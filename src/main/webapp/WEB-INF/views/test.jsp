<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Ajax Test Page</title>
	<!-- jQuery 2.1.4 -->
	<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
</head>
<body>
	<h2>Ajax Test Page</h2>
		<div>
			<div>
				REPLYER <input name='text' name='replyer' id='newReplyWriter'>
			</div>
			<div>
				REPLY TEXT <input name='text' name='replytext' id='newReplyText'>
			</div>
			<Button id="replyAddBtn">Add Reply</Button>
		</div>

	<script>	
	$("#replyAddBtn").on("click",function(){
		var replyer = $("#newReplyWriter").val();
		var replytext = $("#newReplyText").val();
		
		$.ajax({
			type : 'post',
			url : '/replies',
			headers : {
				"Content-Type" : "application/json",
				"X-HTTP-Method-Override" : "POST"
			},
			dataType : 'text',
			data : JSON.stringify({
				bno : bno,
				replyer : replyer,
				replytext : replytext
			}),
			success : function(result) {
				if (result == 'SUCCESS') {
					alert("등록 되었습니다.");
					getAllList();
				}
			}
		});
	});
	
	function getAllList(){
		
		$.getJSON("/replies/all/" + bno, function(data){
			console.log(data.length);
		
			$(data).each(
				function(){
					str += "<li data-rno='"+this.rno+"' class='replyLi'>"
						+ this.rno + ":" + this.replytext
						+ "<button>MOD</button></li>";
					});
				$("#replies").html(str);
			});
		
			$("#replyLi").on("click", ".replyLi button",function(){
				var reply = $(this).parent();
				var rno = reply.attr("data-rno");
				var replytext = reply.text();
				alert(rno + ":" + replytext);
			});
	}
	</script>
	
	<ul id="replies"></ul>
</body>
</html>