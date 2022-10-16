package homework3.dataAccess.category;

import homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi : " + category.getName());
	}

}
