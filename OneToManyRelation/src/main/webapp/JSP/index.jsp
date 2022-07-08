<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>add students</h1>
  <form action="/add" method="post">
    <label for="fname">firstname</label>
    <input type="text" id="des" name="firstname" placeholder="Your description">
        <label for="fname">lastname</label>
    <input type="text" id="des" name="lastname" placeholder="Your name..">
    <h3>department</h3>
    <label for="fname">department</label>
    <input type="text" id="des" name="department" placeholder="id">
        <label for="fname">name</label>
    <input type="text" id="des" name="name" placeholder="Your description">
        <label for="fname">description</label>
    <input type="text" id="des" name="description" placeholder="Your name..">
    <input type="submit" value="Submit">
  </form>
  <br>
  
  
  
  <h1>add department</h1>
  <form action="/add2" method="post">
    <label for="fname">name</label>
    <input type="text" id="des" name="name" placeholder="Your description">
        <label for="fname">description</label>
    <input type="text" id="des" name="description" placeholder="Your name..">
            <label for="fname">cp_fk</label>
    <input type="text" id="des" name="cp_fk" placeholder="Your name..">
    <input type="submit" value="Submit">
  </form>
  <br>
    <h1>find by ID</h1>
  <form action="/getinfo/" method="get">
    <label for="fname">Id</label>
    <input type="text" id="fname" name="id" placeholder="Your name..">
    <input type="submit" value="Submit">
  </form>
</body>
</html>