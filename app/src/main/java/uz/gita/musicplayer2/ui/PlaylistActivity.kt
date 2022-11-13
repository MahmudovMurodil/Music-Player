package uz.gita.musicplayer2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.gita.musicplayer2.R
import uz.gita.musicplayer2.databinding.ActivityPlaylistBinding

class PlaylistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.coolPink)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}