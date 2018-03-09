<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<link href="<c:url value='/bootstrap/css/hanwook.css'/>" rel="stylesheet">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 
<!-- 내용 시작 -->
	<div class="container">
        <div class="card card-container">
        <h2>로그인</h2><hr style="border: solid 1px #FE9A2E;">
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            <img id="profile-img" class="profile-img-card" src="<c:url value='/com.sajo.foodtruck/front-end/images/user.png'/>" />
            <p id="profile-name" class="profile-name-card"></p>
            <form class="forSm-signin" method="post" action="LoginProcess.jsp">
                <span id="reauth-email" class="reauth-email"></span>
                <label>아이디</label>
                <input name="user" type="text" id="inputid" class="form-control" placeholder="아이디를 입력해주세요" value="<%=request.getParameter("user") == null ? "" : request.getParameter("user")%>" required autofocus>
                <label>비밀번호</label>
                <input name="pass" type="password" id="inputPassword" class="form-control" placeholder="비밀번호를 입력해주세요" value="<%=request.getParameter("pass") == null ? "" : request.getParameter("pass")%>" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> 아이디저장
                    </label>
                </div>
                <input class="btn btn-lg btn-primary btn-block btn-signin" type="submit" value="로그인"/>
                <p style="color: red; font-weight: bold"><%=request.getAttribute("ERROR") == null ? "":request.getAttribute("ERROR")%></p>
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                비밀번호를 잊어버리셨나요?
            </a>
        </div><!-- /card-container -->
    </div><!-- /container -->

<!-- 내용 끝 -->


   