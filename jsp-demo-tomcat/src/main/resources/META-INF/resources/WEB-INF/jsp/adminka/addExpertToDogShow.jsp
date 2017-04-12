<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %><%
    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Pragma","no-cache");
    response.setHeader("Expires","0");

%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<c:set var="ctx" value="${pageContext['request'].contextPath}"/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="${pageContext.request.contextPath}/adminka/assets/img/apple-icon.png" />
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/adminka/assets/img/favicon.png" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta http-equiv="content-type" content="text/html; charset=utf-8">


    <title>Material Dashboard by Creative Tim</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />

    <!-- Bootstrap core CSS     -->
    <link href="${pageContext.request.contextPath}/adminka/css/bootstrap.min.css" rel="stylesheet" />

    <!--  Material Dashboard CSS    -->
    <link href="${pageContext.request.contextPath}/adminka/css/material-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="${pageContext.request.contextPath}/adminka/css/demo.css" rel="stylesheet" />

    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>
</head>

<body>

<div class="wrapper">

    <div class="sidebar" data-color="purple" data-image="${pageContext.request.contextPath}/adminka/img/sidebar-1.jpg">
        <!--
            Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

            Tip 2: you can also add an image using data-image tag
        -->

        <div class="logo">
            <a href="${pageContext.request.contextPath}/home_page" class="simple-text">
                Dog Show Live
            </a>
        </div>

        <div class="sidebar-wrapper">
            <ul class="nav">
                <li>
                    <a href="${pageContext.request.contextPath}/admin/home_page">
                        <i class="material-icons">dashboard</i>
                        Главная панель
                    </a>
                </li>
                <li>
                    <a data-toggle="collapse" data-target="#Add">
                        <i class="material-icons">library_add</i>
                        Добавить
                    </a>
                    <div id="Add" class="collapse in">
                        <ul class="active"><a href="${pageContext.request.contextPath}/admin/createDogShow">Выставку</a></ul>
                        <ul><a href="${pageContext.request.contextPath}/admin/addDogToShow">Собаку на выставку</a></ul>
                        <ul><a href="${pageContext.request.contextPath}/admin/addExpertToDogShow">Эксперта на выставку</a></ul>
                        <a data-toggle="collapse" data-target="#Participant">
                            <i class="material-icons">accessibility</i>
                            На конкурс
                        </a>
                        <div id="Participant" class="collapse in">
                            <ul><a href="${pageContext.request.contextPath}/admin/addDogToContest">Собаку на конкурс</a></ul>
                            <ul><a href="${pageContext.request.contextPath}/admin/addParticipant">Человека на конкурс</a></ul>
                        </div>
                    </div>
                <li>
                </li>
                </li>
                <li>
                    <a href="typography.html">
                        <i class="material-icons">library_books</i>
                        <p>Typography</p>
                    </a>
                </li>
                <li>
                    <a href="icons.html">
                        <i class="material-icons">bubble_chart</i>
                        <p>Icons</p>
                    </a>
                </li>
                <li>
                    <a href="maps.html">
                        <i class="material-icons">location_on</i>
                        <p>Maps</p>
                    </a>
                </li>
                <li>
                    <a href="notifications.html">
                        <i class="material-icons text-gray">notifications</i>
                        <p>Notifications</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-transparent navbar-absolute">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/admin/home_page">Organizer's Dashboard</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#pablo" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="material-icons">dashboard</i>
                                <p class="hidden-lg hidden-md">Dashboard</p>
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="material-icons">notifications</i>
                                <span class="notification">5</span>
                                <p class="hidden-lg hidden-md">Notifications</p>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Mike John responded to your email</a></li>
                                <li><a href="#">You have 5 new tasks</a></li>
                                <li><a href="#">You're now friend with Andrew</a></li>
                                <li><a href="#">Another Notification</a></li>
                                <li><a href="#">Another One</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="material-icons">person</i>
                                <p class="hidden-lg hidden-md">Profile</p>
                            </a>
                            <ul class="dropdown-menu">
                                <li><security:authorize access="isAuthenticated()">
                                    <a >Logged as <strong><security:authentication property="principal.username" /></strong></a>
                                </security:authorize></li>
                                <li><a href="${pageContext.request.contextPath}/admin/userDetails">User Details</a></li>
                                <li><a href="${pageContext.request.contextPath}/logout">Log out</a></li>

                            </ul>
                        </li>
                    </ul>

                    <form class="navbar-form navbar-right" role="search">
                        <div class="form-group  is-empty">
                            <input type="text" class="form-control" placeholder="Search">
                            <span class="material-input"></span>
                        </div>
                        <button type="submit" class="btn btn-white btn-round btn-just-icon">
                            <i class="material-icons">search</i><div class="ripple-container"></div>
                        </button>
                    </form>
                </div>
            </div>
        </nav>

        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-auto">
                        <div class="card">
                            <div class="card-header" data-background-color="green">
                                <h4 class="title">Добавить выставку</h4>
                            </div>
                            <div class="card-content">
                                <form method="POST" action="/admin/addTest">
                                    <div class="row">
                                        <div class="col-md-3">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Имя(First Name):</label>
                                                <input type="text" class="form-control" name="fname" id="fname">
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Фамилия(Second Name):</label>
                                                <input type="text" class="form-control" name="sname" id="sname">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Отчество(Last Name):</label>
                                                <input type="text" class="form-control" name="lname" id="lname">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-auto">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Страна проживания</label>
                                                <input type="text" class="form-control" name="country" id="country">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>Описание эксперта</label>
                                                <div class="form-group label-floating">
                                                    <label class="control-label"></label>
                                                    <textarea class="form-control" rows="5" name="description" id="description"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-primary pull-right">Добавить</button>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <footer class="footer">
                <div class="container-fluid">
                    <nav class="pull-left">
                        <ul>
                            <li>
                                <a href="#">
                                    Home
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Company
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Portfolio
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Blog
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <p class="copyright pull-right">
                        &copy; <script>document.write(new Date().getFullYear())</script> <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
                    </p>
                </div>
            </footer>
        </div>
    </div>

    <footer class="footer">
        <div class="container-fluid">
            <nav class="pull-left">
                <ul>
                    <li>
                        <a href="#">
                            Home
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            Company
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            Portfolio
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            Blog
                        </a>
                    </li>
                </ul>
            </nav>
            <p class="copyright pull-right">
                &copy; <script>document.write(new Date().getFullYear())</script> <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
            </p>
        </div>
    </footer>
</div>
</div>

</body>

<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/adminka/js/jquery-3.1.0.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/adminka/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/adminka/js/material.min.js" type="text/javascript"></script>

<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/adminka/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/adminka/js/bootstrap-notify.js"></script>

<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>

<!-- Material Dashboard javascript methods -->
<script src="${pageContext.request.contextPath}/adminka/js/material-dashboard.js"></script>

<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script src="${pageContext.request.contextPath}/adminka/js/demo.js"></script>

<script type="text/javascript">
    $(document).ready(function(){

        // Javascript method's body can be found in assets/js/demos.js
        demo.initDashboardPageCharts();

    });

</script>

</html>
