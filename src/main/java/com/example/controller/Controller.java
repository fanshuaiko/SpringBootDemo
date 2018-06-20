package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Student;
import com.example.properties.StudentProperty;
import com.example.services.StudentServices;

@RestController
@RequestMapping("/controller")
public class Controller {

	@Autowired
	private StudentServices studentServices;
	
	// 绑定配置文件中的某个属性的值
	@Value("${testParam}")
	private String testParam;

	// 注入将绑定配置文件中属性Student数据的类
	@Autowired
	private StudentProperty studentProperty;

	@RequestMapping("/test")
	public String test() {
		return "Hello Spring Boot!";
	}

	// 返回配置文件中的testParam属性的值
	@RequestMapping("/testParam")
	public String testParam() {
		return testParam;
	}

	// 返回配置文件中的Student属性的值
	 @RequestMapping("/studentProperty")
	 public String studentProperty() {
	 return studentProperty.getName() + ":" + studentProperty.getAge() ;
	 }
	 
	 //保存一个Student对象
	 @RequestMapping("/save")
	 public Student save(@RequestParam("name")String name,@RequestParam("age")Integer age) {
		 Student student = new Student();
		 student.setName(name);
		 student.setAge(age);
		 studentServices.save(student);
		 return student;
	 }
	 /**
	  * 根据id查询一个学生
	  * @param id
	  * @return
	  */
	 @GetMapping("/findById/{id}")
	 public  Optional<Student> findById(@PathVariable("id")Integer id) {
		 return studentServices.findById(id);
	 }
}
