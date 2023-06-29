package com.example.dermage


object DadosHolder {
    private var counter: Dados? = null

    fun getCounter(): Dados {
        if (counter == null) {
            counter = Dados()
        }
        return counter!!
    }
}