package com.example.test_mysql_github_action.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private final MemberRepository memberRepository;

	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	public Member saveMember(MemberReq memberReq){
		return memberRepository.save(memberReq.toEntity());
	}
}
