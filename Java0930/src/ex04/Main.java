package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//BookData객체 5개 생성
		/*
		 1.책이름 : Jaba / 가격: 21000 / 저자: 홍길동
		 2.C++ /29000/ 박문수
		 3.Database / 31000 / 김장독
		 4.Android / 18000 / 이순신
		 5.Web / 26000 /김철수
		 */
	   BookData bookdata = new BookData("Java", 21000, "홍길동");
	   
	   
	   BookData book1 = new BookData("Jaba", 21000, "홍길동");
	   BookData book2 = new BookData("C++", 29000, "박문수");
	   BookData book3 = new BookData("Database", 31000, "김장독");
	   BookData book4 = new BookData("Android", 18000, "이순신");
	   BookData book5 = new BookData("Web", 26000, "김철수");
	   
	   
	   
	   
//	   System.out.println(book1);
//	   System.out.println(book2);
//	   System.out.println(book3);
//	   System.out.println(book4);
//	   System.out.println(book5);
   
	   Scanner sc = new Scanner(System.in);
	   
	   //객체배열
	   BookData[] books = new BookData[5];
	   
	   //BookData객체배열 초기화
	   for(int i=0; i<books.length; i++) {
		   System.out.print("책제목 :");
		   String title = sc.next();
		   System.out.print("가격 :");
		   int price =sc.nextInt();
		   System.out.print("저자 :");
		   String writer = sc.next();
		   
		   //객체배열 내 데이터 초기화하는 방법
		   //객체배열[인덱스] = new 클래스명(데이터1, 데이터2, ...);
		   books[i] = new BookData(title, price, writer);
	   }
	   
//	   books[0] = new BookData("Jaba", 21000, "홍길동");
//	   books[1] = new BookData("C++", 29000, "박문수");
//	   books[2] = new BookData("Database", 31000, "김장독");
//	   books[3] = new BookData("Android", 18000, "이순신");
//	   books[4] = new BookData("Web", 26000, "김철수");
	   
	   //BookData객체배열 출력
	   for(int i=0; i<books.length; i++) {
		   System.out.println(books[i]);
	   }
	}
	

}
