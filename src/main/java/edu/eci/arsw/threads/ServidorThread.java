package edu.eci.arsw.threads;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;

public class ServidorThread extends Thread {
	private HostBlackListsValidator hostBlackListsValidator;
	private String ip;
	private int n;


	public ServidorThread(String ip, int n){
		this.ip = ip;
		this.n = n;
	}
	public void searchOcu() {
		hostBlackListsValidator.checkHost(ip,n);
		
	}
}
