package model.data;
import java.util.Collections;
import java.util.ArrayList;




import model.data.stores.CustomersStore;
import model.data.comparator.CustomerFioComparator;
import model.data.comparator.CustomerIdComparator;
import model.data.comparator.CustomerYearComparator;
/*
 * � ������ ��������� ���� �������� ����������
 * � ������ ������ � ����
 * 
 */
public class Customer {
	//�����, ����������� ������ ����������
	/*
	 * � �� �������� ���� ���������� � ������ ��� ������ � ���
	 * ��������� � ��������� �������� ����� ����������
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
	   
	   public int getId()//�������� id ����������
	   {
		   return id;
	   }
	   public void setId(int id)//������ id ����������
	   {
		   this.id = id;
	   }
	   
	   public int getbirthDate() {//���������� ���� �������� �������
	      return birthDate;
	   }
	   
	   public void setbirthDate(int birthDate) {//������������� ���� ��������
	      this.birthDate = birthDate;
	   }
	   
	   public String getName() {//���������� ��� �������
	      return name;
	   }
	   
	   public void setName(String name) {//������������� ���
	      this.name = name;
	   }
	   
	public  ArrayList<Customer> makeCustomers()//�������� ������ ��������
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