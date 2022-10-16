<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Trainer Confirmation</title>

</head>
<body>
		<h1>Delete Trainer Confirmation ${weightTraining.firstName }</h1>

		<div>
		<c:choose>
		<c:when test="${weightTraining}">
		<p>The trainer you tried to delete was not successful. Please try again</p>
		</c:when>
		<c:otherwise>
		<p><a href="getWeightTrainer.do?id=${weightTraining.id }">${weightTraining.firstName}</a> was deleted successfully.</p>
		</c:otherwise>
		</c:choose>
	
		</div>
		<h3><a href = "home.do">Home Page</a></h3>

</body>
</html>