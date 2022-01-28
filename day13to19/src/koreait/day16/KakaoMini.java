package koreait.day16;

import java.security.acl.Owner;
import java.text.DecimalFormat;

public class KakaoMini extends CreditCard {
	
	public static final int MAX_LIMIT = 100000;
	
	public KakaoMini(String owner) {
		super(owner);
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,###원");
		return owner+" 님. 이번달 결제예정금액 "+df.format(payTotal)+" 원 입니다.\n[이용한도 "+df.format(limit)+" 원]";
	}

	@Override
	public int upLimit(int plus) {	//한도 5만원 , 조정금액+5만원
		if (limit+plus>MAX_LIMIT) 
			return 0;
		else {
			limit+=plus;
		return plus;
		}
	}

	@Override
	public int pay(int money) {
		if(payTotal+money>limit) return 0;
		else {
			payTotal+=money;
			return money;
		}
	}
	
	
	

}
