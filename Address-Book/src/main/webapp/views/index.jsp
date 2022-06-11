<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
    />
 <title>Home</title>
</head>
<body>
	<section id="search" class="py-4 mb-4 bg-light">
    <div class="container">
      <div class="row">
        <div class="col-md-6 ml-auto">
        <form action="/searchword" method="post">
          <div class="input-group">
          
	            <input type="text" name="word" class="form-control" placeholder="Search Words...">
	            <div class="input-group-append">
	              <button type="submit" btn btn-warning">Search</button>
	            </div>
            
          </div>
          </form>
        </div>
      </div>
    </div>
    
    
  <c:forEach var="item" items="${data}">
    <ol class="list-group">
		  <li class="list-group-item"> ${item} </li>
		 
	</ol>
  </c:forEach>
    
    
    
    
    
  </section>
</body>
</html>