package homework3.business;

import java.util.ArrayList;
import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.course.CourseDao;
import homework3.entities.Category;
import homework3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	List<String> courses = new ArrayList<String>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public boolean isNameValid(Course course) {
		for (String name : courses) {
			if (name == course.getName()) {
				return false;
			}
		}
		return true;
	}

	public boolean isPriceCheck(Course course) {
		if (course.getPrice() < 0) {
			return false;
		}
		return true;

	}

	public void add(Course course) throws Exception {

		if (isNameValid(course) == true && isPriceCheck(course) == true) {
			courses.add(course.getName());
			courseDao.add(course);

			for (Logger logger : loggers) {
				logger.log(course.getName());
			}

		} else {
			throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz.");
		}
	}

}
