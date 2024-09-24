package com.shri.Bridge;

public abstract class MediaFile {
	Device d=null;
	MediaFile(Device d){
		this.d=d;
	}
	abstract void play(String filename);

}
