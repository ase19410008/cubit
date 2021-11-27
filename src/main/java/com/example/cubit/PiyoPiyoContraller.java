package com.example.cubit;

import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PiyoPiyoContraller {

	public static void main(String[] args) {
		SpringApplication.run(PiyoPiyoContraller.class, args);
	}

	@GetMapping("/PiyoPiyo")
	public String PiyoPiyo(@RequestParam(value = "name", defaultValue = "World") String name,Model model) {
		model.addAttribute("name",name);
		return "PiyoPiyo";
	}
}
