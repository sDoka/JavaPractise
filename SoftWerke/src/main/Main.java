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
		 
		 
		//����� �������������. ��� ������ � ������
		 View mainView = new View();
		 Controller control = new Controller(mainView);
		 
		 control.setCustomers();//������ ������ �����������
		 control.setDevices();//������ ������ ���������
		 control.updateView();//���������� ������������� �������
		 control.wait4User();//��� ����� �� ������������ � ��������� ��������������
	   }
}
