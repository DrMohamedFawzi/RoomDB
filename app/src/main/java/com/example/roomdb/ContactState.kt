package com.example.roomdb

data class ContactState(

    val contact: List<Contact> = emptyList(),
    val firstName:String="",
val lastName:String="",
val phoneNmber:String="",
    val isAddingContact: Boolean=false,
    val sortType: SortType=SortType.FIRST_NAME
)
