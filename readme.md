기술스택 
Spring boot
thymeleaf
tomcat
spring web
JPA
MariaDB
Spring dev tools

@Valid 자체기능이 작동 안한다... 어디서 잘못된건지 못찾음.
그래서 @Size(min=2, max=10) 요게 작동 안함.

findByTitleOrContent 적용  --> BoardRepository

Paging -> pageable 을 사용

검색 기능 -> findByTitleOrContent 사용

spring security 
    .passwordEncoder(passwordEncoder()) 추가하면 에러발생
2021-12-01 13:06:37.429 ERROR 16948 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'webSecurityConfig': Requested bean is currently in creation: Is there an unresolvable circular reference?
