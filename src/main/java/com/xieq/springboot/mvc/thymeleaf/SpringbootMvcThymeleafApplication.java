package com.xieq.springboot.mvc.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xieq.springboot.mvc.thymeleaf.domain.Person;

@Controller
@SpringBootApplication
public class SpringbootMvcThymeleafApplication {

	@RequestMapping("/index")
	public ModelAndView index(Model model) {
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("张三", "62");
		Person p2 = new Person("李四", "64");
		Person p3 = new Person("王五", "25");
		Person p4 = new Person("小明", "45");
		Person p5 = new Person("刘备", "95");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("list", list);
		return mv;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcThymeleafApplication.class, args);
	}
}
