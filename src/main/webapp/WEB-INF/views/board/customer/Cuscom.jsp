<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/Common/IsMember.jsp" %>

<section style="padding-top: 80px; margin-right: 80px; margin-left: 80px">
	<article>
		<h2>손님게시판</h2>
		<hr align="left" style="border: solid 1px #FE9A2E; width: 20%">
	</article>

	<article style="float: right; margin-right: 30px">
		<a href="<c:url value='#'/>"><button type="button" class="btn btn-success">글등록</button></a>
	</article>
	<br>
	<br>

	<article style="margin-right: 30px; margin-left: 30px">
		<table class="table table-bordered table-hover">
			<tr style="text-align: center">
				<th style="width: 10%;">번호</th>
				<th style="width: 35%">제목</th>
				<th style="width: 10%">작성자</th>
				<th style="width: 15%">등록일</th>
				<th style="width: 20%">첨부파일</th>
			</tr>
			<c:if test="${empty requestScope.list }" var="flag">
				<tr>
					<td colspan="6">등록된 자료가 없습니다</td>
				</tr>
			</c:if>
			<c:if test="${not flag }">
				<c:forEach var="item" items="${list}" varStatus="loop">
					<tr>
						<td>${totalRecordCount - (((nowPage - 1) * pageSize) + loop.index)}</td>
						<td><a href="<c:url value='/DATAROOM/View.do?key=${item.no}'/>">${item.title}</a></td>
						<td>${item.name}</td>
						<td>${item.postdate}</td>
						<td><span id="download${loop.count}">${item.downcount}</span></td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</article>
</section>