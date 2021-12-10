package org.run;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.Loginpage;

import newTest.PageNum1;
import newTest.PageNum2;
import newTest.PageNum3;
import newTest.PageNum4;

public class HotelLogin extends BaseClass {
	
	public static void main(String[] args) {
		
		launchbrowser();
		LoadUrl("https://adactinhotelapp.com/");
		Loginpage lp = new Loginpage();
		insert(lp.getTxtname(), "sarahema");
		insert(lp.getPwds(),"Sarath@123");		
		click(lp.getLogin());
		ImplicitWait();
		Select1();
		Select2();
		Select3();
		Select4();
		PageNum1 P1 = new PageNum1();
		insert(P1.getCheckIn(),"08/12/2021");
		insert(P1.getCheckout(),"08/14/2021");
		Select5();
		Select6();
		click(P1.getP1sumbit());
		PageNum2 P2 = new PageNum2();
		click(P2.getRadio());
		click(P2.getContinue1());
		PageNum3 p3 = new PageNum3();
		insert(p3.getFirstname(),"Arun");
		insert(p3.getLastname(),"Palani");
		insert(p3.getAddress(),"No.5 C.CG COLONY 2ND STREET ROYAPURAM");
		insert(p3.getCardno(),"1111222233334444");
		cctype();
		month();
		year();
		insert(p3.getCcv(),"123");
		click(p3.getBooknow());
		ImplicitWait();
		PageNum4 p4 = new PageNum4();
		click(p4.getLogout());
		
		
		
	
	}
	

}
