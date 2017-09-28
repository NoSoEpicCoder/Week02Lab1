<%-- 
    Document   : ageCalculator
    Created on : Sep 21, 2017, 2:13:19 PM
    Author     : 728646
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <div>
            <form action="AgeCalculatorServlet" method="post">
                Enter your current age: <input type="text" name="currentAge">
                <input type="submit" value="Age next birthday"><br>
            </form>
        ${errorMessage}
        ${currentAge}
        </div>
    </body>
</html>
