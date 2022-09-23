package expt1;

public class Invoice {
	
		/*first we are creating variables which are private in this program for storing
		serial number of the product in store,its description (name),
		no of items purchased,total amount for billing*/
		//private makes that variable to be used within that class
		private String product_number;
		private String product_description;
		private int quantity;
		private double price_item;
		private double total=0;
		//now here we have to make a constructor .this will have same name as the class name
		Invoice()
		{
			String product_number="";	
			String product_description="";
			int quantity=0;
			double price_item=0.0;
		}
		
		public String getProduct_number()
		{
			/*for getting number from user
			this is a string because the owner may store
			 it in the form of alpha-numeric*/
			return product_number;
		}
		public void setProduct_number(String product_number)
		{
			//for storing number into product_number
			this.product_number = product_number;
		}
		public String getProduct_description()
		{
			//for getting description like name,company etc.,
			return product_description;
		}
		public void setProduct_description(String product_description)
		{
			//for storing descripion in product_description
			this.product_description = product_description;
		}
		public int getQuantity()
		{
			//for getting how many items the customer has purchased
			return quantity;
		}
		public void setQuantity(int quantity)
		{	/*if no products are puchased or negative no 
			of products are given,it will return 0*/
			if(quantity<0)
			{
				quantity=0;
			}
			//or it will store that number into quantity
			else
				this.quantity = quantity;
		}
		public double getPrice_item()
		{	/*this will be updated based on market so 
		 	we have to get the price of the product*/
			return price_item;
		}
		public void setPrice_item(double price_item)
		{	/*this also returns 0 if price is given < 0*/
			if(price_item<0)
			{
				price_item=0.0;
			}
			//or the price will be stored in price_item
			else
				this.price_item = price_item;
		}
		double getInvoiceAmount()
		{//here we declare total price for calculating amount
			totalprice();//it invokes totalprice method
			return total;
			//this returns total value to the called statements in another class
		}
		void totalprice()
		{	/*the price of each product will be calculated with 
			multiplying no of products here and added to totalprice */
			total=total+getQuantity()*getPrice_item();
		}
	
}
