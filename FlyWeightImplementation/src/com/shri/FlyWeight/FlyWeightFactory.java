package com.shri.FlyWeight;
import java.util.HashMap;

public class FlyWeightFactory {
	
	static HashMap<Character,CharacterImpl> mp=new HashMap<>();
	public static CharacterImpl getCharacter(char c) {
		CharacterImpl ch=mp.get(c);
		if(ch==null) {
			ch=new CharacterImpl(c);
			mp.put(c, ch);
		}
		return ch;
	}

	

}
