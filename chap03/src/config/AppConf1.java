package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.VersionPrinter;

@Configuration
public class AppConf1 {
	
	@Bean
	public MemberDao memberDao() { // Dao가 일종의 Repository 역할
		return new MemberDao();	
	}
	
	@Bean
	public MemberPrinter memberPrinter() { // 필드, 생성자 아무것도 없음
		return new MemberPrinter(); // 빈 생성자(기본)를 만들어서 리턴함.
	}

}
