package com.example.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey
 @Entity
data class Contact(

    val firstName:String,
    val lastName:String,
    val phoneNumper:String,

    @PrimaryKey(autoGenerate = true)
     val id:Int=0
)
