package model;

import java.util.ArrayList;
import java.util.Random;

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
	   
	 //��������� ������ � ����������� �� ����
	   ArrayList<Customer> cusList = new ArrayList<Customer>(); 
	   int[] years = {1994, 1958, 2010, 1912, 1916, 1992, 1975};
		String[] names =  new String[]{"����","����","����","�����","����","�������","����"};
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