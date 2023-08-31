<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차 관리 프로그램</title>
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
		<h2>정기권 조회</h2>
		<table border="1">

			<tr>
				<th>정기권 번호</th>
				<th>차량 번호</th>
				<th>차주 전화</th>
				<th>주차등급</th>
				<th>정기권 상태</th>
				<th>주차 시작일</th>
				<th>주차 종료일</th>
			</tr>

			<tr>
				<td>${ticketdata.tno}</td>
				<td>${ticketdata.carno}</td>
				<td>${ticketdata.phone}</td>
				<td>${ticketdata.grade}</td>
				<td>${ticketdata.tstat}</td>
				<td>${ticketdata.startdate}</td>
				<td>${ticketdata.startdate}</td>
			</tr>
		</table>


		<%--  <h1>정기권 조회</h1>
    <p>정기권 번호: ${ticketData.tno}</p>
    <p>차량 번호: ${ticketData.carno}</p>
    <p>차주 전화번호: ${ticketData.phone}</p>
    <p>주차 등급: ${ticketData.grade}</p>
    <p>정기권 상태: ${ticketData.tstat}</p>
    <p>시작일: ${ticketData.startdate}</p>
    <p>종료일: ${ticketData.startdate}</p>
 --%>
	</section>

	<footer>
		<p>footer 영역. 2023-08-25</p>
	</footer>

</body>
</html>
