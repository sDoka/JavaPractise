package controller;


import java.util.Scanner;




//для покупателя
import model.Customer;
import controller.CustomerController;
import view.CustomerView;

//для текущего контрола
import view.View;

public class Controller {
	

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
	 public void wait4User()
	 {
		  in = new Scanner(System.in);
		  String s = in.next().toLowerCase() ;//считываем, нечуствительно к регистру
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
	  public void setCustomers()//забиваем список клиентов
	  {
		  cus.setCustomers();
	  }
}
