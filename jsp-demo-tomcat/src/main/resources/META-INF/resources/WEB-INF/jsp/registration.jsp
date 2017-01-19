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
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>

    <!-- Basic Page Needs ==================================================
    ================================================== -->

    <meta charset="utf-8">
    <title>Home Page</title>
    <meta name="description" content="Place to put your description text">
    <meta name="author" content="">
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Mobile Specific Metas ==================================================
    ================================================== -->

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">

    <!-- CSS ==================================================
    ================================================== -->

    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/skeleton.css">
    <link rel="stylesheet" href="css/screen.css">
    <link rel="stylesheet" href="css/for_registration/reset.css">
    <link rel="stylesheet" href="css/for_registration/style.css">
    <link rel="stylesheet" href="css/prettyPhoto.css" type="text/css" media="screen" />

    <!-- Favicons ==================================================
    ================================================== -->

    <link rel="shortcut icon" href="images/favicon.png">
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">

    <!-- Google Fonts ==================================================
    ================================================== -->
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Content Part ==================================================
================================================== -->
<div id="header">
    <div class="container">
        <!-- Header | Logo, Menu
            ================================================== -->
        <div class="logo"><a href="${pageContext.request.contextPath}/home_page"><img src="images/logo.png" alt="" /></a></div>
        <div class="mainmenu">
            <div id="mainmenu">
                <ul class="sf-menu">
                    <li><a href="${pageContext.request.contextPath}/home_page">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                    <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                    <li><a>Register</a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/register_dog">Register Dog</a></li>
                            <li><a href="${pageContext.request.contextPath}/reg_participant">Register as Participant</a></li>
                        </ul>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
                    <li><a href="${pageContext.request.contextPath}/registration"id="visited">Registration test</a></li>
                    <li><a href="${pageContext.request.contextPath}/add_dog_show">Add dog show test</a></li>
                    <%--<li><a class="cd-signin" href="#0">Sign up / Sign in</a></li>--%>
                    <li>
                        <nav class="main-nav ">
                            <!-- ссылки на вызов форм -->
                            <li><a  href="#0">Sign up / Sign in</a></li>
                            <%--<li><a class="cd-signup" href="#0">Регистрация</a></li>--%>
                    </nav>
                    </li>
                </ul>
            </div>
            <!-- mainmenu ends here -->

            <!-- Responsive Menu -->
            <form id="responsive-menu" action="#" method="post">
                <select>
                    <option value="">Navigation</option>
                    <option value="${pageContext.request.contextPath}/home_page">Home</option>
                    <option value="${pageContext.request.contextPath}/about">About</option>
                    <option value="${pageContext.request.contextPath}/contact">Contact</option>
                    <option value="${pageContext.request.contextPath}/register_dog">Register Dog</option>
                    <option value="${pageContext.request.contextPath}/register_participant">Register as Participant</option>
                    <option value="${pageContext.request.contextPath}/dogshows">Dog Shows</option>
                    <option value="${pageContext.request.contextPath}/reg">Registration test</option>
                    <option value="${pageContext.request.contextPath}/register_dog">Add Dog test</option>
                    <option value="${pageContext.request.contextPath}/add_dog_show">Add dog show test</option>
                    <option value="${pageContext.request.contextPath}/register_expert">Add Expert test</option>
                </select>
            </form>
        </div>
        <!-- mainmenu ends here -->
    </div>
    <!-- container ends here -->
</div>
<!-- header ends here -->

