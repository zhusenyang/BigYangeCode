package com.boot.utile;

import com.boot.entity.LoginAddress;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class AddressUtil {
    static ArrayList<String> ipHead=new ArrayList<>();
    static {
        ipHead.add("X-Forwarded-For");
        //Proxy-Client-IP
        //WL-Proxy-Client-IP

    }
    public static void main(String[] args) {

        System.out.println(getAddressByIP("192.168.1.6"));
    }

    /**
     * 获取真实IP
     * @param request 请求体
     * @return 真实IP
     */
    public static String getRealIp(HttpServletRequest request) {
        // 这个一般是Nginx反向代理设置的参数
        String ip = request.getHeader("X-Real-IP");
        int i = 0;
        while (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            if (i<ipHead.size()) ip=request.getHeader(ipHead.get(0));
            else if (i>ipHead.size()) ip = request.getRemoteAddr();break;
        }

        // 处理多IP的情况（只取第一个IP）
        if (ip != null && ip.contains(",")) {
            String[] ipArray = ip.split(",");
            ip = ipArray[0];
        }
        return ip;
    }

    public static LoginAddress getAddressByIP(String strIP) {
        LoginAddress address =new LoginAddress();
        try {
            URL url = new URL("http://api.map.baidu.com/location/ip?ak=F454f8a5efe5e577997931cc01de3974&ip=" + strIP);
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String line = null;
            StringBuffer result = new StringBuffer();

            while((line = reader.readLine()) != null) {
                result.append(line);
            }

            reader.close();
            String ipAddr = result.toString();
//            System.out.println(ipAddr);
            try {
                JSONObject obj1 = new JSONObject(ipAddr);
                if ("0".equals(obj1.get("status").toString())) {
                    JSONObject obj2 = new JSONObject(obj1.get("content").toString());
                    JSONObject obj3 = new JSONObject(obj2.get("address_detail").toString());
                    String city_code = obj3.get("city_code").toString();
                    String province = obj3.get("province").toString();
                    String add = obj1.get("address").toString();
                    String city=obj3.get("city").toString();
                    address.setCity(city);
                    address.setAddress(add);
                    address.setProvince(province);
                    address.setIp(strIP);
                    return address;
                } else {
                    return address;
                }
            } catch (JSONException var12) {
                var12.printStackTrace();
                return address;
            }
        } catch (IOException var13) {
            return address;
        }
    }
}
