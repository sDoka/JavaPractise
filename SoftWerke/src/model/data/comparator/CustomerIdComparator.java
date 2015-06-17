package model.data.comparator;
import java.util.Comparator;
import model.data.Customer;

public class CustomerIdComparator implements Comparator<Customer>{



	@Override
	public int compare(Customer cus1, Customer cus2) {
		// TODO Auto-generated method stub
		return (cus1.getId() < cus2.getId() ? -1 : (cus1.getId() == cus2.getId() ? 0 : 1));
	}

}
