package Java0927;

public class ex_array2_1 {

	public static void main(String[] args) {
		//2차원 배열 생성
				//자료형[][] 변수명 = new 자료형 [행의크기] [열의크기];
				int[][] array = new int[3][2];
				
				//2차원 배열 데이터 초기화
				//: 배열[행인덱스][열인덱스] = 값;
				array[0][0] = 1;
				array[0][1] = 2;
				
				array[1][0] = 3;
				array[1][1] = 4;
				
				array[2][0] = 5;
				array[2][1] = 6;
				
				//다중 for문을 활용하여 2차원 배열 데이터 출력
				//array.length : 행 크기
				//array[인덱스].length : 열 크기
				for(int i = 0; i<array.length; i++) { //행
					
					for(int j =0; j<array[i].length; j++) { //열
					System.out.println(array[i][j]+"\t");
					}
					System.out.println();
				}

	}

}
