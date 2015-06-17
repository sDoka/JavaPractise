package model.data.comparator;

import java.util.Comparator;

import model.data.Device;

public class DeviceMarkComparator  implements Comparator<Device>{

	@Override
	public int compare(Device dev1, Device dev2) {

		 return dev1.getMark().compareTo(dev1.getMark());
	}
}
