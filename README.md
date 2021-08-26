# JWT





###  JWT 개요

- JWT는 Header, Payload, Signature 로 구성된
  - Header
    - Signature를 해싱하기 위한 알고리즘 정보를 가짐
  - Payload
    - 서버와 클라이언트가 주고받는, 시스템에서 실제로 사용될 정보를 가짐
  - Signature
    - token의 유효성을 검증할 수 있는 문자열을 가짐
- JWT 장점
  - 중앙의 인증서버, 데이터 스토어에 대한 의존성 없음
  - 시스템 수평 확장 유리
  - Base64 URL Safe Encoding 사용
    - URL, Cookie, Header 모두 사용 가능
- JWT 단점
  - payload에 담는 정보가 많으면 네트워크 사용량 증가
  - 토큰이 클라이언트에 저장되므로 클라이언트의 토큰을 직접 조작할 수 없음



### ResponseEntity

> 완전히 구성된 HTTP Response를 사용할 수 있는 클래스



header, body, status code로 구성되어 HTTP Method 동작시 개발자가 직접 HTTP Method에 필요한 정보를 제어할 수 있도록 제공하는 클래스

