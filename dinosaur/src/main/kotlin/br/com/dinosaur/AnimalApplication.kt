package br.com.dinosaur


import org.modelmapper.ModelMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@SpringBootApplication
class DinosaurApplication
	fun main(args: Array<String>) {
		runApplication<DinosaurApplication>(*args)
	}

@Configuration
class configuration {
	@Bean
	fun modelMappper(): ModelMapper = ModelMapper()
}








