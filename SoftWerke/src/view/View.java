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
	 }
	 public void helpCustomer()
	 {
		 System.out.println("������� ����������");
		 System.out.println("-sortByName       -�� �����");
		 System.out.println("-sortById         -�� Id");
		 System.out.println("-sortByYear       -�� ���� ��������");
		 System.out.println("------------------------------------");
		 System.out.println("������� ������");
		 System.out.println("-findByName   ���    -�� �����");
		 System.out.println("-findById     Id     -�� Id");
		 System.out.println("-findByYear   ���    -�� ���� ��������");
		 System.out.println("------------------------------------");
		 System.out.println("-addCustomer ��� �����������      -�������� �������");
		 System.out.println("-back             				   -��������� � ������� ����");
	 }
	 public void helpDevice()
	 {
		 System.out.println("������� ����������");
		 System.out.println("-sortByType       -�� ���� ����������");
		 System.out.println("-sortByColor      -�� ����� ����������");
		 System.out.println("-sortByMark       -�� ����� ����������");
		 System.out.println("-sortById         -�� Id");
		 System.out.println("-sortByYear       -�� ���� �������");
		 System.out.println("------------------------------------");
		 System.out.println("������� ������");
		 System.out.println("-findByType       -�� ���� ����������");
		 System.out.println("-findByColor      -�� ����� ����������");
		 System.out.println("-findByMark       -�� ����� ����������");
		 System.out.println("-findById         -�� Id");
		 System.out.println("-findByYear       -�� ���� �������");
		 System.out.println("------------------------------------");
		 System.out.println("-addCustomer ��� �����������      -�������� �������");
		 System.out.println("-back             				   -��������� � ������� ����");
	 }
	 public void wrongCommand()
	 {
		 System.out.println("�������� ��������, ���������� ��� ��� ���� ������� -help");
	 }
}
