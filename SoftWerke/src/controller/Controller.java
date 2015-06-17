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
	//создаём представление для вывода на экран инфы по устройствам
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
	 private void back2main()
	 {
		 view.youAreBack();
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
		  case ("-customers")://ветка клиентов
			  cus.updateView();
			  this.nextStep();
		  case "-sales"://ветка продаж
			  this.wait4User();
		  case "-devices"://ветка устройств
			  dev.updateView();
			  this.nextStepD();
			  
	    default:
			  this.angryView();
			  this.wait4User();
			  
		  }
  
	 }
	 
	 private void nextStep()//работа с клиентами. Сортировки, поиски
	 {
		 
		 in = new Scanner(System.in);
		  String a = in.next().toLowerCase() ;//считываем, нечуствительно к регистру
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
			  this.helpCustomer();//вьюшка помощи
			  break;
		  }
			default: this.angryView();
		  }
		  this.nextStep();;

	 }
	 private void nextStepD()//работа с устройствами
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
