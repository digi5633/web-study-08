package web_study_08.service;

import java.util.List;

import web_study_08.dto.Member;
import web_study_08.dto.MemberDao;
import web_study_08.dto.impl.MemberDaoImpl;

public class MemberService {
	private MemberDao dao = MemberDaoImpl.getInstance();
	
	public List<Member> showMemberList(){
		return dao.selectMemberByAll();
	}
	
}
