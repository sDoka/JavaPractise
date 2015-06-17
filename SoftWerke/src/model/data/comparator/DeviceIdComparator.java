package model.data.comparator;

import java.util.Comparator;


import model.data.Device;

public class DeviceIdComparator implements Comparator<Device>{
	@Override
	public int compare(Device dev1, Device dev2) {
		// TODO Auto-generated method stub
		return (dev1.getId() < dev2.getId() ? -1 : (dev1.getId() == dev2.getId() ? 0 : 1));
	}

}
