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
		<h1>${weightTraining.firstName} ${weightTraining.lastName} </h1>
		<h5>Trainer ID: ${weightTraining.id}</h5>
		<ul>
			<li>OHP: ${weightTraining.ohp }</li>
			<li>Back Squat: ${weightTraining.squat }</li>
			<li>Back Over Rows: ${weightTraining.bentOverRows }</li>
			<li>Deadlift: ${weightTraining.deadlift }</li>
			<li>Bench Press: ${weightTraining.bench }</li>
		</ul>
	</div>
	<form action="deleteTrainer.do?wtid=${weightTraining.id }" method="GET">
	Delete Trainer By ID: 
	<input type="number" name="id">
	<input type="submit" name="delete">
	</form>
	<form action="createEditForm.do"  method="GET">
	Edit Trainer By ID:
	<input type="number" name="id" value="${weightTraining.id }">
	<input type="submit" name="edit">
	</form>
	<!-- <h3><a href = "createTrainer.do">Add New Trainer</a></h3> -->
	<form action="createForm.do" method="GET">
	<button type="submit">Create</button>
	</form>
	
</body>
</html>