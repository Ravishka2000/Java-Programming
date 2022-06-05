<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://api.fontshare.com/css?f[]=author@200,300,400,500&f[]=neco@1&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Online Help Desk | Answer Question</title>

<style>
		
	body {
    	background: linear-gradient(133deg, #898dff,#47525cca);
	}

	#form_login {
        display: flex;
        justify-content: center;
        flex-direction: column;
        margin: 27px 64px 36px 64px;
        font-family: sans-serif;
    	font-weight: 500;
    }
    
    .update {
   		background: rgba( 255, 255, 255, 0.35 );
		box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
		backdrop-filter: blur( 13.5px );
		-webkit-backdrop-filter: blur( 13.5px );
		border-radius: 10px;
		border: 1px solid rgba( 255, 255, 255, 0.18 );
		max-width: 500px;
		min-width:500px;
		margin: auto;
		position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50% , -50%);
    }   
    
    input[type="text"] {
	    padding: 5px;
	    background: rgba( 233, 239, 213, 0.4 );
		box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
		backdrop-filter: blur( 13.5px );
		-webkit-backdrop-filter: blur( 13.5px );
		border-radius: 10px;
		margin-top: 7px;
	} 
	
	input[type="submit"] {
	    border-radius: 25px;
	    padding: 9px 2px;
	    margin: 0px 126px;
	    border: none;
	    font-weight: bolder;
	    font-size: 16px;
	}
	
	h1 {
		text-align: center;
		font-family: 'Author', sans-serif;
		font-family: 'Neco', serif;
	}

</style>

</head>
<body>

	<%
		String id = request.getParameter("stdID");
		String question = request.getParameter("qst");
		String answer = request.getParameter("ans");
		String lecturer = request.getParameter("lec");	
		String qid = request.getParameter("qid");
	%>
	<div class="update">
	<h1>Update Question</h1>
	<form action="update" method="post"  id="form_login">
		Question ID <br>
		<input type="text" name = "qid" value="<%= qid %>" readonly><br>
		Student ID <br>
		<input type="text" value="<%= id %>" readonly><br>
		Question <br>
		<input type="text" name="question" value="<%= question %>" readonly><br>
		Answer <br>
		<input type="text" name="answer" value="<%= answer %>"><br>
		Lecturer <br>
		<input type="text" name="lecturer" value="<%= lecturer %>"><br><br>
		
		<input type="submit" value="Update">
	
	</form>
	</div>
</body>
</html>