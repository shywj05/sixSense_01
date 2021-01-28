package package_Main;

import java.util.List;
import java.util.Map;

import package_VO.CustomerVO;
import package_VO.EventProductVO;
import package_VO.OrderVO;
import package_VO.OrderedListVO;
import package_VO.ProductVO;
import package_VO.QuestionVO;
import package_VO.EventVO;

public interface IService {
	/**
	 * 관리자 계정 로그인
	 * 
	 * @param loginInfo 
	 * 			<>, <> 키 /값을 전송 
	 * @return
	 */
	boolean adminLogin(Map<String, String> loginInfo);

	/**
	 * 회원 계정 로그인
	 * @param loginInfo
	 *            <"customer_id", customer_id>, <"customer_pw", customer_pw> 키/값을 전송하여 로그인 성공여부
	 *            반환받음
	 * @return 로그인 성공 시 true, 실패 시 false 반환
	 * @author 박상빈
	 */
	boolean customerLogin(Map<String, String> loginInfo);

	/**
	 * 상품 리스트 전체보기 - 관리자 메서드(r)
	 * 
	 * @param 
	 * @return ProductVO
	 * @author 박상빈
	 */
	List<ProductVO> selectAllProduct();
	
	/**
	 * 선택한 상품 추가하기 - 관리자 메서드(c)
	 * 
	 * @param productInfo
	 * @return 추가되었으면 true, 추가 안됐으면 false
	 * @author 박상빈
	 */
	boolean insertProduct(Map<String, Integer> productInfo);
	
	/**
	 * 선택한 상품 수정하기 - 관리자 메서드(u)
	 * 
	 * @param productInfo
	 * @return 수정됐으면 1, 수정 안됐으면 0
	 * @author 박상빈
	 */
	int updateProduct(Map<String, Integer> productInfo);
	
	/**
	 * 선택한 상품 삭제하기 - 관리자 메서드(d)
	 * 
	 * @param productInfo
	 * @return 삭제됐으면 1, 삭제 안됐으면 0
	 * @author 박상빈
	 */
	int deleteProduct(Map<String, Integer> productInfo);
	
	///////////////////////////////////
	
	/**
	 * 재고 추가 - 관리자 메서드(c)
	 * 
	 * @param stockInfo
	 * @return 추가되었으면 1, 추가 안됐으면 0
	 * @author 박상빈
	 */
	boolean insertStock(int stock_num);
	
	/**
	 * 선택한 상품 재고 수정하기- 관리자 메서드(u)
	 * 
	 * @param productInfo
	 * @return 수정됐으면 true, 수정 안됐으면 false
	 * @author 박상빈
	 */
	boolean updateStock(Map<String, Integer> productInfo);
	
	////////////////////////////////////////
	
	/**
	 * 이벤트 목록 전부 가져오기 - 관리자 / 고객 메서드(r)
	 * 
	 * @return List<EventVo>
	 * @author 성원제
	 */
	List<EventVO> selectAllEvent();
	
	/**
	 * 이벤트 선택해서 보기- 관리자 메서드(r)
	 * 
	 * @param int event_num
	 * @return EventVO
	 * @author 성원제
	 */
	EventVO selectEvent(int event_num);
	
	/**
	 * 이벤트 추가 - 관리자 메서드(c)
	 * 
	 * @return eventInfo
	 * @author 성원제
	 */
	boolean insertEvent (Map<String, Object> eventInfo);
	
	/**
	 * 이벤트 수정(u)
	 * 
	 * @return eventInfo
	 * @author 성원제
	 */
	boolean updateEvent (Map<String, Object> eventInfo);
	
	/**
	 * 이벤트 삭제하기(d)
	 * 
	 * @return eventInfo
	 * @author 성원제
	 */
	boolean deleteEvent (Map<String, Object> eventInfo);


	
	
	///////////////////////////////////////////
	
	

	/**
	 * 이벤트상품 목록 전부 가져오기 - 관리자 / 고객 메서드(r)
	 * 
	 * @return List<EventProductVo>
	 * @author 성원제
	 */
	List<EventProductVO> selectAllEventProduct();
	
	/**
	 * 이벤트상품 선택해서 보기- 관리자 메서드(r)
	 * 
	 * @param int event_num
	 * @return EventVO
	 * @author 성원제
	 */
	EventProductVO selectEventProduct(int eventProduct_num);
	
	/**
	 * 이벤트상품 추가 - 관리자 메서드(c)
	 * @param int eventProductInfo
	 * @return 
	 * @author 성원제
	 */
	boolean insertProductEvent (Map<String, Object> eventProductInfo);
	
	/**
	 * 이벤트상품 수정(u)
	 * @param int eventProductInfo
	 * @return 
	 * @author 성원제
	 */
	boolean updateProductEvent (Map<String, Object> eventProductInfo);
	
	/**
	 * 이벤트상품 삭제하기(d)
	 * @param int eventProductInfo
	 * @return 
	 * @author 성원제
	 */
	boolean deleteProductEvent (Map<String, Object> eventProductInfo);

	
	
