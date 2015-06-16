package model;

import java.util.ArrayList;
import java.util.Random;

/*
 * в модели описываем пол€ сущности покупатель
 * и методы работы с ними
 * 
 */
public class Customer {
	//класс, реализующий модель покупател€
	/*
	 * ¬ нЄм хран€тс€ пол€ покупател€ и методы дл€ работы с ним
	 * установка и получение значений полей покупател€
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
	   
	   public int getId()//получить id покупател€
	   {
		   return id;
	   }
	   public void setId(int id)//задать id покупател€
	   {
		   this.id = id;
	   }
	   
	   public int getbirthDate() {//возвращает дату рождени€ клиента
	      return birthDate;
	   }
	   
	   public void setbirthDate(int birthDate) {//устанавливает дату рождени€
	      this.birthDate = birthDate;
	   }
	   
	   public String getName() {//возвращает им€ клиента
	      return name;
	   }
	   
	   public void setName(String name) {//устанавливает им€
	      this.name = name;
	   }
	   
	 //имитируем данные о покупател€х из базы
	   ArrayList<Customer> cusList = new ArrayList<Customer>(); 
	   int[] years = {1994, 1958, 2010, 1912, 1916, 1992, 1975};
		String[] names =  new String[]{"¬ас€"," ат€","∆ора","Ѕорис","јнна"," отлета","ѕаша"};
		public ArrayList<Customer>  makeCustomers()
		{
			for (int i = 0;i< 10; i++)
			{
				int idn = new Random().nextInt(names.length);
				String name = (names[idn]);
				int idy = new Random().nextInt(years.length);
				int year = years[idy];
				Customer cus = new Customer(name, year);
				cusList.add(cus);
				cus.setId(cusList.size());
						
			}
			return cusList;
		}
	   
	   
	   
	   
	}