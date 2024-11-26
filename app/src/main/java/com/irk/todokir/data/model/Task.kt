package com.irk.todokir.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "name") var name: String = "Task",
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "isDone") var isDone: Boolean = true,
    @ColumnInfo(name = "timestampOfTask") var timestampOfTask: Long
)
