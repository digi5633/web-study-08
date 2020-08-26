package web_study_08.dto;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import web_study_08.dto.impl.MemberDaoImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberDaoTest {
	private MemberDao dao;

	@Before
	public void setUp() throws Exception {
		dao = MemberDaoImpl.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void test04SelectMemberByAll() {
		System.out.println("test04SelectMemberByAll");
		List<Member> list = dao.selectMemberByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);

		System.out.println();
	}

	@Test
	public void test05SelectMemberByNo() {
		System.out.printf("%s()%n", "test05SelectMemberByNo");
		Member selectMember = dao.selectMemberByNo(new Member("somi"));
		Assert.assertNotNull(selectMember);

		System.out.println(selectMember);
	}

	@Test
	public void test01InsertMember() {
		System.out.printf("%s()%n", "test01InsertMember");
		Member insertMember = new Member("박규영", "parkgy", "1234", "pgy@naver.com", "010-1111-2222", 0);
		int res = dao.insertMember(insertMember);
		Assert.assertEquals(1, res);

		System.out.printf("%s%n%n", insertMember);
	}

	@Test
	public void test03DeleteMember() {
		System.out.printf("%s()%n", "test03DeleteMember");
		Member deleteMember = new Member("parkgy");
		int res = dao.deleteMember(deleteMember);
		Assert.assertEquals(1, res);

		System.out.printf("%s%n%n", deleteMember);
	}

	@Test
	public void test02UpdateMember() {
		System.out.printf("%s()%n", "test02UpdateMember");
		Member updateMember = new Member("문채원", "parkgy", "5678", "mcw@gmail.com", "010-3333-5555", 1);
		int res = dao.updateMember(updateMember);
		Assert.assertEquals(1, res);

		System.out.printf("%s%n%n", updateMember);
	}

}
