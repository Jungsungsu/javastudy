
public class ex_for_369 {

	public static void main(String[] args) {
		
		// 1~50 ���� 3,6,9
		
		
		for(int i = 1; i <= 50; i++) {
			// ~�̸鼭 : and ������ (&&)
			// ~�̰ų�, Ȥ�� : or ������ (||)
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				System.out.println("�ڼ�");
			}else if(i%10 == 5) {
				System.out.println("����");
			}else {
				System.out.println(i);
			}
		}
		
		
		

	}

}
