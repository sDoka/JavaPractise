package model.data.comparator;

import java.util.Comparator;

import model.data.Device;

public class DeviceTypeComparator implements Comparator<Device>{

	@Override
	public int compare(Device dev1, Device dev2) {

		 return dev1.getType().compareTo(dev1.getType());
	}
}
