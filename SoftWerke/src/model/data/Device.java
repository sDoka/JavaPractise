/*
 * в модели описываем поля сущности девайс
 * и методы работы с ними
 * 
 */
package model.data;

public class Device {
//тип, цвет, дата выпуска
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
