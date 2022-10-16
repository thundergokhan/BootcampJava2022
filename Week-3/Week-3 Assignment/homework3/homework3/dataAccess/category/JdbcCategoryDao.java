package homework3.dataAccess.category;

import homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi : " + category.getName());

	}

}
