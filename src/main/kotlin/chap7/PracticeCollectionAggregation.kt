package chap7

fun main(){


    //두 번째 집계 함수 그룹 - 컬렉션 원소를 문자열로 엮는 일을 담당한다.
    println(listOf(1,2,3).joinToString ())
    println(listOf(1,2,3).joinToString{it.toString(2)}) // 1, 10, 11

    //joinToString() 함수에 옵션을 사용하는 경우
    val list = listOf(1,2,3)
    println(list.joinToString(prefix = "[", postfix = "]"))
    println(list.joinToString(separator = "|"))
    println(list.joinToString(limit = 2))
    println(list.joinToString(
        limit = 1,
        separator = " ",
        truncated = "???"
    ))
}