package com.example.kotlinbasics

fun main(){
    println("Hello world!")
    var Lan = "Hi";
    println(Lan)
    /** val은 재할당할 수 없는 변수를 선언해준다. js의 const같군.**/
    val number = 1
    var number1 = 1
    println(number1)

    val constantNumber : Int = 1
    var mutableString = "강의 듣는 중"
    mutableString = "듣기 싫다"

    /**-128에서 127까지의 숫자 대신 0에서 255라는 숫자를 사용**/
    var age : UInt = 15u
    println(age)

    var lan : Char = 'C'

    val str = "abcd 123"
    for(c in str){
        println(c)
    }
    println(str.uppercase())


    var flag = true

    if(flag){
        println("it's true")
    }else{
        println("it's false")
    }

    var name = readln()
    println(name)

    var ages = readln().toInt()
    println(ages)

    if(ages in 19 .. 30){
        println("she is "+ages+" old")
    }
}