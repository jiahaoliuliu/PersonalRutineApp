package com.androidtraining.personalrutineapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import io.reactivex.annotations.NonNull

@Entity
data class Gender(
        @PrimaryKey(autoGenerate = true)
        @NonNull
        val id: Int? = null,
        val name: String)