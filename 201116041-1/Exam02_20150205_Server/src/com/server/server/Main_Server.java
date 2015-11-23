package com.server.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main_Server {
	
	ServerSocket server;
	ArrayList<ServerThread> mSocketList = new ArrayList<ServerThread>();
	
	Main_Server(){
		System.out.println("���� ����");		
		
		try{
			server = new ServerSocket(19999);
			while(true){
				System.out.println("���� ���");
				
				Socket _soc = server.accept();
				System.out.println("���� ����");
				
				ServerThread _temp = new ServerThread(this, _soc);
				_temp.start();				
				mSocketList.add(_temp);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("��������");
	}
	
	//������ �������ѵ� �޽���(_str)�� �α׸� ������.
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
