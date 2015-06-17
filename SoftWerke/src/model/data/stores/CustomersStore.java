package model.data.stores;
import java.util.ArrayList;
import java.util.Random;

import model.data.Customer;

public class CustomersStore {
	 //имитируем данные о покупателях из базы
	   ArrayList<Customer> cusList = new ArrayList<Customer>(); 
	   int[] years = {1994, 1958, 2010, 1912, 1916, 1992, 1975};
		String[] names =  new String[]{"Вася","Катя","Жора","Борис","Анна","Котлета","Паша"};
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
