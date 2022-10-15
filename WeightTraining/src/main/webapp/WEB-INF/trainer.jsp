<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weight Trainer Details</title>
</head>
<body>
	<div>
		<h3>${weightTraining.firstName} ${weightTraining.lastName}</h3>
		<ul>
			<li>OHP: ${weightTraining.ohp }</li>
			<li>Back Squat: ${weightTraining.squat }</li>
			<li>Back Over Rows: ${weightTraining.bentOverRows }</li>
			<li>Deadlift: ${weightTraining.deadlift }</li>
			<li>Bench Press: ${weightTraining.bench }</li>
		</ul>
	</div>
</body>
</html>