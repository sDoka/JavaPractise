package main;

import view.View;
import controller.Controller;



public class Main {
	 public static void main(String[] args) {
		 //забиваем списки покупателей
		 
		 //Общее представление. Для работы с юзером
		 View mainView = new View();
		 Controller control = new Controller(mainView);
		 control.setCustomers();//создаём список покупателей
		 
		 control.updateView();//показвыаем привественную надпись
		 control.wait4User();//ждём ввода от пользователя и реагируем соответственно
	   }
}
