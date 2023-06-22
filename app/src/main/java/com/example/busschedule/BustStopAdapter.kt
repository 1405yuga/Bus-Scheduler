package com.example.busschedule

import android.annotation.SuppressLint
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.Database.Schedule
import com.example.busschedule.databinding.BusStopItemBinding
import java.text.SimpleDateFormat

class BustStopAdapter(private val onItemClicked : (Schedule)-> Unit) : ListAdapter<Schedule,BustStopAdapter.BusStopViewHolder>(DiffCallback) {

    class BusStopViewHolder(private var binding: BusStopItemBinding):RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SimpleDateFormat")
        fun bind(schedule: Schedule){
            binding.stopNameTextView.text = schedule.stopName
            binding.arrivalTimeTextView.text = SimpleDateFormat("h:mm a").format(schedule.arrivalTime.toLong()*1000)
        }
    }


}