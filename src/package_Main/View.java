//package package_Main;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//import package_VO.CustomerVO;
//
//public class View {
//	
//	private CustomerVO customer = null;
//	private final IServiceImpl iServiceImpl = new IServiceImpl();
//
//	
//	/**
//	 * 문자열 입력 메서드
//	 * 
//	 * @author 이학재
//	 * @return String - 입력받은 문자열
//	 */
//	String sInput() {
//		Scanner scanner = new Scanner(System.in);
//		return scanner.next().trim();
//	}
//
//	/**
//	 * 숫자 입력 메서드
//	 * 
//	 * @author 이학재
//	 * @return int - 입력받은 숫자
//	 */
//	int iInput() {
//		int input;
//		while (true) {
//			try {
//				Scanner scanner = new Scanner(System.in);
//				input = scanner.nextInt();
//				break;
//			} catch (Exception e) {
//				System.out.println();
//				System.out.println("숫자만 입력해주세요.");
//			}
//		}
//		return input;
//	}
//	
//	
//	
//	
//	/**
//	 * 첫 메인 화면 
//	 * @author 박상빈1
//	 * @param
//	 */
//
//	void mainScreen() {
//		String message = "";
//		while(true){
//		System.out.println("메인화면");
//		System.out.println();
//		System.out.println("[ 1 ] 로그인");
//		System.out.println("[ 2 ] 회원가입");
//		System.out.println("[ 0 ] 종료");
//		
//		if (!"".equals(message)) {
//			System.out.println();
//			System.out.println(message);
//			message = "";
//		}
//		
//		switch (iInput()) {
//		case 0:
//			System.out.println("프로그램을 종료합니다.");
//			return;
//		case 1:
//			login();
//			break;
//		case 2:
//			//insertUserView();
//			break;
//		default:
//			message = "잘못 입력하셨습니다. 다시 입력해 주세요.";
//		}
//		
//		}
//		
//	}
//
//	/**
//	 * 로그인 뷰 -관리자/사용자 메서드 -아이디 비밀번호값을 받아 database에서 비교
//	 * 
//	 * @author 박세웅
//	 */
//	private void login() {
//		String userId = null;
//		String userPw = null;
//		String message = "";
//
//		while (true) {
//			System.out.println();
//			if (userId == null) {
//				System.out.println("→ 1. 아이디 입력");
//				System.out.println("2. 비밀번호 입력");
//			} else if (userPw == null) {
//				System.out.println("1. 아이디 입력");
//				System.out.println("→ 2. 비밀번호 입력");
//			}
//			System.out.println();
//
//			if (userId == null) {
//				System.out.println("아이디를 입력하세요.");
//				if (!"".equals(message)) {
//					System.out.println();
//					System.out.println(message);
//					message = "";
//				}
//				userId = sInput();
//				continue;
//			} else if (userPw == null) {
//				System.out.println("비밀번호를 입력하세요.");
//				userPw = sInput();
//				continue;
//			}
//
////			Map<String, String> loginInfo = new HashMap<>();
//			loginInfo.put("user_id", userId);
//			loginInfo.put("user_pw", userPw);
//
//			if (iServiceImpl.adminLogin(loginInfo)) {
//				adminMainView();
//				break;
//			} else if (iServiceImpl.userLogin(loginInfo)) {
//				customer = iServiceImpl.selectCustomer(userId);
//				userMainView();
//				break;
//			}
//
//			message = "아이디 또는 비밀번호를 확인하세요.";
//			userId = null;
//			userPw = null;
//		}
//	}
//	
//	
//	
//	
//	
//	/**
//	 * -관리자 메인 뷰 -관리자 메서드
//	 * 
//	 * @author 정예진
//	 * 
//	 */
//	private void adminMainView() {
//		String message = "";
//		//while (true) {
//			System.out.println("관리자 페이지");
//			System.out.println("[ 1 ] 상품리스트 관리");
//			System.out.println("[ 2 ] 상품재고 관리");
//			System.out.println("[ 3 ] 주문내역 관리");
//			System.out.println("[ 4 ] 이벤트 관리");
//			System.out.println("[ 5 ] 고객의 소리 관리");
//			System.out.println("[ 0 ] 로그아웃");
//			System.out.println();
//			System.out.println("메뉴를 선택하세요.");
//			
//		//}
////			switch (iInput()) {
////			case 0:
////				// 뒤로가기
////				return;
////			case 1:
////				// 주문 목록 관리 메서드 호출
////				orderInfoView();
////				break;
////			case 2:
////				// 아이스크림 재고 관리 메서드 호출
////				icecreamStockView();
////				break;
////			case 3:
////				// 아이스크림 사이즈 관리 메서드 호출
////				sizeManageView();
////				break;
////			case 4:
////				// 회원 목록 관리 메서드 호출
////				userListView();
////				break;
////			case 5:
////				// 공지사항 관리 메서드 호출
////				notifyView();
////				break;
////			default:
////				message = "잘못 입력하셨습니다. 다시 입력해 주세요.";
////			}
//		}
//			
//		
//		/**
//		 * -회원 메인 뷰 -사용자 메서드
//		 * 
//		 * @author 박세웅
//		 */
//		private void userMainView() {
//			
//			String message = "";
//			while (true) {
//				if (customer == null) {
//					return;
//				}
//				System.out.println("--------------------");
//				System.out.println("[ 1 ] 상품 카테고리 보기");
//				System.out.println("[ 2 ] 장바구니 보기");
//				System.out.println("[ 3 ] 주문내역 보기");
//				System.out.println("[ 4 ] 고객의 소리");
//				System.out.println("[ 5 ] 마이페이지");
//				System.out.println("[ 6 ] 이벤트 보기");
//				System.out.println("[ 0 ] 로그아웃");
////				System.out.println("--------------------");
//
//				if (!"".equals(message)) {
//					System.out.println();
//					System.out.println(message);
//					message = "￣￣￣￣￣￣￣￣￣￣￣￣￣￣";
//				}
//
////				switch (iInput()) {
////				case 0:
////					return;
////				case 1:
////					userNotifyView();
////					break;
////				case 2:
////					pointCharge();
////					break;
////				case 3:
////					sizeView();
////					break;
////				case 4:
////					icecreamKindsView();
////					break;
////				case 5:
////					orderHistoryView();
////					break;
////				case 6:
////					myInfoView();
////					break;
////				default:
////					message = "올바르지 않은 입력입니다.";
////				}
////			}
//		}
//
//		
//			
//			
//			
//			
//			
//			
//			
//			
//			
//
//	}
//
//}
