<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>home</title>
<!-- cs -->
	<link href="${pageContext.request.contextPath}/resources/template/makaan/img/favicon.ico" rel="icon">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@700;800&display=swap" rel="stylesheet">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/template/makaan/lib/animate/animate.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/template/makaan/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/template/makaan/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/template/makaan/css/style.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/person.userId.css" rel="stylesheet">
	
<!-- js -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/wow/wow.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/easing/easing.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/waypoints/waypoints.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/js/main.js"></script>

<!-- style -->	

	
</head>
<body>
<!-- haeder  -->
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<!-- page section -->	
<section>
<div class="container-fluid bg-white p-5">
	<h1>회사소개</h1>

		<div class="row">
			<div class="col-md-3 col-sm-4  border border-secondary">
				<div class="team-item rounded overflow-hidden">
					<div class="position-relative">
						<img class="img-fluid"
							src="${pageContext.request.contextPath}/resources/template/makaan/img/team-1.jpg" alt="">
						<div
							class="position-absolute start-50 top-100 translate-middle d-flex align-items-center">
							<a class="btn btn-square mx-1" href=""><i
								class="fab fa-facebook-f"></i></a> <a class="btn btn-square mx-1"
								href=""><i class="fab fa-twitter"></i></a> <a
								class="btn btn-square mx-1" href=""><i
								class="fab fa-instagram"></i></a>
						</div>
					</div>
					<div class="text-center p-4 mt-3">
						<h5 class="fw-bold mb-0">Full Name</h5>
						<small>email</small>
					</div>
					<div class="list-group">
						<a href="#" class="list-group-item list-group-item-action">바로가기</a>
						<a href="#" class="list-group-item list-group-item-action">바로가기</a>
						<a href="#" class="list-group-item list-group-item-action">바로가기</a>
					</div>
				</div>

			</div>
			<div class="col-md-8 col-sm-8 border border-secondary">
				<div class="border border-secondary">
					<a>회사소개</a>
					<button class="text-end" type="button" id="infowrite" >
						소개글작성</button>
					<!-- 이미지 -->	
					<div id="carouselExampleIndicators" class="carousel slide w-75 p-3 h-auto "
						data-bs-ride="carousel">
						<div class="carousel-indicators">
							<button type="button" data-bs-target="#carouselExampleIndicators"
								data-bs-slide-to="0" class="active" aria-current="true"
								aria-label="Slide 1"></button>
							<button type="button" data-bs-target="#carouselExampleIndicators"
								data-bs-slide-to="1" aria-label="Slide 2"></button>
							<button type="button" data-bs-target="#carouselExampleIndicators"
								data-bs-slide-to="2" aria-label="Slide 3"></button>
						</div>
						<div class="carousel-inner">
							<div class="carousel-item active">
								<img src="https://dummyimage.com/500x300/000/fff" class="img-responsive center-block d-block w-100" alt="...">
							</div>
							<div class="carousel-item">
								<img src="https://dummyimage.com/500x300/000/fff" class="img-responsive center-block d-block w-100" alt="...">
							</div>
							<div class="carousel-item">
								<img src="https://dummyimage.com/500x300/000/fff" class="img-responsive center-block d-block w-100" alt="...">
							</div>
						</div>
						<button class="carousel-control-prev" type="button"
							data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
							<span class="carousel-control-prev-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Previous</span>
						</button>
						<button class="carousel-control-next" type="button"
							data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
							<span class="carousel-control-next-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Next</span>
						</button>
					</div>
					<p>소개 해주세요.</p>
				</div>
				<div class="border border-secondary">
					<h1>뉴스레터</h1>
					<p>소개 해주세요.</p>
				</div>
				<div class="border border-secondary">
					<h1>Q&A</h1>
					<p>소개 해주세요.</p>
				</div>
			</div>
		</div>
</div>
</section>

	
<!-- footer  -->
	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
</div>	

<!-- page script -->
	
</body>
</html>
