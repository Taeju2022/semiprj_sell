package kh.seller.vo;

public class sellerVo {
	
	private String sellerId = null;
	private String sellerPassword = null;
	
	public sellerVo() {}

	@Override
	public String toString() {
		return "sellerVo [sellerId=" + sellerId + ", sellerPassword=" + sellerPassword + "]";
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerPassword() {
		return sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}
	
}
