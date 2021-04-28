<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판Home</title>
</head>
<link rel ="stylesheet" type="text/css" href="css/home.css">
<body>
<div class="container">
<h3>한국인 모여라 Home</h3>
<%-- 

	index.jsp  ---  FindKoreanByAddress --- MemberDAO: ArrayList<MemberVO : id, address>
							|
							| forward( request에 리스트를 가져오고), 
							| 
						FindKorean-result.jsp 
						지역에 있는 사람들 지도에 표시 
						로그인을 해야 채팅이 가능하도록 						
 --%>
<form action="FindKoreanByAddress.do">
<input type="text" name="userAddress" required="required" placeholder="지역을 입력하세요">
<input type="submit" value="찾기">
</form>
</div>
</body>
</html>