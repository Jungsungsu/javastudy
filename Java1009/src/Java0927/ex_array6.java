package Java0927;

import java.util.Scanner;

public class ex_array6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		
		int[] answers = {1, 4, 3, 2, 1};
		int[] inputs = new int[5];
		int total = 0;
		
		// 5���� ������ ���� ���� �����ϴ� ��ɹ�
		for(int i = 0; i<inputs.length; i++) {
			System.out.print((i+1) +"���� >> ");
			inputs[i] = sc.nextInt();
		}
		
		//�迭�� ��ü������ ���
		//System.out.println(Arrays.toString(inputs));
		
		System.out.println("==����Ȯ��==");
		for(int i = 0; i<answers.length; i++) {
			
			//���䵥���Ϳ� �Է��� ������ ��
			if(answers[i] == inputs[i]) {
				total = total + 20; // total += 20;
				System.out.print("o");
			}else {
				System.out.print("x");
			}
			
		}    
		
		     //\' or \" : ��������ǥ or ū����ǥ�� �ڷ����� �ƴ� ���ڵ����ͷ� �ν�
		     //\r: �ü��
		     //\t: tab
		     //\n: �ٹٲ� --> �̽������� ����
	         System.out.println("\n���� : " + total);

	}

}
