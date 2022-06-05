<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://api.fontshare.com/css?f[]=author@200,300,400,500&f[]=neco@1&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Online Help Desk | Delete a Question</title>

<style>
	
	body {
    	background: linear-gradient(143deg, #698cff,#ff7cdb,white);
	}

	#form_delete {
        display: flex;
        justify-content: center;
        flex-direction: column;
        margin: 27px 64px 36px 64px;
        font-family: sans-serif;
    	font-weight: 500;
    }
    
    .delete {
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
	
	/* From uiverse.io */
button {
     width: 158px;
    height: 43px;
    cursor: pointer;
    display: flex;
    align-items: center;
    background: red;
    border: none;
    border-radius: 5px;
    box-shadow: 1px 1px 3px rgb(0 0 0 / 15%);
    background: #e62222;
}

button, button span {
 transition: 200ms;
}

button .text {
 transform: translateX(35px);
 color: white;
 font-weight: bold;
}

button .icon {
 position: absolute;
 border-left: 1px solid #c41b1b;
 transform: translateX(110px);
 height: 40px;
 width: 40px;
 display: flex;
 align-items: center;
 justify-content: center;
}

button svg {
 width: 15px;
 fill: #eee;
}

button:hover {
 background: #ff3636;
}

button:hover .text {
 color: transparent;
}

button:hover .icon {
 width: 150px;
 border-left: none;
 transform: translateX(0);
}

button:focus {
 outline: none;
}

button:active .icon svg {
 transform: scale(0.8);
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
		display: flex;
    	justify-content: center;
    	font-family: 'Author', sans-serif;
		font-family: 'Neco', serif;
	}
	
	.btn {
    justify-content: center;
    display: flex;
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
	<div class="delete">
	<h1>Delete Question</h1>
	<form action="delete" method="post" id="form_delete">
		Question ID <br>
		<input type="text" name = "qid" value="<%= qid %>" readonly><br>
		Student ID <br>
		<input type="text" value="<%= id %>" readonly><br>
		Question <br>
		<input type="text" name="question" value="<%= question %>" readonly><br>
		Answer <br>
		<input type="text" name="answer" value="<%= answer %>" readonly><br>
		Lecturer <br>
		<input type="text" name="lecturer" value="<%= lecturer %>" readonly><br><br>
		
		<div class = "btn"><button class="noselect"><span class="text">Delete</span><span class="icon"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M24 20.188l-8.315-8.209 8.2-8.282-3.697-3.697-8.212 8.318-8.31-8.203-3.666 3.666 8.321 8.24-8.206 8.313 3.666 3.666 8.237-8.318 8.285 8.203z"></path></svg></span></button></div>
		
	</form>
	</div>
</body>
</html>