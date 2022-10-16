<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Trainer</title>
</head>
<body>

<h2> Edit Trainer </h2>
	<h4>Trainer ID: "${weightTraining.id }"</h4>
<form action="editTrainer.do" method="POST">
	
	 
	<br> First Name: <input type="text" name="firstName" value="${weightTraining.firstName }"/> 
	<br> Last Name:	<input type="text" name="lastName" value="${weightTraining.lastName }"/> 
	<br> Over Head Press: <input type="number" name="ohp" value="${weightTraining.ohp }"/> 
	<br> Bench Press: <input type="number" name="bench" value="${weightTraining.bench }"/>
	<br> Squat: <input type="number" name="squat" value="${weightTraining.squat }"/>
	<br> Deadlift: <input type="number" name="deadlift" value="${weightTraining.deadlift }"/>
	<br> Bent Over Rows: <input type="number" name="bentOverRows" value="${weightTraining.bentOverRows }"/>
	<br> <input type="submit" value="update"/>
	</form>
  </body>
</html>