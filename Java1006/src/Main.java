import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//������ ���� �� �ִ� ���� �̱� ��� �����!
		// -> ���, ������, ��ĳ����
		
		// ������ ��迡�� ������ ���� �� �ֵ��� ����� ����!
		// 1.���� Ŭ���� -> ����(moomin), ������(ohmpangE), ���̾�(ryan), ¯��(jjanggo)
		//              - �� ������ Ŭ���� �ȿ��� �ش� ������ �̸����� �޼ҵ� �����ϱ�
		//              - ex) moomin class -> public void moomin() {
		//                        system.out.println("���� ���� ����!")
		//                    };
	
		// 2. ��� Ŭ���� -> Machine Ŭ���� -> ������ ������ ������ �ִ� pic(¯��) ���� - �����ε�
		
		// Machine ��ü �����ϱ�
		Machine m = new Machine();	
		
		//�� ������ ��ü �����ϱ�
//		Moomin moomin = new Moomin();
//		OhmpangE ohmpangE = new OhmpangE();
//		Ryan ryan = new Ryan();
//		Jjanggo jjanggo = new Jjanggo();
//		
		
//		m.pic(moomin);
//		m.pic(ohmpangE);
//		m.pic(ryan);
//		m.pic(jjanggo);
		
		
		//��ĳ���� Ȱ���ϱ�
		Doll d1 = new Jjanggo();
		Doll d2 = new Moomin();
		Doll d3 = new Ryan();
		Doll d4 = new OhmpangE();
		
//		m.pic(d1);
//		m.pic(d2);
//		m.pic(d3);
//		m.pic(d4);
		
		//�������� ���� �̱� ����� ����!
		//������,����,¯��,���̾� -> ����(doll)
		Doll[] dolls = {d1, d2, d3, d4};
		
		// �������� ������ ���� �� �ֵ��� ����� �ֱ�!
		// 1. ������ �����ϱ�
	    Random rd = new Random();
	    int num = rd.nextInt(4); // 0~3 ������ ������ ����
	    
	    System.out.println();
	    System.out.println("�������� ���� �̾��ֱ�!");
	    
	    //���� �̱� ��迡 �������� ������ ������ ���� �Ű����� ������ �־��ش�!
	    m.pic(dolls[num]);
		
		

	}

}
