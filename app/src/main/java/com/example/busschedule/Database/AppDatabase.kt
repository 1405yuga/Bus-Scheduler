package com.example.busschedule.Database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class AppDatabase() : RoomDatabase() {
    abstract fun scheduleDao() : ScheduleDao

    companion object{
        @Volatile
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context : Context) : AppDatabase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(context, AppDatabase::class.java, "app_database")
                    .createFromAsset("database/bus_schedule.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}