<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Pragma","no-cache");
    response.setHeader("Expires","0");

%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
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

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/skeleton.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/screen.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.bootstrap_3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/prettyPhoto.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery.tablesorter.pager.css" type="text/css" media="screen" />

    <!-- Favicons ==================================================
    ================================================== -->

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico">
    <link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath}/images/favicon.ico"/>
    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/images/favicon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="${pageContext.request.contextPath}/images/favicon.png">
    <link rel="apple-touch-icon" sizes="114x114" href="${pageContext.request.contextPath}/images/favicon.png">

    <!-- Google Fonts ==================================================
    ================================================== -->
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <style>
        .tablesorter-pager .btn-group-sm .btn {
            font-size: 1.2em; /* make pager arrows more visible */
        }
    </style>
</head>
<body>

<!--Content Part ==================================================
================================================== -->
<div id="header">
    <div class="container">
        <!-- Header | Logo, Menu
            ================================================== -->
        <div class="logo"><a href="${pageContext.request.contextPath}/home_page" al><img src="${pageContext.request.contextPath}/images/logo.png" alt="" style="height: 120px; margin-bottom: 10px"/></a></div>
        <div class="mainmenu">
            <div id="mainmenu">
                <ul class="sf-menu">
                    <li><a href="${pageContext.request.contextPath}/home_page">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                    <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                    <li><a>Register</a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/register_dog">Register Dog</a></li>
                            <li><a>Register to Contest</a>
                                <ul>
                                    <li><a href="${pageContext.request.contextPath}/reg_participant">Register as Participant</a></li>
                                    <li><a href="${pageContext.request.contextPath}/reg_dog_contest">Register dog to contest</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/dogshows" id="visited">Dog Shows</a></li>
                    <li><a href="${pageContext.request.contextPath}/add_dog_show">Add dog show</a></li>
                    <li><a href="${pageContext.request.contextPath}/register_expert">Add Expert</a></li>
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
<!--Breadcrumbs ==================================================
================================================== -->

<div class="breadcrumbs">
    <div class="container">
        <header>
            <h3><c:out value="${showdet.title}"/></h3>
        </header>
    </div>
    <!-- container ends here -->
    <%--RAZDELITEL--%>
    <hr class="separator1">
</div>
<!-- breadcrumbs ends here -->
<!-- Blog Single ==================================================
================================================== -->
<div class="container" align="center">


    <table id="travel" class="table table-striped table-bordered" cellspacing="0" width="100%" align="center" style="text-align: center">


        <thead class="thead-inverse">
        <tr>
            <th>Breed</th>
            <th>Name</th>
            <th>FCI Group</th>
            <th>Gender</th>
            <th>Date Of Birth</th>
            <th>Color</th>
            <th>Chip</th>
            <th>Brand</th>
            <th>Pedigree</th>
            <th>Sire</th>
            <th>Dam</th>
            <th>Breeder</th>
            <th>Owner</th>
        </tr>


        </thead>

        <tfoot>
        <tr>
            <th>Breed</th>
            <th>Name</th>
            <th>FCI Group</th>
            <th>Gender</th>
            <th>Date Of Birth</th>
            <th>Color</th>
            <th>Chip</th>
            <th>Brand</th>
            <th>Pedigree</th>
            <th>Sire</th>
            <th>Dam</th>
            <th>Breeder</th>
            <th>Owner</th>
        </tr>
        </tfoot>

        <tbody>
        <c:forEach var="dog" items="${dogs_registered_list}">
        <tr>
            <td>${dog.breed.title}</td>
            <td>${dog.name}</td>
            <td>${dog.breed.fciGroup.number}</td>
            <td>${dog.gender}</td>
            <td><fmt:formatDate value="${dog.dob}" pattern="dd MMM yyyy" /></td>
            <td>${dog.colour.title}</td>
            <td>${dog.chip}</td>
            <td>${dog.brand}</td>
            <td>${dog.pedigree}</td>
            <td>${dog.sire}</td>
            <td>${dog.dam}</td>
            <td>${dog.breeder.fname} ${dog.breeder.sname} ${dog.breeder.lname}</td>
            <td>${dog.owner.fname} ${dog.owner.sname} ${dog.owner.lname}</td>
        </tr>
        </c:forEach>


        </tbody>

    </table>


    <hr class="separator2">



</div>

<!-- container ends here -->

<!-- Socialize ==================================================
================================================== -->
<hr class="separator2">
<div class="socialsblock">
    <div class="container socialize">
        <h3>Socialize with us!</h3>
        <section class="socials">
            <ul class="socials">
                <li><a href="#"><img src="${pageContext.request.contextPath}/images/socials/twitter.png" alt="" /></a></li>
                <li><a href="#"><img src="${pageContext.request.contextPath}/images/socials/facebook.png" alt="" /></a></li>
                <li><a href="#"><img src="${pageContext.request.contextPath}/images/socials/dribbble.png" alt="" /></a></li>
                <li><a href="#"><img src="${pageContext.request.contextPath}/images/socials/google+.png" alt="" /></a></li>
                <li><a href="#"><img src="${pageContext.request.contextPath}/images/socials/linkedin.png" alt="" /></a></li>
                <li><a href="#"><img src="${pageContext.request.contextPath}/images/socials/youtube.png" alt="" /></a></li>
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
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/jquery.browser.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/js/dataTables.bootstrap.min.js"></script>
<%--<script src="${pageContext.request.contextPath}/js/jquery.tablesorter.js" type="text/javascript"></script>--%>
<%--<script src="${pageContext.request.contextPath}/js/jquery.tablesorter.widgets.js" type="text/javascript"></script>--%>
<%--<script src="${pageContext.request.contextPath}/js/jquery.tablesorter.pager.js" type="text/javascript"></script>--%>
<script src="${pageContext.request.contextPath}/js/table.js" type="text/javascript"></script>

<!-- Main js files -->
<script src="${pageContext.request.contextPath}/js/screen.js" type="text/javascript"></script>
<!-- Tabs -->
<script src="${pageContext.request.contextPath}/js/tabs.js" type="text/javascript"></script>
<!-- Include prettyPhoto -->
<script src="${pageContext.request.contextPath}/js/jquery.prettyPhoto.js" type="text/javascript"></script>
<!-- Include Superfish -->
<script src="${pageContext.request.contextPath}/js/superfish.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/hoverIntent.js" type="text/javascript"></script>
<!-- Flexslider -->
<script src="${pageContext.request.contextPath}/js/jquery.flexslider-min.js" type="text/javascript"></script>
<!-- Modernizr -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/modernizr.custom.29473.js"></script>





</body>
</html>