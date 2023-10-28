package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProgrammingLanguage;


public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {

}
