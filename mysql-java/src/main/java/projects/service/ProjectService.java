package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
	}
	
	private ProjectDao projectDao = new ProjectDao();
}
