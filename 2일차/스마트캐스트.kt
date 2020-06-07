/*
 스마트 캐스트

 컴파일러가 자동으로 형 변환을 해주는 기법입니다.
 */

fun main() {
// Number는  Float, Int, Long으로 알아서 인식해서 변환 합니다.
    var num2: Number = 12.2
    println(num2)
    num2 = 10
    println(num2)
    num2 = 10L
    println(num2)
}