package com.boot.utile;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



/**
 * @author 作者 竺森洋:
 * @version 创建时间：2019年3月29日 下午4:43:14 类说明 :
 */
public class MD5 {
	private static final String hexDigIts[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
			"e", "f" };

	/**
	 * MD5加密
	 * 
	 * @param origin
	 *            字符
	 * @param charsetname
	 *            编码
	 * @return
	 */
	public static String MD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (null == charsetname || "".equals(charsetname)) {
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} else {
				resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
			}
		} catch (Exception e) {
		}
		return resultString;
	}

	public static String MD5EncodeByUTF8(String origin){
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString.getBytes("utf-8")));
		} catch (Exception e) {
		}
		return resultString;
	}
	
	public static String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	public static String byteToHexString(byte b) {
		int n = b;
		if (n < 0) {
			n += 256;
		}
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigIts[d1] + hexDigIts[d2];
	}


	public void test() {
		String ss = MD5.MD5Encode("1234563c318dd3ea575d6c", "utf-8");
		System.out.println(ss);
		String sss = MD5.MD5Encode("123456", "utf-8");
		System.out.println(sss);
	}
}
