package package_VO;

public class OrderedlistVO {
	private int orderedListID;
	private int orderNumber;
	private int productID;
	private int mount;
	private boolean refund;
	
	public int getOrderedListID() {
		return orderedListID;
	}
	public void setOrderedListID(int orderedListID) {
		this.orderedListID = orderedListID;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getMount() {
		return mount;
	}
	public void setMount(int mount) {
		this.mount = mount;
	}
	public boolean isRefund() {
		return refund;
	}
	public void setRefund(boolean refund) {
		this.refund = refund;
	}
	


}
