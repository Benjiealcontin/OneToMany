package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Department;
import com.example.Model.Students;
import com.example.Repository.DepartmentRespo;
import com.example.Repository.StudentsRespo;
import com.example.Service.Request;
import com.example.Service.Response;

@RestController
public class Controllers {

	@Autowired
	private StudentsRespo studentrespo;
	@Autowired
	private DepartmentRespo departrespo;
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;		
	}
	
	//Add Student
	@PostMapping("/add")
	public Students insertdata(Students stud) {
		return studentrespo.save(stud);		
	}
	
	//Add Department
	@PostMapping("/add2")
	public Department insertdepartment(Department stud) {
		return departrespo.save(stud);
	}
	
	
	
	//Get by Id
	@GetMapping("/getinfo/")
	public ModelAndView getJoinInformation(@RequestParam("id")int id){
		ModelAndView mv = new ModelAndView();
		List<Response> datalist = studentrespo.getJoinInformation(id);
		mv.addObject("data",datalist);
		mv.setViewName("result");
		return mv;
		
	}
}
