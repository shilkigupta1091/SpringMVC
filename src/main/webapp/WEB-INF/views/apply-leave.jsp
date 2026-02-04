<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leave Submission</title>
</head>
<body>
<h2>Apply for Leave</h2>
<form action="${pageContext.request.contextPath}/submitLeave" method="post">
    Name: <input type="text" name="employeeName" /><br><br>
    <!-- Leave Days: <input type="number" name="days" /><br><br> -->
    Start Date: <input type="date" name="startDate" /><br><br>
    End Date: <input type="date" name="endDate" /><br><br>
    Reason: <input type="text" name="reason" /><br><br>
    <input type="submit" value="Apply Leave" />
</form>
</body>
</html>