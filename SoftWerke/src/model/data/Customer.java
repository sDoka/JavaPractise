package model.data;
import java.util.Collections;
import java.util.ArrayList;




import model.data.stores.CustomersStore;
import model.data.comparator.CustomerFioComparator;
import model.data.comparator.CustomerIdComparator;
import model.data.comparator.CustomerYearComparator;
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
	   
	public  ArrayList<Customer> makeCustomers()//создание списка клиентов
	{
		
		CustomersStore cus  = new CustomersStore();
		return cus.makeCustomers();
	}
	public  ArrayList<Customer> sortByName(ArrayList<Customer> inList)
	{
		Collections.sort(inList,new CustomerFioComparator());
		return inList;
	}
	public  ArrayList<Customer> sortById(ArrayList<Customer> inList)
	{
		Collections.sort(inList,new CustomerIdComparator());
		return inList;
	}
	public  ArrayList<Customer> sortByYear(ArrayList<Customer> inList)
	{
		Collections.sort(inList,new CustomerYearComparator());
		return inList;
	}
	   
	   
	   
	   
	}