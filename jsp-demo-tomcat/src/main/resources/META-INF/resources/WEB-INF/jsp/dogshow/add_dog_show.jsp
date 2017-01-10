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
    <script>
        $(document)
            .ready(
                function() {
                    //add more file components if Add is clicked
                    $('#addFile')
                        .click(
                            function() {
                                var fileIndex = $('#fileTable tr')
                                        .children().length - 1;
                                $('#fileTable')
                                    .append(
                                        '<tr><td>'
                                        + '   <input type="file" name="files['+ fileIndex +']" />'
                                        + '</td></tr>');
                            });

                });
    </script>
    <!-- Basic Page Needs ==================================================
    ================================================== -->

    <meta charset="utf-8">
    <title>Add Dog Show</title>
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
                    <li><a>Register</a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/register_dog">Register Dog</a></li>
                            <li><a href="${pageContext.request.contextPath}/register_participant">Register as Participant</a></li>
                        </ul>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
                    <li><a href="${pageContext.request.contextPath}/reg">Registration test</a></li>
                    <li><a href="${pageContext.request.contextPath}/register_dog">Add Dog test</a></li>
                    <li><a href="${pageContext.request.contextPath}/add_dog_show" id="visited">Add dog show test</a></li>
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
            <h3>Add Dog Show Page</h3>
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
            <form action="add_show" method="POST" id="contact_form" enctype="multipart/form-data">
                <div class="name">
                    <label for="title">Dog Show's Title:</label>
                    <input type=text id=title name="title" value="<c:out value="${dogshow.title}"/>" required/>
                </div>
                <div class="name">
                    <label for="date">Dog Show's Date:</label>
                    <input type="date" id="date" name="date" value="<c:out value="${dogshow.date}"/>" required/>
                </div>
                <div class="name">
                    <label for="sponsor">Dog Show's Sponsor:</label>
                    <input type="text" id="sponsor" name="sponsor" value="<c:out value="${dogshow.sponsor}"/>" required/>
                </div>
                <div class="name">
                    <label for="description">Dog Show's Description:</label>
                    <%--<input type="text" id="description" name="description" value="<c:out value="${dogshow.description}"/>" required/>--%>
                    <textarea id=description name=description rows=6 cols=10 maxlength="200" value="<c:out value="${dogshow.description}"/>" required></textarea>
                </div>
                <div class="name">
                    <label for="address">Dog Show's Address:</label>
                    <input type="text" id="address" name="address" value="<c:out value="${dogshow.address}"/>" required/>
                </div>
                <div class="name">
                    <label for="organizer">Dog Show's Organizer:</label>
                    <input type="text" id="organizer" name="organizer" value="<c:out value="${dogshow.organizer}"/>" required/>
                </div>
                <div class="name">
                    <label for="contest_title">Title of Your Contest:</label>
                    <input type="text" id="contest_title" name="contest_title" value="<c:out value="${contest.contest_title}"/>" required/>
                </div>
                <div class="name">
                    <label for="contest_description">Contest Description:</label>
                    <%--<input type="text" id="contest_description" name="contest_description" value="<c:out value="${contest.contest_description}"/>" required/>--%>
                    <textarea id=contest_description name=contest_description rows=6 cols=10 maxlength="100" value="<c:out value="${contest.contest_description}"/>" required></textarea>
                </div>
                <div class="name">
                    <label for="contest_type_list">For whom will be Your Contest:</label>
                    <%--<input type="text" id="contest_type" name="contest_type" value="<c:out value="${contest_type.forwhom}"/>" required/>--%>
                    <form:select path="contest_type_list" id="contest_type_list" name="contest_type_id">
                    <form:option  value="" label="Select Contest"></form:option>
                    <form:options items="${contest_type_list}" itemLabel="forwhom" itemValue="contest_type_id"></form:options>
                    </form:select>
                </div>
                <table>
                    <tr>
                        <td><form:label path="file">Select photo to upload</form:label></td>
                        <td><input type="file" name="file"></td>
                    </tr>
                </table>

                    <div id="loader">
                    <input type="submit" value="Submit">Submit form</input>
                    </div>
            </form>

            <%--<form:form method="post" enctype="multipart/form-data"--%>
                       <%--modelAttribute="uploadedFile" action="add_show">--%>

            <%--</form:form>--%>

            <%--<form:form action="savefiles" name="savefiles" method="POST"--%>
                         <%--modelAttribute="uploadForm" enctype="multipart/form-data">--%>

            <%--<p>Select photo to upload. Press Add button to add more file--%>
                <%--inputs.</p>--%>

            <%--<table id="fileTable">--%>
                <%--<tr>--%>
                    <%--<td><input name="files[1]" type="file" /></td>--%>
                <%--</tr>--%>
            <%--</table>--%>
            <%--<br />--%>
            <%--<input type="submit" value="submit photo" />--%>
            <%--<input id="addFile" type="button" value="Add File" />--%>
        <%--</form:form>--%>
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