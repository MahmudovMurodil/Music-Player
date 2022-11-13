package uz.gita.musicplayer2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import uz.gita.musicplayer2.R
import uz.gita.musicplayer2.databinding.ItemSongLayoutBinding
import uz.gita.musicplayer2.model.Music
import uz.gita.musicplayer2.model.formatDuration
import uz.gita.musicplayer2.ui.PlayerActivity

class MusicAdapter(private val context: Context, private val musicList: ArrayList<Music>) :
    RecyclerView.Adapter<MusicAdapter.MyHolder>() {
    class MyHolder(binding: ItemSongLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val title = binding.songName
        val album = binding.albumName
        val image = binding.songImage
        val duration = binding.songLength
        val root = binding.root
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyHolder(
        ItemSongLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
    )

    override fun onBindViewHolder(holder: MusicAdapter.MyHolder, position: Int) {
        val currentItem = musicList[position]
        holder.title.text = currentItem.title
        holder.title.isSelected = true
        holder.album.text = currentItem.album
        holder.album.isSelected = true
        holder.duration.text = formatDuration(currentItem.duration)
        Glide.with(context)
            .load(currentItem.imageUri)
            .apply(RequestOptions.placeholderOf(R.drawable.music_icon).centerCrop())
            .into(holder.image)
        holder.root.setOnClickListener {
            val intent = Intent(context, PlayerActivity::class.java)
            intent.putExtra("index",position)
            intent.putExtra("class","MusicAdapter")
            ContextCompat.startActivity(context, intent, null)
        }
    }

    override fun getItemCount() = musicList.size


}