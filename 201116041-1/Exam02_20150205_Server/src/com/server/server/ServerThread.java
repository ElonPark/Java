package com.server.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	Socket mSocket;
	Main_Server mServer;
	
	BufferedReader in;
	PrintWriter pw;
	
	String mMsg;
	
	ServerThread(Main_Server _server, Socket _soc){
		mSocket = _soc;
		mServer = _server;
		
		try{
			in = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
			pw = new PrintWriter(mSocket.getOutputStream(), true);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void run(){
		
		while(true){
			try{
				mMsg = in.readLine();
				mServer.broadcast(mMsg);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void sendMsg(String _str){
		pw.println(_str);
	}

}
