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
	<h1 class="text-center">Books</h1>

	<div class=" w-50 mx-auto d-block my-3 p-3 border ">
		<table class="table table-hover ">
			<thead class="">
				<tr>
					<th class="text-center">ID</th>
					<th class="text-center">title</th>
					<th class="text-center">description</th>
					<th class="text-center">language</th>
					<th class="text-center"># Pages</th>	
				</tr>
			</thead>
			<tbody>
			
 
			<c:forEach var="book" items="${allbooks}">
				<tr class="space">
					<td class=""><c:out value="${book.id}"/></td>
					<td class=""><a href="/book/<c:out value="${book.id}"/>"><c:out value="${book.title}"/></a></td>
					<td class=""><c:out value="${book.description}"/></td>
					<td class=""><c:out value="${book.language}"/></td>
					<td class=""><c:out value="${book.numberOfPages}"/></td>
					
				</tr>
				</c:forEach> 

			</tbody>
		</table>
	</div>
</body>
</html>