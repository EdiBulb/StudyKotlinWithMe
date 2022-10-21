package chap7

fun main(){

    //맵 이터레이션
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    for((key, value) in map){
        println("$key -> $value")
    }

    //for 루프의 대안으로 forEach() 확장 함수가 있다.
    intArrayOf(1,2,3).forEach { println(it*it) }

    listOf("a","b","c").forEach{println("'$it'")}

    sequenceOf("a","b","c").forEach { println("'$it'") }

    mapOf(1 to "ont", 2 to "two", 3 to "three").forEach{(key, value) ->
        println("$key -> $value")
    }

    //원소 인덱스 함수를 참해야한다면 forEachIndexed()함수를 쓰면 된다.
    println("forEachIndexed()")
    listOf(10,20,30).forEachIndexed{i, n -> println("$i: ${n*n}")}

    //컬렉션 타입이 제공하는 기본 기능
    val list = listOf(1,2,3)
    println(list.isEmpty())
    println(list.size)
    println(list.contains(4))
    println(2 in list)
    println(list.containsAll(listOf(1,2)))

    //MutableCollection타입은 원소를 추가하거나 제거할 수 있는 메서드를 제공한다.
    val mutableList = arrayListOf(1,2,3)
    mutableList.add(4)
    mutableList.remove(3)
    mutableList.addAll(setOf(5,6))
    mutableList.removeAll(listOf(1,2))
    mutableList.retainAll(listOf(5,6,7))
    mutableList.clear()

    //add()/remove()/addAll()/removeAll() 개신 +=나 -= 복합 연산을 사용할 수도 있다.
    mutableList +=4
    mutableList -=3
    mutableList += setOf(5,6)
    mutableList -= listOf(1,2)

    //리스트도 배열처럼 원소를 인덱스로 접근할 수 있는 메서드를 제공한다.
    val list2 = listOf(1,4,6,2,4,1,7)

    println(list2.get(3))
    println(list[2])
//    println(list[10])
    println(list2.indexOf(4))
    println(list2.lastIndexOf(4))
    println(list2.indexOf(8))

    //리스트가 가변 리스트인 경우에는 인덱스를 사용해 원소를 변경할 수 있다.
    val list3 = arrayListOf(1,4,6,2,4,1,7)

    list3.set(3,0)
    list3[2]=1
    list3.removeAt(5)
    list3.add(3,8)

    //subList 함수는 시작 인덱스오 끝 인덱스로 지정한 리스트의 일부분에 대한 래퍼를 만든다.
    val list4 = arrayListOf(1,4,6,2,4,1,7)
    val segment = list4.subList(2,5)

    list4[3]=0

    //map인스턴스는 키를 사용해 값을 얻는 메서드와 모든 키나 값의 컬렉션을 돌려주는 메서드 등을 지원한다.
    val map1 = mapOf(1 to "I", 5 to "V", 10 to "X", 50 to "L")


}