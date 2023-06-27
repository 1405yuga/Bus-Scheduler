package com.example.busschedule.ViewModels

import androidx.lifecycle.ViewModel
import com.example.busschedule.Database.Schedule
import com.example.busschedule.Database.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDao: ScheduleDao) : ViewModel() {
    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStop(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)

}