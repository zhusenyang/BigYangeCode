var yu_ming="http://localhost:8080";
function loadHead(){
	var head = 
		'<nav class="nav" id="topnav">'+
      '<h1 class="logo"><a href="">小站</a></h1>'+
      '<li><a href="index">主页</a> </li>'+
// '<!-- <li><a href="about">随笔</a> </li>-->'+
// '<li><a href="share.html">demo</a>'+
// '<ul class="sub-nav">'+
// '<li><a href="share.html">demo1</a></li>'+
// '<li><a href="share.html">demo2</a></li>'+
// '<li><a href="share.html">demo3</a></li>'+
// '</ul>'+
// '</li>'+
// '<li><a href="game" id="gameList">游戏人生</a>'+
// '<ul class="sub-nav">'+
// '<li><a href="list">Diablo III</a></li>'+
// '<li><a href="list">痒痒鼠</a></li>'+
// '</ul>'+
// '</li>'+
// '<li><a href="life" id="lifeList">随记</a>'+
// '<ul class="sub-nav">'+
// '<li><a href="life">1</a></li>'+
// '</ul>'+
// '</li>'+
      '<li><a href="time">时间轴</a> </li>'+
      '<li><a href="gbook">留言</a> </li>'+
      '<li><a href="info">关于我</a> </li>'+
      '<!--search begin-->'+
      '<div id="search_bar" class="search_bar">'+
        '<form  id="searchform" action="[!--news.url--]e/search/index.php" method="post" name="searchform">'+
          '<input class="input" placeholder="请输入关键词..." type="text" name="keyboard" id="keyboard">'+
          '<input type="hidden" name="show" value="title" />'+
          '<input type="hidden" name="tempid" value="1" />'+
          '<input type="hidden" name="tbname" value="news">'+
          '<input type="hidden" name="Submit" value="����" />'+
          '<span class="search_ico"></span>'+
        '</form>'+
       
      '</div>'+
     
      '<!--search end--> '+
    '</nav>'+
    '<div  style="position:absolute;right:2%;top:0"><a id="login" href="javascript:;">登录</a><span>/</span><a class="login"href="javascript:;">注册</a></div>'
    ;
	
	var door_head = document.getElementById("headmenu");
	door_head.innerHTML=head;
}
function loadFooter(){
	
	var footer =  '<p>Design by <a href="http://www.bigyangcode.xyz" target="_blank">洋</a> <a href="/">浙ICP备18018513号-1</a></p>';
	var door_head = document.getElementById("footer")
	door_head.innerHTML=footer;
}
function loadSideBar(){
	var sideBar='<div class="zhuanti">'+
    '<h2 class="hometitle" id="special_recommendation">特别推荐</h2>'+
    '<ul>'+
      '<li> <i><img src="images/banner03.jpg"></i>'+
        '<p>�۹�cms���÷��� <span><a href="/">�Ķ�</a></span> </p>'+
      '</li>'+
// '<li> <i><img src="images/b04.jpg"></i>'+
// '<p>5.20 �������˵ <span><a href="/">�Ķ�</a></span></p>'+
// '</li>'+
// '<li> <i><img src="images/b05.jpg"></i>'+
// '<p>���˲��ͣ������ҵ�С���磡 <span><a href="/">�Ķ�</a></span></p>'+
// '</li>'+
    '</ul>'+
  '</div>'+
  '<div class="tuijian">'+
    '<h2 class="hometitle" id="article">推荐文章</h2>'+
    '<ul class="tjpic">'+
      '<i><img src="images/toppic01.jpg"></i>'+
      '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
    '</ul>'+
    '<ul class="sidenews">'+
      '<li> <i><img src="images/toppic01.jpg"></i>'+
        '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
        '<span>2018-05-13</span> </li>'+
// '<li> <i><img src="images/toppic02.jpg"></i>'+
// '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
// '<span>2018-05-13</span> </li>'+
// '<li> <i><img src="images/v1.jpg"></i>'+
// '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
// '<span>2018-05-13</span> </li>'+
// '<li> <i><img src="images/v2.jpg"></i>'+
// '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
// '<span>2018-05-13</span> </li>'+
    '</ul>'+
  '</div>'+
  '<div class="tuijian" id="hot_click">'+
    '<h2 class="hometitle">点击排行</h2>'+
    '<ul class="tjpic">'+
      '<i><img src="images/toppic01.jpg"></i>'+
      '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
    '</ul>'+
    '<ul class="sidenews">'+
      '<li> <i><img src="images/toppic01.jpg"></i>'+
        '<p><a href="/">������Щ���ĵ���·</a></p>'+
        '<span>2018-05-13</span> </li>'+
// '<li> <i><img src="images/toppic02.jpg"></i>'+
// '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
// '<span>2018-05-13</span> </li>'+
// '<li> <i><img src="images/v1.jpg"></i>'+
// '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
// '<span>2018-05-13</span> </li>'+
// '<li> <i><img src="images/v2.jpg"></i>'+
// '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
// '<span>2018-05-13</span> </li>'+
    '</ul>'+
  '</div>'+
  '<div class="cloud">'+
    '<h2 class="hometitle" id="label_cloud">标签云</h2>'+
    '<ul>'+
      '<a href="/">İ�ϻ���</a> <a href="/">У԰����</a> <a href="/">html5</a> <a href="/">SumSung</a> <a href="/">�ഺ</a> <a href="/">��ů</a> <a href="/">����</a> <a href="/">����</a><a href="/">����</a> <a href="/">��ά��ҫ</a> <a href="/">����</a> <a href="/">����</a>'+
    '</ul>'+
  '</div>'+
  '<div class="links">'+
    '<h2 class="hometitle" id="frend_link">友情链接</h2>'+
    '<ul>'+
      '<li><a href="http://www.yangqq.com" target="_blank">���಩��</a></li>'+
      '<li><a href="http://www.yangqq.com" target="_blank">D���ʦ����</a></li>'+
      '<li><a href="http://www.yangqq.com" target="_blank">������˲���</a></li>'+
    '</ul>'+
  '</div>'+
  '<div class="guanzhu" id="follow-us">'+
    '<h2 class="hometitle">关注</h2>'+
    '<ul>'+
      '<li class="sina"><a href="/" target="_blank"><span>新浪微博</span>���಩��</a></li>'+
      '<li class="tencent"><a href="/" target="_blank"><span>腾讯微博</span>���಩��</a></li>'+
      '<li class="qq"><a href="/" target="_blank"><span>QQ</span>247735108</a></li>'+
      '<li class="email"><a href="/" target="_blank"><span>邮箱</span>247735108@qq.com</a></li>'+
      '<!--  <li class="wxgzh"><a href="/" target="_blank"><span>微信</span>XXXXX</a></li>-->'+
     '<!--  <li class="wx"><img src="images/wx.jpg"></li>-->'+
    '</ul>'+
  '</div>';
	var door_head = document.getElementById("sideBar");
	if(door_head!=null){
		door_head.innerHTML=sideBar;
	}
}
function loadLogin(){
	checkUserLogin();
	var login_model='<div class="mypop" style="display: none">'+
    '<div class="graybox" ></div>'+
    '<div class="popbox">'+
        '<div class="poptop">'+
            '<h3>登录</h3>'+
            '<a href="javascript:;" class="close"></a>'+
        '</div>'+
        '<div class="popcon">'+
            '<div>'+
                '<div class="group">'+
                    '<input id="userName" type="text" value="请输入帐号" onFocus="if(value=='+
                "'请输入帐号'"+
                ') {value='+
                "''"+
                '}" onBlur="if(value=='+
                "''"+
                '){value='+
                "'请输入帐号'"+
                '}">'+
                    '<i class="fa fa-user"></i>'+
                '</div>'+
                '<div class="group">'+
                    '<input id="password" type="password" value="请输入密码" onFocus="if(value=='+
                "'请输入密码'"+
                ') {value='+
                "''"+
                '}" onBlur="if(value=='+
                "''"+
                '){value='+
                "'请输入密码'"+
                '}">'+
                    '<i class="fa fa-lock"></i>'+
                '</div>'+
            '</div>'+
            '<div class="remember clearfix">'+
                '<div class="remember-con">'+
                    '<input type="checkbox" id="input1" class="inputbox">'+
                    '<label for="input1">记住密码</label>'+
                '</div>'+
                '<div class="remember-con">'+
                    '<a href="#" class="code"><i class="fa fa-question-circle"></i>忘记密码</a>'+
                '</div>'+
            '</div>'+
        '</div>'+
        '<div class="divbtn clearfix">'+
        '<a href="javascript:;" class="btn ok" onclick="login()">登陆</a>'+
            '<a href="javascript:;" class="btn" id="cancel">取消</a>'+
        '</div>'+
    '</div>'+
'</div>';
	var user_model='';
	var load_Login = $(document.body);
	if(load_Login!=null){
		if (load_Login!=null) {
			load_Login.append(login_model);
		}
	}
	
	$('#login').click(function () {
        $('.mypop').show();
    });
    $('.graybox,.close,#cancel').click(function () {
        $('.mypop').hide();
    })
}
function checkUserLogin(){
	$.ajax({
		url: yu_ming+"/checkUserLogin",
		async:false,
		type : "post",
		success: function(result){
			if (result.stateNum!=null&&result.stateNum==200) {

			}
		}
	})
}


