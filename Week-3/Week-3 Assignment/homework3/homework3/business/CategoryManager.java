package homework3.business;

import java.util.ArrayList;
import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.category.CategoryDao;
import homework3.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	List<String> categories = new ArrayList<String>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public boolean isNameValid(Category category) {
		for (String name : categories) {
			if (name == category.getName()) {
				return false;
			}
		}
		return true;
	}

	public void add(Category category) throws Exception {
		if (isNameValid(category)) {
			categories.add(category.getName());
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		} else {
			throw new Exception("Kategori ismi tekrar edemez.");
		}

	}

}
