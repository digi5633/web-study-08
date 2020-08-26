package web_study_08.dto;

import java.util.List;

public interface MemberDao {
	
	List<Member> selectMemberByAll();
	
	Member selectMemberByNo(Member member);
	
	int insertMember(Member member);
	
	int deleteMember(Member member);
	
	int updateMember(Member member);
	
}
