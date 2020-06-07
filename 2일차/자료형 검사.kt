/*
 자료형 검사하기.
 */

fun main(){
    var num = 256

    if (num is Int){
        println(num)
    }else if(num !is Int){
        println("is Not Int")
    }

    /*
       Any형을 사용하여 자료형을 결정하지 않은 채료 변수 선언
       Any는 최상위 클래스로 어떤 자료형이라도 될 수 있는 특수한 자료형입니다.

     */

    var x:Any
    x = "Hello"
    if (x is String){
        //Any 타입은 null 할당 불가.
        print(x?.length ?:-1)
    }

    /*
     as를 이용한 스마트 캐스트
     */
    // y의 값이 null이 아니면 y값이 String으로 변환되어서 X에 값이 할당됩니다.
    var y: String? = "RRET"

    var x1: String? = y  as? String
    println(x1)

    check("String")
    check(10000)

    //vararg : 가변인자.

}

fun check(x:Any){
    if (x is String){
        println("문자열 입니다.")
    }else if (x is Int){
        print("Int형 입니다.")
    }
}