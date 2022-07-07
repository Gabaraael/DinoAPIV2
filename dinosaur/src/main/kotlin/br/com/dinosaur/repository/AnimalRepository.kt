package br.com.dinosaur.repository

import br.com.dinosaur.model.AnimalEntity
import org.springframework.data.jpa.repository.JpaRepository


interface AnimalRepository : JpaRepository<AnimalEntity, Long> {



}