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
                    <li><a href="${pageContext.request.contextPath}/home_page" id="visited">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                    <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                    <li><a>Register</a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/register_dog">Register Dog</a></li>
                            <li><a href="${pageContext.request.contextPath}/reg_participant">Register as Participant</a></li>
                        </ul>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
                    <li><a href="${pageContext.request.contextPath}/registration">Registration test</a></li>
                    <li><a href="${pageContext.request.contextPath}/register_dog">Add Dog test</a></li>
                    <li><a href="${pageContext.request.contextPath}/add_dog_show">Add dog show test</a></li>
                    <li><a href="${pageContext.request.contextPath}/register_expert">Add Expert test</a></li>
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
<!-- Slider ==================================================
================================================== -->
<section class="slider">
    <div class="flexslider">
        <ul class="slides">
            <li> <a href="#"><img src="dogshow_1.jpg" alt=""/></a></li>
            <li> <img src="dogshow_2.jpg" alt="" /></li>
            <li> <a href="#"><img src="dogshow_3.jpg" alt="" /></a></li>
        </ul>
    </div>
    <!-- flexslider ends here -->
</section>
<!-- slider ends here -->
<!-- info Box ==================================================
================================================== -->
<div class="infobox">
    <div class="container info">
        <header>
            <h1>Introducing SERVICE NAME!</h1>
        </header>
        <hr class="separator">
    </div>
    <!-- container ends here -->
</div>
<!-- infobox ends here -->
<!--Latest Photos ==================================================
================================================== -->
<div class="container latest">
    <div class="one_third">
        <figure class="shadow"><a href="#" class="thumb"><img src="images/portfolio/a.jpg" alt="alt" /></a>
            <figcaption> <a href="#">
                <h3 class="heading">Retro Movie</h3>
            </a>
                <p class="bioquote">One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. </p>
            </figcaption>
        </figure>
    </div>
    <!-- one_third ends here -->
    <div class="one_third">
        <figure class="shadow"><a href="#" class="thumb"><img src="images/portfolio/b.jpg" alt="alt" /></a>
            <figcaption> <a href="#">
                <h3 class="heading">Retro Movie</h3>
            </a>
                <p class="bioquote">One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. </p>
            </figcaption>
        </figure>
    </div>
    <!-- one_third ends here -->
    <div class="one_third lastcolumn">
        <figure class="shadow"><a href="#" class="thumb"><img src="images/portfolio/c.jpg" alt="alt" /></a>
            <figcaption> <a href="#">
                <h3 class="heading">Retro Movie</h3>
            </a>
                <p class="bioquote">One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. </p>
            </figcaption>
        </figure>
    </div>
    <!-- one_third ends here -->
</div>
<!-- end container -->
<!--Heading Box ==================================================
================================================== -->
<div class="headingblock">
    <div class="container heading">
        <header>
            <h2>Introducing Freebix!</h2>
            <p>- Free, fully <span class="pink">responsive HTML</span> site template made by <a href="http://www.anarieldesign.com/" rel="nofollow"><strong>Anariel Design</strong></a> -</p>
        </header>
    </div>
    <!-- container ends here -->
    <hr class="separator1">
</div>
<!-- headingblock ends here -->
<!-- Latest News & Faq ==================================================
================================================== -->
<div class="container latest">
    <div class="two_third">
        <div class="accordion-trigger">
            <h3>What did you eat for breakfast?</h3>
        </div>
        <div class="accordion-container">
            <div class="one_third"> <img class="shadow" src="images/portfolio/a.jpg" alt="" /> </div>
            <!--end one_third-->
            <div class="one_third"> <img class="shadow" src="images/portfolio/b.jpg" alt="" /> </div>
            <!--end one_third-->
            <div class="one_third lastcolumn"> <img class="shadow" src="images/portfolio/c.jpg" alt="" /> </div>
            <!--end one_third-->
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. </p>
            <hr class="separator1">
        </div>
        <div class="accordion-trigger">
            <h3>Morning or Night person?</h3>
        </div>
        <div class="accordion-container">
            <div class="one_half">
                <div class="video-holder">
                    <div class="video-container">
                        <iframe title="YouTube video player" class="youtube-player" src="http://www.youtube.com/embed/W7JXcoTty3Q"></iframe>
                    </div>
                    <!--video-container ends here-->
                </div>
                <!--video-holder ends here-->
            </div>
            <!--end one_half-->
            <div class="one_half lastcolumn">
                <div class="video-holder">
                    <div class="video-container">
                        <iframe title="YouTube video player" class="youtube-player" src="http://www.youtube.com/embed/W7JXcoTty3Q"></iframe>
                    </div>
                    <!--video-container ends here-->
                </div>
                <!--video-holder ends here-->
            </div>
            <!--end one_half-->
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. </p>
            <hr class="separator1">
        </div>
        <div class="accordion-trigger">
            <h3>If you were a animal, which would you be?</h3>
        </div>
        <div class="accordion-container">
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. </p>
            <hr class="separator1">
        </div>
        <div class="accordion-trigger">
            <h3>Your favorite places in the world?</h3>
        </div>
        <div class="accordion-container">
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. </p>
            <hr class="separator1">
        </div>
        <div class="accordion-trigger">
            <h3>Your favorite color?</h3>
        </div>
        <div class="accordion-container">
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. </p>
            <hr class="separator1">
        </div>
        <div class="accordion-trigger">
            <h3>The 5 things you can't live without?</h3>
        </div>
        <div class="accordion-container">
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper.</p>
            <hr class="separator1">
            <!-- ENDS Accordions -->
        </div>
    </div>
    <!-- two_third ends here -->
    <div class="one_third lastcolumn">
        <h3>New Entries</h3>
        <article>
            <p>One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin.</p>
            <p class="quote">One morning, when Gregor Samsa woke from troubled dreams.</p>
            <a href="#" title="">&rarr; download</a></article>
        <hr class="separator1">
        <article>
            <p>One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin.</p>
            <p class="quote">One morning, when Gregor Samsa woke from troubled dreams.</p>
            <a href="#" title="">&rarr; download</a></article>
        <hr class="separator1">
        <article>
            <p>One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin.</p>
            <p class="quote">One morning, when Gregor Samsa woke from troubled dreams.</p>
            <a href="#" title="">&rarr; download</a></article>
    </div>
    <!-- one_third ends here -->
</div>
<!-- end container -->
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