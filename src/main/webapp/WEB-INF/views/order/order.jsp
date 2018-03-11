
<!-- 내용 시작 -->
<div class="container-fluid">
	<div class="row">
		<div class="jumbotron">
			<h1>주문하기</h1>
		</div>
		<h2></h2>
		<div class="col-lg-2">
			<img alt="주문한 그림"
				src='<c:url value = "/images/menu_list1.jpg"/>' />
		</div>
		<div class="col-lg-offset-2 col-lg-6">
			<h3>
				<span style="font-style: italic;">주문 내역</span>
			</h3>
			<h4>
				스테이크 3개 <span>9000원</span>
			</h4>
			<h4>
				감자튀김 2개 <span>10000원</span>
			</h4>
			<h4>
				콜라 1개 <span>2000원</span>
			</h4>
		</div>
		<div class="col-lg-offset-11 col-lg-1">
			<a href="<c:url value='/com.sajo.foodtruck/front-end/views/order/order2.jsp'/>">
				<button class="btn btn-default">주문하기</button>
			</a>
		</div>
	</div>
</div>