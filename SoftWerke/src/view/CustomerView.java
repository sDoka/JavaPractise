package view;

import java.util.ArrayList;

import model.data.Customer;

public class CustomerView {
	 public void printCustomerDetails(ArrayList<Customer> cusList){
	      System.out.println("Покупатель: ");
	      System.out.println(/*"Id "+*/"Имя: " + "        Год рождения: ");
	      for(Customer cus : cusList)
	      {	      
		      System.out.printf("%-15s", cus.getName());
		      System.out.println("" + cus.getbirthDate());
	      }

	      
	   }
}
