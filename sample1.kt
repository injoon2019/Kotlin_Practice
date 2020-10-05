package com.example.injunpractice
//https://www.youtube.com/watch?v=IDVnZPjRCYg&list=PLxBf91VkJLZ_XosvQ5yJnJB3k3iho2XbV&index=2
fun main(){
//    helloWorld()
//    println(add(4, 5))

    //3. String Template
//    val name = "Injun"
//    val lastName = "Son"
//    println("my name is ${name + lastName} I'm 23") //string 안에 변수 넣기
//    println("this is 2\$a")

//    checkNum(80)
//    forAndWhile()
    nullcheck()
}

//1. 함수

fun helloWorld(){
    println("Hello World!")
}

fun add(a : Int, b: Int) : Int {
    return a+b
}

//2. val vs var
//val = value

fun hi(){

    val a : Int = 10    //상수
    var b : Int = 9     //변수

    val c = 100 // 타입 안적어도 에러는 안뜬다
    var d = 100

    var name = "Joyce"
}

//4. 조건식
fun maxBy(a : Int, b: Int) : Int{
    if (a > b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b: Int) = if (a>b) a else b

fun checkNum(score: Int){
    //다른 언어에서 switch 역할을 한다
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1-> 1
        2-> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genious")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

//5. Array and List

// Array

// List 1. List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    //array는 mutable이지만 list는 immutable이다. MutableList는 mutable이다
    array[0] = 3
    //list[0]=3 에러가 난다
    //mutableList 중에 arrayList가 있다
    var arrayList = arrayListOf<Int>() //val var 둘다 가능하다
    arrayList.add(10)
    arrayList.add(20)

    arrayList = arrayListOf() //val로 선언했으면 에러가 난다. val은 바꿀 수 없기 때문에
}

// 6. For / While

fun forAndWhile(){

    val students = arrayListOf("Injun", "James", "Jenny", "Jennifer")

    for (name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번쨰 학생: ${name}")
    }

    var sum: Int =0
    var sum2 = 0
    var sum3 = 0

    for(i in 1..10 step 2){
        sum += i
    }
    for(i in 10 downTo 2){
        sum2 += i
    }
    for(i in 1 until 100){ //100을 포함하지 않는다 1..100은 100을 포함한다
        sum3 += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    //NPE: Null Pointer Exception
    var name : String = "joyce"

    //var nullName : String = null   (string은 non-null type이라 에러가 뜬다)
    var nullName: String? = null //nullable type이 된다

    var nameinUpperCase = name.toUpperCase()

    //null이 아니면 upperCase를 반환하고, null이면 null 반환 
    var nullNameUpperCase = nullName?.toUpperCase()
    
    // ?: 엘비스 프레슬리 연산자
    val lastName : String? = null
    val fullName = name +" "+ (lastName?: "No lastName") //null인 경우 default로 지정된 값 반환
    print(fullName)

}

// !! 컴파일러한테 null이 아님을 보장
fun ignoreNuls(str: String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()
}

fun ignoreNulls(str: String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email: String? = "joycehong@gamil.com"
    //null이 아니라면 let안으로 옮겨준다
    email?.let{
        println("my eamil is ${email}")
    }
}

