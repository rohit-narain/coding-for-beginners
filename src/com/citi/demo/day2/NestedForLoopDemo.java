package com.citi.demo.day2;

public class NestedForLoopDemo {
public static void main(String[] args) {
	for (int i = 1; i <=10; i++) {
		for (int j = 1; j <= 10; j++ ) {
			System.out.print(j +" x "+ i + "\t= " + i * j + "\t");
		}
		 System.out.println("");
	}
}
}