package package_Database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import package_VO.AdminVO;
import package_VO.CategoryVO;
import package_VO.CustomerVO;
import package_VO.EventProductVO;
import package_VO.EventVO;
import package_VO.OrderVO;
import package_VO.OrderedListVO;
import package_VO.ProductVO;
import package_VO.QuestionVO;
import package_VO.RefundVO;



public class Database {
	
	private final AdminVO admin = new AdminVO();
	// admin 계정

	private final List<CategoryVO> catelist = new ArrayList<>();
	// 카테고리 목록 

	private final List<CustomerVO> customerList = new ArrayList<>();
	// 손님 목록

	private final List<EventProductVO> eventProductList = new ArrayList<>();
	// 이벤트상품 목록!

	private final List<EventVO> eventList = new ArrayList<>();
	// 이벤트 목록 

	private final List<OrderedListVO> orderedListList = new ArrayList<>();
	// 주문내역 리스트(어떤 상품을 몇개 구매 했는지 확인 리스트)

	private final List<OrderVO> orderList = new ArrayList<>();
	// 주문 정보(고객, 구매날짜, 주문번호 리스트)
	
	private final List<ProductVO> productList = new ArrayList<>();
	// 상품 리스트
	
	private final List<QuestionVO> questionList = new ArrayList<>();
	// 고객의 소리 리스트
	
	private final List<RefundVO> refundList = new ArrayList<>();
	// 환불 내역 리스트
	
	/**
	 * <code>adminLogin</code> 메서드는 해당 로그인 요청이 관리자 계정과 일치하는지 판별하는 메서드입니다.
	 * 
	 * @param loginInfo
	 *            : user_id, user_pw를 담은 Map
	 * @return 로그인에 성공한다면 true, 그렇지 않다면 false.
	 * @author 박세웅
	 */
	public boolean adminLogin(Map<String, String> loginInfo) {
		return admin.getId().equals(loginInfo.get("user_id")) 
				&& admin.getPw().equals(loginInfo.get("user_pw"));
	}
	
	
	
	
	/**
	 * <code>selectAllUser</code> 메서드는 모든 유저의 정보를 불러오기 위한 메서드입니다.
	 * 
	 * @return 모든 유저의 정보를 포함한 List
	 * @author 이학재
	 */
	public List<CustomerVO> selectAllUser() {
		List<CustomerVO> userList = new ArrayList<>();
		for (CustomerVO user : this.customerList) {
				userList.add(user);
			
		}
		return userList;
	}
	
	
	
	
	
	
	/**
	 * <code>selectUser</code> 메서드는 선택한 유저의 정보를 불러오기 위한 메서드입니다.
	 * 
	 * @param id
	 *            : 사용자의 고유 id
	 * @return 사용자의 정보를 담고 있는 UserVO 객체
	 * @author 이학재
	 */
	public CustomerVO selectCustomer(String id) {
		for (CustomerVO user : customerList) {
			if (user.getCustomerID().equals(id)) {
				return user;
			}
		}
		return null;
	}
	

	
	/**
	 * <code>userLogin</code> 메서드는 해당 로그인 요청이 사용자 계정과 일치하는지 판별하는 메서드입니다.
	 * 
	 * @param loginInfo
	 *            : user_id, user_pw를 담은 Map
	 * @return 로그인에 성공한다면 true, 그렇지 않다면 false.
	 * @author 박세웅
	 */
	public boolean userLogin(Map<String, String> loginInfo) {
		if (selectCustomer(loginInfo.get("user_id")) == null) {
			return false;
		}
		return selectCustomer(loginInfo.get("user_id")).getPassword().equals(loginInfo.get("user_pw"));
				//&& selectUser(loginInfo.get("user_id")).isActivate();
	}
	
	
	//CustomerVO 초기화 블럭
	{
		CustomerVO user1 = new CustomerVO();
		user1.setCustomerID("minseon");
		user1.setPassword("1111");
		user1.setName("길민선");
		customerList.add(user1);
	
		
	}

	
	
	
	
	
	
	
	
	

	
}


