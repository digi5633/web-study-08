<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>memberlist.jsp</title>
		<style type="text/css">
			table {
				width: 100%;
				border-collapse: separate; 
			}
			
			table, tr, td {
				border : 1px solid black;
				text-align: center;
			}
			
			thead {
				background-color: #cccccc;
				font-size: 20px;
			}
			
			
		</style>
	</head>
	
	<body>
		${mList}<br>
		
		<hr>
		<table border="1">
		<thead>
			<tr>
				<td>회원명</td>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이메일</td>
				<td>전화번호</td>
				<td>관리자</td>
			</tr>
		</thead>
		<c:forEach var="m" items="${mList}">
			<tr>
				<td><c:out value="${m.name}"/></td>
				<td><c:out value="${m.userId}"/></td>
				<td>
					<c:set var="str1" value="${m.pwd}"/>
					<c:out value="${fn:replace(str1, str1, '****')}"/>
				</td>
				<td><c:out value="${m.email}"/></td>
				<td><c:out value="${m.phone}"/></td>
				<td>
					<c:if test="${m.admin eq 1}">
						<c:out value="관리자"/>
					</c:if>
					<c:if test="${m.admin ne 1}">
						<c:out value=""/>
					</c:if>
				</td>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>