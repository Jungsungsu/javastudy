package Java0930_03;

public class Main {

	public static void main(String[] args) {
		// Student ��ü 2�� ����
				Student student1 = new Student();

				// set�޼ҵ带 �̿��ؼ� student1��ü �ʱ�ȭ
				student1.setName("ȫ�浿");
				student1.setNumber("20150675");
				student1.setAge(22);
				student1.setScoreJava(50);
				student1.setScoreWeb(89);
				student1.setScoreAndroid(77);

				// ��������ǻ����ڸ� �̿��ؼ� student2 ��ü �ʱ�ȭ
				Student student2 = new Student("�迵��", "20090541", 29, 90, 25, 30);
		        
//				//student1��ü�� ������ ���
//				student1.show();
//				System.out.println("==============================");
//				student2.show();
				System.out.println(student1);
				System.out.println("==============================");
				System.out.println(student2);

	}

}
