package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ProgrammingLanguage;
import com.example.demo.service.ProgrammingLanguageService;

@RestController
@RequestMapping("/languages")
public class ProgrammingLanguageController {
	@Autowired
	private ProgrammingLanguageService languageService;

	// Create a new programming language
	@PostMapping("/post")
	public ProgrammingLanguage createLanguage(@RequestBody ProgrammingLanguage newLanguage) {
		return languageService.createLanguage(newLanguage);
	}

	// Retrieve a specific programming language by ID
	@GetMapping("/{languageId}")
	public ProgrammingLanguage getLanguageById(@PathVariable Long languageId) {
		return languageService.getLanguageById(languageId);
	}

	// Retrieve all programming languages
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAllLanguages() {
		return languageService.getAllLanguages();
	}

	// Vote for a programming language
	@PutMapping("/{languageId}/vote")
	public ProgrammingLanguage voteForLanguage(@PathVariable Long languageId) {
		return languageService.voteForLanguage(languageId);
	}
}
