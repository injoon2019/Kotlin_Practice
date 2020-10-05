package com.example.injunpractice

//data class를 이용하면 toString(), hashCode(), equals(), copy()를 자동으로 만들어준다
data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber : Int)

class TicketNormal(val companyName:String, val name: String, var data:String, var seatNumber: Int)

class Book private constructor(val id: Int, val name : String){

    //자바의 static 역할을 한다
    //private property나 method를 읽어올 수 있게 한다
    companion object BookFactory : IdProvider{

        override fun getId(): Int{
            return 444
        }

        val myBook = "new book"

        fun create() = Book(0, "animal farm")
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
//    val ticketA = Ticket("koreanAir", "injunSon", "2020-02-16", 14)
//    val ticketB = TicketNormal("koreanAir", "injunSon", "2020-02-16", 14)
//
//    println(ticketA)
//    //일반 class는 주소값이 출력된다
//    println(ticketB)

    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}

