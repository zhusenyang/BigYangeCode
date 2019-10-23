function loading_head() {
	var head =
	'<DIV class="header">'+
		'<DIV class="h_mid_c">'+
			'<DIV class="h_mid">'+
				'<DIV class="logo">'+
					'<A title="远成" href="http://www.cubicrobot.cn/"><IMG alt="远成" src="image/logo.bmp"></A>'+
				'</DIV>'+
				'<DIV class="top_contact">'+
					'<H2>服&nbsp;&nbsp;&nbsp;&nbsp;务&nbsp;&nbsp;&nbsp;&nbsp;热&nbsp;&nbsp;&nbsp;&nbsp;线</H2>'+
					'<SPAN>021-31261588</SPAN>'+
				'</DIV>'+
			'</DIV>'+
		'</DIV>';
	var door_head = document.getElementById("door_head");
	door_head.innerHTML=head;
}