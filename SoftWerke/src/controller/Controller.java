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
		  case "-customers"://����� ��������
			  cus.updateView();
			  this.nextStep();
		  case "-sales"://����� ������
			  this.wait4User();
		  case "-devices"://����� ���������
			  dev.updateView();
			  this.nextStepD();
			  this.wait4User();
		  default:
			  this.angryView();
			  this.wait4User();
			  
		  }
  
	 }
	 
	 private void nextStep()//������ � ���������. ����������, ������
	 {
		 this.helpCustomer();
		 in = new Scanner(System.in);
		  String a = in.next().toLowerCase() ;//���������, �������������� � ��������
		  switch (a){
		  case "-sortbyname":
			  cus.sortByName();
			  cus.updateView();
			  this.nextStep();
		  case "-sortbyid":
			  cus.sortById();
			  cus.updateView();
			  this.nextStep();
		  case "-sortbyyear":
			  cus.sortByYear();
			  cus.updateView();
			  this.nextStep();
		  case "-findbyname":

			  this.nextStep();
		  case "-findbyid":

			  this.nextStep();
		  case "-findbyyear":

			  this.nextStep();
		  case "-addcustomer":
			  
			  this.nextStep();
		  case "-back":
			  this.updateView();
			  this.wait4User();
			  
			default: this.angryView();
		  }

	 }
	 private void nextStepD(){
		 this.helpDevice();
		 in = new Scanner(System.in);
		  String a = in.next().toLowerCase() ;//���������, �������������� � ��������
		  switch (a){
		  case "-sortbytype":
			  dev.sortByType();
			  dev.updateView();
			  this.nextStepD();
		  case "-sortbycolor":
			  dev.sortByColor();
			  dev.updateView();
			  this.nextStep();
		  case "-sortbymark":
			  dev.sortByMark();
			  dev.updateView();
			  this.nextStepD();
		  case "-sortbyid":
			  dev.sortById();
			  dev.updateView();
			  this.nextStepD();
		  case "-sortbyyear":
			  dev.sortByYear();
			  dev.updateView();
			  this.nextStepD();
		  case "-findbyname":

			  this.nextStepD();
		  case "-findbyid":

			  this.nextStepD();
		  case "-findbyyear":

			  this.nextStepD();
		  case "-addcustomer":
			  
			  this.nextStepD();
		  case "-back":
			  this.updateView();
			  this.wait4User();
			  
			default: this.angryView();
		  }
	 }
}
