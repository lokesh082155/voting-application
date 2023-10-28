package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProgrammingLanguage;
import com.example.demo.repository.ProgrammingLanguageRepository;

@Service
public class ProgrammingLanguageService {
	@Autowired
	private ProgrammingLanguageRepository languageRepository;

	public List<ProgrammingLanguage> getAllLanguages() {
		return languageRepository.findAll();
	}

	public ProgrammingLanguage getLanguageById(Long languageId) {
		return languageRepository.findById(languageId)
				.orElseThrow(() -> new IllegalArgumentException("Language not found with ID: " + languageId));
	}

	public ProgrammingLanguage createLanguage(ProgrammingLanguage newLanguage) {
		return languageRepository.save(newLanguage);
	}

	public void deleteLanguage(Long languageId) {
		if (languageRepository.existsById(languageId)) {
			languageRepository.deleteById(languageId);
		} else {
			throw new IllegalArgumentException("Language not found with ID: " + languageId);
		}
	}

	public ProgrammingLanguage voteForLanguage(Long languageId) {
		ProgrammingLanguage language = languageRepository.findById(languageId)
				.orElseThrow(() -> new IllegalArgumentException("Language not found with ID: " + languageId));

		language.setVotes(language.getVotes() + 1);
		return languageRepository.save(language);
	}
}
