package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }; // 10個の数値を持つ配列

		System.out.println("ジョブ分け:");

		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			String job;

			switch (number) {
			case 1:
				job = "勇者";
				break;
			case 2:
				job = "バトルマスター";
				break;
			case 3:
				job = "パラディン";
				break;
			case 4:
				job = "海賊";
				break;
			case 5:
				job = "魔法剣士";
				break;
			default:
				job = "不明";
				break;
			 }

			System.out.println("要素 " + number + ": " + job);
		}

	}

}
