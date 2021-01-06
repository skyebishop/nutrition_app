<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
</head>
<body>

			<form class="form-inline my-2 my-lg-0" method="post"
				action="/searchresults">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					name="search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
			
		<font size="3">
			<div class="container">
				<div class="row">
					<div class="col-lg-4" style="color: #2a9fd6;">branded</div>
				</div>
			</div>
		<c:forEach var="brand" items="${ brands }">
			<div class="container">
				<div class="row">
				<div class="col-lg-4 padded">${ brand.getFood_name() }</div>
				</div>
			</div>
		</c:forEach>
		
		<div class="container">
				<div class="row">
					<div class="col-lg-4" style="color: #2a9fd6;">common</div>
				</div>
			</div>
		<c:forEach var="common" items="${ commons }">
			<div class="container">
				<div class="row">
				<div class="col-lg-4 padded">${ common.getFood_name() }</div>
				</div>
			</div>
		</c:forEach>
		
		
		</font>
</body>
</html>