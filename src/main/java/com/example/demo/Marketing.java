package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
public class Marketing {
	@Value("${country.local}")
	String localCountryName;
	@Value("${country.export}")
	String exportCountryName;
	
	
public String getLocalCountryName() {
		return localCountryName;
	}


	public void setLocalCountryName(String localCountryName) {
		this.localCountryName = localCountryName;
	}


	public String getExportCountryName() {
		return exportCountryName;
	}


	public void setExportCountryName(String exportCountryName) {
		this.exportCountryName = exportCountryName;
	}

//display adds based on marketing id and application property and environment variable
//environment variable has precedence
String getAds(int marketingId,boolean isLocal){
	if(!isLocal) {
		return "add-"+marketingId+"-"+this.getExportCountryName();
	}else {//taking the environment variable
		return "add-"+marketingId+"-"+this.getLocalCountryName();
	}
	
}
}
