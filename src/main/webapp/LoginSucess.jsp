<%@ page language="java" 
	 	 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"
    	 import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bankstyle.css">
    <style>
        .account_create{
            border: 2px outset rgb(237, 198, 57);
            border-radius: 10px;
            width: 50%;
        }
    </style>
<title>Insert title here</title>
</head>
<body>
    <form action="index" method="post">
        <div class="Main">
            <div class="subMain">
                <div class="Header">
                        <header>CHECK BALANCE</header>
                </div>
                <div class="HeaderBar">
                        <a href="index.html">HOME</a>
                        <a href="#">ABOUT</a>
                        <a href="#">SERVICES</a>
                        <a href="#">CAREER</a>
                        <a href="#">LOGIN/SIGNUP</a>
                    <div class="search">
                        <input type="search" name="search" placeholder="Text to search...">
                        <input type="button" value="Search">
                    </div>
                </div>
                <div class="container">
                    <center>
                        <div class="account_create">     
                        	<%
								AdminBean ab = (AdminBean)session.getAttribute("abean");
								out.println("Welcome Admin : "+ab.getName());
							%>   
                        </div>
                        <a href="adminmenu.html"> 
                        	<input class="submit" type="button" value="GO HOME">
                        </a>
                    </center>              
                </div>
            </div>
            <div class="bottom">
                <footer>                    
                    <a href="faqs.html">FAQ</a>
                    <a href="contact.html">Contact Us</a>
                    <a href="term.html">Term of Use</a>
                    <a href="privacypol.html">Privacy Policy</a>
                    <a href="refundpol.html">Refund Policy</a>
                    <a href="#">&copy; 2023 | SBI</a>
                    <div class="search">
                        <input type="search" name="search" placeholder="Text to search...">
                        <input type="button" value="Search">
                    </div>               
                </footer>
            </div>
        </div>

    </form>
</body>
</html>