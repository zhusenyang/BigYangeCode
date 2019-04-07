package com.boot; 
/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月25日 下午3:31:06 
* 类说明 :
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "SID=1f21feaea&";
		String a = aa.replace("^SID=\\w+&", "s");
		System.out.println(a);
	}

}
 