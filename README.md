# BasicTest

## Spring Legacy - Spring Web MVC Project

- new - spring legacy project - spring mvc project
- project name: `WebTest`
- root package: `com.test.java`

#### 현재 프로젝트 버전 수정하기(프로젝트 만들 때마다 세팅 필요)
1. 자바 버전 > 11
   - pom.xml
   - 프로젝트 > 우측버튼 > Properties > Project facets > Java 11로 설정
2. 스프링 버전 > 5.0.7
   - pom.xml
3. 롬복 설치하기
   - pom.xml > 의존성 추가

#### STS 관련 설정
1. 설정에서 encoding 검색
   1. workspace, css, html, jsp 인코딩 모두 UTF-8로 변경
   2. Content Types에서 Text 클릭 -> Encoding에 UTF-8 입력 후 Update 클릭
2. jsp 템플릿 추가

#### 파일 및 패키지
- 1번 예제
  - com.test.java.controller
    - `Ex01Controller.java`
  - views
    - `ex01.jsp`
- 2번 예제
  - com.test.java.controller
    - `Ex02Controller.java`
  - com.test.java.model
    - `SpringDAO.java`
  - views
    - `ex02.jsp`
- 3번 예제(annotation 방식을 이용한 Spring 설정)
  - com.test.java.controller
    - `Ex03Controller.java`
  - com.test.java.model
    - `SpringDAO03.java`
  - views
    - `ex03.jsp`
- 4번 예제(annotation 방식을 이용한 Spring 설정)
  - com.test.java.controller
    - `Ex04Controller.java`
    - `Ex04GetController.java`
    - `Ex04PostController.java`
  - views
    - `ex04.jsp`
    - `ex04get.jsp`
    - `ex04post.jsp`
- 5번 예제(annotation 방식을 이용한 Spring 설정, controller 줄이기(servlet 줄이기))
    - 서블릿 수업 때 하나의 컨트롤러에 get메서드 post메서드 둘다 구현하는 방식이랑 비슷
  - com.test.java.controller
    - `Ex05Controller.java`
  - views
    - `ex05.jsp`
    - `ex05get.jsp`
    - `ex05post.jsp`
- __6번 예제: 데이터 전송 + 수신하기(중요)__
    - 서블릿 수업 때 하나의 컨트롤러에 get메서드 post메서드 둘다 구현하는 방식이랑 비슷
  - com.test.java.controller
    - `Ex06Controller.java`
  - com.test.java.model
    - `AddressDTO.java`
  - views
    - `ex06.jsp`
    - `ex06ok.jsp`