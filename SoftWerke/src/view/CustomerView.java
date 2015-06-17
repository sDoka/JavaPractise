package view;

import java.util.ArrayList;

import model.data.Customer;

public class CustomerView {
	 public void printCustomerDetails(ArrayList<Customer> cusList){
	      System.out.println("����������: ");
	      System.out.println("Id             " + "���:                  " + "   ��� ��������: ");
	      for(Customer cus : cusList)
	      {	      
		      System.out.printf("%-15s",cus.getId());
		      System.out.printf("%-25s", cus.getName());
		      System.out.printf("%-35s%n", cus.getbirthDate());
	      }
	      
	   }
}
