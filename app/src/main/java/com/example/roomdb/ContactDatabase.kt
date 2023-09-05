package com.example.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase :RoomDatabase(){

    abstract val dao:Contact
}