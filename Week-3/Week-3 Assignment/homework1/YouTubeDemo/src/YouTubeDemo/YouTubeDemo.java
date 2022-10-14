package YouTubeDemo;

public class YouTubeDemo {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		teacherCreditManager.save();

	}
}
