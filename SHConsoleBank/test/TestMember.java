package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.SHMemberService;

// --------------DELETE FROM sh_member; COMMIT; 이거 디벨로퍼에 치고오기----------------

public class TestMember {
	public static void main(String[] args) {
//		testMemberDao();
		testMemberService();
	}
	
	public static void testMemberService() {
//		MemberService ms = new SHMemberService(new MemberListDao());
		MemberService ms = new SHMemberService(new MemberOracleDao());
		
		System.out.println(">> 회원가입 및 목록조회");
		ms.join("curi", "1234", "큐리");
		ms.join("curi2", "1111", "큐리");
		printMemberList(ms.getAllMember());
		
		System.out.println(">> 로그인, 로그아웃");
		if(ms.login("curi", "1234"))
			System.out.println(ms.getLoggedMember());
		ms.logout();
		System.out.println(ms.getLoggedMember());
		
		System.out.println(">> 회원 정보 보기");
		ms.login("admin", "1234");
		System.out.println(ms.getMemberInfo("curi"));
		
		System.out.println(">> 비밀번호 변경");
		ms.changePassword("curi2", "1234", "cccc");
		printMemberList(ms.getAllMember());
	}
	
	public static void testMemberDao() {
//		MemberDao mdao = new MemberListDao();
		MemberDao mdao = new MemberOracleDao();
		
		// 회원 추가
		System.out.println(">>> 회원 추가 및 회원 목록");
		mdao.save(new Member("admin", "1234", "admin", null, null, Member.ADMIN));
		mdao.save(new Member("AAA", "1111", "abc", null, null, Member.USER));
		mdao.save(new Member("BBB", "2222", "ABC", null, null, Member.USER));
		printMemberList(mdao.findAll());
		
		System.out.println(">>> id로 회원 찾기");
		Member m = mdao.findById("AAA");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("3333");
		mdao.update(m);
		printMemberList(mdao.findAll());
		
		System.out.println(">>> 회원 삭제");
		mdao.delete(mdao.findById("BBB"));
		printMemberList(mdao.findAll());
	}
	
	public static void printMemberList(List<Member> mlist) {
		for(Member m : mlist) {
			System.out.println(m);
		}
	}
}
