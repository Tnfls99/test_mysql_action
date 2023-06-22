package com.example.test_mysql_github_action.member;

public record MemberReq(
	String name
) {
	public Member toEntity() {
		return new Member(name);
	}
}
