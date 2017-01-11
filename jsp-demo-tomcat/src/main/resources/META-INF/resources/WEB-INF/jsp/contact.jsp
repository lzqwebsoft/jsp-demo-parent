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
    <title>Freebix Responsive Site Template</title>
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
                    <li><a href="${pageContext.request.contextPath}/contact" id="visited">Contact</a></li>
                    <li><a>Register</a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/register_dog">Register Dog</a></li>
                            <li><a href="${pageContext.request.contextPath}/register_participant">Register as Participant</a></li>
                        </ul>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
                    <li><a href="${pageContext.request.contextPath}/reg">Registration test</a></li>
                    <li><a href="${pageContext.request.contextPath}/register_dog">Add Dog test</a></li>
                    <li><a href="${pageContext.request.contextPath}/add_dog_show">Add dog show test</a></li>
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
                    <option value="${pageContext.request.contextPath}/reg_participant">Register as Participant</option>
                    <option value="${pageContext.request.contextPath}/dogshows">Dog Shows</option>
                    <option value="${pageContext.request.contextPath}/reg">Registration test</option>
                    <option value="${pageContext.request.contextPath}/register_dog">Add Dog test</option>
                    <option value="${pageContext.request.contextPath}/add_dog_show">Add dog show test</option>
                </select>
            </form>
        </div>
        <!-- mainmenu ends here -->
    </div>
    <!-- container ends here -->
</div>
<!-- header ends here -->
<!--Breadcrumbs ==================================================
================================================== -->
<div class="breadcrumbs">
    <div class="container">
        <header>
            <h3>Contact Page</h3>
        </header>
    </div>
    <!-- container ends here -->
    <hr class="separator1">
</div>
<!-- breadcrumbs ends here -->
<!-- Contact Content Part - GoogleMap ==================================================
================================================== -->
<section class="map">
    <!-- google map -->
    <div class="map-holder">
        <div class="map-container">
            <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d164152.76897293236!2d36.1457427!3d49.9947277!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4127a09f63ab0f8b%3A0x2d4c18681aa4be0a!2z0KXQsNGA0YzQutC-0LIsINCl0LDRgNGM0LrQvtCy0YHQutCw0Y8g0L7QsdC70LDRgdGC0Yw!5e0!3m2!1sru!2sua!4v1483647739377" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
            <!-- end google map -->
        </div>
        <!--map-container ends here-->
    </div>
    <!--map-holder ends here-->
</section>

<!-- Contact Content Part - Contact Form ==================================================
================================================== -->
<div class="container contact">
    <!-- Contact Sidebar ==================================================
  ================================================== -->
    <div class="one_third">
        <h3>My Info</h3>
        <section class="first shadow">
            <ul>
                <li>Kharkiv</li>
                <li>Phone: +38 (093) 867-6925</li>
                <li>Fax: (057) 738-0698</li>
                <li>Email: <a href="#" title="">safronov.maksim.v@gmail.com</a></li>
            </ul>
        </section>
    </div>
    <!-- one_third ends here -->
    <div class="two_third lastcolumn contact1">
        <div id="contactForm">
            <h3>Contact me</h3>
            <div class="sepContainer"></div>
            <form action="process.php" method="post" id="contact_form">
                <div class="name">
                    <label for="name">Your Name:</label>
                    <p> Please enter your full name</p>
                    <input id=name name=email type=text placeholder="e.g. Mr. John Smith" required />
                </div>
                <div class="email">
                    <label for="email">Your Email:</label>
                    <p> Please enter your email address</p>
                    <input id=email name=email type=email placeholder="example@domain.com" required />
                </div>
                <div class="message">
                    <label for="message">Your Message:</label>
                    <p> Please enter your question</p>
                    <textarea id=message name=message rows=6 cols=10 required></textarea>
                </div>
                <div id="loader">
                    <input type="submit" value="Submit" />
                </div>
            </form>
        </div>
        <!-- end contactForm -->
    </div>
</div>
<div class="blankSeparator"></div>

<!-- Socialize ==================================================
================================================== -->
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
</body>
</html>