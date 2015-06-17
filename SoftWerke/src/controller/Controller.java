package controller;


import java.util.Scanner;




//для покупателя



import model.data.Customer;
import model.data.Device;
import controller.CustomerController;
import view.CustomerView;

import view.DeviceView;
//для текущего контрола
import view.View;

public class Controller {
	
	//инициализируем и определяем устройства
    Device devmodel  = new Device();
//создаём представление для вывода на экран инфы по покупателям
    DeviceView devView = new DeviceView();      
	  DeviceController dev = new DeviceController(devmodel, devView);
	//инициализируем и определяем покупателя
      Customer model  = new Customer();
  //создаём представление для вывода на экран инфы по покупателям
      CustomerView cusView = new CustomerView();      
	  CustomerController cus = new CustomerController(model, cusView);
	
	
	private View view;
	private Scanner in;
	
	public Controller(View view){//конструктор контроллера
	 this.view = view;
	   }
	 public void updateView(){//обновляет представление, вызывает метод вывода на экран				
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
	  public void setCustomers()//забиваем список клиентов
	  {
		  cus.setCustomers();
	  }
	  public void setDevices()//забиваем список клиентов
	  {
		  dev.setDevices();
	  }
	 public void wait4User()
	 {
		  in = new Scanner(System.in);
		  String s = in.next().toLowerCase() ;//считываем, нечуствительно к регистру
		  switch (s)
		  {
		  case "-help"://ветка помощи
			  view.help();
			  this.wait4User();
		  case "-customers"://ветка клиентов
			  cus.updateView();
			  this.nextStep();
		  case "-sales"://ветка продаж
			  this.wait4User();
		  case "-devices"://ветка устройств
			  dev.updateView();
			  this.nextStepD();
			  this.wait4User();
		  default:
			  this.angryView();
			  this.wait4User();
			  
		  }
  
	 }
	 
	 private void nextStep()//работа с клиентами. Сортировки, поиски
	 {
		 this.helpCustomer();
		 in = new Scanner(System.in);
		  String a = in.next().toLowerCase() ;//считываем, нечуствительно к регистру
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
		  String a = in.next().toLowerCase() ;//считываем, нечуствительно к регистру
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
