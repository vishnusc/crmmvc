<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>erm</title>

</head>
<body>
	<section id="container" class="">
	<div align="center">

		<form method="post">
			<h1>Search Customer Page</h1>
			<hr />
			<table cellpadding="6px">
				<tr>
					<td>Enter Mobile No:</td>
					<td><input name="mobile" id="mobile" type="text" />
				</tr>
				<tr>
					<td  align="center"><input type="submit" value="Search" onsubmit="return submitCheck()"/></td>
				</tr>
			</table><br><br>

			<table cellpadding="5px" padding="5px" border="1">
				
					<c:choose>
							<c:when test="${view}">
								
								<tr>
									<th>NAME</th>
									<th colspan="2">Phone</th>
								</tr>
								<tbody>
								<tr>
									<td>${customer.name}</td>
									<td >${customer.mobile}</td>
									<td><button><a href="<c:url value='/edit-${customer.mobile}-customer' />">Edit</a></button></td>
								</tr>
								</tbody>
							</c:when>
							<c:when test="${view1}">
									<tr>
									<th>ERROR: CUSTOMER DOES NOT EXIST</th>
									<td><button><a href="<c:url value='/newcustomer' />">Create Customer</a></button>
									</tr>
							</c:when>
							
						</c:choose></td>
				
			</table>

		</form>
	</div>
	</section>
</body>
</html>