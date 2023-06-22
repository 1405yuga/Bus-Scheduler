package com.example.busschedule.ViewModels

import androidx.lifecycle.ViewModel
import com.example.busschedule.Database.Schedule
import com.example.busschedule.Database.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao) : ViewModel() {
    fun fullScedule(): List<Schedule> = scheduleDao.getAll()

    fun scheduleForStop(name: String): List<Schedule> = scheduleDao.getByStopName(name)

}