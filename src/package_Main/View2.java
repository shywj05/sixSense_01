package package_Main;
import java.util.Scanner;

public class View2 {

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
      while(true){
         System.out.println("   메인화면   ");
         System.out.println();
         System.out.println("[ 1 ] 로그인");
         System.out.println("[ 2 ] 회원가입");
         System.out.println("[ 0 ] 종료");
         
         
         switch (iInput()) {
         case 1:
            login();
            break;
         case 2:
            signin();
            break;
         case 0:
            System.out.println("   종료합니다.   ");
            System.out.println();
            System.out.println();
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      
      }
      
   }

   /**
    * 로그인 
    * @author 박상빈2
    * @param
    */
   private void login() {
      while(true){
         System.out.println("   로그인 화면      ");
         System.out.println();
         System.out.println("[1] 회원 메인");
         System.out.println("[2] 관리자 메인");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            customerMain();
            break;
         case 2:
            adminMain();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
         
      }
   }

   /**
    * 관리자 메인화면
    * @author 박상빈3
    * @param
    */
   
   private void adminMain() {
      while(true){
         System.out.println("   관리자 메인화면   ");
         System.out.println();
         System.out.println("[1] 상품관리");
         System.out.println("[2] 재고관리");
         System.out.println("[3] 이벤트관리");
         System.out.println("[4] 이벤트상품관리");
         System.out.println("[5] 주문내역관리");
         System.out.println("[6] 고객의소리관리");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            productView();
            break;
         case 2:
            stockView();
            break;
         case 3:
            event();
            break;
         case 4:
            //eventProduct();
            break;
         case 5:
            orderedList();
            break;
         case 6:
        	complain();
        	break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }   
   }

   /**
    * 관리자메인-[1]상품관리
    * @author 박상빈4
    * @param
    */
   
