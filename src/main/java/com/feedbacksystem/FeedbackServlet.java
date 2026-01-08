package com.feedbacksystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null || !"student".equals(user.getRole())) {
            response.sendRedirect("login.html");
            return;
        }

        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        try {
            Connection conn = DBUtil.getConnection();
            String sql = "INSERT INTO feedback (student_id, subject, message) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, user.getId());
            stmt.setString(2, subject);
            stmt.setString(3, message);
            stmt.executeUpdate();

            request.setAttribute("success", "Feedback submitted successfully");
            request.getRequestDispatcher("feedback.html").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Failed to submit feedback");
            request.getRequestDispatcher("feedback.html").forward(request, response);
        }
    }
}