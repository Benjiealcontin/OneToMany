<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
    <%@page import="com.example.Service.Response" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Response> dataList = (List<Response>)request.getAttribute("data");
for(int i = 0; i<dataList.size(); i++){	
%>
<li><%out.print(dataList.get(i).getFirstname()); %></li>
<li><%out.print(dataList.get(i).getName()); %></li>
<%} %>
</body>
</html>