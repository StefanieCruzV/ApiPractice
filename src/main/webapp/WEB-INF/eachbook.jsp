<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<title>JAVA</title>
</head>
<body>
	
	<div class=" w-50 mx-auto d-block my-3 p-3  "> 
	<h1><c:out value="${book.title}"/></h1>
	
		<h2> Description: <span><c:out value="${book.description}"/></span></h2>
		<h2> Language: <span><c:out value="${book.language}"/></span></h2>
		<h2> Pages: <span><c:out value="${book.numberOfPages}"/></span></h2>
	
	</div>
	



</body>
</html>