package com.citi.demo.day2;

public class RailwaySeat {
 public static void main(String[] args) {
	int seat = 8;
	if (seat > 72) { System.out.println("Confirm Seat numer is <72");}
	else {
		String[] berth = {"Side Upper", "Lower", "Middle", "Upper","","","", "Side Lower"};
	int seatIndex = seat%8;
	if (seatIndex <=6 && seatIndex >=1) { seatIndex %= 3;}
	String finalBerth = berth[seatIndex];
		System.out.println(finalBerth);
 }
}
}