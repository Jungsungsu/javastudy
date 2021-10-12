package Java0929;

public class Mymath {
	public static int cal(int num1, int num2, char op) {
		int result = 0;

		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		return result;
	}

    public static int largerNumber(int num1, int num2) {
		if (num1 > num2) { // num1이 큰 경우
			return num1;
		} else if (num1 < num2) { // num2가 큰 경우
			return num2;
		} else { // 두 수가 동일한 경우
			return 0;
		}
	}

	public static int close10(int num1, int num2) {

		int n1 = Math.abs(10 - num1);
		int n2 = Math.abs(10 - num2);

		if (n1 > n2) {
			return num2;
		} else if (n1 < n2) {
			return num1;
		} else {
			return 0;
		}
	}

	public static int powerN(int base, int n) {

		int result = 1;

		for (int i = 0; i < n; i++) {
			result = result * base; // result *= base;
		}

		return result;
	}

	public static int getAbsoluteValue(int num1, int num2) {
		int result = num1 - num2;

		if (result < 0) {
			result = -result;
		}

		return result;
	}
}
