package com.uca.capas.Actividad3laboNcapas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.Actividad3laboNcapas.domain.Student;


@Controller
public class MainController {
	
	private List<Student> students = new ArrayList<>();
	
	@GetMapping(path="/ejemplo1", produces= MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String ejemplo1() {
		return "Bienvenidos\n" + "Programacion Ncapas";
		
	}
	
	@GetMapping("/ejemplo2")
	public @ResponseBody List<Student> ejemplo2(){
		return Arrays.asList(
				new Student("Nombre1", "Apellido", "10/10/1992", "Carrera X", true),
				new Student("Nombre1", "Apellido", "10/10/1992", "Ingenieria en limones", false)
				);
	}
	
	@GetMapping("/inicio")
	public String inicio(Student student) {
		return "index";
	}
	
	
	@PostMapping("/formData")
	public ModelAndView process(Student student) {
		students.add(student);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("student", new Student());
		
		return mav;
	}

	@GetMapping("/listado")
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("listado");
		mav.addObject("studentList", this.students);
		
		return mav;
	}
}
