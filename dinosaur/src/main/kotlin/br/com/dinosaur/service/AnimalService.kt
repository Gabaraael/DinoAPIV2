package br.com.dinosaur.service

import br.com.dinosaur.model.AnimalEntity
import br.com.dinosaur.repository.AnimalRepository
import org.springframework.stereotype.Service

@Service
class AnimalService
(
        private val animalRepository: AnimalRepository
)
{
    fun save(animalEntity: AnimalEntity){
        animalRepository.save(animalEntity);
    }

    fun findAll(): List<AnimalEntity>{
        return animalRepository.findAll();
    }
}