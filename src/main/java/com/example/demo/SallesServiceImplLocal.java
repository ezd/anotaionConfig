package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SallesServiceImplLocal implements SallesService {
	@Autowired
    Marketing marketing;
	@Autowired
    PurchaseImpl purchaseImpl;
    
    
	
	public SallesServiceImplLocal(Marketing marketing, PurchaseImpl purchaseImpl) {
		this.marketing = marketing;
		this.purchaseImpl = purchaseImpl;
	}



	@Override
	public String report(int marketingId,String date,boolean isLocal) {
		// TODO Auto-generated method stub
		return "the report in imp1 is: \n marketing:"+this.marketing.getAds(marketingId,isLocal)+"\n"
				+ "purchase:"+this.purchaseImpl.amount(date);
	}

}
