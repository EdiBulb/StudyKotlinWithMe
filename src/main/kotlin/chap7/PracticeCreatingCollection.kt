package chap7

import java.util.TreeMap

/*컬렉션 생성하기*/
fun main(){
    //인스턴스 생성자를 통해 생성하기
    val list = ArrayList<String>()
    list.add("red")
    list.add("green")
    println(list)

    val set = HashSet<Int>()
    set.add(12)
    set.add(21)
    set.add(12)
    println(set)

    val map = TreeMap<Int,String>()
    map[20] = "twenty"
    map[10] = "ten"
    println(map)

    //가변 길이 인자를 받는 함수를 사용해서 컬렉션 클래스 인스턴스 생성하기
    val emptyList = emptyList<String>()
    println(emptyList)
//    emptyList.add("abc")//add is unresolved

    //시퀀스를 만드는 방법
    println(sequenceOf(1,2,3).iterator().next())
    println(listOf(10,20,30).asSequence().iterator().next())
    println(
        mapOf(1 to "One", 2 to "Two").asSequence().iterator().next()
    )
}