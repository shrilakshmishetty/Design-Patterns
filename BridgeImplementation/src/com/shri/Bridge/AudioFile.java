package com.shri.Bridge;

public class AudioFile extends MediaFile{
AudioFile(Device d){
	super(d);
}

	@Override
	void play(String filename) {
		// TODO Auto-generated method stub
		d.playAudio(filename);
		
	}

}
