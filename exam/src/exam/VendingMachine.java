package exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int price = 0;
		Drink d1 = new Drink();
		while(1>0){
			d1.Drink(price);
			d1.print();
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			switch(line){
			case "1":
				price = price + 1;
				break;
			case "5":
				price = price + 5;
				break;
			case "10":
				price = price + 10;
				break;
			case "a":
				price = price - 10;
				if(price>0){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
					price = price + 10;
				}
			case "c":
				price = price - 10;
				if(price>0){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
					price = price + 10;
				}
			case "b":
				price = price - 15;
				if(price>0){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
					price = price + 15;
				}
			case "g":
				price = price - 15;
				if(price>0){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
					price = price + 15;
				}
			case "d":
					price = price - 18;
					if(price>0){
						System.out.println("DON!");
					}else{
						System.out.println("BEEP!");
						price = price + 18;
					}
			case "h":
				price = price - 18;
				if(price>0){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
					price = price + 18;
				}
			case "f":
				price = price - 20;
				if(price>0){
					System.out.println("DON!");
				}else{
					System.out.println("BEEP!");
					price = price + 20;
				}
			case "0":
				price = price -(price+1);
			}
			if(price<0){
				break;
			}
		}

	}

}