	////////////////////////////////////////////////
	
	

	/**
	 * 주문내역 목록 전부 가져오기 - 관리자 / 고객 메서드(r)
	 * 
	 * @return List<EventProductVo>
	 * @author 성원제
	 */
	List<OrderedListVO> selectAllOrderedList();
	
	/**
	 * 주문내역 선택해서 보기- 관리자 메서드(r)
	 * 
	 * @param int event_num
	 * @return EventVO
	 * @author 성원제
	 */
	OrderedListVO selectOrderedList(int OrderedList_num);
	
	
	/**
	 * 매출현황(r)
	 * @param int eventProductInfo
	 * @return 
	 * @author 성원제
	 */
	boolean selectSale (Map<Integer, Integer> saleInfo);

	
	/**
	 * 환불 내역 보기(r)
	 * @param int eventProductInfo
	 * @return 
	 * @author 성원제
	 */
	boolean selectRefund (Map<Integer, Integer> refundInfo);

/////////////////////////////////////////////////////////
	
	/**
	 * 고객의 소리 목록 전부 가져오기 - 관리자 / 고객 메서드(r)
	 * 
	 * @return List<QuestionVO>
	 * @author 성원제
	 */
	List<QuestionVO> selectAllQuestion();
	
	/**
	 * 고객의 소리의 목록 중 하나 가져오기 - 관리자 메서드(r)
	 * 
	 * @param int customer_id
	 * @return customer_id
	 * @author 성원제
	 */
	QuestionVO selectQuestion(int seq_num);
	
	/**
	 * 고객의 소리 목록 하나에 답변달기 - 관리자 메서드(c)
	 * 
	 * @return Question
	 * @author 성원제
	 */
	boolean insertAnswer (QuestionVO question);
	
	/**
	 * 답변수정하기(c)
	 * 
	 * @return Question
	 * @author 성원제
	 */
	int updateAnswer (QuestionVO question);
	
	/**
	 * 답변삭제하기(d)
	 * 
	 * @return 
	 * @author 성원제
	 */
	int deleteAnswer (QuestionVO question);
	
	///////////////////////
	//고객
	///////////////////////
	//마이페이지
	
	/**
	 * 마이페이지 전체 내역 보기 - 고객 메서드(r)
	 * 
	 * @return List<QuestionVO>
	 * @author 성원제
	 */
	List<CustomerVO> selectAllCustomerInfo();
	

	/**
	 * 유저 정보 업데이트 메서드
	 * 
	 * @param userInfo
	 *            <"user_pw", user_pw> <"user_addr",
	 *            user_addr>
	 * @return 실패 시 0, 성공 시 양수 반환
	 * @author 
	 */
	int updateCustomer(Map<String, Object> CustomerInfo);

	
	/**
	 * 고객의 소리-글등록-고객 메서드
	 * 
	 * @return Question
	 * @author 성원제
	 */
	boolean insertQuestion (QuestionVO question);
	
	/**
	 * 답변수정하기(c)
	 * 
	 * @return Question
	 * @author 성원제
	 */
	int updateQuestion (QuestionVO question);
	
	/**
	 * 답변삭제하기(d)
	 * 
	 * @return 
	 * @author 성원제
	 */
	int deleteQuestion (QuestionVO question);
	
	/////////////////////////////////
	//고객
	
	
	/**
	 * 상품 목록 전부 가져오기 - 관리자 / 유저 메서드
	 * 
	 * @return List<ProductVO>
	 * @author 길민선
	 */
	List<ProductVO> selectAllProductList();
	
	
	/**
	 * 주문 정보 추가 - 유저 메서드
	 * 
	 * @param order
	 * @return 성공 시 true, 실패 시 false 반환
	 * @author 길민선
	 */
	boolean insertOrder(OrderVO order);

	/**
	 * 장바구니 여부 - 유저 메서드
	 * 
	 * @param ShopList
	 * @return 성공 시 true, 실패 시 false 반환
	 * @author 길민선
	 */
	boolean insertShopList(List<OrderVO> ShopList);


	/**
	 * 나의 주문내역 전체 보기 - 유저 메서드
	 * 
	 * @param user_id
	 * @return List<OrderInformationVO>
	 * @author 길민선
	 */
	List<OrderedListVO> selectAllOrderedList(String user_id);

	/**
	 * 유저 정보 업데이트 메서드
	 * 
	 * @param userInfo
	 *            <"user_id", user_id> <"user_pw", user_pw> <"user_name",
	 *            user_name>
	 * @return 실패 시 0, 성공 시 양수 반환
	 * @author 길민선
	 */
	int updateUser(Map<String, Object> userInfo);

	/**
	 * 유저 정보 삭제 메서드
	 * 
	 * @param user_id
	 * @return 실패 시 0, 성공 시 양수 반환
	 * @author 길민선
	 */
	int deleteUser(String user_id);
	
	
	
	
	
}
