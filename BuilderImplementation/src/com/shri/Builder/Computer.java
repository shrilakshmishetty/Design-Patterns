package com.shri.Builder;

public class Computer {
	private String cpu;
	private String ram;
	private String storage;
	private String graphicsCard;
	private String OS;
	
	
	private Computer(Builder build) {
		this.cpu=build.cpu;
		this.ram=build.ram;
		this.storage=build.storage;
		this.graphicsCard=build.graphicsCard;
		this.OS=build.OS;
		
	}
	@Override
	public String toString() {
		return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", OS='" + OS + '\'' +
                '}';
		
	}
	static class Builder{
		private String cpu;
		private String ram;
		private String storage;
		private String graphicsCard;
		private String OS;
		
		public Builder() {
			
		}

		public Builder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
			
		}
		
		public Builder setRam(String ram) {
			this.ram = ram;
			return this;
		}

		public Builder setStorage(String storage) {
			this.storage = storage;
			return this;
		}

		public Builder setGraphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}

		public Builder setOS(String OS) {
			this.OS = OS;
			return this;
		}
		
	   public Computer build() {
		   return new Computer(this);
		  
		   
	   }
		
		
		
	}

}
