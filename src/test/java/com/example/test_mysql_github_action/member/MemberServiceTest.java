package com.example.test_mysql_github_action.member;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberServiceTest {

	@Autowired
	private MemberService memberService;

	@Test
	@DisplayName("멤버를 저장할 수 있다.")
	void save_member(){
		String name = "name";
		MemberReq memberReq = new MemberReq(name);

		Member member =  memberService.saveMember(memberReq);

		assertThat(member.getName()).isEqualTo(name);
	}

}