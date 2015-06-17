package controller;

import java.util.ArrayList;

import model.data.Device;
import view.DeviceView;

public class DeviceController {
	   private Device model;
	   private DeviceView view;
	   private ArrayList<Device> devList;

	   public DeviceController(Device model, DeviceView view){//����������� �����������
	      this.model = model;
	      this.view = view;
	   }


	   public void setDeviceName(String type){//����� ��� �������
	      model.setType(type);		
	   }

	   public String getDeviceName(){//���������� ��� �������
	      return model.getType();		
	   }

	   public void setDevicebirthDate(int birthDate){//������������� ���� �������� �������
	      model.setDate(birthDate);		
	   }

	   public int getDevicebirthDate(){//���������� ���� �������� �������
	      return model.getDate();		
	   }

	   public void setDevices()
	   {
		   devList = model.makeDevices();
		   
	   }

	   public void updateView(){//��������� �������������, �������� ����� ������ �� �����				
	      view.printDeviceDetails(devList);
	   }	
	   public ArrayList<Device> getList()
	   {
		   return devList;
	   }
	   
	   public   ArrayList<Device> sortByType()
	   {
		   return model.sortByType(devList);
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
