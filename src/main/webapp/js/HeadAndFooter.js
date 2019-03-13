function loadHead(){
	var head = '<nav class="nav" id="topnav">'+
      '<h1 class="logo"><a href="">小站</a></h1>'+
      '<li><a href="index.html">主页</a> </li>'+
      '<!--  <li><a href="about.html">随笔</a> </li>-->'+
      '<li><a href="share.html">demo</a>'+
        '<ul class="sub-nav">'+
          '<li><a href="share.html">demo1</a></li>'+
          '<li><a href="share.html">demo2</a></li>'+
          '<li><a href="share.html">demo3</a></li>'+
        '</ul>'+
      '</li>'+
      '<li><a href="game.html" id="gameList">游戏人生</a>'+
        '<ul class="sub-nav">'+
          '<li><a href="list.html">Diablo III</a></li>'+
          '<li><a href="list.html">痒痒鼠</a></li>'+
        '</ul>'+
      '</li>'+
      '<li><a href="life.html" id="lifeList">随记</a>'+
        '<ul class="sub-nav">'+
          '<li><a href="life.html">1</a></li>'+
        '</ul>'+
      '</li>'+
      '<li><a href="time.html">时间轴</a> </li>'+
      '<li><a href="gbook.html">留言</a> </li>'+
      '<li><a href="info.html">关于我</a> </li>'+
      '<!--search begin-->'+
      '<div id="search_bar" class="search_bar">'+
        '<form  id="searchform" action="[!--news.url--]e/search/index.php" method="post" name="searchform">'+
          '<input class="input" placeholder="���ѵ�ʲô��..." type="text" name="keyboard" id="keyboard">'+
          '<input type="hidden" name="show" value="title" />'+
          '<input type="hidden" name="tempid" value="1" />'+
          '<input type="hidden" name="tbname" value="news">'+
          '<input type="hidden" name="Submit" value="����" />'+
          '<span class="search_ico"></span>'+
        '</form>'+
      '</div>'+
      '<!--search end--> '+
    '</nav>';
	var door_head = document.getElementById("headmenu");
	door_head.innerHTML=head;
}
function loadFooter(){
	
	var footer = '<footer>'+
    '<p>Design by <a href="http://www.bigyangcode.xyz" target="_blank">洋</a> <a href="/">浙ICP备18018513号-1</a></p>'+
    '</footer>';
	var door_head = document.getElementById("footer");
	door_head.innerHTML=head;
}
function loadSideBar(){
	var sideBar='<div class="zhuanti">'+
    '<h2 class="hometitle">特别推荐</h2>'+
    '<ul>'+
      '<li> <i><img src="images/banner03.jpg"></i>'+
        '<p>�۹�cms���÷��� <span><a href="/">�Ķ�</a></span> </p>'+
      '</li>'+
      '<li> <i><img src="images/b04.jpg"></i>'+
        '<p>5.20 �������˵ <span><a href="/">�Ķ�</a></span></p>'+
      '</li>'+
      '<li> <i><img src="images/b05.jpg"></i>'+
        '<p>���˲��ͣ������ҵ�С���磡 <span><a href="/">�Ķ�</a></span></p>'+
      '</li>'+
    '</ul>'+
  '</div>'+
  '<div class="tuijian">'+
    '<h2 class="hometitle">推荐文章</h2>'+
    '<ul class="tjpic">'+
      '<i><img src="images/toppic01.jpg"></i>'+
      '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
    '</ul>'+
    '<ul class="sidenews">'+
      '<li> <i><img src="images/toppic01.jpg"></i>'+
        '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
        '<span>2018-05-13</span> </li>'+
      '<li> <i><img src="images/toppic02.jpg"></i>'+
        '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
        '<span>2018-05-13</span> </li>'+
      '<li> <i><img src="images/v1.jpg"></i>'+
        '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
        '<span>2018-05-13</span> </li>'+
      '<li> <i><img src="images/v2.jpg"></i>'+
        '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
        '<span>2018-05-13</span> </li>'+
    '</ul>'+
  '</div>'+
  '<div class="tuijian">'+
    '<h2 class="hometitle">点击排行</h2>'+
    '<ul class="tjpic">'+
      '<i><img src="images/toppic01.jpg"></i>'+
      '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
    '</ul>'+
    '<ul class="sidenews">'+
      '<li> <i><img src="images/toppic01.jpg"></i>'+
        '<p><a href="/">������Щ���ĵ���·</a></p>'+
        '<span>2018-05-13</span> </li>'+
      '<li> <i><img src="images/toppic02.jpg"></i>'+
        '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
        '<span>2018-05-13</span> </li>'+
      '<li> <i><img src="images/v1.jpg"></i>'+
        '<p><a href="/">������Щ���ĵ���·�����������ҳ���</a></p>'+
        '<span>2018-05-13</span> </li>'+
      '<li> <i><img src="images/v2.jpg"></i>'+
        '<p><a href="/">����ģ��PSDԴ�ļ����Ҹ������HTML��</a></p>'+
        '<span>2018-05-13</span> </li>'+
    '</ul>'+
  '</div>'+
  '<div class="cloud">'+
    '<h2 class="hometitle">标签云</h2>'+
    '<ul>'+
      '<a href="/">İ�ϻ���</a> <a href="/">У԰����</a> <a href="/">html5</a> <a href="/">SumSung</a> <a href="/">�ഺ</a> <a href="/">��ů</a> <a href="/">����</a> <a href="/">����</a><a href="/">����</a> <a href="/">��ά��ҫ</a> <a href="/">����</a> <a href="/">����</a>'+
    '</ul>'+
  '</div>'+
  '<div class="links">'+
    '<h2 class="hometitle">友情链接</h2>'+
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
      '<!--  <li class="wxgzh"><a href="/" target="_blank"><span>微信</span>yangqq_1987</a></li>-->'+
     '<!--  <li class="wx"><img src="images/wx.jpg"></li>-->'+
    '</ul>'+
  '</div>';
	var door_head = document.getElementById("sideBar");
	door_head.innerHTML=sideBar;
}