package main;

import view.View;
import controller.Controller;



public class Main {
	 public static void main(String[] args) {
		 //�������� ������ �����������
		 
		 //����� �������������. ��� ������ � ������
		 View mainView = new View();
		 Controller control = new Controller(mainView);
		 control.setCustomers();//������ ������ �����������
		 
		 control.updateView();//���������� ������������� �������
		 control.wait4User();//��� ����� �� ������������ � ��������� ��������������
	   }
}
