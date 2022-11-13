package uz.gita.musicplayer2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.gita.musicplayer2.R
import uz.gita.musicplayer2.databinding.ActivityFavouriteBinding

class FavouriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavouriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.coolPink)
        binding = ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}