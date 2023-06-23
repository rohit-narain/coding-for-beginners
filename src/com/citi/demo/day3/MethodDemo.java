package com.citi.demo.day3;

public class MethodDemo {

		static void calculateIncome(double salary, double bonus, double tax) {
			double income = salary + bonus - tax;
			System.out.println(income);
		}
		
		public static void main(String[] args) {
			MethodDemo.calculateIncome(100, 10, 5);
			MethodDemo.calculateIncome(150, 20, 10);
			MethodDemo.calculateIncome(90, 5, 0);
		}
}
