package chap2

/*1. 주석*/

//한줄짜리 주석
/*여러줄 주석*/
/** KDoc 여러 줄 주석*/

/*2. 변수 정의하기*/
val timeInsecond = 15
fun main(){
    val a = readLine()!!.toInt() // !! : 널 아님 단언 연산자다. 만약 널인경우, 예외를 발생시킨다.
    val b = readLine()!!.toInt()
    println("value of val : " + (a+b))

    //타입 명시해도됨
    val n : Int = 100
    val text:String = "Hello!"

    //식별자 - 두 가지 방법이 있다.
    val `fun` = 1
    val `name with spaces` =2

    println("value of ` : "+`name with spaces`)

    //가변 변수
    var sum =1
    sum = sum +2
    sum = sum +3
    println("value of using mutable value : " + sum)

    //가변 변수 - 값을 바꿀 순 있어도, 타입은 유지된다.
    var sum1 = 1
//    sum1 = "Hello"

    //복합 대입 연산 및 이항 연산
    var result = 3
    result *=10
    result +=6
}