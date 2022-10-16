<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Trainer</title>
</head>
<body>

<h2> Create Trainer </h2>
<form action="createTrainer.do" method="POST">
	
	 
	<br> First Name: <input type="text" name="firstName" value="${weightTraining.firstName }"/> 
	<br> Last Name:	<input type="text" name="lastName" value="${weightTraining.lastName }"/> 
	<br> Over Head Press: <input type="number" name="ohp" value="${weightTraining.ohp }"/> 
	<br> Bench Press: <input type="number" name="bench" value="${weightTraining.bench }"/>
	<br> Squat: <input type="number" name="squat" value="${weightTraining.squat }"/>
	<br> Deadlift: <input type="number" name="deadlift" value="${weightTraining.deadlift }"/>
	<br> Bent Over Rows: <input type="number" name="bentOverRows" value="${weightTraining.bentOverRows }"/>
	<br> <input type="submit" value="create"/>
	</form>
  </body>
</html>