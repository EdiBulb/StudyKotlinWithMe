package chap2

import java.util.*

fun main(){
    //문자열
    //문자열 템플릿
    val name = readLine()
    println("Hello, $name!\n Today is ${Date()}")

    //로우 문자열
    val message = """
        Hello, $name!
        Today is ${Date()}
    """.trimIndent()

    //기본 문자열 연산 - String 인스턴스는 length 프로퍼티와 lastIndex 프로퍼티를 제공한다.
    "Hello!".length//6
    "Hello!".lastIndex//

    //문자열의 인덱스로 접근 가능
    val s = "Hello!"
    println(s[0])
    println(s[1])
    println(s[5])
//    println(s[10])

    //+ 문자열을 연결하기
    val s1 = "The sum is :" + s

    //문자열 동등성 비교
    val ss1 = "Hello!"
    val ss2 = "Hel" + "lo!"
    println(ss1==ss2) //true
}