package koreait.day16;

public abstract class CreditCard {
	// 부모클래스는 자식클래스가 사용하도록 protected로 합니다
	protected String owner;	//소유자
	protected int limit;	//이용한도
	protected int payTotal;	//결제금액
	
	public CreditCard(String owner) {	//owner필드값을 저장하는 커스텀 생성자 정의
		this.owner=owner;
	}
	
	//getter
	public int getLimit() {	
		return limit;
	}
	public String getOwner() {
		return owner;
	}
	public int getPayTotal() {
		return payTotal;
	}
	
	public abstract int upLimit(int plus);
	public abstract int pay(int money);
	
	
	
	
	
	
	
}
