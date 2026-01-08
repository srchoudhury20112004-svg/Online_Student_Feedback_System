<%@ page import="java.util.List, com.feedbacksystem.Feedback" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin - Manage Feedback</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Feedback Management</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Student ID</th>
                    <th>Subject</th>
                    <th>Message</th>
                    <th>Submitted At</th>
                </tr>
            </thead>
            <tbody>
                <% List<Feedback> feedbacks = (List<Feedback>) request.getAttribute("feedbacks");
                   if (feedbacks != null) {
                       for (Feedback fb : feedbacks) { %>
                <tr>
                    <td><%= fb.getId() %></td>
                    <td><%= fb.getStudentId() %></td>
                    <td><%= fb.getSubject() %></td>
                    <td><%= fb.getMessage() %></td>
                    <td><%= fb.getSubmittedAt() %></td>
                </tr>
                <%     }
                   } %>
            </tbody>
        </table>
        <a href="logout">Logout</a>
    </div>
</body>
</html>