<div class="cd-user-modal"> <!-- все формы на фоне затемнения-->
    <div class="cd-user-modal-container"> <!-- основной контейнер -->
        <ul class="cd-switcher">
            <li><a href="#0">Вход</a></li>
            <li><a href="#0">Регистрация</a></li>
        </ul>

        <div id="cd-login"> <!-- форма входа -->
            <form class="cd-form">
                <p class="fieldset">
                    <label class="image-replace cd-email" for="signin-email">E-mail</label>
                    <input class="full-width has-padding has-border" id="signin-email" type="email" placeholder="E-mail">
                    <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                </p>

                <p class="fieldset">
                    <label class="image-replace cd-password" for="signin-password">Пароль</label>
                    <input class="full-width has-padding has-border" id="signin-password" type="text"  placeholder="Пароль">
                    <a href="#0" class="hide-password">Скрыть</a>
                    <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                </p>

                <p class="fieldset">
                    <input type="checkbox" id="remember-me" checked>
                    <label for="remember-me">Запомнить меня</label>
                </p>

                <p class="fieldset">
                    <input class="full-width" type="submit" value="Войти">
                </p>
            </form>

            <p class="cd-form-bottom-message"><a href="#0">Забыли свой пароль?</a></p>
            <!-- <a href="#0" class="cd-close-form">Close</a> -->
        </div> <!-- cd-login -->

        <div id="cd-signup"> <!-- форма регистрации -->
            <form class="cd-form">
                <p class="fieldset">
                    <label class="image-replace cd-username" for="signup-username">Имя пользователя</label>
                    <input class="full-width has-padding has-border" id="signup-username" type="text" placeholder="Имя пользователя">
                    <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                </p>

                <p class="fieldset">
                    <label class="image-replace cd-email" for="signup-email">E-mail</label>
                    <input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="E-mail">
                    <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                </p>

                <p class="fieldset">
                    <label class="image-replace cd-password" for="signup-password">Пароль</label>
                    <input class="full-width has-padding has-border" id="signup-password" type="text"  placeholder="Пароль">
                    <a href="#0" class="hide-password">Скрыть</a>
                    <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                </p>

                <p class="fieldset">
                    <input type="checkbox" id="accept-terms">
                    <label for="accept-terms">Я согласен с <a href="#0">Условиями</a></label>
                </p>

                <p class="fieldset">
                    <input class="full-width has-padding" type="submit" value="Создать аккаунт">
                </p>
            </form>

            <!-- <a href="#0" class="cd-close-form">Close</a> -->
        </div> <!-- cd-signup -->

        <div id="cd-reset-password"> <!-- форма восстановления пароля -->
            <p class="cd-form-message">Забыли пароль? Пожалуйста, введите адрес своей электронной почты. Вы получите ссылку, чтобы создать новый пароль.</p>

            <form class="cd-form">
                <p class="fieldset">
                    <label class="image-replace cd-email" for="reset-email">E-mail</label>
                    <input class="full-width has-padding has-border" id="reset-email" type="email" placeholder="E-mail">
                    <span class="cd-error-message">Здесь сообщение об ошибке!</span>
                </p>

                <p class="fieldset">
                    <input class="full-width has-padding" type="submit" value="Восстановить пароль">
                </p>
            </form>

            <p class="cd-form-bottom-message"><a href="#0">Вернуться к входу</a></p>
        </div> <!-- cd-reset-password -->
        <a href="#0" class="cd-close-form">Закрыть</a>
    </div>
</div>

<hr class="separator2">
<div class="socialsblock">
    <div class="container socialize">
        <h3>Socialize with us!</h3>
        <section class="socials">
            <ul class="socials">
                <li><a href="#"><img src="images/socials/twitter.png" alt="" /></a></li>
                <li><a href="#"><img src="images/socials/facebook.png" alt="" /></a></li>
                <li><a href="#"><img src="images/socials/dribbble.png" alt="" /></a></li>
                <li><a href="#"><img src="images/socials/google+.png" alt="" /></a></li>
                <li><a href="#"><img src="images/socials/linkedin.png" alt="" /></a></li>
                <li><a href="#"><img src="images/socials/youtube.png" alt="" /></a></li>
            </ul>
        </section>
    </div>
    <!-- container ends here -->
</div>
<!-- socialsblock ends here -->
<!-- Footer ==================================================
================================================== -->
<div class="footer">
    <div class="container">
        <div class="one_fourth">
            <h3>Contact Informations</h3>
            <p><span class="orange"><strong>Address:</strong></span> <br>
                Kharkiv, Ukraine</p>
            <p><span class="orange"><strong>Phone:</strong></span> <br>
                + 38 (093) 867 6925<br>
            </p>
            <p><span class="orange"><strong>Email:</strong></span> <br>
                safronov.maksim.v@gmail.com<br>
            </p>
        </div>
        <!-- four columns ends here -->
        <div class="one_fourth lastcolumn">
            <h3>About</h3>
            <p>There is a service, which help You to be aware of Dog Shows.</p>
        </div>
        <!-- four columns ends here -->
    </div>
    <!-- container ends here -->
</div>
<!-- footer ends here -->
<!-- Copyright ==================================================
================================================== -->
<div id="copyright">
    <div class="container">
        <p class="copyright">&copy; Copyright 2017. &quot;SERVICE NAME&quot; by Max Design. All rights reserved.</p>
    </div>
    <!-- container ends here -->
</div>
<!-- copyright ends here -->
<!-- End Document
================================================== -->
<!-- Scripts ==================================================
================================================== -->
<script src="js/jquery-1.8.0.min.js" type="text/javascript"></script>
<!-- Main js files -->
<script src="js/screen.js" type="text/javascript"></script>
<!-- Tabs -->
<script src="js/tabs.js" type="text/javascript"></script>
<!-- Include prettyPhoto -->
<script src="js/jquery.prettyPhoto.js" type="text/javascript"></script>
<!-- Include Superfish -->
<script src="js/superfish.js" type="text/javascript"></script>
<script src="js/hoverIntent.js" type="text/javascript"></script>
<!-- Flexslider -->
<script src="js/jquery.flexslider-min.js" type="text/javascript"></script>
<!-- Modernizr -->
<script type="text/javascript" src="js/modernizr.custom.29473.js"></script>
<script type="text/javascript" src="js/for_registration/main.js"></script>
<script type="text/javascript" src="js/for_registration/modernizr.js"></script>
</body>
</html>