<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/index.css">
<meta charset="UTF-8">
<title>Weight Training</title>
</head>
<body>

	<h1>All Weight Trainers</h1>

	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Overhead Press</th>
				<th>Back Squat</th>
				<th>Bent Over Rows</th>
				<th>Deadlift</th>
				<th>Bench Press</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="weights" items="${weightTraining }">
				<tr>
					<td><a href="getWeightTrainer.do?wtid=${weights.id }">${weights.firstName }</a></td>
					<td>${weights.lastName }</td>
					<td>${weights.ohp }</td>
					<td>${weights.squat }</td>
					<td>${weights.bentOverRows }</td>
					<td>${weights.deadlift }</td>
					<td>${weights.bench}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form action="createWeightTrainer.do" method="GET">
		Create New Weight Trainer: <input type="text" name="wtid" /> <input
			type="submit" value="Create" />
	</form>
</body>
</html>