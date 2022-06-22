package com.example.Lab3.Controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Lab3.Entity.Student;
import com.example.Lab3.Repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired StudentRepository studentRepository;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		List<Student> students = studentRepository.findAll();
		
		model.addAttribute("students", students);
		
		return "index";
	}
	
	@RequestMapping("/edit")
	public String edit(Model model, @PathVariable String id) {
		if(id.isEmpty()) return "index";
		Optional<Student> stu = studentRepository.findById(Integer.parseInt(id));
		
		model.addAttribute("student", stu);
		return "student";
	}
}
