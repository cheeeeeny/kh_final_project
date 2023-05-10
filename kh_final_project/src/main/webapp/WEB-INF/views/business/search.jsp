<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>인재찾기</title>
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
	
<!-- js -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/wow/wow.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/easing/easing.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/waypoints/waypoints.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/template/makaan/js/main.js"></script>


	
</head>
<body>
<!-- header  -->
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<!-- page section -->	
<section>
<div class="container-fluid p-5">
	<h4>기업회원을 위한 맞춤형 인재 추천</h4>
	<h2>면접제안 리스트</h2>
	<div class="text-end">
	<a class="btn btn-primary" href="<%=request.getContextPath()%>/business/search/suggest" role="button">인재추천</a>
	<a class="btn btn-primary" href="<%=request.getContextPath()%>/business/applicant" role="button">지원자 관리 페이지</a>
	</div><br>

	<div class="table-responsive ">
		<table class="table table-hover">
			  <thead>
			    <tr>
			      <th scope="col">제안 날짜</th>
			      <th scope="col">이름</th>
			      <th scope="col">이력서</th>
			      <th scope="col">면접등록</th>
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${suggest.getPage() }" var="suggest">
			    <tr>
			      <td>${suggest.sendDate }</td>
			      <td><a value="${suggest.psUser }">${suggest.userName }</a></td>
			      <td><a value="${suggest.resumeNo }" href="${pageContext.request.contextPath}/business/applicant/resume?resumeNo=${suggest.resumeNo}">${suggest.resumeTitle }</a></td>
				  <td>
				  <c:choose>
				    <c:when test="${suggest.suggestAccept == 'Y'}">
				      <a type="button" class="btn btn-primary " value="${suggest.suggestAccept}" href="${pageContext.request.contextPath}/business/search/interview?no=${suggest.sgNo }">면접등록</a>
				    </c:when>
				    <c:when test="${suggest.sendInterview == 'Y'}">
				      <button class="btn btn-primary " value="${suggest.sendInterview} " disabled>등록완료</button>
				    </c:when>
				    <c:otherwise>
				      <button class="btn btn-outline-success" disabled >수락대기</button>
				    </c:otherwise>
				  </c:choose>
				  </td>
			    </tr>
			   </c:forEach>	
			   </tbody>
	   </table> 
	
	</div>
</div>
</section>

	
<!-- footer  -->
	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>

<!-- page script -->

	
</body>
</html>
