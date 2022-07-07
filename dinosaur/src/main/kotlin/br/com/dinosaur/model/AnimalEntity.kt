package br.com.dinosaur.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Table(name = "animal")
@Entity
class AnimalEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long?,
        val reino: String?,
        val filo: String?,
        val classe: String?,
        val superordem: String?,
        val ordem: String?,
        val infraOrdem: String?,
        val genero: String?
){


}