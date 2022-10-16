package homework3.dataAccess.instructor;

import homework3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi : " + instructor.getName() + " " + instructor.getName());
	}
}
