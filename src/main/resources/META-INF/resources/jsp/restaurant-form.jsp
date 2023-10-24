<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Restaurant Choice Input</title>
</head>
<body>
    <h1>Restaurant Choice Input</h1>
    <form action="submit-choices" method="post">
        <label for="userChoice">Enter your choice: </label>
        <input type="text" id="userChoice" name="userChoice" value="${restaurantForm.userChoice}">

        <button type="submit">Submit</button>
    </form>

</body>
</html>
