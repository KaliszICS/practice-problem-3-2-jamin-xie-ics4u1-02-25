public class PracticeProblem {

	public static void main(String args[]) {

	}

	static int num2 = -1;
	public static int towerOfHanoi(int num) {
		if (num < 3 && num2 == -1) {
			return -1;
		}
		num2 = num2 + 1;

		if (num == 1) {
			return 1;
		}
		return 2 * towerOfHanoi(num - 1) + 1;
	}
}
