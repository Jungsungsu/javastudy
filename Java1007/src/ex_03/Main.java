package ex_03;


public class Main {

	public static void main(String[] args) {

		RegularEmployee regular = new RegularEmployee("SMHRD001", "ȫ�浿", 4000, 400);

		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "����");

		System.out.println();
		TempEmployee temp = new TempEmployee("SMHRD002", "�ڸ��", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay() + "����");

		System.out.println();
		PartTimeEmployee part = new PartTimeEmployee("SMHRD003", "�迵��", 10, 10);
		System.out.println(part.print());
		System.out.println(part.getMoneyPay() + "����");
	}

}
