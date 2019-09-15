<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="<spring:theme code='styleSheet'/>"/>
        <title>Home</title>
    </head>
    <body>
        <div class="w3-container w3-theme">
            <h1>Themed Application</h1>
            <div class="w3-container">
            <security:authorize access="isAuthenticated()">
                authenticated as <security:authentication property="principal.username" />
            </security:authorize>
            </div>
        </div>
        <div class="w3-content" style="max-width:600px">
            <div class="w3-container" style="margin:50px; justify-content:center">
               <div class="w3-cell-middle">


                    <form class="w3-container" action="<c:url value='/'/>" method="POST" name="themeChangeForm" id="themeChangeForm">
                        <div class="w3-container">
                            <h2>
                                Change Theme
                            </h2>
                        </div>
                        <select id="theme" name="theme" onChange="submitForm()" class="w3-select w3-border">
                            <option value="w3-theme-dark-grey">Dark Grey</option>
                            <option value="w3-theme-indigo">Indigo</option>
                            <option value="w3-theme-red">Red</option>
                            <option value="w3-theme-w3schools">W3C</option>
                            <option value="w3-theme-yellow">Yellow</option>
                        </select>
                    </form>

                     <form action="<c:url value='/logout.do'/>" method="POST" name="logoutForm">
                        <button class="w3-btn w3-theme w3-input" type="submit" name="submit">Sign Out</button>
                    </form>
               </div>
            </div>
        </div>
        <script>
        function submitForm() {
          document.themeChangeForm.submit();
        }
        </script>
    </body>
</html>
