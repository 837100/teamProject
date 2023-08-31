<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정기권 등록</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
}

header {
	background-color: #333;
	color: white;
	text-align: center;
	padding: 10px;
}

nav {
	background-color: #f0f0f0;
	padding: 10px;
}

nav a {
	margin-right: 15px;
	text-decoration: none;
}

section {
	text-align: center;
	padding: 20px;
}

footer {
	background-color: #333;
	color: white;
	text-align: center;
	padding: 10px;
}
</style>
</head>
<body>

	<header>
		<a href="index.jsp"><h1>주차관리 프로그램 ver 1.0</h1></a>
	</header>

	<nav>
		<a href="newTicketForm.jsp">정기권 등록</a> <a href="readTicket.jsp">정기권
			조회</a> <a href="ParkInOutForm.jsp">주차차량 입/출고</a> <a href="readPark.jsp">주차현황조회</a>
	</nav>

	<section>
		<!--   <h2>주차 정기권 등록</h2>
      <form action="write.do" method="post">
   <table border="1" width="100%">
    -->

		<!--  <tr>
   	<td>정기권 번호(자동 발생)</td>
   	<td><input type="text" id="tno" name="tno"></td> 
 </tr>
 
 
   <tr>
   	<td>차량번호</td>
   	<td><input type="text" id="carno" name="carno"></td> 
 </tr>
   <tr>
   	<td>차주전화</td>
   	<td><input type="text" id="phone" name="phone"></td> 
 </tr>
   <tr>
   	<td>주차등급(M/Y)</td>
   	<td><input type="text" id="grade" name="grade"></td> 
 </tr>
 <tr>
   	<td>정기권 상태(Y/N)</td>
   	<td><input type="text" id="tstat" name="tstat"></td> 
 </tr>
 <tr>
   	<td>시작일</td>
   	<td><input type="text" id="startdate" name="startdate"></td> 
 </tr>
 
 <tr>
   	<td>종료일</td>
   	<td><input type="text" id="enddate" name="enddate"></td> 
 </tr>
   </table>
   	<input type="submit" name="submitType" value="등록">
   	<input type="submit" name="submitType" value="조회"> -->


		<h1>새로운 정기권 등록</h1>
		<form action="write.do" method="post">
			<!--   <label for="carno">차량 번호:</label>
        <input type="text" id="carno" name="carno"><br>
        <label for="phone">차주 전화번호:</label>
        <input type="text" id="phone" name="phone"><br>
        <label for="grade">주차 등급:</label>
        <input type="text" id="grade" name="grade"><br>
        <label for="tstat">정기권 상태:</label>
        <input type="text" id="tstat" name="tstat"><br> -->


			<p>정기권 번호(자동 발생)</p>
			<input type="text" id="tno" name="tno">
			<p>
				차량번호:<input type="text" name="carno" value="${param.carno}">
			</p>
			<p>
				차주 전화번호:<input type="text" name="phone" value="${param.phone}">
			</p>
			<p>
				주차 등급:<input type="text" name="grade" value="${param.grade}">
			</p>
			<p>
				정기권 상태:<input type="text" name="tstat" value="${param.tstat}">
			</p>
			<p>
				시작일:<input type="date" name="startdate" value="${param.startdate}">
			</p>

			<p>
				종료일 :<input type="date" name="enddate" value="${param.enddate}">
			</p>


			<input type="submit" name="submitType" value="등록"> <input
				type="submit" name="submitType" value="조회">
		</form>
		<!--   </form> -->
	</section>

	<footer>
		<p>footer 영역. 2023-08-25</p>
	</footer>

</body>
</html>
