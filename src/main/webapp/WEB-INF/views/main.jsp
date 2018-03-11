<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" %>
<link href="<c:url value='/bootstrap/css/mypage.css'/>" rel="stylesheet">

<!-- Custom styles for this template -->    
<link href="<c:url value='/bootstrap/css/agency.css'/>" rel="stylesheet">
<!-- Custom fonts for this template -->
<link href="https://use.fontawesome.com/releases/v5.0.8/css/all.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>


<!-- Header -->
<header>
	<div>
		<div>
			<!-- The carousel -->
			<div id="transition-timer-carousel"
				class="carousel slide transition-timer-carousel"
				data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#transition-timer-carousel" data-slide-to="0"
						class="active"></li>
					<li data-target="#transition-timer-carousel" data-slide-to="1"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner">
					<div class="item active">
						<img src="<c:url value='/images/area_event_1600_500.jpg'/>" />
						<div class="carousel-caption">
							
						</div>
					</div>

					<div class="item">
						<img src="<c:url value='/images/home_event_1600_500.jpg'/>" />
						<div class="carousel-caption">
					
						</div>
					</div>

				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#transition-timer-carousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="right carousel-control"
					href="#transition-timer-carousel" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>

			</div>
		</div>
	</div>

</header>

<!-- Services -->
<section id="services">
	<div>
		<div>
			<div class="col-lg-12 text-center">
				<h2 class="section-heading text-uppercase">가즈아</h2>
				<h3 class="section-subheading text-muted">
					푸드 트럭의 새 시대를 열다.</h3>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-md-4">
				<span class="fa-stack fa-4x"> <i
					class="fa fa-circle fa-stack-2x text-primary"></i> <i
					class="fa fa-shopping-cart fa-stack-1x fa-inverse"></i>
				</span>
				<h4 class="service-heading">쉽고 빠른 구매</h4>
				<p class="text-muted">원하는 푸드트럭 음식을 쉽고 빠르게 구매합니다</p>
			</div>
			<div class="col-md-4">
				<span class="fa-stack fa-4x"> <i
					class="fa fa-circle fa-stack-2x text-primary"></i> <i
					class="fa fa-handshake fa-stack-1x fa-inverse"></i>
				</span>
				<h4 class="service-heading">신뢰</h4>
				<p class="text-muted">사업자와 구매자를 매칭시켜드립니다.</p>
			</div>
			<div class="col-md-4">
				<span class="fa-stack fa-4x"> <i
					class="fa fa-circle fa-stack-2x text-primary"></i> <i
					class="fa fa-map-marker-alt fa-stack-1x fa-inverse"></i>
				</span>
				<h4 class="service-heading">지도</h4>
				<p class="text-muted">푸드트럭의 위치를 실시간으로 제공합니다</p>
			</div>
		</div>
	</div>
</section>

<!-- Portfolio Grid -->
<section class="bg-light" id="portfolio">
	<div>
		<div>
			<div class="col-lg-12 text-center">
				<h2 class="section-heading text-uppercase">메뉴</h2>
				<h3 class="section-subheading text-muted">누구보다도 빠르게 가즈아를 만나보세요</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" href="#">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="<c:url value='/images/main/logo.jpg'/>"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>소개</h4>
					<p class="text-muted">사이트 소개</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" 
					href="#">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="<c:url value='/images/main/find.jpg'/>"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>찾기</h4>
					<p class="text-muted">푸드트럭 찾기</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" 
					href="#>">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="<c:url value='/images/main/menu.jpg'/>"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>음식</h4>
					<p class="text-muted">푸드트럭 메뉴보기</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" 
					href="#">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="<c:url value='/images/main/event.jpg'/>"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>이벤트</h4>
					<p class="text-muted">수많은 이벤트</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" 
					href="#">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="<c:url value='/images/main/list.jpg'/>"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>게시판</h4>
					<p class="text-muted">게시판 보기</p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a class="portfolio-link" data-toggle="modal"
					href="#">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid" src="<c:url value='/images/main/question.jpg'/>"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>창업문의</h4>
					<p class="text-muted">창업절차 문의하기</p>
				</div>
			</div>
		</div>
	</div>
</section>
	
	
	<!--
<img src="<c:url value='/images/user.png'/>" alt="/images/user.png"/><br/>
<div style="height: 50px; background-color: red"></div>
<div id="mypage"></div>

<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<h1>
	Hello FOODTRUCK MAIN! 
</h1><br/>

<P>  The time on the server is ${serverTime}. </P>
  -->