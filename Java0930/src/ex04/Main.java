package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//BookData��ü 5�� ����
		/*
		 1.å�̸� : Jaba / ����: 21000 / ����: ȫ�浿
		 2.C++ /29000/ �ڹ���
		 3.Database / 31000 / ���嵶
		 4.Android / 18000 / �̼���
		 5.Web / 26000 /��ö��
		 */
	   BookData bookdata = new BookData("Java", 21000, "ȫ�浿");
	   
	   
	   BookData book1 = new BookData("Jaba", 21000, "ȫ�浿");
	   BookData book2 = new BookData("C++", 29000, "�ڹ���");
	   BookData book3 = new BookData("Database", 31000, "���嵶");
	   BookData book4 = new BookData("Android", 18000, "�̼���");
	   BookData book5 = new BookData("Web", 26000, "��ö��");
	   
	   
	   
	   
//	   System.out.println(book1);
//	   System.out.println(book2);
//	   System.out.println(book3);
//	   System.out.println(book4);
//	   System.out.println(book5);
   
	   Scanner sc = new Scanner(System.in);
	   
	   //��ü�迭
	   BookData[] books = new BookData[5];
	   
	   //BookData��ü�迭 �ʱ�ȭ
	   for(int i=0; i<books.length; i++) {
		   System.out.print("å���� :");
		   String title = sc.next();
		   System.out.print("���� :");
		   int price =sc.nextInt();
		   System.out.print("���� :");
		   String writer = sc.next();
		   
		   //��ü�迭 �� ������ �ʱ�ȭ�ϴ� ���
		   //��ü�迭[�ε���] = new Ŭ������(������1, ������2, ...);
		   books[i] = new BookData(title, price, writer);
	   }
	   
//	   books[0] = new BookData("Jaba", 21000, "ȫ�浿");
//	   books[1] = new BookData("C++", 29000, "�ڹ���");
//	   books[2] = new BookData("Database", 31000, "���嵶");
//	   books[3] = new BookData("Android", 18000, "�̼���");
//	   books[4] = new BookData("Web", 26000, "��ö��");
	   
	   //BookData��ü�迭 ���
	   for(int i=0; i<books.length; i++) {
		   System.out.println(books[i]);
	   }
	}
	

}
