# SW 개발 실무 (BE)


[1차 과제 - 개발환경 셋팅 하면서 어려웠던 점]

1. Eclipse 최신 버전 설치 후 셋팅 과정마다 에러 메시지 발생 (해결)
→ Eclipse 최신 버전에서 Spring Legacy Project 미지원하면서 발생한 문제.
  Spring Legacy Project를 지원하는 2021-03 버전으로 재설치함
  

2. Spring, Mariadb, MyBarils 연동 후 localhost 확인시 아래 에러 메시지뜨면서 DB 테이블 확인 불가 (확인중)

[문제점]
Spring, Mariadb, MyBatis 연동 후 localhostg확인시 localhost에서 연결 거부

[에러메시지]
- Origin 서버가 대상 리소스를 위한 현재의 representation을 찾지 못했거나, 그것이 존재하는지를 밝히려 하지 않습니다.
- localhost에서 연결을 거부했습니다. (연결 확인, 프록시 및 방화벽 확인)

[시도해본 해결방법]
1. web.xml 확인
2. 서블릿 어노테이션 오타 확인
3. 포트번호 (8080) 충돌 -> 8090으로 변경 후에도 문제 동일함
4. 프로젝트 클린하기
5. 프로젝트 서버 업로드하기
6. 프록시, 방화벽 설정 확인

[참고사항]
* eclipse : 2021-03
* jdk : 1.8
* jre : 1.8
* Tomcat : 9.0.69
* Mariadb : 10.2.14
* mysql workbench : 8.0.31
* spring : 5.1.8.RELEASE
* 프로젝트 내보내기한 압축 파일 첨부함

이 상태에서 어떤 것을 더 해봐야할지 더이상 감이 잡히지않습니다. 피드백 주시면 감사하겠습니다!

![image](https://user-images.githubusercontent.com/71672106/206585983-8b505adc-95ca-43cf-98a5-ee18836cda44.png)



3. Eclipse 내 git 활용하여 Push시 다른계정으로 commit 됨 (로그아웃 후 재로그인해도 동일함 /확인중)



[2차 과제 - API 가이드 문서(초안) 작성하기 하면서 어려웠던 점]

1. API 문서 초안의 경우 GitHub에 어떻게 반영하면 좋을까요? 아래와 같이 이미지를 붙이면 좋을까요? 피드백 주시면 반영하겠습니다! (확인중)
![image](https://user-images.githubusercontent.com/71672106/206585778-4c84d958-4b16-4787-a671-8b6b5fe79532.png)


2. requestlog, is_success가 무엇이고, Request Parameters에 반영되는게 맞는건지 잘 모르겠습니다. (확인중)
