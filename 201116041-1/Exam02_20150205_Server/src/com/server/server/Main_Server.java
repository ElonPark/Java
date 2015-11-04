package com.server.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main_Server {
	
	ServerSocket server;
	ArrayList<ServerThread> mSocketList = new ArrayList<ServerThread>();
	
	Main_Server(){
		System.out.println("서버 실행");		
		
		try{
			server = new ServerSocket(19999);
			while(true){
				System.out.println("유저 대기");
				
				Socket _soc = server.accept();
				System.out.println("유저 접속");
				
				ServerThread _temp = new ServerThread(this, _soc);
				_temp.start();				
				mSocketList.add(_temp);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("서버종료");
	}
	
	//접속한 유저들한데 메시지(_str)를 싸그리 보낸다.
	public void broadcast(String _str){
		for(int i=0 ; i<mSocketList.size() ; i++){
			try{
				mSocketList.get(i).sendMsg(_str);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static void main(String args[]){
		new Main_Server();
		
	}
}
