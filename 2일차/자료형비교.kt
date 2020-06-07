/*
 자료형 비교/검사 및 변환
 코틀린에서는 지료형은 모든 참조형으로 선언합니다. 컴파일을 거쳐서 최적화 될떄 int, long, short 로 자료형은 기본형 자료형으로 변환이 됩니다.
 */
fun main(){

    // 자료형 변환.
    var a:Int = 1
    // 코틀린에서 자동 형 변환이 이루어지지 않습니다.
    // 에러 : var b: Double = a

    // 명시적으로 형변환을 이뤄내야 합니다.
    var b: Double  = a.toDouble()
    println(b)

    val result = 1L + 3
    println(result)
    // toDouble(), toInt(), toChar().. 상황에 맞게 사용하면 됩니다.

    /*
      기본형과 참조형 자료형의 비교

      단순히 값만 비교하는 경우와 참조주소를 비교하는 경우있습니다.

      == -> 단순히 값만 비교,   === -> 참조주소 비교(값과 상관없이 참조가 동일하면 True 반환)
     */
     var a1 = 128
     var b1 = 128

     println(a1==b1) // True
     println(a1===b1) // True

    // === 가 왜 true가 나오는지 의아해 할 수 있습니다.
    // 그 이유는 코틀린은 모든 자료형을 참조형으로 선언하기 때문입니다.

    var a2 = 128
    var b2 : Int? = 128

    println(a1==b1) // True
    println(a1===b1) // false

    // 자료형? 은 참조형으로 저장됩니다. 즉 a2는 스택 영역에 있고, b2 힙 영역기 떄문에 false가 반환 됩니다.




}