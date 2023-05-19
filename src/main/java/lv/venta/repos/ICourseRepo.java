package lv.venta.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.models.Course;

public interface ICourseRepo extends CrudRepository<Course, Long> {

	ArrayList<Course> findByGradeStudentIds(long id);

	ArrayList<Course> findAllByProfessorsIdp(long id);
	
}
