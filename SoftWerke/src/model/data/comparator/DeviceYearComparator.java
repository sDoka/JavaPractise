package model.data.comparator;

import java.util.Comparator;

import model.data.Device;

public class DeviceYearComparator  implements Comparator<Device>{
	@Override
	public int compare(Device dev1, Device dev2) {
		// TODO Auto-generated method stub
		return (dev1.getDate() < dev2.getDate() ? -1 : (dev1.getDate() == dev2.getDate() ? 0 : 1));
	}
}
