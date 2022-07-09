package br.com.dinosaur.service

import br.com.dinosaur.dtos.AnimalDTO
import br.com.dinosaur.model.AnimalEntity
import br.com.dinosaur.repository.AnimalRepository
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service


@Service
class AnimalService
(
        private val animalRepository: AnimalRepository,
        private val modelMapper: ModelMapper
)
{
    fun save(animalDTO: AnimalDTO){
        animalRepository.save(modelMapper.map(animalDTO, AnimalEntity::class.java))
    }
    fun findAll(): List<AnimalEntity>{
        return animalRepository.findAll();
    }
}