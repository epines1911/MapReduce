package edu.utap.mapreduce

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import edu.utap.mapreduce.model.GameViewModel
import kotlinx.android.synthetic.main.activity_game.atkV
import kotlinx.android.synthetic.main.activity_game.defV
import kotlinx.android.synthetic.main.activity_game.hpV
import kotlinx.android.synthetic.main.activity_game.spdV

class GameActivity : AppCompatActivity() {
    private val model: GameViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        model.observePlayer().observe(
            this,
            {
                hpV.text = it.hp.toString()
                atkV.text = it.atk.toString()
                defV.text = it.def.toString()
                spdV.text = it.spd.toString()
            }
        )
    }
}
