<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>erm</title>
</head>
<body>
  <section id="container" class="">
<div align="center">

<form  method="post">
<h1>Search Customer Page</h1><hr/>
<table cellpadding="6px">
<tr><td>Enter Mobile No:</td>
	<td><input name="mno"  type="text"/>
</tr>
<tr><td><input type="submit" value="Search"/></td></tr>
</table>


<table>
		<tr>
			<td>NAME:</td><td>Phome:</td>
		</tr>
		<c:forEach items="${customer}" var="customer">
			<tr>
			<td>${customer.name}</td>
			<td>${customer.mobile}</td>
			</tr>
		</c:forEach>
	</table>

</form>
</div>
</section>
</body>
</html>