<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bankstyle.css">
    <style>
        .account_create{
            border: 2px outset rgb(232, 89, 194);
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
                        <header>STATE BANK OF INDIA</header>
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
                           Account Name Mr.Raushan Kumar<br>
                           Account Number 1001071030055858<br>
                           Account Description Savings A/c<br>
                           Balance 40500.30<br>
                        </div> 
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
                    <a href="#">&copy; 2022 | Livave</a>
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