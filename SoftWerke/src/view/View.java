package view;

public class View {

	 public void sayHello(){
	      System.out.println("����� ���������� � ��� �������: ");
	      System.out.println("��� ��������� ������� ������� -help");
	      System.out.println("���� ������� ������ �������� ");
	   }
	 public void help()
	 {
		 System.out.println("������ ��������� �������");
		 System.out.println("-customers     -�������� ���� ��������");
		 System.out.println("-sales         -�������� ��� �������");
		 System.out.println("-devices       -�������� ��� ����������");
		 System.out.println("-new sale      -������� ����������");
		 System.out.println("-new customer  -�������� ����������");
		 System.out.println("-new device    -�������� ����������");
		 
	 }
	 public void wrongCommand()
	 {
		 System.out.println("�������� ��������, ���������� ��� ��� ���� ������� -help");
	 }
}
