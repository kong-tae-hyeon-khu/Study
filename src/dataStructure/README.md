**'자료구조(Data Sructure)'**  
<br>
자료에 효율적인 접근 및 수정을 가능하게 하는 자료의 조직, 관리, 저장을 의미한다.
더 정확히 말해, **자료 구조는 데이터 값의 모임, 또 데이터 간의 관계, 
그리고 데이터에 적용할 수 있는 함수나 명령을 의미한다.**  
<br>
자료구조와 알고리즘은 서로 뗄 수 없는 의존적인 관계이다.
어떤 알고리즘 문제를 풀기 위해 문제를 해석한 후, 사용할 자료구조를 선택한다.
자료구조를 선택하면 해당 자료구조에 맞는 알고리즘을 선택하는데 보다 더 효율적인 알고리즘을
선택할 수 있다는 장점이 있다.  
<br>
예를들어, 순서가 있는 데이터들이 있을 때 삽입(insert/add), 삭제(remove/delete)가
빈번하게 발생한다면 LinkedList 를, 아닐 경우에는 ArrayList 를 쓰듯이 각 자료구조별로
장단점을 갖고 있기 때문에 알고리즘 선택에 있어서 매우 중요한 역할을 담당한다.
  
**자료구조의 분류**
  * 선형 자료구조(Linear Data Structure)  
  데이터가 일렬로 연결된 형태. 우리가 흔히 쓰는 int[] 배열 같은 것.
  선형 자료구조는 대표적으로 리스트(List)와 큐(Queue), 덱(Deque) 등이 있다.  
  
  * 비선형 자료구조(Nonlinear Data Structure)  
  데이터가 일렬로 나열된 것이 아닌, 각 요소가 여러 개의 요소와 연결 된 형태. (마치 거미줄처럼)
  * 집합 자료구조(Set Data Structure)  
  집합의 경우는 데이터가 연결된 형식이 아니다.
  <br>

**Java Collection FrameWork**

![javaCollectionFramework](./collection_framework.png)

**1. List**  
자료구조의 가장 기초로 먼저 배우는 것은 List 계열들일 것이다. 
기존에 사용하던 int[] 나, double[] 과 같은 배열들과, 자바 컬렉션 프레임워크에서 지원하는
ArrayList, LinkedList 와 같은 리스트 클래스들과의 공통점과 차이점은 무엇일까?  
  
**[공통점]**
1. 동일한 특성의 데이터들을 묶는다.
2. 반복문(loop) 내에 변수를 이용하여 하나의 묶음 데이터들을 모두 접근할 수 있다.
  
**[차이점 - 배열]**
1. 처음 선언한 배열의 크기(길이)는 변경할 수 없다. 이를 정적 할당(Static Allocation)이라고 한다.
2. 메모리에 연속적으로 나열되어 할당된다.
3. index에 위치한 하나의 데이터(element)를 삭제하더라도 해당 index 에는 빈공간으로 계속 남는다.
  
**[차이점 - 리스트]**
1. 리스트의 길이가 가변적이다. 이를 동적 할당(dynamic allocation)이라고 한다.
2. 데이터들이 연속적으로 나열된다. (메모리에 연속적으로 나열되지 않고 각 데이터들은 주소(reference)로 연결되어 있다. C에서의 포인터처럼.)
3. 데이터(element) 사이에 빈 공간을 허용하지 않는다.

**배열의 장단점**  
<장점>
1. 데이터 크기가 정해져있을 경우 메모리 관리가 편하다.
2. 메모리에 연속적으로 나열되어 할당하기 때문에 index를 통한 색인(접근)속도가 빠르다.

<단점>
1. 배열의 크기를 변경할 수 없기 때문에 초기에 너무 큰 크기로 설정해주었을 경우 메모리 낭비가 심해지고, 반대로 너무 작은 크기로 설정해주었을 경우 데이터를 다 못담을 수 있는 경우가 발생할 수 있다.
2. 데이터를 삽입(add), 삭제(remove)를 할 때 빈 공간을 허용하지 않고자 한다면, 뒤의 데이터들을 모두 밀어내거나 당겨주어야 하기 때문에 속도가 느려 삽입, 삭제가 빈번한 경우 유용하지 않다.

**리스트의 장단점**
1. 


