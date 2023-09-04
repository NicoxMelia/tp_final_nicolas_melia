package com.example.tp_final_nicolas_melia

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


//data class Comparador(val palabra1: String, val palabra2: String)

class MainViewModel: ViewModel(){

    val comparador: LiveData<Comparador> get() = _comparador
    private var _comparador = MutableLiveData<Comparador>(Comparador("", "", ""))

    fun setPalabras(a:String, b:String, r: String){
        _comparador.value = Comparador(a, b, r)
    }

    fun compararPalabras(a: String, b : String){
        if(a == b){
            setPalabras(a, b, "Palabras iguales")
        }else{
            setPalabras(a, b, "Palabras diferentes")
        }
    }


}