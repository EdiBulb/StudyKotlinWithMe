package chap7

fun main(){
    /*컬렉션 타입 - 이터러블*/
    //리스트 생성
    val list = listOf("red","green","blue")

    for(item in list){
        print(item + " ") // red green blue 출력
    }

    val list1 = ArrayList<String>() // 불변 컬렉션
    list1.add("abc") // 불변 컬렉션인데, 데이터를 변경하는 것은 가능
//    list1 = ArrayList<String>() // 불변 컬렉션의 참조를 변경하는 것은 불가능

    val list2 = listOf("a","b","c")//List<String>
    processCollection(list2)//List<String>을 List<Any>로 전달한다.

    val AGE_COMPARATOR = Comparator<Person>{p1, p2 ->
        p1.age.compareTo(p2.age)
    }

    val AGE_COMPARATOR1 = compareBy<Person>{it.age}
    val REVERSE_AGE_COMPARATOR = compareByDescending<Person> {it.age}
}

fun processCollection(c:Iterable<Any>){

}
//Comparable과 Comparator
class Person(
    val firstName: String,
    val familyName:String,
    val age:Int
): Comparable<Person>{
    val fullName get() = "$firstName $familyName"
    override fun compareTo(other: Person) = fullName.compareTo(other.fullName)

}