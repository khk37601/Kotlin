# 1일차


#### val, var 차이점
```
/*
  val == const   
  var : 변수 선언
  
       val        username:       String =    "Kim"
  (선언 키워드)   (변수 명)        (타입)      (값)
 */
fun main(args: Array<String>) {
    val username: String = "Kim"
    print(username)
}
```
* 실행 결과

![변수선언1](https://user-images.githubusercontent.com/39870797/82904785-e7735a80-9f9d-11ea-84a8-ae567a013931.PNG)

* val 변수 값 재지정 
  - val 변수 선언은 한번지정하면 바꿀수 없기떄문에 오류가 발생 합니다. C, Java에서 const 선언과 같다고 생각 하면 될거 같습니다.
  
![변순선언_val](https://user-images.githubusercontent.com/39870797/82905114-69638380-9f9e-11ea-95d4-0146c01c81cd.PNG)


#### val 재지정

```
fun main(args: Array<String>) {
  // 자료형을 지정 없이도 값을 통해서 자료형을 추론하기 떄문에 선언이 가능 합니다.
  var username = "KJS" 
  print(username)
   
  // 값을 지정하지 않으면 자료형을 지정하지 않으면 선언이 불가능 합니다.
  var arr   
  arr = "test"
  print(arr)
  // 값을 지정하지 않을려면 자료형 타입을 지정해줘야 합니다.
  var arr: String = "test"
}
```

* 실행결과

![변수선언2](https://user-images.githubusercontent.com/39870797/82906367-1a1e5280-9fa0-11ea-8a1a-ebdf02af66d2.PNG)

#### 변수출력

```
fun main(args: Array<String>) {
	val number = 10
    var name ="KimJeaSeok"
    var number2: Int = 2
    
    number2 = 50 // 재지정 가능합니다.
    println("number: $number") //문자열에 $변수명을 쓰면 변수값 출력.
    println("name: $name")
    println("number2: $number2")
}
```
* 실행결과

![변수값 출력](https://user-images.githubusercontent.com/39870797/82907000-045d5d00-9fa1-11ea-9103-8aa3caa53f0f.PNG)

#### 코틀린 자료형, 참조형
```
코틀린은 참조형만 사용합니다. 그러한 이유는 참조형으로 선언한 변수는 선능 최적화를 위해 코틀린 컴파일러에서 다시 기본형으로 대체 됩니다.
참조형을 기본형으로 고려하는 최적화는 신경을 안써도 괜찮습니다.
```
#### 기본형 최솟값, 최댓값
```
fun main(args: Array<String>) {
	println("Byte min"+ Byte.MIN_VALUE+ " Max : "+ Byte.MAX_VALUE)
    println("Short min"+ Short.MIN_VALUE+ " Max : "+ Short.MAX_VALUE)
    println("Int min"+ Int.MIN_VALUE+ " Max : "+ Int.MAX_VALUE)
    println("Long min"+ Long.MIN_VALUE+ " Max : "+ Long.MAX_VALUE)
    println("Float min"+ Float.MIN_VALUE+ " Max : "+ Float.MAX_VALUE)
    println("Double min"+ Double.MIN_VALUE+ " Max : "+ Double.MAX_VALUE)
}
```
* 실행 결과
![기본형_최대값](https://user-images.githubusercontent.com/39870797/82908646-3cfe3600-9fa3-11ea-8bfe-7ffa8a1d1fd3.PNG)
