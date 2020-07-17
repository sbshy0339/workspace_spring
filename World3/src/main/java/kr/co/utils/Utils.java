package kr.co.utils;

import java.io.UnsupportedEncodingException;

public class Utils {

	public static String toKor(String msg) {
		
			try {
				return new String(msg.getBytes("8859 1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return null;
			}
	}
	
}
