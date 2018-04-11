package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SallesServiceImplExport implements SallesService {
	@Autowired
    Marketing marketing;
	@Autowired
    PurchaseImpl2 purchaseImpl2;
    
    
	
	public SallesServiceImplExport(Marketing marketing, PurchaseImpl2 purchaseImpl2) {
		this.marketing = marketing;
		this.purchaseImpl2 = purchaseImpl2;
	}



	@Override
	public String report(int marketingId,String date,boolean isLocal) {
		// TODO Auto-generated method stub
		return "the report in imp1 is: \n marketing:"+this.marketing.getAds(marketingId,isLocal)+"\n"
				+ "purchase:"+this.purchaseImpl2.amount(date);
	}

}
