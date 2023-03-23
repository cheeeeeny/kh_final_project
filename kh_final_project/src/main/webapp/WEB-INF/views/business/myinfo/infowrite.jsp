<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>회사소개작성</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	
	<div class="container m-5">
		<h1 class="m-5 text-primary">회사소개를 작성해 주세요</h1>
		
		<div class="">
		<form action="/companyinfo" method="post" > 
        	<div class="row ">
				<div class="col-2 text-center"><h3>태그</h3></div>
				<div class="col-10 text-start">
				<p><a class="fw-bold">근무/휴가</a>
				<input type="checkbox" name="tag" value="유연근무">유연근무
				<input type="checkbox" name="tag" value="재택근무">재택근무
				<input type="checkbox" name="tag" value="주35시간">주35시간
				<input type="checkbox" name="tag" value="주4일근무">주4일근무
				<input type="checkbox" name="tag" value="육아휴직">육아휴직
				<input type="checkbox" name="tag" value="출산휴가">출산휴가
				<input type="checkbox" name="tag" value="리프레시휴가">리프레시휴가
				</p>
				<p><a class="fw-bold">보상</a>
				<input type="checkbox" name="tag" value="성과금">성과금
				<input type="checkbox" name="tag" value="상여금">상여금
				<input type="checkbox" name="tag" value="연말보너스">연말보너스
				<input type="checkbox" name="tag" value="스톡옵션">스톡옵션
				</p>
				<p><a class="fw-bold">기업문화</a>
				<input type="checkbox" name="tag" value="수평적조직">수평적조직
				<input type="checkbox" name="tag" value="스타트업">스타트업
				<input type="checkbox" name="tag" value="자율복장">자율복장
				<input type="checkbox" name="tag" value="워크샵">워크샵
				<input type="checkbox" name="tag" value="반려동물">반려동물
				</p>
				<p><a class="fw-bold">편의</a>
				<input type="checkbox" name="tag" value="식비지원">식비지원
				<input type="checkbox" name="tag" value="간식제공">간식제공
				<input type="checkbox" name="tag" value="사내카페">사내카페
				<input type="checkbox" name="tag" value="사내식당">사내식당
				<input type="checkbox" name="tag" value="주차">주차
				<input type="checkbox" name="tag" value="수면실">수면실
				<input type="checkbox" name="tag" value="휴게실">휴게실
				<input type="checkbox" name="tag" value="헬스장">헬스장
				<input type="checkbox" name="tag" value="안마의자">안마의자
				</p>
				
				<p><a class="fw-bold">지원</a>
				<input type="checkbox" name="tag" value="택시비">택시비
				<input type="checkbox" name="tag" value="셔틀버스">셔틀버스
				<input type="checkbox" name="tag" value="차량지원">차량지원
				<input type="checkbox" name="tag" value="기숙사">기숙사
				<input type="checkbox" name="tag" value="건강검진">건강검진
				<input type="checkbox" name="tag" value="동호회">동호회
				<input type="checkbox" name="tag" value="복지포인트">복지포인트
				<input type="checkbox" name="tag" value="문화비">문화비
				<input type="checkbox" name="tag" value="운동비">운동비
				<input type="checkbox" name="tag" value="자기계발비">자기계발비
				</p>
				
				<p><a class="fw-bold">교육</a>
				<input type="checkbox" name="tag" value="교육비">교육비
				<input type="checkbox" name="tag" value="도서구매비">도서구매비
				<input type="checkbox" name="tag" value="직무교육">직무교육
				<input type="checkbox" name="tag" value="세미나비">세미나비
				<input type="checkbox" name="tag" value="어학교육">어학교육
				<input type="checkbox" name="tag" value="해외연수">해외연수
				</p>
				</div>
            </div>
            <div class="row ">
				<div class="col-2 text-center"><h3></h3></div>
				<div class="col-10 "><hr></div>
			</div>
			 <div class="row ">
				<div class="col-2 text-center"><h3>소개글</h3></div>
				<div class="col-10 was-validated">
				 	<div class="mb-3">
    					<label for="validationTextarea" class="form-label">내용작성</label>
    					<textarea class="form-control is-invalid" id="validationTextarea" style="height: 300px;"
    					placeholder="회사소개 내용을 입력하세요." required></textarea>
    					<div class="invalid-feedback">회사소개를 작성해주세요</div>
   					 </div>
   					 <div class="mb-3">
   					 	<input type="file" class="form-control" aria-label="file example" required>
   					 	<div class="invalid-feedback">Example invalid form file feedback</div>
  					 </div>
				</div>
			</div>
			<div class="container mb-3 mx-auto">
    			<button class="btn btn-primary" type="submit">등록</button>
    			<button class="btn btn-light" type="button" >취소</button>
  			</div>
        </form>
        </div>
	</div>
		
	
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
	
	<script type="text/javascript">
	
	</script>
</body>



</html>