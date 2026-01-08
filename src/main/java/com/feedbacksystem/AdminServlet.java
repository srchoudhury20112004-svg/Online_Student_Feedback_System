package com.feedbacksystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null || !"admin".equals(user.getRole())) {
            response.sendRedirect("login.html");
            return;
        }

        try {
            Connection conn = DBUtil.getConnection();
            String sql = "SELECT f.*, u.username FROM feedback f JOIN users u ON f.student_id = u.id";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Feedback> feedbacks = new ArrayList<>();
            while (rs.next()) {
                Feedback fb = new Feedback();
                fb.setId(rs.getInt("id"));
                fb.setStudentId(rs.getInt("student_id"));
                fb.setSubject(rs.getString("subject"));
                fb.setMessage(rs.getString("message"));
                fb.setSubmittedAt(rs.getTimestamp("submitted_at"));
                // Add username somehow, perhaps extend Feedback or use map
                feedbacks.add(fb);
            }

            request.setAttribute("feedbacks", feedbacks);
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Failed to load feedbacks");
            request.getRequestDispatcher("admin.html").forward(request, response);
        }
    }
}