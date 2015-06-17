package model.data.comparator;

import java.util.Comparator;


import model.data.Device;

public class DeviceColorComparator implements Comparator<Device>{

	@Override
	public int compare(Device cus1, Device cus2) {

		 return cus1.getColor().compareTo(cus2.getColor());
	}
}
