package controller;


import java.util.Scanner;




//��� ����������



import model.data.Customer;
import model.data.Device;
import controller.CustomerController;
import view.CustomerView;

import view.DeviceView;
//��� �������� ��������
import view.View;

public class Controller {
	
	//�������������� � ���������� ����������
	  Device devmodel  = new Device();
	//������ ������������� ��� ������ �� ����� ���� �� �����������
      DeviceView devView = new DeviceView();      
	  DeviceController dev = new DeviceController(devmodel, devView);

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
	 private void helpCustomer()
	 {
		 view.helpCustomer();
	 }
	 private void helpDevice()
	 {
		 view.helpDevice();
	 }
	 private void back2main()
	 {
		 view.youAreBack();
	 }
	  public void setCustomers()//�������� ������ ��������
	  {
		  cus.setCustomers();
	  }
	  public void setDevices()//�������� ������ ��������
	  {
		  dev.setDevices();
	  }
	 public void wait4User()
	 {
		  in = new Scanner(System.in);
		  String s = in.next().toLowerCase() ;//���������, �������������� � ��������
		  switch (s)
		  {
		  case "-help"://����� ������
			  view.help();
			  this.wait4User();
		  case ("-customers")://����� ��������
			  cus.updateView();
			  this.nextStep();
		  case "-sales"://����� ������
			  this.wait4User();
		  case "-devices"://����� ���������
			  dev.updateView();
			  this.nextStepD();
			  
	    default:
			  this.angryView();
			  this.wait4User();
			  
		  }
  
	 }
	 
	 private void nextStep()//������ � ���������. ����������, ������
	 {
		 
		 in = new Scanner(System.in);
		  String a = in.next().toLowerCase() ;//���������, �������������� � ��������
		  switch (a){
		  case "-sortbyname":
		  {
			  cus.sortByName();
			  cus.updateView();
			  break;
		  }

			  
		  case "-sortbyid":
		  {
			  cus.sortById();
			  cus.updateView();
			  break;
		  }

		  case "-sortbyyear":
		  {
			  cus.sortByYear();
			  cus.updateView();
			  this.nextStep();
		  }
			  
		  case "-findbyname":
			  break;
		  case "-findbyid":
			 break;
		  case "-findbyyear":
			  break;

			  
		  case "-addcustomer":
			 break;
		  case "-back":
		  {
			  this.updateView();
			  this.wait4User();
			  break;
		  }

		  case "-help":
		  {
			  this.helpCustomer();//������ ������
			  break;
		  }
			default: this.angryView();
		  }
		  this.nextStep();;

	 }
	 private void nextStepD()//������ � ������������
	 {
		 in = new Scanner(System.in);
		 String d = in.next().toLowerCase();
		 switch (d){
		 case "-sortbytype":{
			    dev.sortByType();
				dev.updateView();
				break;
		 }
		 case "-sortbymark":
		 {
			    dev.sortByMark();
				dev.updateView();
				break;
		 }
		 case"-sortbycolor":
		 {
			    dev.sortByColor();
				dev.updateView();
				break;
		 }
		 case"-sortbyyear":
		 {
			    dev.sortByYear();
				dev.updateView();
				break;
		 }
		 case "-sortbyid":
		 {
			 dev.sortById();
				dev.updateView();
				break;
		 }
		 case "-help":
			 this.helpDevice();
			 break;
		 case "-back":
		 {
			 this.back2main();
			 this.wait4User();
			 break;
		 }
		 default: this.angryView();
		 break;
		 }
		this.nextStepD();
	 
	 }
}
