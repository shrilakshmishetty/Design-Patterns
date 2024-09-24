package com.shri.FlyWeight;

public class Main {
	public static void main(String[] args) {
		String s="hello";
		for(char ch:s.toCharArray()) {
			CharacterInterface character=FlyWeightFactory.getCharacter(ch);
			System.out.println(character);
			character.render(20, "times");
			
		}
		
		
		
	}

}
