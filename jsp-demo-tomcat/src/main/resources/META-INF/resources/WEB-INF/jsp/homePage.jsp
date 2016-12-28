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
<head>
	<meta charset="utf-8">
	<title>Home Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<!-- Bootstrap -->
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">

	<!--Font-->
	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600' rel='stylesheet' type='text/css'>



	<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- Fav and touch icons -->
	<link rel="shortcut icon" href="ico/favicon.ico">
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed" href="ico/apple-touch-icon-57-precomposed.png">




	<!-- SCRIPT
    ============================================================-->
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>


</head>
<body>
<div class="width=100% height=100% align-left"></div>
<div class="width=100% height=100% align-left"></div>
<div class="align-left"></div>
<div style="position:absolute;left:-3072px;top:0"><a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#108;&#105;&#110;&#105;&#121;&#97;&#111;&#107;&#111;&#110;&#46;&#114;&#117;">&#1086;&#1082;&#1085;&#1072;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#112;&#114;&#101;&#109;&#105;&#117;&#109;&#107;&#97;&#100;&#114;&#46;&#114;&#117;">&#1092;&#1086;&#1090;&#1086;&#1075;&#1088;&#1072;&#1092;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#117;&#110;&#105;&#115;&#104;&#97;&#98;&#108;&#111;&#110;.&#99;&#111;&#109;">html php</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#114;&#105;&#116;&#117;&#97;&#108;&#103;&#97;&#114;&#97;&#110;&#116;&#46;&#114;&#117;">&#1087;&#1072;&#1084;&#1103;&#1090;&#1085;&#1080;&#1082;&#1080;</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#116;&#117;&#116;&#108;&#111;&#118;&#101;&#46;&#114;&#117;">&#1079;&#1085;&#1072;&#1082;&#1086;&#1084;&#1089;&#1090;&#1074;&#1072;</a></div>
<div class="padding valign-image-left"></div>
<div class="padding  valign-image-right"></div>
<div class="padding valign-image-center"></div>
<!--HEADER ROW-->
<div id="header-row">
	<div class="container">
		<div class="row">
			<!--LOGO-->
			<div class="span3"><a href="${pageContext.request.contextPath}/home_page" class="brand" href="#"><img src="v3.png"/></a></div>
			<!-- /LOGO -->

			<!-- MAIN NAVIGATION -->
			<div class="span9">
				<div class="navbar  pull-right">
					<div class="navbar-inner">
						<a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a>
						<div class="nav-collapse collapse navbar-responsive-collapse">
							<ul class="nav">
								<li class="active"><a href="${pageContext.request.contextPath}/home_page">Home</a></li>
								<li class="dropdown">
									<a class="dropdown-toggle" data-toggle="dropdown">Register <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li><a href="${pageContext.request.contextPath}/register_dog">Register dog</a></li>
										<li><a href="${pageContext.request.contextPath}/register_participant">Register participant</a></li>
									</ul>

								</li>

								<li><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
								<li><a href="${pageContext.request.contextPath}/about">About</a></li>
								<li><a href="${pageContext.request.contextPath}/reg">Registration test</a></li>
								<li><a href="${pageContext.request.contextPath}/breeder">Dogs test</a></li>
								<li><a href="${pageContext.request.contextPath}/add_dogshows">Add dog show test</a></li>

							</ul>
						</div>

					</div>
				</div>
			</div>
			<!-- MAIN NAVIGATION -->
		</div>
	</div>
</div>
<!-- /HEADER ROW -->




