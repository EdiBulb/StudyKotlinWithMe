package chap7

/*7_1_6컬렉셔넹 대한 조건 검사*/
fun main(){

    //all()함수 : 컬렉션의 모든 원소가 주어진 술어를 만족하면 true를 반환한다.
    println(listOf(1,2,3,4).all { it <10 })
    println(listOf(1,2,3,4).all { it%2 ==0 })

    println(
        mapOf(1 to "I", 5 to "V", 10 to "X").all{it.key ==1 || it.key %5 ==0}
    )

    val seq = generateSequence(1){ if(it<50) it * 3 else null}

    println(seq.all{it%3 ==0})
    println(seq.all{it ==1 || it %3 ==0})

    //none()함수 : all()과 반대. 컬렉션에서 주어진 조건을 만족하는 원소가 하나도 없을 때 true를 반환한다.
    println(listOf(1,2,3,4).none{it>5})
    println(
        mapOf(1 to "I", 5 to "V", 10 to "X").none(){it.key %2==0}
    )

    val seq2 = generateSequence(1){if(it<50) it*3 else null }
    println(seq.none{it>=100})
}