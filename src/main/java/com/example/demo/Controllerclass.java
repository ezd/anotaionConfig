package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass {
	@Autowired
	SallesServiceImpl sallesServiceImpl;
	@Autowired
	SallesServiceImplLocal sallesServiceImplLocal;
	@Autowired
	SallesServiceImplExport sallesServiceImplExport;
	
	@RequestMapping("/default")
	String getDefaultReport(){
		return sallesServiceImpl.report(1, "monday",true);
	}
	@RequestMapping("/local")
	String getLocalReport(){
		return sallesServiceImplLocal.report(1, "monday",true);
	}
	@RequestMapping("/export")
	String getExportReport(){
		return sallesServiceImplExport.report(1, "monday",false);
	}

}
