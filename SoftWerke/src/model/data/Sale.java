package model.data;


import java.util.Date;

public class Sale {
//дата, устройство, клиент‘»ќ
	private Date date;
	private String deviceName;
	private String customerFIO;
	
	public Sale(Date date,String deviceName,String customerFIO )
	{
		
	}
	
	public void setDate()
	{
		this.date = new Date();
	}
	public Date getDate()
	{
		return date;
	}
	public String getDeviceName()
	{
		return deviceName;
	}
	public void setDeviceName(String deviceName)
	{
		this.deviceName = deviceName;
	}
	public String getCustomerFIO()
	{
		return customerFIO;
	}
	public void setCustomerFIO(String customerFIO)
	{
		this.customerFIO = customerFIO;
	}
	

}
