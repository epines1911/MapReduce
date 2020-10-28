package edu.utap.mapreduce.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private var player = MutableLiveData<Player>().apply {
        value = Player(99, 99, 99, 99)
    }

    private var gameMap = MutableLiveData<List<Room>>()

    init {
        Log.d("aaa", "VM Init")
        val rooms = emptyList<Room>().toMutableList()
        for (i in 0 until 5) {
            for (j in 0 until 5) {
                rooms.add(Room(i, j))
            }
        }
        gameMap.value = rooms
    }

    fun observePlayer(): LiveData<Player> = player

    fun observeMap(): LiveData<List<Room>> = gameMap
}
