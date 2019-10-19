
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <section id="container" class="">
	<div  align="center">

		<h1>Customer Feedback Page</h1>
		<hr />
		<form:form  method="POST" modelAttribute="customerfeedback">
			<table cellpadding="6">
				<tr>
					<td>QUESTION 1:</td>
					<td><form:radiobutton path="q1" id="q1" value="YES" />YES &nbsp&nbsp
					<form:radiobutton path="q1" id="q1" value="NO" />NO</td>
				</tr>
				<tr>
					<td>QUESTION 2:</td>
					<td><form:radiobutton path="q2" id="q2" value="YES" />YES &nbsp&nbsp
					<form:radiobutton path="q2" id="q2" value="NO" />NO</td>
				</tr>
				<tr>
					<td>Rating on Food:</td>
					<td><form:select path="rFood" id="rFood">
							<option value="-1">--Select--</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</form:select></td>

				</tr>
				<tr>
					<td>Rating on Music:</td>
					<td><form:select path="rMusic" id="rMusic">
							<option value="-1">--Select--</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</form:select></td>
				</tr>
				<tr>
					<td>Feedback/Suggestion:</td>
					<td><form:textarea rows="4" cols="50" path="suggestion"
							id="suggestion" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>