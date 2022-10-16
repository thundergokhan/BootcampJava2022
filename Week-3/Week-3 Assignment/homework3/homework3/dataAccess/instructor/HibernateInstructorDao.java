package homework3.dataAccess.instructor;

import homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi : " + instructor.getName() + " " + instructor.getName());
	}
}