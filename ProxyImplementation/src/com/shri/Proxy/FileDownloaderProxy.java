package com.shri.Proxy;
import java.util.*;

public class FileDownloaderProxy implements Downloader{
	private String userName;
	 private Map<String, FileDownloader> fileDownloaders = new HashMap<>();
	 public FileDownloaderProxy(String userName){
		 this.userName=userName;
		 System.out.println(userName);
	 }

	   
		@Override
	    public void download(String filename) {
			
			if(userName.equals("admin")) {
	        if (!fileDownloaders.containsKey(filename)) {
	            FileDownloader fileDownloader = new FileDownloader();
	            fileDownloader.download(filename);
	            fileDownloaders.put(filename, fileDownloader);
	        } else {
	            System.out.println("Retrieving the already downloaded file "+ filename);
	        }
			}
			else {
				System.out.println("Access Denied");
			}
	    }

}
