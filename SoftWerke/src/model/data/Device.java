/*
 * � ������ ��������� ���� �������� ������
 * � ������ ������ � ����
 * 
 */
package model.data;

public class Device {
//���, ����, ���� �������
	String type;
	String color;
	String date;
	
	public Device(String[] args)
	{
		this.type = args[0];
		this.color = args[1];
		this.date = args[2];
	}
	
	
}
