package controller;


import java.util.Scanner;




//��� ����������
import model.Customer;
import controller.CustomerController;
import view.CustomerView;

//��� �������� ��������
import view.View;

public class Controller {
	

	//�������������� � ���������� ����������
      Customer model  = new Customer();
  //������ ������������� ��� ������ �� ����� ���� �� �����������
      CustomerView cusView = new CustomerView();      
	  CustomerController cus = new CustomerController(model, cusView);
	
	
	private View view;
	private Scanner in;
	
	public Controller(View view){//����������� �����������
	 this.view = view;
	   }
	 public void updateView(){//��������� �������������, �������� ����� ������ �� �����				
	      view.sayHello();
	   }	
	 private void angryView(){
		 view.wrongCommand();
	 }
	 public void wait4User()
	 {
		  in = new Scanner(System.in);
		  String s = in.next().toLowerCase() ;//���������, �������������� � ��������
		  switch (s)
		  {
		  case "-help":
			  view.help();
			  this.wait4User();
		  case "-customers":
			  cus.updateView();
			  this.wait4User();
		  case "-sales":
			  this.wait4User();
		  case "-devices":
			  this.wait4User();
		  case "-new sale":
			  this.wait4User();
		  case "-new customer":
			  this.wait4User();
		  case "-new device":
			  this.wait4User();
		  
		  default:
			  this.angryView();
			  this.wait4User();
			  
		  }
	
		  
	 }
	  public void setCustomers()//�������� ������ ��������
	  {
		  cus.setCustomers();
	  }
}
