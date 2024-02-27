<%@ page language="java" 
	 	 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"
    	 import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="bankstyle.css">
    <style>
        .account_create{
            border: 2px outset rgb(248, 109, 50);
            border-radius: 10px;
            width: 70%;
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
                           <%
                        		UserBean ub = (UserBean)session.getAttribute("ubean");
                        		out.println("Welcome user : "+ub.getuName()+"<br>");
                        		out.println("Father Name : "+ub.getfName()+"<br>");
                        		out.println("Your Account No     : "+ub.getAccountNo()+"<br>");
                        		out.println("Account Type : "+ub.getAccType()+"<br>");
                        		out.println("Date Of Birth : "+ub.getDob()+"<br>");
                        		out.println("Gender : "+ub.getGender()+"<br>");
                        		out.println("Phone No : "+ub.getPhNo()+"<br>");
                        		out.println("Mail ID : "+ub.getMailId()+"<br>");
                        		out.println("Address : "+ub.getAddress()+"<br>");
                        		out.println("ID Proof : "+ub.getIdProof()+"<br>");
                        		out.println("ID Proof No : "+ub.getIdProofNo()+"<br>");	
                        		out.println("Total Balance : "+ub.getBalance()+"<br>");
                        	%>
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

    </form>
</body>
</html>