package main;



import model.data.Device;
import view.DeviceView;
import view.View;
import controller.Controller;
import controller.DeviceController;



public class Main {
	 public static void main(String[] args) {
	 
		/* Device devModel = new Device();
		 DeviceView devView = new DeviceView();
		 DeviceController dev = new DeviceController(devModel, devView);
		 dev.setDevices();
		 dev.updateView();
		 dev.sortByMark();
		 dev.updateView();*/
		 
		 
		//Общее представление. Для работы с юзером
		 View mainView = new View();
		 Controller control = new Controller(mainView);
		 
		 control.setCustomers();//создаём список покупателей
		 control.setDevices();//создаём список устройств
		 control.updateView();//показвыаем привественную надпись
		 control.wait4User();//ждём ввода от пользователя и реагируем соответственно
	   }
}
