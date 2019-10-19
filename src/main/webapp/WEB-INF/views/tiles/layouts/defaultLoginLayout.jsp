<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
  <link rel="shortcut icon" href="img/favicon.png">

  <title>Login Page</title>

  <!-- Bootstrap CSS -->
  <link href="<c:url value='/static/css/bootstrap.min.css'/>" rel="stylesheet">
  <!-- bootstrap theme -->
  <link href="<c:url value='/static/css/bootstrap-theme.css'/>" rel="stylesheet">
  <!--external css-->
  <!-- font icon -->
  <link href="<c:url value='/static/css/elegant-icons-style.css'/>" rel="stylesheet" />
  <link href="<c:url value='/static/css/font-awesome.css'/>" rel="stylesheet" />
  <!-- Custom styles -->
  <link href="<c:url value='/static/css/style.css'/>" rel="stylesheet">
  <link href="<c:url value='/static/css/style-responsive.css'/>" rel="stylesheet" />

  <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
  <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->

    <!-- =======================================================
      Theme Name: NiceAdmin
      Theme URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
      Author: BootstrapMade
      Author URL: https://bootstrapmade.com
    ======================================================= -->
</head>
<body>
<header id="header">
			<tiles:insertAttribute name="header" />
		</header>
<section id="site-content">
			<tiles:insertAttribute name="body" />
		</section>
		


</body>
		
		
		</html>