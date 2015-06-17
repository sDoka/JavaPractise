package model.data.comparator;

import java.util.Comparator;


import model.data.Device;

public class DeviceMarkComparator  implements Comparator<Device>{

	@Override
	public int compare(Device cus1, Device cus2) {

		 return cus1.getMark().compareTo(cus2.getMark());
	}
}
