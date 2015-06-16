

package controller;
import java.util.ArrayList;

import view.CustomerView;
import model.Customer;

/*
 * Контроллер клиента 
 * связывает представление и модель
 */
public class CustomerController {
	   private Customer model;
	   private CustomerView view;
	   private ArrayList<Customer> cusList;

	   public CustomerController(Customer model, CustomerView view){//конструктор контроллера
	      this.model = model;
	      this.view = view;
	   }


	   public void setCustomerName(String name){//задаёт имя клиента
	      model.setName(name);		
	   }

	   public String getCustomerName(){//возвращает имя клиента
	      return model.getName();		
	   }

	   public void setCustomerbirthDate(int birthDate){//устанавливает дату рождения клиента
	      model.setbirthDate(birthDate);		
	   }

	   public int getCustomerbirthDate(){//возвращает дату рождения клиента
	      return model.getbirthDate();		
	   }

	   public void setCustomers()
	   {
		   cusList = model.makeCustomers();
		   
	   }

	   public void updateView(){//обновляет представление, вызывает метод вывода на экран				
	      view.printCustomerDetails(cusList);
	   }	
	}
