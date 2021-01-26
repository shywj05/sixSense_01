package Method;

//장바구니
public class ShopListVO {
	private int shopListID;//장바구니 고유번호 pk
	private String customer_ID;//손님 아이디fk
	private String product_ID;//재고 아이디fk
	private int mount;//장바구니 물건 수량
	
	
	public int getShopListID() {
		return shopListID;
	}


	public void setShopListID(int shopListID) {
		this.shopListID = shopListID;
	}


	public String getCustomer_ID() {
		return customer_ID;
	}


	public void setCustomer_ID(String customer_ID) {
		this.customer_ID = customer_ID;
	}


	public String getProduct_ID() {
		return product_ID;
	}


	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}


	public int getMount() {
		return mount;
	}


	public void setMount(int mount) {
		this.mount = mount;
	}


	@Override
	public String toString() {//재품, 재품 수량 확인
		return " shopListID=" + shopListID + ", mount=" + mount ;
	}
	
	
}
