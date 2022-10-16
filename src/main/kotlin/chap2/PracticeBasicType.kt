package chap2
import java.util.Date

fun main(){
    //정수 타입
    val n = 12345

    //가독성 - 큰 수에 유리
    val n1 = 34_721_189

    //리터럴 자체의 타입
    val one :Byte = 1
//    val tooBigForShort : Short = 100_000
    val million = 1_000_000
//    val tooBigForInt : Int = 10_000_000_000
    val tenBillions = 10_000_000_000
//    val tooBigForLong = 10_000_000_000_000_000_000

    //long 타입
    val hundredLong = 100L
//    val hundredInt :Int = 100L

    //타입의 최대값 최소값 상수
    Short.MAX_VALUE
    Short.MIN_VALUE
    println(Int.MAX_VALUE +1)

    //Float와 Double의 특별한 값을 표현하는 상수
    Float.MIN_VALUE
    Float.MAX_VALUE
    Double.POSITIVE_INFINITY
    1.0/Double.NEGATIVE_INFINITY
    2-Double.POSITIVE_INFINITY
    3*Float.NaN


    //문자 타입 Char
    val z = 'z'
    val alpha = 'a'
    val quote = '\''
    val newLine = '\n'

    //수 변환
    val num =100
//    val l: Long = num

    //불 타입과 논리 연산
    val hasErrors = false
    val testPassed = true




}