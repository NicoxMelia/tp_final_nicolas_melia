package com.example.tp_final_nicolas_melia

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class   MainViewModelTest {
    private lateinit var mainViewModel: MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        mainViewModel = MainViewModel()
    }

    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }

    @Test
    fun palabrasIguales() = runTest{
        val resultado = mainViewModel.compararPalabras("hola", "hola")
        assertEquals("Palabras iguales", mainViewModel.comparador.value?.resultado)
    }

    @Test
    fun palabrasDiferentes() = runTest{
        val resultado = mainViewModel.compararPalabras("hola", "perro")
        assertEquals("Palabras diferentes", mainViewModel.comparador.value?.resultado)
    }
}