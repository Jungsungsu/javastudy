
public class Test {

	public static void main(String[] args) {
		
		//�Ʒ� �����ϽǶ�
		//Ŭ������ ������ = new Ŭ������(); --> Ŭ�������� �����ؾ� �ؿ�~!
		Mymath math = new Mymath();
		
		//Ŭ���� �� ���ǵ� �޼ҵ带 ������ ���� ��ħǥ(.)�� ����!
		//��ü��.�޼ҵ��
		int result = math.cal(5, 5, '+');
        System.out.println(result);
	}

}
