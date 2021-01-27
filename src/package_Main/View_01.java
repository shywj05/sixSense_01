package package_Main;

import java.util.Scanner;

public class View_01 {

	/**
	 *  1. 로그인
		2. 회원가입
	 * @author 박상빈1
	 * @param
	 */
	Scanner sc = new Scanner(System.in);
	int iInput() {
		int input;
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				input = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println();
				System.out.println("숫자만 입력해주세요.");
			}
		}
		return input;
	}
	void mainScreen() {
		String message = "";
		while(true){
		System.out.println("메인화면");
		System.out.println();
		System.out.println("[ 1 ] 로그인");
		System.out.println("[ 2 ] 회원가입");
		System.out.println("[ 3 ] 종료");
		if (!"".equals(message)) {
			System.out.println();
			System.out.println(message);
			message = "";
		}
		
		switch (iInput()) {
		case 1:
			login();
			break;
		case 2:
			signin();
			break;
		case 3:
			System.out.println("종료합니다.");
			System.out.println();
			System.out.println();
			return;
		default:
			message = "잘못 입력하셨습니다. 다시 입력해 주세요.";
		}
		
		}
		
	}

	/**
	 * 
	 * @author 박상빈2
	 * @param
	 */
	private void login() {
		while(true){
			System.out.println("로그인 화면");
			System.out.println();
			System.out.println("[1] 회원 메인");
			System.out.println("[2] 관리자 메인");
			System.out.println("[3] 메인화면");
			
			
		}
	}

	/**
	 * 관리자 메인화면
	 * @author 박상빈3
	 * @param
	 */
	
	private void adminMain() {
		
	}

	/**
	 * 관리자메인-상품관리
	 * @author 박상빈4
	 * @param
	 */
	
	private void product() {

	}

	/**
	 * 관리자메인-상품관리-상품추가
	 * @author 박상빈5
	 * @param
	 */
	
	private void addProduct() {

	}

	/**
	 * 관리자메인-상품관리-상품삭제
	 * @author 박상빈6
	 * @param
	 */
	
	private void removeProduct() {

	}

	/**
	 * 관리자메인-상품관리-상품수정
	 * @author 박상빈7
	 * @param
	 */
	
	private void setProduct() {

	}

	/**
	 * 관리자메인-재고관리
	 * @author 박상빈8
	 * @param
	 */
	
	private void stock() {

	}

	/**
	 * 관리자메인-재고추가
	 * @author 박상빈9
	 * @param
	 */
	
	private void addStock() {

	}

	/**
	 * 관리자메인-재고삭제
	 * @author 박상빈10
	 * @param
	 */
	
	private void removeStock() {

	}

	/**
	 * 관리자메인-이벤트관리
	 * @author 박상빈11
	 * @param
	 */
	
	private void event() {

	}

	/**
	 * 관리자메인-이벤트관리-이벤트추가
	 * @author 박상빈12
	 * @param
	 */
	
	private void addEvent() {

	}

	/**
	 * 관리자메인-이벤트관리-이벤수정
	 * @author 박상빈13
	 * @param
	 */
	
	private void updateEvent() {

	}

	/**
	 * 관리자메인-이벤트관리-이벤삭제
	 * @author 박상빈14
	 * @param
	 */
	
	private void removeEvent() {

	}
	/**
	 * 관리자메인-고객의 소리
	 * @author 성원제1
	 * @param
	 */
	private void question() {

	}

	/**
	 * 관리자메인-고객의 소리-답변등록
	 * @author 성원제2
	 * @param
	 */
	private void addQuestion() {

	}

	/**
	 * 관리자메인-고객의 소리-답변수정
	 * @author 성원제3
	 * @param
	 */
	private void updateQuestion() {

	}

	/**
	 * 관리자메인-고객의 소리-답변삭제
	 * @author 성원제4
	 * @param
	 */
	private void removeQuestion() {

	}

	/**
	 * 관리자메인-주문내역
	 * @author 성원제5
	 * @param
	 */
	private void orderedNum() {

	}

	/**
	 * 주문내역-환분내역
	 * @author 성원제6
	 * @param
	 */
	private void refundDetail() {

	}

	/**
	 * 관리자메인-주문내역-매출현황
	 * @author 성원제7
	 * @param
	 */
	private void saleDetail() {

	}

	/**
	 * 회원 메인화면
	 * @author 성원제8
	 * @param
	 */
	private void customerMain() {

	}

	/**
	 * 회원 메인화면-카테고리
	 * @author 성원제9
	 * @param
	 */
	private void category() {

	}

	/**
	 * 회원 메인화면-카테고리-리스트
	 * @author 성원제10
	 * @param
	 */
	private void categoryList() {

	}

	/**
	 * 회원 메인화면-카테고리-리스트-수량
	 * @author 성원제11
	 * @param
	 */
	private void categoryListMount() {

	}

	/**
	 * 회원 메인화면-카테고리-리스트-수량-결재
	 * @author 성원제12
	 * @param
	 */
	private void categoryOrder() {

	}

	/**
	 * 회원 메인화면-카테고리-리스트-수량-바구니담기
	 * @author 성원제13
	 * @param
	 */
	private void categoryAdd() {

	}

	/**
	 * 회원 메인화면-장바구니보기
	 * @author 성원제14
	 * @param
	 */
	private void cartList() {

	}

	/**
	 * 회원 메인화면-장바구니보기-결재
	 * @author 성원제15
	 * @param
	 */
	private void cartOrder() {

	}
	/**
	 * 
	 * @author 길민선1
	 * @param
	 */
	// 회원 메인화면-주문내역
	private void orderedList() {

	}

	/**
	 * 
	 * @author 길민선2
	 * @param
	 */
	// 회원 메인화면-주문내역-환불
	private void refund() {

	}

	/**
	 * 
	 * @author 길민선3
	 * @param
	 */
	// 회원 메인화면-고객의 소리
	private void complain() {

	}

	/**
	 * 
	 * @author 길민선4
	 * @param
	 */
	// 회원 메인화면-고객의 소리-글작성
	private void addComplaint() {

	}

	/**
	 * 
	 * @author 길민선5
	 * @param
	 */
	// 회원 메인화면-고객의 소리-글삭제
	private void removeComplaint() {

	}

	/**
	 * 
	 * @author 길민선6
	 * @param
	 */
	// 회원 메인화면-고객의 소리-답변확인
	private void readAnswer() {

	}

	/**
	 * 
	 * @author 길민선7
	 * @param
	 */
	// 회원 메인화면-마이페이지
	private void myPage() {

	}

	/**
	 * 
	 * @author 길민선8
	 * @param
	 */
	// 회원 메인화면-마이페이지-비번변경
	private void pwChange() {

	}

	/**
	 * 
	 * @author 길민선9
	 * @param
	 */
	// 회원 메인화면-마이페이지-주소변경
	private void addrChange() {

	}

	/**
	 * 
	 * @author 길민선10
	 * @param
	 */
	// 회원 메인화면-마이페이지-포인트빼기
	private void pointRemove() {

	}

	/**
	 * 
	 * @author 길민선11
	 * @param
	 */
	// 회원 메인화면-마이페이지-포인트충전
	private void pointCharge() {

	}

	/**
	 * 
	 * @author 길민선12
	 * @param
	 */
	// 회원 메인화면-이벤트보기
	private void eventList() {

	}

	/**
	 * 
	 * @author 길민선13
	 * @param
	 */
	// 회원 메인화면-이벤트보기-이벤트선택
	private void eventSelect() {

	}

	/**
	 * 
	 * @author 길민선14
	 * @param
	 */
	// 회원 메인화면-이벤트보기-이벤트선택-결재
	private void eventPay() {

	}

	/**
	 * 
	 * @author 길민선15
	 * @param
	 */
	// 회원가입
	private void signin() {
		System.out.println("signin");
		
	}
}
