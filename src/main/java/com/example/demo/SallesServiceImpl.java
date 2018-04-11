package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SallesServiceImpl implements SallesService {
	@Autowired
    Marketing marketing;
	@Autowired
	@Qualifier("purchaseImpl")
    Purchase purchase;
    
    
	
	public SallesServiceImpl(Marketing marketing, @Qualifier("purchaseImpl") Purchase purchase) {
		this.marketing = marketing;
		this.purchase = purchase;
	}



	@Override
	public String report(int marketingId,String date,boolean isLocal) {
		// TODO Auto-generated method stub
		return "the report in imp1 is: \n marketing:"+this.marketing.getAds(marketingId,isLocal)+"\n"
				+ "purchase:"+this.purchase.amount(date);
	}

}
