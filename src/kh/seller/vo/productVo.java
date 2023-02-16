package kh.seller.vo;

public class productVo {
	
	/* 필드 8개
	PRODUCT_ID VARCHAR2(20) PRIMARY KEY,
	PRODUCT_NAME VARCHAR2(50) NOT NULL,
	PRODUCT_PRICE NUMBER(20) NOT NULL,
	DISCOUNT_RATE NUMBER(20),
	DISCOUNT_PRICE NUMBER(20),
	SELLING_STATUS VARCHAR2(20),
	PRODUCT_DESCRIPTION VARCHAR2(3000),
	IMAGE_ADDRESS VARCHAR2(512) */
	
	private String productId = null;
	private String productName = null;
	private double productPrice = 0.0;
	private double discountRate = 0.0;
	private double discountPrice = 0.0;
	private String sellingStatus = null;
	private String productDescription = null;
	private String imageAddress = null;

	public productVo() {}

	@Override
	public String toString() {
		return "productVo [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", discountRate=" + discountRate + ", discountPrice=" + discountPrice + ", sellingStatus="
				+ sellingStatus + ", productDescription=" + productDescription + ", imageAddress=" + imageAddress + "]";
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getSellingStatus() {
		return sellingStatus;
	}

	public void setSellingStatus(String sellingStatus) {
		this.sellingStatus = sellingStatus;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getImageAddress() {
		return imageAddress;
	}

	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}
	
	
	
	
}
