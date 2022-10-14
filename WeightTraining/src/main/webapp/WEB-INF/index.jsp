<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weight Training</title>
</head>
<body>
	<h1>Weight Training Numbers</h1>
	
	
	<c:forEach var="weights" items="${weightTraining }">
	<li>${weights.bench}</li>
	</c:forEach>
</body>
</html>