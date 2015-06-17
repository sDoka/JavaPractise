package model.data.comparator;


import java.util.Comparator;

import model.data.Customer;

public class CustomerFioComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer cus1, Customer cus2) {

		 return cus1.getName().compareTo(cus2.getName());
	}

}
