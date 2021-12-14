package util;

import java.util.*;

import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
	public Member getNewMember(Scanner scan) {
		Member newMember = new Member();
		while(true) //오입력 시 다시입력받기를위한 
			try {
				System.out.println("=====새 회원 정보 등록=====");
				
				System.out.print("회원 아이디 : ");
				int id = scan.nextInt();
				
				System.out.print("회원 이름 : ");
				String name = scan.next();
				
				System.out.print("회원이메일 : ");
				String email = scan.next();
				
				System.out.print("회원 주소 : ");
				String addr = scan.next();
				
				System.out.print("회원 취미 : ");
				String hobby = scan.next();
				
				System.out.print("회원전화번호 : ");
				String tel = scan.next();
				
				System.out.print("회원 나이 : ");
				int age = scan.nextInt();
				
				newMember.setId(id);
				newMember.setName(name);
				newMember.setEmail(email);
				newMember.setAddr(addr);
				newMember.setHobby(hobby);
				newMember.setTel(tel);
				newMember.setAge(age);
				break;
			}
		catch(InputMismatchException e) {
			System.out.println("다시 입력해 주세요.");
			scan.next(); //잘못받은거 다시받기 
		}
		return newMember;
 	}

	public void printRegistSuccessMessage(int id) {
		System.out.println(id+"회원 등록 성공");
	}
	
	public void printRegistFailMessage(int id) {
		System.out.println(id+"회원 등록 실패");
	}
	
	public void printMemberList(Member[] memberArray) {
		if(memberArray.length==0) {
			System.out.println("추가된 회원 정보가 없습니다.");
		}
		else {
			for(int i=0; i<memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
	
	public int getId(String msgKind, Scanner scan) {
		while(true) {
			try {
				System.out.print(msgKind+"아이디 : ");
				return scan.nextInt();
			}
			catch(NullPointerException e) {
				System.out.println("아이디가 없습니다. 다시 입력해주세요");
				scan.next();
				continue;
			}
			catch(InputMismatchException e) {
				System.out.println("아이디는 숫자만 입력해 주세요.");
				scan.next();
				continue;
			}
			
		}
	}
	
	public Member getNewMember(Member oldMember, Scanner scan) {		
		Member member = new Member();
		String name, email, addr, hobby, tel;
		int age;
		while(true) {
			try {
				System.out.println("==== 회원 정보 수정 ====");
				System.out.println("회원 아이디 : "+oldMember.getId());
				
				System.out.println("이전 이름 : "+oldMember.getName());
				System.out.println("새 회원 이름 : ");
				name = scan.next();
				
				
				System.out.println("이전 이메일 : "+oldMember.getEmail());
				System.out.println("새 회원 이메일 : ");
				email = scan.next();
				
				System.out.println("이전 주소 : "+oldMember.getAddr());
				System.out.println("새 회원 주소 : ");
				addr = scan.next();
				
				System.out.println("이전 취미 : "+oldMember.getHobby());
				System.out.println("새 회원 취미 : ");
				hobby = scan.next();
				
				System.out.println("이전 전화번호 : "+oldMember.getTel());
				System.out.println("새 회원 전화번호 : ");
				tel = scan.next();
				
				System.out.println("이전 나이 : "+oldMember.getAge());
				System.out.println("새 회원 나이 : ");
				age = scan.nextInt();
				break;
				}
			catch(InputMismatchException e) {
				System.out.println("나이는 숫자만 입력해 주세요.");
				scan.next();
			}
		}
		member.setId(oldMember.getId());
		member.setName(name);
		member.setEmail(email);
		member.setAddr(addr);
		member.setHobby(hobby);
		member.setTel(tel);
		member.setAge(age);
		
		return member;
	}
	
	public void printUpdateSuccessMessage(int id) {
		System.out.println(id+"회원 정보 수정 성공");
	}
	
	public void printUpdateFailMessage(int id) {
		System.out.println(id+"회원 정보 수정 실패");
	}
	
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id+"회원 정보 삭제 성공");
	}
	
	public void printDeleteFailMessage(int id) {
		System.out.println(id+"회원 정보 삭제 실패");
	}
	
	public SearchData getSearchData(Scanner scan) {
		System.out.println("검색 조건을 선택하시오.");
		System.out.println("1. 아이디");
		System.out.println("2. 이름");
		System.out.print("검색 조건 : ");
		
		String searchCondition = scan.next();
		String searchValue = null;
		
		if(searchCondition.equals("아이디")) {
			System.out.print("검색할 아이디 : ");
			searchValue = scan.next();
		}
		else if(searchCondition.equals("이름")) {
			System.out.print("검색할 이름 " );
			searchValue = scan.next();
		}
		
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);
		return searchData;
	}
	
	public void printSearchMember(Member member) {
		if(member==null) {
			System.out.println("검색한 결과가 없습니다.");
		}
		else {
			System.out.println(member.getId()+"으로 검색한 결과 ");
			System.out.println(member);
		}
	}
	
	public void printSearchMemberArray(Member[] memberArray) {
		if(memberArray.length == 0) {
			System.out.println("이름으로 검색한 결과가 없습니다.");
			}
		else {
			System.out.println("이름으로 검색한 결과 ");
			for(int i=0; i<memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}

}
