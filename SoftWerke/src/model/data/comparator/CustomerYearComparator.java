package model.data.comparator;

import java.util.Comparator;
import model.data.Customer;

public class CustomerYearComparator  implements Comparator<Customer>{

	@Override
	public int compare(Customer cus1, Customer cus2) {
		// TODO Auto-generated method stub
		return (cus1.getbirthDate() < cus2.getbirthDate() ? -1 : (cus1.getbirthDate() == cus2.getbirthDate() ? 0 : 1));
	}
	

}
