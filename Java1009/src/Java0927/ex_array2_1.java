package Java0927;

public class ex_array2_1 {

	public static void main(String[] args) {
		//2���� �迭 ����
				//�ڷ���[][] ������ = new �ڷ��� [����ũ��] [����ũ��];
				int[][] array = new int[3][2];
				
				//2���� �迭 ������ �ʱ�ȭ
				//: �迭[���ε���][���ε���] = ��;
				array[0][0] = 1;
				array[0][1] = 2;
				
				array[1][0] = 3;
				array[1][1] = 4;
				
				array[2][0] = 5;
				array[2][1] = 6;
				
				//���� for���� Ȱ���Ͽ� 2���� �迭 ������ ���
				//array.length : �� ũ��
				//array[�ε���].length : �� ũ��
				for(int i = 0; i<array.length; i++) { //��
					
					for(int j =0; j<array[i].length; j++) { //��
					System.out.println(array[i][j]+"\t");
					}
					System.out.println();
				}

	}

}
