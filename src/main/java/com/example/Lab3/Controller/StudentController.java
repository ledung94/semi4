package com.example.Lab3.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Lab3.Entity.Student;
import com.example.Lab3.Repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		
		List<Student> students = studentRepository.findAll();
		
		model.addAttribute("students", students);
		
		return "index";
	}
	
	@GetMapping("/edit/{roll}")
	public String edit(Model model, @PathVariable String roll) {
		if(roll.isEmpty()) return "edit";
		Optional<Student> student = studentRepository.findById(roll);
		
		model.addAttribute("student", student);
		return "edit";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute(name = "student") @Validated  Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "edit";
		}
		studentRepository.save(student);
		
		return "redirect:/";
	}
	
	@GetMapping("/add")
	public String create(Model model) {
		model.addAttribute("student", new Student());
		return "new";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute(name = "student") Student student) {
		studentRepository.save(student);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{roll}")
	public String delete(@PathVariable String roll) {
		studentRepository.deleteById(roll);
		return "redirect:/";
	}
}
