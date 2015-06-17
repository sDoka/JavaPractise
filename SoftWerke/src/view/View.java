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
	 }
	 public void helpCustomer()
	 {
		 System.out.println("Способы сортировок");
		 System.out.println("-sortByName       -По имени");
		 System.out.println("-sortById         -По Id");
		 System.out.println("-sortByYear       -По году рождения");
		 System.out.println("------------------------------------");
		 System.out.println("Способы поиска");
		 System.out.println("-findByName   Имя    -По имени");
		 System.out.println("-findById     Id     -По Id");
		 System.out.println("-findByYear   Год    -По году рождения");
		 System.out.println("------------------------------------");
		 System.out.println("-addCustomer Имя ГодРождения      -Добавить клиента");
		 System.out.println("-back             				   -Вернуться в главное меню");
	 }
	 public void helpDevice()
	 {
		 System.out.println("Способы сортировок");
		 System.out.println("-sortByType       -По типу устройства");
		 System.out.println("-sortByColor      -По цвету устройства");
		 System.out.println("-sortByMark       -По марке устройства");
		 System.out.println("-sortById         -По Id");
		 System.out.println("-sortByYear       -По году выпуска");
		 System.out.println("------------------------------------");
		 System.out.println("Способы поиска");
		 System.out.println("-findByType       -По типу устройства");
		 System.out.println("-findByColor      -По цвету устройства");
		 System.out.println("-findByMark       -По марке устройства");
		 System.out.println("-findById         -По Id");
		 System.out.println("-findByYear       -По году выпуска");
		 System.out.println("------------------------------------");
		 System.out.println("-addCustomer Имя ГодРождения      -Добавить клиента");
		 System.out.println("-back             				   -Вернуться в главное меню");
	 }
	 public void wrongCommand()
	 {
		 System.out.println("Неверная комманда, попробуйте ещё раз либо введите -help");
	 }
}
