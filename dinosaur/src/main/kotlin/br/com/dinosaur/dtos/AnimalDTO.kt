package br.com.dinosaur.dtos

data class AnimalDTO
    (
        val id: Long,
        val reino: String,
        val filo: String,
        val classe: String,
        val superordem: String,
        val ordem: String,
        val infraOrdem: String,
        val genero: String
    )
{

}
