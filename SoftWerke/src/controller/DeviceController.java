package controller;

import java.util.ArrayList;

import model.data.Device;
import view.DeviceView;

public class DeviceController {
	   private Device model;
	   private DeviceView view;
	   private ArrayList<Device> devList;

	   public DeviceController(Device model, DeviceView view){//конструктор контроллера
	      this.model = model;
	      this.view = view;
	   }


	   public void setDeviceType(String type){//задаёт тип девайса
	      model.setType(type);		
	   }

	   public String getDeviceType(){//возвращает тип девайса
	      return model.getType();		
	   }
	   public void setDeviceMark(String type){//задаёт марку девайса
		      model.setMark(type);		
		   }

		   public String getDeviceMark(){//возвращает марку девайса
		      return model.getMark();		
		   }

	   public void setDeviceDate(int Date){//устанавливает дату изготовления девайса
	      model.setDate(Date);		
	   }

	   public int getDeviceDate(){//возвращает дату изготовления девайса
	      return model.getDate();		
	   }

	   public void setDeviceColor(String type){//задаёт цвет девайса
		      model.setColor(type);		
		   }

		   public String getDeviceColor(){//возвращает цвет девайса
		      return model.getColor();		
		   }
	   
	   
	   
	   public void setDevices()
	   {
		   devList = model.makeDevices();
		   
	   }

	   public void updateView(){//обновляет представление, вызывает метод вывода на экран				
	      view.printDeviceDetails(devList);
	   }	
	   public ArrayList<Device> getList()
	   {
		   return devList;
	   }
	   
	   public   ArrayList<Device> sortByType()//не хочет работать сортировка по строковым эл-там
	   {
		   
		   return  model.sortByType(devList);
	   }
	   
	   public   ArrayList<Device> sortByMark()
	   {
		   return model.sortByMark(devList);
	   }
	   
	   public   ArrayList<Device> sortByColor()
	   {
		   return model.sortByColor(devList);
	   }
	   
	   public   ArrayList<Device> sortById()
	   {
		   return model.sortById(devList);
	   }
	   
	   public   ArrayList<Device> sortByYear()
	   {
		   return model.sortByYear(devList);
	   }
	}
