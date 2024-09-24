package com.shri.Facade;

public class HomeAutomationFacade {
	private Lighting light;
	private Heating heat;
	private Security sec;
	
	HomeAutomationFacade(){
		this.light=new Lighting();
		this.heat=new Heating();
		this.sec=new Security();
	}
	public void enterHome() {
		light.onLight();
		heat.onHeat();
		sec.securityOff();
	}
	public void leaveHome() {
		light.offLight();
		heat.offHeat();
		sec.securityOn();
	}

}
