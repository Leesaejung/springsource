<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Board Register</h1>
</div>
	<div class="row">
		<div class="col">
		<form action="" method="post">
		  <div class="form-group">
		    <label for="title">Title</label>
		    <input type="text" class="form-control" id="title" placeholder="title" name="title" required>
		  </div>
		  <div class="form-group">
		    <label for="content">Content</label>
		    <textarea class="form-control" id="content" rows="10" name="content" placeholder="content" required></textarea>
		  </div>
		  <div class="form-group">
		    <label for="writer">Writer</label>
		    <input type="text" class="form-control" id="writer" placeholder="writer" name="writer" required>
		  </div>
		  <button type="submit" class="btn btn-primary">등록</button>
		  <button type="submit" class="btn btn-secondary">취소</button>
		</form>
	</div>
</div>
<scrpit src="/resources/js/register.js"></scrpit>
<%@ include file="../include/footer.jsp" %>