package com.example.busschedule.Database

import androidx.room.Query

interface ScheduleDao {

    @Query("SELECT * FROM Schedule ORDER BY arrival_time ASC")
    fun getAll() : List<Schedule>

    @Query("SELECT * FROM Schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName : String) : List<Schedule>
}