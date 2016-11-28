<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<!-- Main Content -->
<section class="content">
	<div class="row">
	<!-- left column -->
	<div class="col-md-12">
	
	 <form role="form" action="modifyPage" method="post">
	 	<input type="hidden" name="bno" value="${board.bno}">
	 	<input type="hidden" name="page" value="${cri.page}">
	 	<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
	 </form>
	 
	 <div class="box-body">
	 	<div class="form-group">
	 		<label for="exampleInputEmail1">Title</label>
	 		<input type="text" name='title' class="form-control" value="${board.title}" readonly="readonly">
	 	</div>
	 	<div class="form-group">
	 		<label for="exampleInputPassword1">Content</label>
	 		<textarea class="form-control" name="content" rows="3" readonly="readonly">${board.content}</textarea>
	 	</div>
	 	<div class="form-group">
	 		<label for="exampleInputEamil1">Writer</label>
	 		<input type="text" name="writer" class="form-control" value="${board.writer}" readonly="readonly">
	 	</div>
	 </div>
	 
	 <div class="box-footer">
	 	<button type="submit" class="btn btn-warning">Modify</button>
	 	<button type="submit" class="btn btn-danger">Remove</button>
	 	<button type="submit" class="btn btn-primary">LIST ALL</button>
	 </div>
	 
	</div>
	</div>
</section>

<!-- jQuery  -->
<script>
$(document).ready(function(){
	var formObj = $("form[role='form']");
    console.log(formObj);
    
    $(".btn-warning").on("click", function(){
    	formObj.attr("action", "/board/modifyPage");
    	formObj.attr("method", "get");
    	formObj.submit();
    });
    
    $(".btn-danger").on("click", function(){
    	formObj.attr("action", "/board/removePage");
    	formObj.submit();
    });
    
    $(".btn-primary").on("click", function(){
		formObj.attr("method", "get");
		formObj.attr("action", "/board/listPage");
		formObj.submit();
    });
});
</script>
<%@include file="../include/footer.jsp" %>