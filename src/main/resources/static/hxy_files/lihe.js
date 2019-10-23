$(function(){

	$('.beautify_input').cssSelect();//select美化(search部分)

	/*首页搜索下拉*/
	$(".drop_down").click(function(event) {
		if (event.stopPropagation) {
			//阻止时间冒泡
			event.stopPropagation(); 
			$(".dd_list").slideToggle(200)
		}else{
			event.cancelBubble = true;
			$(".dd_list").slideToggle(200)
		};
	});

	$(".dd_list span").click(function(event) {
		var val = $(this).html();

		$(".dd_list").slideUp(200);
		$(this).addClass('current_dd_span').siblings().removeClass('current_dd_span');
		$(".drop_down").html(val);

	});

	//点击空白处收起
	$("body").click(function(event) {
		$(".dd_list").slideUp(200);
	});

	/*导航下拉*/
/*	$(".nav ul li").hover(function() {
		$(this).find('.nav_dd').stop().slideToggle(200);
	});*/

	/*自定义轮播*/
	$(".small_pic a").hover(function() {
		var index = $(".small_pic a").index(this);

		$(".big_pic a").eq(index).fadeIn(100).siblings().fadeOut(100);
		$(this).addClass('current_small_pic_a').siblings().removeClass('current_small_pic_a')
	});

	/*案例遮罩*/
	$(".anli_content ul li").hover(function() {
		$(this).find('.anli_zz').stop().animate({top:0,opacity:'1'}, 300)
	},function(){
		$(this).find('.anli_zz').stop().animate({top:'100%',opacity:0}, 300)
	});

	/*右侧定位导航*/
	$(".tel,.QQ,.back_top").hover(function() {
		$(this).find('a').stop().animate({'width':'140px','left':'-80px'}, 300)
	},function(){
		$(this).find('a').stop().animate({'width':'60px','left':0}, 300)
	});

	$(".side_nav ul li").eq(2).addClass('side_nav_3')//控制二维码
	$(".side_nav ul li").eq(2).hover(function() {
		$(this).find('span').stop().toggle(300)
	});


	$(".nav ul li").hover(function() {
		var nn = $(this).find('.nav_dd').innerHeight();

		$(this).find('.nav_dd').stop().slideDown(200);
		$(".zz_nav").stop().animate({'height':nn}, 200) //导航遮罩

	}, function() {
		var nn = $(this).find('.nav_dd').innerHeight();

		$(this).find('.nav_dd').stop().slideUp(200);
		$(".zz_nav").stop().animate({'height':0}, 200) //导航遮罩
	});

	$(".txtMarquee-left").slide({mainCell:".bd ul",autoPlay:true,effect:"leftMarquee",vis:2,interTime:30});
	$(".picScroll-top").slide({titCell:".hd ul",mainCell:".bd ul",autoPage:true,effect:"top",autoPlay:true,vis:1,trigger:"mouseover"});



	/*细节样式*/
	$(".zhuanjia_list ul li").first().siblings().css('margin-left', '6px');
	$(".anli_content ul li").first().css({
		'width': '350px',
		'height': '325px'
	});
	$(".anli_content ul li").eq(4).css({
		'width': '429px'
	});

	$(".anli_content ul li").first().siblings().css({'margin-left':'3px','margin-bottom':"3px"});

	$(".c_title_nav a").last().css('color', '#ff0000');

	$(".slideBox").slide({mainCell:".bd ul",autoPlay:true});

	//子页导航动画按钮
	

	aaa(42)//li的高度
	
	function aaa(hh){

		var h = hh;

		var ul = $("#left-type"); //
		var index_i = 0; //计数器
		var allH = $(".con1_class").height(); //容器高
		var oneN = parseInt(allH/h)-1; //容器内的个数

		$(".class_down").click(function(event) {
			var length = parseInt($("#left-type").height()/h);

			index_i++;

			if(index_i>=length-oneN){
				index_i = 0;
			}
			ul.stop().animate({top:-(index_i*h)}, 200)
		});

		$(".class_up").click(function(event) {
			var length = $("#left-type li").length;
			index_i--;
			if(index_i == -1){
				index_i = 0;
			}
			ul.stop().animate({top:-(index_i*h)}, 200)
		});
	}

})