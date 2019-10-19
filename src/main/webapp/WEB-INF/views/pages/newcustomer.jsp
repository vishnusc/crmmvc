 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>erm</title>
</head>
<body>
  <section id="container" class="">
	<div align="center">

		<form:form method="POST" modelAttribute="newcustomer">
		   <form:input type="hidden" path="id" id="id"/>
		  <%--  <fmt:formatDate pattern="yyyy-MM-dd" value="${now}" /> --%>
			<h1>New Customer Page:</h1>
			<hr />
			<table cellpadding="6">
				<tr>
					<td>Name:</td>
					<td><form:input type="text" path="name" id="name"/></td>
				</tr>
				<tr>
					<td>Mobile No:</td>
					<td><form:input type="text" path="mobile" id="mobile"/></td>
				</tr>
				<tr>
					<td>DOB:</td>
					<td><form:input type="date" path="dob" id="dob"/></td>
				</tr>
				<tr>
					<td>Wedding Anniversary:</td>
					<td><form:input type="date" path="adate" id="adate"/></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input type="text" path="email" id="email"/></td>
				</tr>
				<tr>
					<td>Preference:</td>
					<td><form:radiobutton path="prefence" id="prefence" value="Food"/> Food &nbsp&nbsp
					<form:radiobutton path="prefence" id="prefence" value="Drinks"/> Drinks &nbsp&nbsp
					<form:radiobutton path="prefence" id="prefence" value="Both"/> Both</td>
					
				</tr>

				<tr>
					<td>Address:</td>
					<td><form:textarea rows="4" cols="50" path="address" id="address"/></td>
				</tr>
				
				<tr>
					<td>Mode of Contact:</td>
					<td><form:radiobutton path="contactMode" id="contactMode" value="Phone"/> Phone &nbsp&nbsp
					<form:radiobutton path="contactMode" id="contactMode" value="Mail"/> Mail &nbsp&nbsp
					<form:radiobutton path="contactMode" id="contactMode" value="Both"/> Both</td>
				</tr>
				<tr>
				<c:set var="now" value="<%=new java.util.Date()%>" />
				
 					<fmt:formatDate var="fmtDate" value="${now}" pattern="yyyy-MM-dd"/>
				<form:input type="hidden" path="vdate" id="vdate" value="${fmtDate}"/>
					<td><input type="submit" value="Save"/></td>
				</tr>
			</table>
		</form:form>
	</div>
	</section>
</body>
</html>