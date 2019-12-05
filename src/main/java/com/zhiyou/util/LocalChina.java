package com.zhiyou.util;

public class LocalChina {

	public static String local(String a, String b) {
		if (a.equals("1")) {
			a = "河南";
			if (b.equals("1")) {
				b = "郑州";
			}
			if (b.equals("2")) {
				b = "许昌";
			}
			if (b.equals("3")) {
				b = "开封";
			}
		}

		return a + "-" + b;
	}
}
