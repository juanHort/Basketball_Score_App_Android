package com.jhorta.basketballscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jhorta.basketballscore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var localScore = 0
    private var visitorScore = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupButtons()

    }

    private fun setupButtons(){
        binding.btnLocalMinus1.setOnClickListener {
            localScore = calculateScore(localScore, -1)
            binding.tvLocalScore.text = localScore.toString()
        }

        binding.btnLocalPlus1.setOnClickListener {
            localScore = calculateScore(localScore, 1)
            binding.tvLocalScore.text = localScore.toString()
        }

        binding.btnLocalPlus2.setOnClickListener {
            localScore = calculateScore(localScore, 2)
            binding.tvLocalScore.text = localScore.toString()
        }

        binding.btnVisitorMinus1.setOnClickListener {
            visitorScore = calculateScore(visitorScore, -1)
            binding.tvVisitorScore.text = visitorScore.toString()
        }

        binding.btnVisitorPlus1.setOnClickListener {
            visitorScore = calculateScore(visitorScore, 1)
            binding.tvVisitorScore.text = visitorScore.toString()
        }

        binding.btnVisitorPlus2.setOnClickListener {
            visitorScore = calculateScore(visitorScore, 2)
            binding.tvVisitorScore.text = visitorScore.toString()
        }

    }
    private fun calculateScore(currentScore: Int, pointsDifference: Int): Int{
        val score = currentScore + pointsDifference
        return if (score < 0) 0 else score
    }
}