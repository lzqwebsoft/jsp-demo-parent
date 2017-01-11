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
    <title>Register Dog</title>
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
                    <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                    <li><a id="visited">Register</a>
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
                    <option value="${pageContext.request.contextPath}/register_participant">Register as Participant</option>
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
            <h3>Register Dog Page</h3>
        </header>
    </div>
    <!-- container ends here -->
    <hr class="separator1">
</div>
<!-- breadcrumbs ends here -->
<!-- Contact Content Part - Contact Form ==================================================
================================================== -->
<div class="container contact">
    <!-- Contact Sidebar ==================================================
  ================================================== -->
    <div class="two_third lastcolumn contact1">
        <div id="contactForm">
            <h1>Fill in all the fields!</h1>
            <div class="sepContainer"></div>
            <form action="add_dog" method="POST" id="contact_form">
                <div class="name">
                    <label for="name">Dog's Name:</label>
                    <input type=text id=name name="name" value="<c:out value="${dog.name}"/>" required/>
                </div>
                <div class="name">
                    <label for="dob">Dog's date of birth :</label>
                    <input type="date" id="dob" name="dob" max=<fmt:formatDate value="${date}" pattern="yyyy-MM-dd" /> value="<c:out value="${dog.dob}"/>" required/>
                </div>
                <div class="name">
                    <label for="gender">Dog's Gender:</label>
                    <select name="gender" id="gender">
                        <option disabled> Choose Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select>
                    <%--<input type="text" id="gender" name="gender" value="<c:out value="${dog.gender}"/>" required/>--%>
                </div>
                <div class="name">
                    <label for="color">Dog's Color:</label>
                    <input type="text" id="color" name="color" value="<c:out value="${dog.color}"/>" required/>
                </div>
                <div class="name">
                    <label for="chip">Dog's Chip:</label>
                    <input type="text" id="chip" name="chip" value="<c:out value="${dog.chip}"/>" required/>
                </div>
                <div class="name">
                    <label for="brand">Dog's Brand:</label>
                    <input type="text" id="brand" name="brand" value="<c:out value="${dog.brand}"/>" required/>
                </div>
                <div class="name">
                    <label for="pedigree">Dog's Pedigree:</label>
                    <input type="text" id="pedigree" name="pedigree" value="<c:out value="${dog.pedigree}"/>" required/>
                </div>
                <div class="name">
                    <label for="sire">Dog's Sire:</label>
                    <input type="text" id="sire" name="sire" value="<c:out value="${dog.sire}"/>" required/>
                </div>
                <div class="name">
                    <label for="dam">Dog's Dam:</label>
                    <input type="text" id="dam" name="dam" value="<c:out value="${dog.dam}"/>" required/>
                </div>
                <div class="name">
                    <label for="fcigroup">Dog's Fci Group:</label>
                    <input type="number" size="1" min="1" max="11" id="fcigroup" name="fcigroup" value="<c:out value="${dog.fcigroup}"/>" required/>
                </div>
                <div class="name">
                    <label for="breed">Dog's Breed:</label>
                    <input type="text" id="breed" name="breed" value="<c:out value="${dog.breed}"/>" required/>
                </div>
                <div class="name">
                    <label for="breeder_fname">Input breeder's first name:</label>
                    <input type="text" id="breeder_fname" name="breeder_fname" value="<c:out value="${breeder.fname}"/>" required/>
                </div>
                <div class="name">
                    <label for="breeder_sname">Input breeder's second name:</label>
                    <input type="text" id="breeder_sname" name="breeder_sname" value="<c:out value="${breeder.sname}"/>" required/>
                </div>
                <div class="name">
                    <label for="breeder_lname">Input breeder's last name:</label>
                    <input type="text" id="breeder_lname" name="breeder_lname" value="<c:out value="${breeder.lname}"/>" required/>
                </div>
                <div class="name">
                    <label for="owner_fname">Input owner's first name:</label>
                    <input type="text" id="owner_fname" name="owner_fname" value="<c:out value="${owner.fname}"/>" required/>
                </div>
                <div class="name">
                <label for="owner_sname">Input owner's second name:</label>
                <input type="text" id="owner_sname" name="owner_sname" value="<c:out value="${owner.sname}"/>" required/>
            </div>
                <div class="name">
                    <label for="owner_lname">Input owner's last name:</label>
                    <input type="text" id="owner_lname" name="owner_lname" value="<c:out value="${owner.lname}"/>" required/>
                </div>
                <div class="name">
                    <label for="owner_location">Input owner's location:</label>
                    <input type="text" id="owner_location" name="owner_location" value="<c:out value="${owner.location}"/>" required/>
                </div>
                <form:select path="dogshow_list" id="dogshow_id" name="dogshow_id">
                    <form:option  value="" label="Select Dog Show"></form:option>
                    <form:options items="${dogshow_list}" itemLabel="title" itemValue="dogshow_id"></form:options>
                </form:select>
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