package com.citi.demo.day2;

public class IfElseDemo {
public static void main(String[] args) {
	System.out.println("Should I change my job?");
	double currentSalary = 100;
	double offeredSalary = 110;
	if (offeredSalary > currentSalary) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
}
}