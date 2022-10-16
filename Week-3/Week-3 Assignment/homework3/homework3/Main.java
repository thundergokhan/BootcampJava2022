package homework3;

import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.InstructorManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.Logger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.category.HibernateCategoryDao;
import homework3.dataAccess.category.JdbcCategoryDao;
import homework3.dataAccess.course.HibernateCourseDao;
import homework3.dataAccess.instructor.JdbcInstructorDao;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Instructor;

public class Main {
	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new MailLogger(), new DatabaseLogger(), new FileLogger() };

		Course course1 = new Course(3, "JAVA", 0);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		Category category1 = new Category(4, "Cloud");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);

		Instructor instructor = new Instructor();
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
	}
}
