package view;

public class View {

	 public void sayHello(){
	      System.out.println("Добро пожаловать в наш магазин: ");
	      System.out.println("Для получения справки введите -help");
	      System.out.println("Либо введите нужную комманду ");
	   }
	 public void help()
	 {
		 System.out.println("Список доступных комманд");
		 System.out.println("-customers     -показать всех клиентов");
		 System.out.println("-sales         -показать все продажи");
		 System.out.println("-devices       -показать все устройства");
		 System.out.println("-new sale      -продать устройство");
		 System.out.println("-new customer  -добавить покупателя");
		 System.out.println("-new device    -добавить устройство");
		 
	 }
	 public void wrongCommand()
	 {
		 System.out.println("Неверная комманда, попробуйте ещё раз либо введите -help");
	 }
}
