package com.defineexception;

//自定义一个异常类
class OutOfRangException extends Exception {	//rang：把...圈起来（ring的过去式）、打电话给
	OutOfRangException() {
		super("输入数据超出范围");	//调用父类的构造方法，方法体中第一条语句。
	}
}