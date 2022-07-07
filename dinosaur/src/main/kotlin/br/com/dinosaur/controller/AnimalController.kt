package br.com.dinosaur.controller

import br.com.dinosaur.dtos.AnimalDTO
import br.com.dinosaur.model.AnimalEntity
import br.com.dinosaur.service.AnimalService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class AnimalController (private val animalService: AnimalService){

    @PostMapping("/save")
    fun saveAnimal() {
        // animalService.save()
    }

    @GetMapping("/animal")
    fun findByAnimal(): Any{
       return animalService.findAll();
    }
}