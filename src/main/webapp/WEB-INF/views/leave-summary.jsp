<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leave Summary</title>
</head>
<body>
<h2>Leave Request Submitted</h2>

Employee: ${employeeName} <br> <!-- This is expression language  -->
Days: ${days} <br>
Reason: ${reason} <br>
Status: ${status} <br>

<!--
Output Example:
Leave Request Submitted
Employee: Shil
Days: 4
Reason: Sick
Status: Pending Manager Approval  -->
</body>
</html>

