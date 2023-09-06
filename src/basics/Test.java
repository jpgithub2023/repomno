package basics;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner ui=new Scanner(System.in);//Primitive data type
		Scanner ui2=new Scanner(System.in);//Non-Primitive data type
		
		System.out.println("Welcome to my program");
		System.out.println("=======================");
		System.out.println("What is yor name");
		String name=ui2.nextLine();
		System.out.println("How old are you?");
		int age=ui.nextInt();
		System.out.println("What is your gender?");
		String gender=ui2.nextLine();
		System.out.println("Where are you from?");
		String country=ui2.nextLine();
		System.out.println("Where do you live now?");
		String city=ui2.nextLine();
		System.out.println("Where do you work?");
		String job=ui2.nextLine();
		System.out.println("What is your job role?");
		String role=ui2.nextLine();
		System.out.println("What is your salary?");
		double salary=ui.nextDouble();
		System.out.println("How much raise are you getting next year?");
		double raise=ui.nextDouble();
		double totalSalary=salary+raise;
		System.out.println("-------------------------");
		System.out.println("My name is "+ name +". I am "+age+" years old, "+gender+". I work at "+job+ " as "+role+".");
		System.out.println("I currently live in "+city+".I am originally from "+country+".");
		System.out.print("I make ");
		System.out.printf("%.2f",salary);
		System.out.print(" dollars.I will get ");
		System.out.printf("%.2f",raise);
		System.out.print(" dollars as annual raise so my total salary would be ");
		System.out.printf("%.2f",totalSalary);
		System.out.print(" dollars next year.");
		
		
		
		
		
		
		
		
		
		
	}

}
