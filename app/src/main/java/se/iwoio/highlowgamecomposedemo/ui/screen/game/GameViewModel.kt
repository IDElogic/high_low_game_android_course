package se.iwoio.highlowgamecomposedemo.ui.screen.game

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import java.util.Random

class GameViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    var generatedNum by mutableIntStateOf(0)
    private var upperBound by mutableIntStateOf(3)
    var counter by mutableIntStateOf(0)

    init {
        savedStateHandle.get<Int>("upperBound")?.let {
            upperBound = it
        }
        generateNewNum()
    }

    fun generateNewNum() {
        generatedNum = Random(System.currentTimeMillis()).nextInt(upperBound)
        counter = 0
    }
    fun increaseCounter() {
        counter++
    }
}