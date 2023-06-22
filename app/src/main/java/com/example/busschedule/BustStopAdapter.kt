package com.example.busschedule

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.Database.Schedule
import com.example.busschedule.databinding.BusStopItemBinding

class BustStopAdapter(private val onItemClicked : (Schedule)-> Unit) : ListAdapter<Schedule,BustStopAdapter.BusStopViewHolder>() {
    class BusStopViewHolder(private var binding: BusStopItemBinding):RecyclerView.ViewHolder(binding.root) {

    }


}