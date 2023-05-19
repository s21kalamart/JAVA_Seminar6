package lv.venta.services;

import java.util.ArrayList;

import lv.venta.models.Course;
import lv.venta.models.Grade;
import lv.venta.models.Professor;
import lv.venta.models.Student;

public interface IFilteringService {
	ArrayList<Student> retrieveAllStudents();
	ArrayList<Grade> retrieveAllGrades();
	ArrayList<Course> retrieveAllCourses();
	ArrayList<Professor> retrieveAllProfessors();
	
	ArrayList<Grade> retrieveAllGradesByStudent(long id);
	ArrayList<Course> retrieveCoursesByStudent(Student student);
	ArrayList<Course> retrieveCoursesByProfessor(Professor professor);
	float calculateAVGGradeInCourse(Course course);
}
