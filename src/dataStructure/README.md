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
  <br>
  * 비선형 자료구조(Nonlinear Data Structure)  
  데이터가 일렬로 나열된 것이 아닌, 각 요소가 여러 개의 요소와 연결 된 형태. (마치 거미줄처럼)
  * 집합 자료구조(Set Data Structure)  
  집합의 경우는 데이터가 연결된 형식이 아니다.  
<br>
**Java Collection FrameWork**
![img.png](collection_framework.png)