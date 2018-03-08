/*foodtruck js*/
/**/



/*right box 스크롤 따라다니기*/
$(function(){
	var currentPosition = parseInt($("#sidebox").css("top"));
	$(window).scroll(function() {
		var position = $(window).scrollTop(); 
		$("#sidebox").stop().animate({"top":position+currentPosition+"px"},1000);
	});
});