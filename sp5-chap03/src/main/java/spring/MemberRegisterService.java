package spring;

import java.time.LocalDateTime;

public class MemberRegisterService {
	private MemberDao memberDao; // memberDao라는 객체를 생성

	public MemberRegisterService(MemberDao memberDao) { // 생성자를 통해 의존 객체를 주입 받음
		this.memberDao = memberDao; // 8~9가 DI 부분. 주입 받은 객체를 필드에 할당
	}

	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(), 
				LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
