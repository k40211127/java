package io_test;

public class ToUpperCase_ToLowerCase {
	public static void main(String[] args) {
		
        String str = "ab";
        System.out.println(str.toUpperCase());        // 轉換成大寫
        System.out.println(str.toLowerCase());        // 轉換成小寫
        
        char ch = 'a';
        System.out.println(Character.toUpperCase(ch));// 轉換成大寫
        System.out.println(Character.toLowerCase(ch));// 轉換成小寫

	}
}
