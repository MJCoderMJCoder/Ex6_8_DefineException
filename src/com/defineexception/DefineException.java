package com.defineexception;

import java.util.Scanner;

public class DefineException {

	public static void main(String[] args) {
		final int MIN = 25, MAX = 40;
		Scanner scan = new Scanner(System.in);
		System.out.print("����" + MIN + "��" + MAX + "֮���������");
		try {
			int value = scan.nextInt();
			if(value < MIN || value > MAX)
				throw new OutOfRangException();;	//�׳��Զ����쳣
		} catch(OutOfRangException e) {
			e.printStackTrace();
		} finally {
			System.out.println("����������");
		}

	}

}