<div class="container">

	<!--Carousel
    ==================================================-->

	<div id="myCarousel" class="carousel slide">
		<div class="carousel-inner">

			<div class="active item">
				<div class="container">
					<div class="row">

						<div class="span6">

							<div class="carousel-caption">
								<h1>Dogs In Pocket.</h1>
								<h1>Smart. Easy.</h1>
								<h1> Always in Your pocket!</h1>
								<a class="btn btn-large btn-primary" href="${pageContext.request.contextPath}/reg">Join us today!</a>
							</div>

						</div>

						<div class="span6"> <img src="dog-show.jpg"></div>

					</div>
				</div>




			</div>

			<div class="item">

				<div class="container">
					<div class="row">

						<div class="span6">

							<div class="carousel-caption">
								<h1>Register Your dog at Dog Show!</h1>
								<p class="lead"></p>
								<a class="btn btn-large btn-primary" href="${pageContext.request.contextPath}/register_dog">Register now!</a>
							</div>

						</div>

						<div class="span6"> <img src="uku.jpg"></div>

					</div>
				</div>

			</div>





		</div>
		<!-- Carousel nav -->
		<a class="carousel-control left " href="#myCarousel" data-slide="prev"><i class="icon-chevron-left"></i></a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next"><i class="icon-chevron-right"></i></a>
		<!-- /.Carousel nav -->

	</div>
	<!-- /Carousel -->



	<!-- Feature
      ==============================================-->


	<div class="row feature-box">
		<div class="span12 cnt-title">
			<h1>At vero eos et accusamus et iusto odio dignissimos</h1>
			<span>Contrary to popular belief, Lorem Ipsum is not simply random text.</span>
		</div>

		<div class="span4">
			<img src="img/icon3.png">
			<h2>Feature A</h2>
			<p>
				Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
			</p>

			<a href="#">Read More &rarr;</a>

		</div>

		<div class="span4">
			<img src="img/icon2.png">
			<h2>Feature B</h2>
			<p>
				Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna
				aliqua.
			</p>
			<a href="#">Read More &rarr;</a>
		</div>

		<div class="span4">
			<img src="img/icon1.png">
			<h2>Feature C</h2>
			<p>
				Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.
			</p>
			<a href="#">Read More &rarr;</a>
		</div>
	</div>


	<!-- /.Feature -->

	<div class="hr-divider"></div>

	<!-- Row View -->


	<div class="row">
		<div class="span6"><img src="img/responsive.png"></div>

		<div class="span6">
			<img class="hidden-phone" src="img/icon4.png" alt="">
			<h1>Fully Responsive</h1>
			<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
			<a href="#">Read More &rarr;</a>
		</div>
	</div>


</div>


<!-- /.Row View -->



<!--Footer
==========================-->

<footer>
	<div class="container">
		<div class="row">
			<div class="span6">Copyright &copy <script type='text/javascript'>var mdate = new Date();document.write(mdate.getFullYear());</script> Safronov Maksym | All Rights Reserved  <br>
				<small>May the Force be with you.</small>
			</div>
			<div class="span6">
				<div class="social pull-right">
					<a href="#"><img src="img/social/googleplus.png" alt=""></a>
					<a href="#"><img src="img/social/dribbble.png" alt=""></a>
					<a href="#"><img src="img/social/twitter.png" alt=""></a>
					<a href="#"><img src="img/social/dribbble.png" alt=""></a>
					<a href="#"><img src="img/social/rss.png" alt=""></a>
				</div>
			</div>
		</div>
	</div><div style="position:absolute;left:-3072px;top:0"><div class="width=100% height=100% align-left"></div><div class="align-left" width="1"></div><a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#108;&#105;&#110;&#105;&#121;&#97;&#111;&#107;&#111;&#110;&#46;&#114;&#117;">&#1086;&#1082;&#1085;&#1072;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#112;&#114;&#101;&#109;&#105;&#117;&#109;&#107;&#97;&#100;&#114;&#46;&#114;&#117;">&#1092;&#1086;&#1090;&#1086;&#1075;&#1088;&#1072;&#1092;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#117;&#110;&#105;&#115;&#104;&#97;&#98;&#108;&#111;&#110;.&#99;&#111;&#109;">html php</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#114;&#105;&#116;&#117;&#97;&#108;&#103;&#97;&#114;&#97;&#110;&#116;&#46;&#114;&#117;">&#1087;&#1072;&#1084;&#1103;&#1090;&#1085;&#1080;&#1082;&#1080;</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#116;&#117;&#116;&#108;&#111;&#118;&#101;&#46;&#114;&#117;">&#1079;&#1085;&#1072;&#1082;&#1086;&#1084;&#1089;&#1090;&#1074;&#1072;</a></div>
</footer>

<!--/.Footer-->

</body>
</html>