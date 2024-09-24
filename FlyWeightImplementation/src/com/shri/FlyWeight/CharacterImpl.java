package com.shri.FlyWeight;

public class CharacterImpl implements CharacterInterface {
	private char ch;
	
	public CharacterImpl(char ch){
		this.ch=ch;
	}
	public char getChar(char ch) {
		return ch;
	}

	@Override
	public void render(int size, String fontStyle) {
		// TODO Auto-generated method stub
		System.out.println("Charcter "+ch+" has fontstyle "+fontStyle+" and is of fontsize "+size);
		
	}
	
	

}
