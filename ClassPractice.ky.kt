package com.example.injunpractice
//https://www.youtube.com/watch?v=IDVnZPjRCYg&list=PLxBf91VkJLZ_XosvQ5yJnJB3k3iho2XbV&index=2
//생성자까지 한번에 만든다. open을 해야 다른 클래스가 상속을 받을 수가 있다
open class Human (val name: String = "Anonymous"){

    //부생성자
    constructor(name: String, age:Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    //주생성자의 일부이다 
    init{
        println("New human has been born")
    }

    fun eatingCake(){
        println("THis is so yummy")
    }
    
    open fun singASong(){
        println("lalala")
    }
}

//상속을 받는다는 의미 
class Korean: Human(){
    
    override fun singASong(){
        super.singASong()
        println("라라라")
    }
}

fun main(){
    val human = Human("Injun ")
    human.eatingCake()
    val stranger = Human()

    val mom = Human("kuri", 52)
    println("This human's name is ${human.name}")
    println("This stranger's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}