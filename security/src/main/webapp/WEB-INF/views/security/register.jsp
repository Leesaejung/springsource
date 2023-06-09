<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@include file="../include/header.jsp" %>
	<h1>Register</h1>
	
	<!-- 
		spring security 로그인 페이지 규칙
		
		1) post 방식으로 action="/login" 지정
		2) 아이디를 입력받는 요소의 이름은 반드시 username 이어야 함
		3) 비밀번호를 입력받는 요소의 이름은 반드시 password 이어야 함
		4) post 방식으로 가는 모든 폼 안에는 csrf 토큰 값이 포함되어 있어야 함
	 -->
	
<main class="form-signin w-100 m-auto">
  <form method="post" action="">
    <h1 class="h3 mb-3 fw-normal">회원가입</h1>
    <div class="form-floating">
      <label for="floatingInput">UserId</label>
      <input type="text" class="form-control" id="username" placeholder="userid" name="userid">
    </div>
    <div class="form-floating">
      <label for="floatingPassword">Password</label>
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password"> <!-- 오타 조심!!!! password를 passwoed 라고 써버림	 -->
    </div>
    <div class="form-floating">
      <label for="floatingEmail">Email</label>
      <input type="email" class="form-control" id="floatingPassword" placeholder="email" name="email"> <!-- 오타 조심!!!! password를 passwoed 라고 써버림	 -->
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <button class="w-100 btn btn-lg btn-primary" type="submit">회원가입</button>
    <p class="mt-5 mb-3 text-body-secondary">&copy; 2017–2023</p>
  </form>
</main>
<%@include file="../include/footer.jsp" %>