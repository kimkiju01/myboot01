package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Java 기본 메서드에서 Spring 애플리케이션을 부트스트랩하고 시작하는 데 사용할 수 있는 클래스이다
//기본적으로 클래스는 애플리케이션을 부르스트랩하기 위해 다음 단계를 수행한다

//적절한 ApplicationContext 인스턴스를 생성합니다(클래스 경로에 따라 다름)
//애플리케이션 컨텍스트를 새로고침하고 모든 싱글톤 빈을 로드한다
@SpringBootApplication
public class Myboot011Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot011Application.class, args);
	}

}
