package edu.utap.mapreduce.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private var player = MutableLiveData<Player>().apply {
        value = Player(99, 99, 99, 99)
    }

    fun observePlayer(): LiveData<Player> = player
}
