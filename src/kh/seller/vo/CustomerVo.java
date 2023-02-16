package kh.seller.vo;

import java.sql.Date;

public class CustomerVo {

/*
			ORDER_ID VARCHAR2(20) PRIMARY KEY,
			ORDER_NAME VARCHAR2(20) NOT NULL,
			SALE_PRICE NUMBER(20),
			SALE_DATE DATE,
			ORDER_STATUS VARCHAR2(20),
			CONSTRAINTS PRODUCT_ID FOREIGN KEY (PRODUCT_ID) 
			REFERENCES SHOP_PRODUCT(PRODUCT_ID)
			);
*/
	
	private String orderId = null;
	private String orderName = null;
	private double salePrice = 0.0;
	private Date saleDate = null;
	private String orderStatus = null;
	private int product_id = 0;
	@Override
	public String toString() {
		return "customerVo [orderId=" + orderId + ", orderName=" + orderName + ", salePrice=" + salePrice
				+ ", saleDate=" + saleDate + ", orderStatus=" + orderStatus + ", product_id=" + product_id + "]";
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
}
