package com.example.roomdb

interface ContactEvent {
object SaveContact:ContactEvent
    data class setFirstName(val firstName: String):ContactEvent
    data class setLastName(val lastName: String):ContactEvent
    data class setPhoneNmber(val phoneNmber:  String):ContactEvent

object ShowDialog:ContactEvent
object HideDalog:ContactEvent
    data class SortContact(val sortType:SortType) :ContactEvent
    data class DeletContact(val contact: Contact) :ContactEvent

}