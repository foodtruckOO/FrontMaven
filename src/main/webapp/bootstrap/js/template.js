/*foodtruck js*/
/**/
	function popupOpen(){
	var popUrl = "<c:url value='/login/Login.jsp'/>";	//팝업창에 출력될 페이지 URL
	var popOption = "width=380, height=580, resizable=no, scrollbars=no, status=no, left=800, top=200, location=no;";    //팝업창 옵션(optoin)
		window.open(popUrl,"",popOption);
		Document.log("popupOpen");
	} 
	
	function popupOpen2(){
	var popUrl = "<c:url value='login/Join.jsp'/>";	//팝업창에 출력될 페이지 URL
	var popOption = "width=650, height=500, resizable=no, scrollbars=no, status=no, left=600, top=200, location=no;";    //팝업창 옵션(optoin)
		window.open(popUrl,"",popOption);
	}


/*right box 스크롤 따라다니기*/
$(function(){
	var currentPosition = parseInt($("#sidebox").css("top"));
	$(window).scroll(function() {
		var position = $(window).scrollTop(); 
		$("#sidebox").stop().animate({"top":position+currentPosition+"px"},1000);
	});
});