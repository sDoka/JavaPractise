package model.data;

import java.util.ArrayList;

import model.data.stores.CustomersStore;
/*
 * в модели описываем поля сущности покупатель
 * и методы работы с ними
 * 
 */
public class Customer {
	//класс, реализующий модель покупателя
	/*
	 * В нём хранятся поля покупателя и методы для работы с ним
	 * установка и получение значений полей покупателя
	 */

	public Customer(String name, int year)
	{
      this.setName(name);
	  this.setbirthDate(year);
	}
	public Customer()
	{
		
	}
	   private int birthDate;
	   private String name;
	   private int id;
	   
	   public int getId()//получить id покупателя
	   {
		   return id;
	   }
	   public void setId(int id)//задать id покупателя
	   {
		   this.id = id;
	   }
	   
	   public int getbirthDate() {//возвращает дату рождения клиента
	      return birthDate;
	   }
	   
	   public void setbirthDate(int birthDate) {//устанавливает дату рождения
	      this.birthDate = birthDate;
	   }
	   
	   public String getName() {//возвращает имя клиента
	      return name;
	   }
	   
	   public void setName(String name) {//устанавливает имя
	      this.name = name;
	   }
	   
	public  ArrayList<Customer> makeCustomers()
	{
		
		CustomersStore cus  = new CustomersStore();
		return cus.makeCustomers();
	}
	   
	   
	   
	   
	}