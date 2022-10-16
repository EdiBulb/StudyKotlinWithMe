package chap2
/*2.4 배열*/
fun main(){
    //배열 정의하기
    val a = emptyArray<String>() //string타입 원소 0개
    val b = arrayOf("hello","world") // string 타입 원소 2개
    val c = arrayOf(1,4,9) // int 타입 원소 3개

    //유연한 방법
    val size = readLine()!!.toInt()
    val squares = Array(size){(it+1) * (it+1)}

    //특화된 배열 타입
    val operations = charArrayOf('+','-','*','/','%')
    val squares2 = IntArray(10){(it+1)*(it+1)}


    //배열 사용하기
    val squares3 = arrayOf(1,4,9,16)
    squares3.size
    squares3.lastIndex
    squares3[3]
    squares3[1]

    //배열 변경하기
    squares3[2] = 100
    squares3[3] += 9
    squares3[0]--

    //copyOf() 메소드
    val numbers = squares3.copyOf()
    numbers[0] = 1000
    squares3.copyOf(2)
    squares3.copyOf(5)

    //+연산으로 새로운 배열 만들기
    val b1 = intArrayOf(1,2,3)+4
    val c1 = intArrayOf(1,2,3)+ intArrayOf(5,6)

    //참조 비교 : ==연산자
    intArrayOf(1,2,3) == intArrayOf(1,2,3) //false

    //배열 내용 비교 : contentEquals()메소드 사용
    intArrayOf(1,2,3).contentEquals(intArrayOf(1,2,3)) //true
}