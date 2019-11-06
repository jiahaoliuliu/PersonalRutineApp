package com.androidtraining.personalrutineapp.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.androidtraining.personalrutineapp.converter.ListConverter
import java.util.*

@Entity(tableName = "traineeRoutine")
data class Routine(
        @PrimaryKey(autoGenerate = true)
        val routineId: Int,
        @ColumnInfo(name = "due_day")
        val dueDay: Date,
        @TypeConverters(ListConverter::class)
        val exercises: List<Exercise>)