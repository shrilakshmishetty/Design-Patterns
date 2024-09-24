package com.shri.Bridge;

public class MacDevice implements Device{

	@Override
	public void playVideo(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Playing "+filename+" video in mac");
		
	}

	@Override
	public void playAudio(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Playing "+filename+" audio in mac");
		
	}

}
