<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Help Desk | Ask a Question</title>

<style>

body {
	background-image: url("https://d29fhpw069ctt2.cloudfront.net/photo/52202/preview/npreview_1280x1280.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
.ask {
    margin: 100px 25px 25px 25px;
    justify-content: center;
    display: flex;
    font-size: 24px;
}

h1 {
	text-align: center;
}

form {
    display: inline-block;
    background: rgba( 255, 255, 255, 0.2 );
	box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
	backdrop-filter: blur( 9px );
	-webkit-backdrop-filter: blur( 9px );
	border-radius: 10px;
	border: 1px solid rgba( 255, 255, 255, 0.18 );
	padding: 0px 40px 30px 40px;
}

.insert{
	margin: 11px 0px;
    padding: 8px 0px;
    font-size: 20px;
}

.cta {
 position: relative;
 margin: auto;
 padding: 12px 18px;
 transition: all 0.2s ease;
 border: none;
 background: none;
}

.cta:before {
 content: "";
 position: absolute;
 top: 0;
 left: 0;
 display: block;
 border-radius: 50px;
 background: #b1dae7;
 width: 45px;
 height: 45px;
 transition: all 0.3s ease;
}

.cta span {
 position: relative;
 font-family: "Ubuntu", sans-serif;
 font-size: 18px;
 font-weight: 700;
 letter-spacing: 0.05em;
 color: #234567;
}

.cta svg {
 position: relative;
 top: 0;
 margin-left: 10px;
 fill: none;
 stroke-linecap: round;
 stroke-linejoin: round;
 stroke: #234567;
 stroke-width: 2;
 transform: translateX(-5px);
 transition: all 0.3s ease;
}

.cta:hover:before {
 width: 100%;
 background: #b1dae7;
}

.cta:hover svg {
 transform: translateX(0);
}

.cta:active {
 transform: scale(0.95);
}
</style>
</head>
<body>

	<div class = "ask">
	<form action="insert" method="post">
		<h1>Ask a Question</h1>
		Enter Student ID : <br><input class="insert" type="text" name="id" placeholder="Enter Your Student ID here" required><br>
		Enter your Question : <br><textarea class="insert" rows="4" cols="50" name="qst" placeholder="Enter your Question hear"></textarea><br>
		<button class="cta">
		  <span>Submit</span>
		  <svg viewBox = "0 0 13 10" height = "10px" width="15px">
		    <path d="M1,5 L11,5"></path>
		    <polyline points="8 1 12 5 8 9"></polyline>
		  </svg>
		</button>
	</form>
	</div>
</body>
</html>