package com.defineexception;

import java.util.Scanner;

public class DefineException {

	public static void main(String[] args) {
		final int MIN = 25, MAX = 40;
		Scanner scan = new Scanner(System.in);
		System.out.print("输入" + MIN + "至" + MAX + "之间的整数：");
		try {
			int value = scan.nextInt();
			if(value < MIN || value > MAX)
				throw new OutOfRangException();;	//抛出自定义异常
		} catch(OutOfRangException e) {
			e.printStackTrace();
		} finally {
			System.out.println("主方法结束");
		}

	}

}
