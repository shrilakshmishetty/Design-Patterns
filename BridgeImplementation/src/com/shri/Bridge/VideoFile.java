package com.shri.Bridge;

public class VideoFile extends MediaFile

{
	VideoFile(Device d){
		super(d);
	}

	@Override
	void play(String filename) {
		// TODO Auto-generated method stub
		d.playVideo(filename);
		
	}

}
