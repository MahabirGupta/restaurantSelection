<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Restaurant Choice Form</title>
</head>
<body>
    <h1>Restaurant Choice Form</h1>
    <form action="submit-choices" method="post">
        <label for="userChoice">Enter your restaurant choice:</label>
        <input type="text" id="userChoice" name="userChoice" required>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
