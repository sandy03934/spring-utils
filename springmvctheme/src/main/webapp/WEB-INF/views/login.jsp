<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="javax.servlet.jsp.PageContext" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="< spring:theme code='styleSheet'/>" type="text/css"/>
        <title>Home</title>
        <style>
            input[type=text], input[type=password] {
              width: 100%;
              padding: 12px 20px;
              margin: 8px 0;
              display: inline-block;
              border: 1px solid #ccc;
              box-sizing: border-box;
            }

            /* Set a style for all buttons */
            button {
              padding: 14px 20px;
              margin: 8px 0;
              border: none;
              cursor: pointer;
            }

            h2 {
                text-align:center;
            }

            form {
              padding: 50%
              border: 3px solid #f1f1f1;
            }
        </style>
    </head>
    <body class="w3-content" style="max-width:600px">
        <div class="w3-container" style="margin:50px; justify-content:center">
           <div class="w3-cell-middle">


                <form class="w3-container" action="<c:url value='/login.do'/>" method="POST" name="loginForm">
                    <div class="w3-container">
                        <h2>
                            Themed MVC
                        </h2>
                    </div>

                    <label for="username"> User Name : </label>
                    <input type="text" name="username" class="w3-input"/>

                    <label for="password"> Password: </label>
                    <input type="password" name="password" class="w3-input"/>

                    <button class="w3-btn w3-theme w3-input" type="submit" name="submit">Sign In</button>

                 </form>
           </div>
        </div>
    </body>
</html>