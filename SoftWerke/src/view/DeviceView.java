package view;

import java.util.ArrayList;

import model.data.Device;

public class DeviceView {
	 public void printDeviceDetails(ArrayList<Device> devList){
	      System.out.println("����������: ");
	      System.out.println("Id   " + "���:      " +"�����     "+ "     ����:        " + "       ��� �������: ");
	    
	      
	     for(Device dev : devList)
	      {	    
		      System.out.printf("%-5s",dev.getId());
		      System.out.printf("%-10s", dev.getType());
		      System.out.printf("%-15s", dev.getMark());
		      System.out.printf("%-20s", dev.getColor());
		      System.out.printf("%-25s%n", dev.getDate());
	      }
	 }
}
