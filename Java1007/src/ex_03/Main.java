package ex_03;


public class Main {

	public static void main(String[] args) {

		RegularEmployee regular = new RegularEmployee("SMHRD001", "È«±æµ¿", 4000, 400);

		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "¸¸¿ø");

		System.out.println();
		TempEmployee temp = new TempEmployee("SMHRD002", "¹Ú¸í¼ö", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay() + "¸¸¿ø");

		System.out.println();
		PartTimeEmployee part = new PartTimeEmployee("SMHRD003", "±è¿µÈÆ", 10, 10);
		System.out.println(part.print());
		System.out.println(part.getMoneyPay() + "¸¸¿ø");
	}

}
