package com.example.kotlinbasics

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("가위, 바위, 보 중에 하나 고르세요")
    playerChoice = readln();

    var win = "이겼습니다"
    var lose = "졌습니다"
    var drow = "비겼습니다"

    var randomNumber = (1 .. 3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "가위"
        }
        2 -> {
            computerChoice = "바위"
        }
        else -> {
            computerChoice = "보"
        }
    }

    val winner = when{
        playerChoice == computerChoice -> "비겼습니다"
        playerChoice == "바위" && computerChoice == "가위" -> "Player"
        playerChoice == "가위" && computerChoice == "보" -> "Player"
        playerChoice == "보" && computerChoice == "바위" -> "Player"
        else -> "Computer"
    }

    if(winner.equals("Tie")){
        println("비겼습니다")
    }else{
        println("$winner 가 이겼습니다")
    }
}