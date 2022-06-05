<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import = "java.sql.Connection" %>
<%@page import = "java.sql.DriverManager" %>
<%@page import = "java.sql.Statement" %>
<%@page import = "java.sql.ResultSet" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://api.fontshare.com/css?f[]=author@200,300,400,500&f[]=neco@1&display=swap" rel="stylesheet">
	<title>Online Help Desk | All FAQs</title>
	<style>
	
		body {
			background: linear-gradient(90deg, hsl(193deg 69% 51%) 0%, hsl(69deg 41% 79%) 100%);
		}
	
		.container{
		
		}
		
		.block {
			display: flex;
    		justify-content: center;
		}
	
		table {
		    border: solid;
		    font-family: system-ui;
		    font-size: 21px;
		    margin: 16px 0px;
		    padding: 13px;
		    background: rgba( 255, 255, 255, 0.5 );
			box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
			backdrop-filter: blur( 20px );
			-webkit-backdrop-filter: blur( 20px );
			border-radius: 7px;
		}
	
		td {
		    padding: 0px 14px;
		}
	
		.submit {
		    padding: 8px 14px;
		    margin: 0px 34px;
		    color: #ffffff;
		    background-color: #08c40b;
		    font-size: 14px;
		    border: 1px solid #1c5e5f;
		    border-radius: 35px;
		    padding: 8px 13px;
		    cursor: pointer;
		}
	
		.submit:hover {
			color: #1c5e5f;
			background-color: #ffffff;
		}
		
		.delete {
		    padding: 8px 14px;
		    margin: 0px 34px;
		    color: #ffffff;
		    background-color:#e21212;
		    font-size: 14px;
		    border: 1px solid black;
		    border-radius: 35px;
		    padding: 8px 13px;
		    cursor: pointer;
		}
	
		.delete:hover {
			color: red;
			background-color: #ffffff;
		}
	
		.buttons {
			justify-content: center;
    		display: flex;
		}
		
		h1 {
		    font-size: xxx-large;
		    text-align: center;
		    margin-top: 65px;
		    margin-bottom: 45px;
		    font-family: 'Author', sans-serif;
		    font-family: 'Neco', serif;
		    color: #181466;
		}
	
	
	</style>
</head>
<body>

	<h1>All Questions and Answers</h1>

	<%
	Connection con = null;
	Statement stmt = null;
	ResultSet rs  = null;
	
	String driver = "com.mysql.jdbc.Driver";
	String url ="jdbc:mysql://localhost:3306/helpdesk";
	String userName = "root";
	String password = "08110607ravi";
	
	try{
		Class.forName(driver);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	con = DriverManager.getConnection(url, userName, password);
	stmt = con.createStatement();
	String sql = "select * from faq";
	
	rs = stmt.executeQuery(sql);
	
	while(rs.next()){
	%>

	<div class = "container">
		<div class = "block">
			<table>
				<tr>
					<td>Student ID </td>
					<td> <%=rs.getString(4) %> </td>
				</tr>
				<tr>
					<td>Question</td>
					<td><%=rs.getString(2) %></td>
				</tr>
				<tr>
					<td>Answer:</td>
					<td><%=rs.getString(3) %></td>
				</tr>
				<tr>
					<td>Lecturer:</td>
					<td><%=rs.getString(5) %></td>
				</tr>
			</table>
		</div>
		
		<c:set var="id" value = "<%=rs.getString(1)%>"/>
		<c:set var="stdid" value = "<%=rs.getString(4)%>"/>
		<c:set var="question" value = "<%=rs.getString(2)%>"/>
		<c:set var="answer" value = "<%=rs.getString(3)%>"/>
		<c:set var="lecturer" value = "<%=rs.getString(5)%>"/>
	
		<c:url value="updatefaq.jsp" var="faqup">
			<c:param name="stdID" value="${stdid}"/>
			<c:param name="qst" value="${question}"/>
			<c:param name="ans" value="${answer}"/>
			<c:param name="lec" value="${lecturer}"/>	
			<c:param name="qid" value="${id}"/>
		</c:url>
		
		<div class = "buttons">
			<a href="${faqup}">
			<input type="submit" name="submit" value="Answer Question" class="submit">
			</a>
			
			<c:url value="deletefaq.jsp" var="faqdelete">
				<c:param name="stdID" value="${stdid}"/>
				<c:param name="qst" value="${question}"/>
				<c:param name="ans" value="${answer}"/>
				<c:param name="lec" value="${lecturer}"/>	
				<c:param name="qid" value="${id}"/>
			</c:url>
			
			
			<a href="${faqdelete}">
			<input type="submit" name="delete" value ="Delete Question" class="delete"><br><br>
			</a>
		</div>
	</div>
	<% } %>
	
	
</body>
</html>