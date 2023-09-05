package com.example.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

@Upsert
  suspend fun insertContact(contact:Contact)

    @Delete
    suspend fun DeletContact(contact:Contact)

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
   fun getContactOrderByFirstName():Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    fun getContactOrderByLastName():Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phoneNumper ASC")
    fun getContactOrderByPhoneNumper():Flow<List<Contact>>
}