function login(){
	var user_Name=$("#userName").val();
	var PassWord=$("#password").val();
	console.log(user_Name);
	console.log(PassWord);
	if(user_Name!=null&&PassWord!=null){
		if (user_Name=="请输入帐号"||PassWord=="请输入密码") {
			alert("请输入正确的账号密码");
		}else{
			$.ajax({ 
				url: yu_ming+"/login",
				async:false,
				type : "post",
				data:{
					userName:user_Name,
					password:PassWord
				},
				scriptCharset : 'utf-8',
				success: function(result){
					
				}
			});
		}
		
	}else{
		alert("请输入正确的账号密码");
	}
	
}
function loadMenu(){
	$.ajax({ 
		url: yu_ming+"/getMenu",
		async:false,
		type : "get",
		scriptCharset : 'utf-8',
		success: function(result){
			var s='';
			for(var i in result){
				var id =result[i].id
				var type_content=result[i].type_content
				var childrenType=result[i].childrenType
				var link=result[i].link
				s = s+'<li><a href="'+link+'">'+type_content+'</a>'+
			        '<ul class="sub-nav">';
				for(var j in childrenType){
					var id2 =childrenType[j].id
					var type_content2=childrenType[j].type_content
					var childrenType2=childrenType[j].childrenType
					var link2=childrenType[j].link
					console.log(type_content2);
					if(link2==null){
						link2="javascript:;"
					}
					s=s+'<li><a href="'+link2+'">'+type_content2+'</a></li>'
				}
			         
			       s=s+ '</ul>'+
			      '</li>';
			}
			console.log(s);
			$("#topnav").append(s);
      }});
}