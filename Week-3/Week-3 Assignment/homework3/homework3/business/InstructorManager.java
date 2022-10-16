package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.instructor.InstructorDao;
import homework3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

}
