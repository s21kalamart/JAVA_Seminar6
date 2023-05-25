package lv.venta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.services.IFilteringService;

@Controller
public class FilterController {
	
	@Autowired
	private IFilteringService filterService;
	
	@GetMapping("/info/showAllStudents")    //localhost:8080/info/showAllStudents
	public String getAllStudentsFunc(Model model) {
		model.addAttribute("students", filterService.retrieveAllStudents());
		return "all-students-page";    //will show all-students-page.html
	}
	
	@GetMapping("/info/showAllProfessors")
	public String getAllProfessorsFunc(Model model) {
		model.addAttribute("professors", filterService.retrieveAllProfessors());
		return "all-professors-page";
	}
	
	@GetMapping("/info/showAllGrades")
	public String getAllGradesFunc(Model model) {
		model.addAttribute("grades", filterService.retrieveAllGrades());
		return "all-grades-page";
	}
	
	@GetMapping("/info/showAllCourses")
	public String getAllCoursesFunc(Model model) {
		model.addAttribute("courses", filterService.retrieveAllCourses());
		return "all-courses-page";
	}
	
}
