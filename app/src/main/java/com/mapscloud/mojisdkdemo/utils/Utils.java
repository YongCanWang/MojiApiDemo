package com.mapscloud.mojisdkdemo.utils;

import java.security.MessageDigest;

/**
 * @author TomCan
 * @description:
 * @date :2020/7/3 15:10
 */
public class Utils {


    public static String getMD5(String str) {
        MessageDigest md5 = null;
        try
        {
            md5 = MessageDigest.getInstance("MD5");
        }catch(Exception e)
        {
            e.printStackTrace();
            return "";
        }

        char[] charArray = str.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for(int i = 0; i < charArray.length; i++)
        {
            byteArray[i] = (byte)charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();
        for( int i = 0; i < md5Bytes.length; i++)
        {
            int val = ((int)md5Bytes[i])&0xff;
            if(val < 16)
            {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }



    /**
     * 获取MD5加密串
     *
     * @param s
     * @return
     */
    public static String getMD5Str(String s) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bDigests = md.digest(s.getBytes("UTF-8"));
            result = byte2hex(bDigests);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * byte型单字节转十六进制编码
     *
     * @param b
     * @return
     */
    public static String byte2hex(byte[] b) {
        StringBuffer hs = new StringBuffer();
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));// 将单字节byte的高24位置零
            if (stmp.length() == 1) {
                hs.append("0").append(stmp);
            } else {
                hs.append(stmp);
            }
        }
        return hs.toString().toLowerCase();
    }



}
