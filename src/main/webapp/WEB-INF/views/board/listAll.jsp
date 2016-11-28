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
	
	<!-- general form elements -->
	<div class="box">
			<div class="box-header with-border">
				<h3 class="box-title">LIST ALL BOARD</h3>
			<table class="table table-bordered">
			<tr>
				<th style="width:10px">BNO</th>
				<th>TITLE</th>
				<th>WRITER</th>
				<th>REGDATE</th>
				<th style="width:40px">VIEWCNT</th>
			</tr>
			
			<c:forEach items="${list}" var="board">
				<tr>
				<td>${board.bno}</td>
				<td><a href='/board/read?bno=${board.bno}'>${board.title}</a></td>
				<td>${board.writer}</td>
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${board.regdate}"/></td>
				<td><span class="badge bg-red">${board.viewcnt}</span></td>
			</tr>
			</c:forEach>
			
			</table>			
			</div>
	</div> 
	</div>
	</div>
</section>
<script>
	var result = '${msg}';
	if(result=='success'){
		alert("처리가 완료되었습니다.");
	}
</script>
<%@include file="../include/footer.jsp" %>

