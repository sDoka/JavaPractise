

package controller;
import java.util.ArrayList;

import view.CustomerView;
import model.data.Customer;

/*
 * ���������� ������� 
 * ��������� ������������� � ������
 */
public class CustomerController {
	   private Customer model;
	   private CustomerView view;
	   private ArrayList<Customer> cusList;

	   public CustomerController(Customer model, CustomerView view){//����������� �����������
	      this.model = model;
	      this.view = view;
	   }


	   public void setCustomerName(String name){//����� ��� �������
	      model.setName(name);		
	   }

	   public String getCustomerName(){//���������� ��� �������
	      return model.getName();		
	   }

	   public void setCustomerbirthDate(int birthDate){//������������� ���� �������� �������
	      model.setbirthDate(birthDate);		
	   }

	   public int getCustomerbirthDate(){//���������� ���� �������� �������
	      return model.getbirthDate();		
	   }

	   public void setCustomers()
	   {
		   cusList = model.makeCustomers();
		   
	   }

	   public void updateView(){//��������� �������������, �������� ����� ������ �� �����				
	      view.printCustomerDetails(cusList);
	   }	
	   public ArrayList<Customer> getList()
	   {
		   return cusList;
	   }
	   
	   public   ArrayList<Customer> sortByName()
	   {
		   return model.sortByName(cusList);
	   }
	   public   ArrayList<Customer> sortById()
	   {
		   return model.sortById(cusList);
	   }
	   public   ArrayList<Customer> sortByYear()
	   {
		   return model.sortByYear(cusList);
	   }
	}
