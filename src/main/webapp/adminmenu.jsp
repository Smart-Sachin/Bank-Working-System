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
            border: 2px outset rgb(232, 89, 194);
            border-radius: 10px;
            width: 50%;
        }
        .submit{
		    background-color: #01419b;
		    height: 30px;
		    width: 180px;
		    border-radius: 15px;
		    color: white;
		}
		.submit:hover{
		    background-color: #53f283;
		    color: white;                   
		}
		
    </style>
<title>Insert title here</title>
</head>
<body>
    
        <div class="Main">
            <div class="subMain">
                <div class="Header">
                	<h2> <%
                       	 	AdminBean ab = (AdminBean)session.getAttribute("abean");
                			out.println("Hi, "+ab.getName());
                        %>
                      </h2>
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
                        		<h2>Admin MENU</h2>

                        	<form action="viewall" method="post">
	                        	<a href="ViewAccount.html">
	                            	<input class="submit" type="button" value="VIEW BY ACCOUNT NO">&nbsp;&nbsp;&nbsp;&nbsp;
	                         	</a>
	                            	<input class="submit" type="submit" value="VIEW ALL ACCOUNT">&nbsp;&nbsp;&nbsp;&nbsp;
                            </form>

                           <br><br>

                           <form action="adminlogout" method="post">
	                          <a href="deletaccount.html">
	                          	 	<input class="submit" type="button" value="DELET ACCOUNT">&nbsp;&nbsp;&nbsp;&nbsp;
	                          </a>
	                           	 	<input class="submit" type="submit" value="LOGOUT">&nbsp;&nbsp;&nbsp;&nbsp;
                           </form>
                            <!-- 
                           <br><br>
                           <a href="#">
                            <input class="submit" type="button" value="TRANSACTION DETAILS">&nbsp;&nbsp;&nbsp;&nbsp;
                            </a>
                           <a href="index.html">
                            <input class="submit" type="button" value="EXIT">&nbsp;&nbsp;&nbsp;&nbsp;
                            </a>
                           <br><br>
                            -->
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
                    <a href="#">&copy; 2023 | SBI</a>
                    <div class="search">
                        <input type="search" name="search" placeholder="Text to search...">
                        <input type="button" value="Search">
                    </div>               
                </footer>
            </div>
        </div>

</body>
</html>