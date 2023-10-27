package practice;

public class PracticeForEach {

	public static void main(String[] args) {
		String[] employeeNames = {"田原", "福尾", "倉成", "濱野", "前村", "重永","松本","濱砂","小屋町","中村"};

		System.out.println("社員名:");
		
		for (String name : employeeNames) {
            System.out.println(name);
	}
  }

}
