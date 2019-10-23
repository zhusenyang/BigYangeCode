function load_footer(){
	var footer='//<!--页尾开始-->'+
		'<DIV class="footer_c">'+
	//<!--底部导航开始-->
	'<DIV class="bb_nav">'+
		'<DIV class="bb_nav_c">'+
			'<UL>'+
				'<LI><A href="http://www.cubicrobot.cn/">网站首页</A></LI>'+
				'<LI><A title="关于我们" href="http://www.cubicrobot.cn/About/">关于我们</A></LI>'+
				'<LI><A title="产品展示" href="http://www.cubicrobot.cn/Product/">产品展示</A></LI>'+
				'<LI><A title="实用案例" href="http://www.cubicrobot.cn/Practicalcase/">实用案例</A></LI>'+
				'<LI><A title="文件下载" href="http://www.cubicrobot.cn/down/">文件下载</A></LI>'+
				'<LI><A title="新闻资讯" href="http://www.cubicrobot.cn/News/">新闻资讯</A></LI>'+
				'<LI><A title="销售网络" href="http://www.cubicrobot.cn/network/">销售网络</A></LI>'+
				'<LI><A title="资质荣誉" href="http://www.cubicrobot.cn/Honor/">资质荣誉</A></LI>'+
				'<LI><A title="联系我们" href="http://www.cubicrobot.cn/Contact/">联系我们</A></LI>'+
			'</UL>'+
		'</DIV>'+
	'</DIV>'+
	//<!--底部导航结束-->'+
	'<DIV class="footer">'+
		'<DIV class="f_content">'+
			'地址：杭州 电话：021-31261588 手机：上海13764925328 / 13723735508 <BR>技术支持：<a title="竺森洋" href="bigyangcode.xyz">竺森洋</a> '+
			'杭州远成超声波有限公司 版权所有：杭州远成超声波'
		'</DIV>'+
		'<DIV class="share_i">'+
		'</DIV>'+
	'</DIV>'+
'</DIV>';
//<!--页尾结束-->
	var door_head = document.getElementById("door_footer");
	door_head.innerHTML=footer;
}
