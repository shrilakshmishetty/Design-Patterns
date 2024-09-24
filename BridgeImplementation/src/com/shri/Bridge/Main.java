package com.shri.Bridge;

public class Main {
	public static void main(String[] args) {
		MediaFile windowAudio=new VideoFile(new WindowsDevice());
		windowAudio.play("hello1.mp3");
		MediaFile windowVideo=new AudioFile(new WindowsDevice());
		windowVideo.play("hello2.mp4");
		MediaFile macAudio=new AudioFile(new MacDevice());
		macAudio.play("hello3.mp3");
		MediaFile macVideo=new VideoFile(new MacDevice());
		macVideo.play("hello4.mp4");
	}

}
