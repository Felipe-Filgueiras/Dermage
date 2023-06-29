package com.example.dermage

class Dados {

    private var Nome: String = ""
    private var Email: String = ""

    fun setNome(value: String) {
        Nome = value
    }

    fun getNome(): String {
        return Nome
    }
    fun setEmail(value: String) {
        Email = value
    }

    fun getEmail(): String {
        return Email
    }
}