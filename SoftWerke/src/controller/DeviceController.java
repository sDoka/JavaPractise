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


	   public void setDeviceType(String type){//����� ��� �������
	      model.setType(type);		
	   }

	   public String getDeviceType(){//���������� ��� �������
	      return model.getType();		
	   }
	   public void setDeviceMark(String type){//����� ����� �������
		      model.setMark(type);		
		   }

		   public String getDeviceMark(){//���������� ����� �������
		      return model.getMark();		
		   }

	   public void setDeviceDate(int Date){//������������� ���� ������������ �������
	      model.setDate(Date);		
	   }

	   public int getDeviceDate(){//���������� ���� ������������ �������
	      return model.getDate();		
	   }

	   public void setDeviceColor(String type){//����� ���� �������
		      model.setColor(type);		
		   }

		   public String getDeviceColor(){//���������� ���� �������
		      return model.getColor();		
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
	   
	   public   ArrayList<Device> sortByType()//�� ����� �������� ���������� �� ��������� ��-���
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
