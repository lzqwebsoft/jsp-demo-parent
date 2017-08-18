<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Pragma","no-cache");
    response.setHeader("Expires","0");

%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>

<c:set var="ctx" value="${pageContext['request'].contextPath}"/>
<!DOCTYPE html>
<html>

<!-- Head -->
<head>

    <!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="Travel Agency Sign In Form Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //Meta-Tags -->

    <!-- Custom-Styleheet-Links -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/for_registration/style.css" 		 type="text/css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/for_registration/animate-custom.css" type="text/css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" media="all">
    <!-- //Custom-Styleheet-Links -->

    <!-- Fonts -->
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" type="text/css" media="all">
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Montserrat:400,700" 		  type="text/css" media="all">
    <!-- //Fonts -->

</head>
<!-- //Head -->



<!-- Body -->
<body>

<h1 class="w3layouts agileits">Dog Show Live</h1>
<br>
<br>
<br>
<br>

<div class="container w3layouts agileits">

    <div class="content-left w3layouts agileits">
        <img src="${pageContext.request.contextPath}/css/for_registration/images/background.jpg" alt="W3layouts Agileits" height="auto">

    </div>

    <div class="content-right w3layouts agileits row">
        <section>
            <div id="container_demo">
                <a class="hiddenanchor w3layouts agileits" id="tologin"></a>
                <a class="hiddenanchor w3layouts agileits" id="toregister"></a>
                <div id="wrapper">
                    <div id="login" class="animate w3layouts agileits form row">
                        <h2 class="w3layouts agileits">Войти</h2>
                        <form class="form-signin" action="login" method="POST">
                            <div class="row">
                                <div class="col-md-auto">
                            <label for="inputEmail" class="sr-only">Email адресс</label>
                            <input name="username" type="text" id="inputEmail" class="form-control" placeholder="Email адресс" required autofocus>
                                </div>
                                <div class="col-md-auto">
                            <label for="inputPassword" class="sr-only">Пароль</label>
                            <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Пароль" required>
                                </div>
                            <div class="send-button w3layouts agileits">
                                <form>
                                    <input type="submit" value="Войти">
                                </form>
                                <div class="clear"></div>
                            </div>
                            <p class="change_link w3layouts agileits">
                                Нет аккаунта? <a href="#toregister" class="to_register">Зарегистрируйтесь!</a>
                            </p>
                            <div class="clear"></div>
                            </div>
                        </form>
                    </div>
                    <div id="register" class="animate w3layouts agileits form">
                        <h2>Зарегистрироваться</h2>
                        <form  action="#"  method="post">
                            <div class="row">
                                    <div class="col-md-12">
                                        <label class="control-label">Имя пользователя</label>
                                        <input type="text" class="form-control" name="username" id="username">
                                    </div>
                                    <div class="col-md-auto">
                                        <label class="control-label">Пароль</label>
                                        <input type="password" class="form-control" name="password" id="password" >
                                    </div>
                                    <div class="col-md-auto">
                                        <label class="control-label">Подтвердите пароль</label>
                                        <input type="password" class="form-control" name="password2" id="password2">
                                    </div>
                                    <div class="col-md-auto">
                                        <label class="control-label">Фамилия</label>
                                        <input type="text" class="form-control" name="fname" id="fname">
                                    </div>
                                    <div class="col-auto">
                                        <label class="control-label">Имя</label>
                                        <input type="text" class="form-control" name="sname" id="sname">
                                    </div>
                                    <div class="col-auto">
                                        <label class="control-label">Отчество</label>
                                        <input type="text" class="form-control" name="lname" id="lname">
                                    </div>
                                <%--<label>Name</label>--%>
                                <%--<input type="text" class="name w3layouts agileits" name="Name" required="">--%>
                                <%--<label>E-mail</label>--%>
                                <%--<input type="text" Name="Email" required="">--%>
                                <%--<label>Password</label>--%>
                                <%--<input type="password" Name="Password" required="">--%>
                                <%--<div class="send-button w3layouts agileits">--%>
                                    <%--<form action="#" method="post">--%>
                                        <%--<input type="submit" value="Зарегистрироваться">--%>
                                    <%--</form>--%>
                                <%--</div>--%>
                            </div>
                            </form>

                            <p class="change_link w3layouts agileits">
                                Уже зарегистрированы? <a href="#tologin" class="to_register">Войти</a>
                            </p>
                            <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </section>
    </div>
    <div class="clear"></div>

</div>

<div class="footer w3layouts agileits">
    <p> &copy; 2016 Travel Agency Sign In Form. All Rights Reserved | Template by <a href="http://w3layouts.com" target="_blank">W3layouts</a></p>
</div>

</body>
<!-- //Body -->

</html>