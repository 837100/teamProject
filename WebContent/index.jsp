<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
      <a href="newTicketForm.jsp">정기권 등록</a>
    <a href="readTicket.jsp">정기권 조회</a>
    <a href="ParkInOutForm.jsp">주차차량 입/출고</a>
    <a href="readPark.jsp">주차현황조회</a>
</nav>

<section>
     <h2>주차 관리 프로그램</h2>
    <p style="text-align: left;">1.정기권 차량정보 테이블을 생성한다.</p>
    <p style="text-align: left;">2.주차정보 테이블을 생성한다.</p>
</section>

<footer>
    <p>footer 영역. 2023-08-25</p>
</footer>

</body>
</html>
