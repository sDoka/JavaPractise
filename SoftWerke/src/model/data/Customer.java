package model.data;

import java.util.ArrayList;

import model.data.stores.CustomersStore;
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
	   
	public  ArrayList<Customer> makeCustomers()
	{
		
		CustomersStore cus  = new CustomersStore();
		return cus.makeCustomers();
	}
	   
	   
	   
	   
	}