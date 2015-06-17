/*
 * в модели описываем поля сущности девайс
 * и методы работы с ними
 * 
 */
package model.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import model.data.comparator.DeviceMarkComparator;
import model.data.comparator.DeviceTypeComparator;
import model.data.comparator.DeviceIdComparator;
import model.data.comparator.DeviceYearComparator;
import model.data.comparator.DeviceColorComparator;
import model.data.stores.DevicesStore;


public class Device {
//тип, цвет, дата выпуска
	private String mark;
	private String type;
	private String color;
	private int date;
	private int Id;
	
	public Device(String mark,String type, String color, int date)
	{
		this.mark = mark;
		this.type = type;
		this.color = color;
		this.date = date;
	}
	public Device()
	{
		
	}
	public void setMark(String mark)
	{
		this.mark = mark;
	}
	public String getMark()
	{
		return this.mark;
	}
	public void setId(int Id)
	{
		this.Id = Id;
	}
	public int getId()
	{
		return this.Id;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return this.type;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setDate(int date)
	{
		this.date = date;
	}
	public int getDate()
	{
		return this.date;
	}
	
	public  ArrayList<Device> makeDevices()//создание списка клиентов
	{
		
		DevicesStore cus  = new DevicesStore();
		return cus.makeDevices();
	}
	public  ArrayList<Device> sortByType(ArrayList<Device> inList)
	{
		Collections.sort(inList,new DeviceTypeComparator());
		return inList;
	}
	public  ArrayList<Device> sortByMark(ArrayList<Device> inList)
	{
		Collections.sort(inList,new DeviceMarkComparator());
		return inList;
	}
	
	public  ArrayList<Device> sortById(ArrayList<Device> inList)
	{
		Collections.sort(inList,new DeviceIdComparator());
		return inList;
	}
	public  ArrayList<Device> sortByYear(ArrayList<Device> inList)
	{
		Collections.sort(inList,new DeviceYearComparator());
		return inList;
	}
	public  ArrayList<Device> sortByColor (ArrayList<Device> inList)
	{
		Collections.sort(inList,new DeviceColorComparator());
		return inList;
	}
	
	
}
