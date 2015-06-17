package model.data.stores;

import java.util.ArrayList;
import java.util.Random;

import model.data.Device;

public class DevicesStore {
	//имитируем данные об устройствах из базы
	   ArrayList<Device> devList = new ArrayList<Device>(); 
	   String[] colors =  new String[]{"Жёлтый","Красный","Чёрный","Белый","Зелёный","Синий","Оранжевый"};
		String[] types =  new String[]{"Смартфон","Планшет","Ноутбук","Плеер"};
		String[] marks = new String[]{"LG","Samsung","Alctatel","Apple","Sony","Panasonic","Phillips"};
		int[] years = {1994, 1958, 2010, 1912, 1916, 1992, 1975};
		public ArrayList<Device>  makeDevices()
		{
			for (int i = 0;i< 10; i++)
			{
				int idm = new Random().nextInt(marks.length);
				String mark = (marks[idm]);
				int idt = new Random().nextInt(types.length);
				String type = (types[idt]);
				int idc = new Random().nextInt(colors.length);
				String color = colors[idc];
				int idy = new Random().nextInt(years.length);
				int date = years[idy];
				Device dev = new Device(mark,type,color,date);
				devList.add(dev);
				dev.setId(devList.size());
						
			}
			return devList;
		}
}
