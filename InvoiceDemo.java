package expt1;

import java.util.Scanner;
public class InvoiceDemo {
	
	
	
		public static void main(String[] args)
		{
			//sc is like a variable which stores the input data
			Scanner sc=new Scanner(System.in);
			Invoice in=new Invoice();
			System.out.print("Enter product number :");
			//here we have to call Product_number method from another class
			in.setProduct_number(sc.nextLine());
			System.out.print("Enter product description :");
			//here we have to call Product_description method from another class
			in.setProduct_description(sc.nextLine());
			System.out.print("Enter no. of items purchased :");
			//here we have to call Quantity method from another class
			in.setQuantity(sc.nextInt());
			System.out.print("Enter price per item :");
			//here we have to call Price_item method from another class
			in.setPrice_item(sc.nextDouble());
			//all of these are called and will perform the program they are meant to be done
			System.out.print(" Item Details :\n");
			//Now we have to display the results from the called methods here
			System.out.print("Product number : " + in.getProduct_number());
			System.out.print("\nProduct description : " + in.getProduct_description());
			System.out.print("\nTotal Billing Amount : " + in.getInvoiceAmount());
		}
}