   private void productView() {
      while(true){
         System.out.println("상품관리 화면");
         System.out.println("[1]스낵리스트보기");
         System.out.println("[2]젤리리스트보기");
         System.out.println("[3]맥주리스트보기");
         System.out.println("[0]이전");
   
         switch (iInput()) {
         case 0:
             return;
         case 1:
            categoryView_product();//[1]스낵리스트보기
            break;
         case 2:
        	categoryView_product();//[2]젤리리스트보기
            break;
         case 3:
        	categoryView_product();//[3]젤리리스트보기
            break;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }   
   }
   
   //현재화면
   //[1]추가하기
   //[2]새우깡 1000원
   //[3]포카칩 1500원
   private void categoryView_product() {
	   while(true){
         System.out.println("상품관리 화면");
         System.out.println("[1]상품 추가하기");
         System.out.println();
         System.out.println("내역 수정/삭제를 원하시면 번호를 입력해주세요");
         System.out.println("[2]새우깡 1000원");
         System.out.println("[3]포카칩 1500원");
         System.out.println("[0]이전");
         
         //selectAllProduct()
        
         int prod_seq=0;
         
         switch (iInput()) {
         case 0:
             return;
         case 1:
            insertProduct();//[1]상품 추가하기
            break;
         case 2:
        	selectProduct(prod_seq);//[2]새우깡의 시퀀스 넘버로 이동
            break;
         case 3:
        	selectProduct(prod_seq);//[3]포카칩의 시퀀스 넘버로 이동
            break;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }

	   }   
   }
   
   
   
   	//[1]상품 추가하기
	private void insertProduct() {
		System.out.println("추가되었습니다");
		
		
	}
	//[2]각 상품의 시퀀스 넘버를 받아온다
	//여기서 수정/삭제
	private void selectProduct(int prod_seq){
		
		//상세내역 확인 ex)새우깡 1000원
		
		//[1]수정
		//[2]삭제
		//[0]이전
		while(true){
	         System.out.println("[1]내역수정하기");
	         System.out.println("[2]내역삭제하기");
	         System.out.println("[0]이전");
	   
	         switch (iInput()) {
	         case 0:
	             return;
	         case 1:
	            updateProduct();
	            break;
	         case 2:
	        	deleteProduct();
	            break;
	         default:
	            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
	         }
	    }   
	}
	//상품내역수정(상품이름/상품가격)
	private void updateProduct() {
			
			
	}
	//상품 내역 삭제
	private void deleteProduct() {
		
		
	}



   /**
    * 관리자메인-재고관리
    * @author 박상빈8
    * @param
    */
   
   private void stockView() {   
      while(true){
         System.out.println("재고관리 화면");
         System.out.println();
         System.out.println("[1]스낵리스트 재고보기");
         System.out.println("[2]젤리리스트 재고보기");
         System.out.println("[3]맥주리스트 재고보기");
         System.out.println("[0]이전화면");
         
         switch (iInput()) {
         case 0:
             return;
         case 1:
        	categoryView_stock();
            break;
         case 2:
        	categoryView_stock();
            break;
         case 3:
        	categoryView_stock();
            break;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }   
   }
   
   private void categoryView_stock() {
	   while(true){
	         System.out.println("스낵리스트-재고");
	         System.out.println("수정/삭제하고자 하는 상품의 번호를 선택해주세요");
	         System.out.println("[1]새우깡 5개");
	         System.out.println("[2]포카칩 5개");
	         System.out.println("[3]스윙칩 5개");
	         System.out.println("[0]이전화면");
	         
	         //selectAllStock()
	         
	         int prod_seq = 0;
	         switch (iInput()) {
	         case 0:
	             return;
	         case 1:
	            selectStock(prod_seq);
	            break;
	         case 2:
	        	selectStock(prod_seq);
	            break;
	         case 3:
	        	selectStock(prod_seq);
	            break;
	         default:
	            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
	         }
	    }   
	
   }
	private void selectStock(int prod_seq) {
		while(true){
	         System.out.println("새우깡 5개");
	         System.out.println();
	         System.out.println("[1]수정");
	         System.out.println("[2]삭제");
	         System.out.println("[0]이전화면");
	         
	         switch (iInput()) {
	         case 0:
	             return;
	         case 1:
	            updateStock(prod_seq);
	            break;
	         case 2:
	        	deleteStock(prod_seq);
	            break;
	         default:
	            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
	         }
	    }   
	}
	
	private void updateStock(int prod_seq) {
		System.out.println("수정되었습니다");
			
	}
	private void deleteStock(int prod_seq) {
		System.out.println("삭제되었습니다");
			
			
	}
/**
    * 관리자메인-이벤트관리
    * @author 박상빈11
    * @param
    */
   
   private void event() {
      while(true){
         System.out.println("   이벤트 관리 화면   ");
         System.out.println();
         System.out.println("[1] 상품리스트보기");
         System.out.println("[2] 이벤트 상품선택");
         System.out.println("[3] 이벤트 상품추가");
         System.out.println("[4] 이벤트 상품삭제");
         System.out.println("[5] 이벤트 상품수정");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            allEventList();
            break;
         case 2:
            selectEvent();
            break;
         case 3:
            addEvent();
            break;
         case 4:
            updateEvent();
            break;
         case 5:
            removeEvent();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-이벤트관리-이벤트리스트보기
    * @author 박상빈12-1
    * @param
    */
   
   private void allEventList() {
      while(true){
         System.out.println("   이벤트리스트보기   ");
         System.out.println();
         System.out.println("[1] 이벤트리스트보기");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트리스트보기 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   
   /**
    * 관리자메인-이벤트관리-이벤트 선택
    * @author 박상빈12-2
    * @param
    */
   
   private void selectEvent() {
      while(true){
         System.out.println("   이벤트 선택   ");
         System.out.println();
         System.out.println("[1] 이벤트 선택 메서드");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트 선택 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * 관리자메인-이벤트관리-이벤트추가
    * @author 박상빈12
    * @param
    */
   
   private void addEvent() {
      while(true){
         System.out.println("   이벤트 상품추가 화면   ");
         System.out.println();
         System.out.println("[1] 이벤트 상품추가");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트 상품추가 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-이벤트관리-이벤수정
    * @author 박상빈13
    * @param
    */
   
   private void updateEvent() {
      while(true){
         System.out.println("   이벤트 상품삭제 화면   ");
         System.out.println();
         System.out.println("[1] 이벤트 상품삭제");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트 상품삭제 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-이벤트관리-이벤삭제
    * @author 박상빈14
    * @param
    */
   
   private void removeEvent() {
      while(true){
         System.out.println("   이벤트 상품수정 화면   ");
         System.out.println();
         System.out.println("[1] 이벤트 상품수정");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트 상품수정 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * 관리자메인-고객의 소리
    * 
    * @author 성원제1
    * @param
    */
   private void question() {
      //질문내용 전부 호출해서 찍지
      while (true) {
         System.out.println("   고객의 소리 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 답변리스트보기");
         System.out.println("[ 2 ] 답변선택");
         System.out.println("[ 3 ] 답변등록");
         System.out.println("[ 4 ] 답변수정");
         System.out.println("[ 5 ] 답변삭제");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            allQuestionList();
            break;
         case 2:
            selectQuestion();
            break;
         case 3:
            addQuestion();
            break;
         case 4:
            updateQuestion();
            break;
         case 5:
            removeQuestion();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   
   /**
    * 관리자메인-고객의 소리-답변 리스트보기
    * 
    * @author 성원제2
    * @param
    */
   private void allQuestionList() {
      while(true){
         System.out.println("   답변 리스트보기 페이지입니다.   ");
         System.out.println();
         System.out.println("답변 리스트보기 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("답변 리스트보기 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-고객의 소리-답변 항목선택
    * 
    * @author 성원제2
    * @param
    */
   private void selectQuestion() {
      while(true){
         System.out.println("   답변 항목선택 페이지입니다.   ");
         System.out.println();
         System.out.println("답변 항목선택 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("답변 항목선택 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * 관리자메인-고객의 소리-답변등록
    * 
    * @author 성원제3
    * @param
    */
   private void addQuestion() {
      //질문내용을 가져올 때 질문 몇번의 것을 가져올지..
      //질문내용에 추가로 아래의 input을 넣어서
      //질문내용 안에 답변이 보이고 답변이 없으면 답변이 없다고 뜨게      
      while (true) {
         System.out.println("   고객의 소리 페이지입니다.   ");
         System.out.println();
         System.out.println("답변등록 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("답변등록 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-고객의 소리-답변수정
    * 
    * @author 성원제3
    * @param
    */
   private void updateQuestion() {
      while(true){
         System.out.println("   답변수정 페이지입니다.   ");
         System.out.println();
         System.out.println("답변등록 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("답변등록 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   

   /**
    * 관리자메인-고객의 소리-답변삭제
    * 
    * @author 성원제4
    * @param
    */
   private void removeQuestion() {
      while(true){
         System.out.println("답변삭제 페이지입니다.");
         System.out.println();
         System.out.println("답변삭제 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("답변삭제 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-주문내역
    * 
    * @author 성원제5
    * @param
    */
   private void orderedNum() {
      while (true) {
         System.out.println("   주문내역 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 주문리스트");
         System.out.println("[ 2 ] 내역선택");
         System.out.println("[ 3 ] 환불내역");
         System.out.println("[ 4 ] 매출현황");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            allDetailList();
            break;
         case 2:
            selectDetail();
            break;
         case 3:
            refundDetail();
            break;
         case 4:
            saleDetail();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 주문내역-주문리스트
    * 
    * @author 성원제6
    * @param
    */
   private void allDetailList() {
      while (true) {
         System.out.println("   주문리스트 페이지입니다.   ");
         System.out.println();
         System.out.println("주문리스트 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("환불내역 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   
   /**
    * 주문내역-내역선택
    * 
    * @author 성원제6
    * @param
    */
   private void selectDetail() {
      while (true) {
         System.out.println("   내역선택 페이지입니다.   ");
         System.out.println();
         System.out.println("내역선택 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("내역선택 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * 주문내역-환분내역
    * 
    * @author 성원제6
    * @param
    */
   private void refundDetail() {
      while (true) {
         System.out.println("   환분내역 페이지입니다.   ");
         System.out.println();
         System.out.println("환불내역 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("환불내역 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 관리자메인-주문내역-매출현황
    * 
    * @author 성원제7
    * @param
    */
   private void saleDetail() {
      while (true) {
         System.out.println("   매출현황 페이지입니다.   ");
         System.out.println();
         System.out.println("매출현황 메서드");
         System.out.println("[ 0 ] 이전");
         switch (iInput()) {
         case 1:
            System.out.println("매출현황 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면
    * 
    * @author 성원제8
    * @param
    */
   private void customerMain() {
      while (true) {
         System.out.println("   회원메인 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 카테고리");
         System.out.println("[ 2 ] 장바구니보기");
         System.out.println("[ 3 ] 주문내역");
         System.out.println("[ 4 ] 고객의 소리");
         System.out.println("[ 5 ] 마이페이지");
         System.out.println("[ 6 ] 이벤트보기");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            category();
            break;
         case 2:
            cartList();
            break;
         case 3:
            orderedList();
            break;
         case 4:
            complain();
            break;
         case 5:
            myPage();
            break;
         case 6:
            eventList();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-카테고리
    * 
    * @author 성원제9
    * @param
    */
   private void category() {
      while (true) {
         System.out.println("   카테고리 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 카테고리 리스트");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            categoryList();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-카테고리-리스트
    * 
    * @author 성원제10
    * @param
    */
   private void categoryList() {
      while (true) {
         System.out.println("   리스트 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 수량");
         System.out.println("[ 0 ] 이전화면");
         switch (iInput()) {
         case 1:
            categoryListMount();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-카테고리-리스트-수량
    * 
    * @author 성원제11
    * @param
    */
   private void categoryListMount() {
      while (true) {
         System.out.println("   수량 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 결제");
         System.out.println("[ 2 ] 장바구니 담기");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            categoryOrder();
            break;
         case 2:
            categoryAdd();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-카테고리-리스트-수량-결재
    * 
    * @author 성원제12
    * @param
    */
   private void categoryOrder() {
      while (true) {
         System.out.println("   결재 페이지입니다.   ");
         System.out.println();
         System.out.println("결제 메서드");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            System.out.println("결제 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-카테고리-리스트-수량-바구니담기
    * 
    * @author 성원제13
    * @param
    */
   private void categoryAdd() {
      while (true) {
         System.out.println("   바구니담기 페이지입니다.   ");
         System.out.println();
         System.out.println("바구니담기 메서드");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            System.out.println("바구니담기 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-장바구
    * 
    * @author 성원제14
    * @param
    */
   private void cartList() {
      while (true) {
         System.out.println("   장바구니 페이지입니다.   ");
         System.out.println();
         System.out.println("[ 1 ] 결재");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            cartOrder();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-장바구니보기-결재
    * 
    * @author 성원제15
    * @param
    */
   private void cartOrder() {
      while (true) {
         System.out.println("   장바구니보기 페이지입니다.   ");
         System.out.println();
         System.out.println("결재 메서드");
         System.out.println("[ 0 ] 이전화면");

         switch (iInput()) {
         case 1:
            System.out.println("결재 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * 회원 메인화면-주문내역
    * @author 길민선1
    * @param
    */
   
   private void orderedList() {
      while (true) {
         System.out.println("   주문내역 화면   ");
         System.out.println("[ 0 ] 뒤로가기");

         switch (iInput()) {
         case 1:
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * 회원 메인화면-주문내역-환불
    * @author 길민선2
    * @param
    */
   
   private void refund() {
      while (true) {
         System.out.println("   환불화면   ");
         System.out.println("[ 0 ] 뒤로가기");

         switch (iInput()) {
         case 1:
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원 메인화면-고객의 소리
    * @author 길민선3
    * @param
    */
   
   private void complain() {
      while (true) {
         System.out.println("   고객의 소리      ");
         System.out.println("[ 1 ] 글 리스트모두보기");
         System.out.println("[ 2 ] 글 등록");
         System.out.println("[ 3 ] 글 삭제");
         System.out.println("[ 4 ] 답변확인");
         System.out.println("[ 0 ] 뒤로가기");

         switch (iInput()) {
         case 1:
            allComplaintList();
            break;
         case 2:
            addComplaint();
            break;
         case 3:
            removeComplaint();
            break;
         case 4:
            readAnswer();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
         
      }

   }
   
   /**
    * // 회원 메인화면-고객의 소리-글 리스트모두보기
    * @author 길민선4
    * @param
    */
   
   private void allComplaintList() {
      while (true) {
         System.out.println("   글 리스트   ");
         System.out.println("[ 1 ] 리스트보기 메서드");
         System.out.println("[ 0 ] 뒤로가기");

         switch (iInput()) {
         case 1:
            System.out.println("리스트보기 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
         
      }

   }

   /**
    * // 회원 메인화면-고객의 소리-글작성
    * @author 길민선4
    * @param
    */
   
   private void addComplaint() {
      while (true) {
         System.out.println("   글 작성   ");
         System.out.println("등록하기 메서드");
         System.out.println("[ 0 ] 뒤로가기");

         switch (iInput()) {
         case 1:
            System.out.println("등록하기 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
         
      }

   }

   /**
    * // 회원 메인화면-고객의 소리-글삭제
    * @author 길민선5
    * @param
    */
   
   private void removeComplaint() {
      while (true) {
         System.out.println("   글 삭제   ");
         System.out.println("[ 1 ] 글 삭제");
         System.out.println("[ 0 ] 뒤로가기");

         switch (iInput()) {
         case 1:
            //글 삭제 구현하기
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * // 회원 메인화면-고객의 소리-답변확인
    * @author 길민선6
    * @param
    */
   private void readAnswer() {
      while (true) {
         System.out.println("   답변확인   ");
         System.out.println("[ 1 ] 답변확인");
         System.out.println("[ 0 ] 뒤로가기");
         switch (iInput()) {
         case 1:
            System.out.println("답변확인 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * // 회원 메인화면-마이페이지
    * @author 길민선7
    * @param
    */
   private void myPage() {
      while (true) {
         System.out.println("   마이페이지   ");
         System.out.println("[ 1 ] 포인트 충전");
         System.out.println("[ 2 ] 비밀번호 변경");
         System.out.println("[ 3 ] 포인트 빼기");
         System.out.println("[ 4 ] 주소 변경");
         System.out.println("[ 0 ] 뒤로가기");
         //마이페이지 정보 보여주기
         //정보 못가져옴
         switch (iInput()) {
         case 1:
            pointCharge();
            break;
         case 2:
            pwChange();
            break;
         case 3:
            pointRemove();
            break;
         case 4:
            addrChange();
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   
   /**
    * // 회원 메인화면-마이페이지-비번변경
    * @author 길민선8
    * @param
    */
   private void pwChange() {
      while (true) {
         System.out.println("비밀번호 변경");
         System.out.println("[ 1 ] 비밀번호 변경");
         System.out.println("[ 0 ] 뒤로가기");
         switch (iInput()) {
         case 1:
            System.out.println("비밀번호 변경 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원 메인화면-마이페이지-주소변경
    * @author 길민선9
    * @param
    */
   
   private void addrChange() {
      while (true) {
         System.out.println("   주소 변경   ");
         System.out.println("[ 1 ] 주소 변경");
         System.out.println("[ 0 ] 뒤로가기");
         switch (iInput()) {
         case 1:
            System.out.println("주소 변경 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }
   /**
    * // 회원 메인화면-마이페이지-포인트빼기
    * @author 길민선10
    * @param
    */
   
   private void pointRemove() {
      while(true){
         System.out.println("   포인트빼기      ");
         System.out.println();
         System.out.println("포인트빼기 메서드");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("포인트빼기 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원 메인화면-마이페이지-포인트충전
    * @author 길민선11
    * @param
    */
   
   private void pointCharge() {
      while(true){
         System.out.println("   포인트충전      ");
         System.out.println();
         System.out.println("포인트충전");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("포인트충전 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원 메인화면-이벤트보기
    * @author 길민선12
    * @param
    */
   
   private void eventList() {
      while(true){
         System.out.println("   이벤트보기      ");
         System.out.println();
         System.out.println("이벤트보기");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트보기");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원 메인화면-이벤트보기-이벤트선택
    * @author 길민선13
    * @param
    */
   
   private void eventSelect() {
      while(true){
         System.out.println("   이벤트선택      ");
         System.out.println();
         System.out.println("이벤트선택 메서드");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트선택 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원 메인화면-이벤트보기-이벤트선택-결재
    * @author 길민선14
    * @param
    */
   
   private void eventPay() {
      while(true){
         System.out.println("   이벤트선택-결재      ");
         System.out.println();
         System.out.println("이벤트선택-결재 메서드");
         System.out.println("[0] 이전화면");
         
         switch (iInput()) {
         case 1:
            System.out.println("이벤트선택-결재 메서드");
            break;
         case 0:
            return;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
         }
      }
   }

   /**
    * // 회원가입
    * @author 길민선15
    * @param
    */
   
   private void signin() {
      System.out.println("signin");
      
   }
}