<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>String counter</title>
    <style>
        form {
            width: 300px;
            margin: auto;
        }
        input{
            width: 300px;
            margin: 5px auto;
        }
        input[type="text"]{
            width: 294px;
        }
        h2{
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    <form action="DemoServlet" method="post">
        <h1>Enter String: </h1>
        <br>
        <input type="text" name="str1" placeholder="String 1">
        <br>
        <input type="text" name="str2" placeholder="String 2">
        <br>
        <input type="text" name="str3" placeholder="String 3">
        <input type="submit" value="Submit"><br>
        <br>
        <h2>String 1:</h2><br>
        <h3>${count1}</h3>
        <br>
        <h2>String 2:</h2><br>
        <h3>${count2}</h3>
        <br>
        <h2>String 3:</h2><br>
        <h3>${count3}</h3>
    </form>
</div>
</body>
</html>
