## **개방 폐쇄 원칙(OCP)**

확장에 대해 열려 있고, 변경에 대해서는 닫혀 있어야 한다.

 - 확장에 대해 열려 있다 : 요구사항이 변경될 때 새로운 '동작'을 추가해서 애플리케이션의 기능을 확장할 수 있다

 - 변경에 대해 닫혀 있다 : 기존의 '코드'를 수정하지 않고도 애플리케이션의 동작을 추가하거나 변경할 수 있다



## **컴파일 타임 의존성을 고정시키고 런타임 의존성을 변경하라**

컴파일 타임 의존성 : 코드에서 드러나는 클래스들 사이의 관계

런타임 의존성 : 실행시에 협력에 참여하는 객체들 사이의 관계

개방 폐쇄 원칙을 따르는 설계를 하자



## **추상화가 핵심이다**

개방 폐쇄 원칙의 핵심은 추상화에 의존하는 것

**추상화**

 - 핵심적인 부분만 남기고 불필요한 부분은 생략함으로써 복잡성을 극복하는 기법

 - 문맥이 바뀌더라도 변하지 않는 부분만 남게 되고 문맥에 따라 변하는 부분은 생략됨

 - 생략된 부분을 문맥에 적합한 내용으로 채워넣음으로써 각 문맥에 적합하게 기능을 구체화하고 확장할 수 있음



## **생성 사용 분리**

유연하고 재사용 가능한 설계를 원한다면 객체와 관련된 두 가지 책임을 서로 다른 객체로 분리해야 한다

1. 객체를 생성할 책임을 클라이언트로 옮기는 것

2. 객체 생성과 관련된 책임만 전담하는 별도의 객체를 추가 - **Factory**

3. 순수한 가공물에게 책임 할당하기

 - **정보 전문가(information expert)** 에게 책임을 할당

 - **표면적 분해** : 도메인에 존재하는 사물 또는 개념을 표현하는 객체들을 이용해 시스템을 분해하는 것

 - **행위적 분해** : 책임을 할당하기 위해 창조되는 도메인과 무관한 **인공적인 객체(순수한 가공물 - pure fabrication)** 에게 책임을 할당



## **의존성 주입**

사용하는 객체가 아닌 외부의 독립적인 객체가 인스턴스를 생성한 후 이를 전달해서 의존성을 해결하는 방법

**생성자 주입(constructor injection)** : 객체를 생성하는 시점에 생성자를 통한 의존성 해결

**setter 주입(setter injection)** : 객체 생성 후 setter 메서드를 통한 의존성 해결

**메서드 주입(method injection)** : 메서드 실행 시 인자를 이용한 의존성 해결

**Service Locator 패턴** : 의존성을 해결할 객체들을 보관하는 저장소를 통해 의존성을 해결해줄 것을 요청

 - 의존성을 구현 내부로 감추기 때문에 런타임에 에러가 발생할 수 있음

 - 의존성을 이해하기 위해 코드 내부의 구현을 이해할 것을 강요함

명시적인 의존성이 숨겨진 의존성이 좋다



## **의존성 역전 원칙(DIP)**

상위 수준의 모듈은 하위 수준의 모듈에 의존해서는 안 된다. 둘 모두 추상화에 의존해야 한다

추상화는 구체적인 사항에 의존해서는 안 된다. 구체적인 사항은 추상화에 의존해야 한다

인터페이스의 소유권을 서버 모듈이 아닌 클라이언트 모듈에 위치 시키자



## **유연성에 대한 조언**

유연한 설계는 유연성이 필요할 때만 옳다

 - 변경하기 쉽고 확장하기 쉬운 구조를 만들기 위해서는 단순함과 명확함의 미덕을 버리게 될 가능성이 높다

 - 유연한 설계는 복잡하고 암시적이다

 - 설계가 유연할수록 클래스 구조와 객체 구조 사이의 거리는 점점 멀어진다

협력과 책임이 중요하다

 - 설계를 유연하게 만들기 위해서는 먼저 역할, 책임, 협력에 초점을 맞춰야 한다

 - 객체를 생성하는 방법에 대한 결정은 모든 책임이 자리를 잡은 후 가장 마지막 시점에 내리는 것이 적절하다