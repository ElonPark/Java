package Notepad;

//=======================================
// 윈도우 메세지 & 다이알로그 박스
//=======================================

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MessageBox extends WindowAdapter implements ActionListener // ActionListener 인터페이스 구현입니다.
{
	private FileDialog fd; // FileDiaog의 객체 fd 선언
	private Dialog dl; // Dialog의 객체 dl 선언
	private File dirFile; // Fire에 객체의 dirfire 선언
	private Panel panel1, panel2; // Panel 객체 Panel1, Panel2 선언
	private Label lblStateMsg, lblQuestMsg; // Label 객체
	private Button btnOk, btnNo, btnCancel; // Button 객체 btnOk, btnNo, btnCancel 선언

	private final String defaultMsg01 = " 파일의 내용이 변경되었습니다"; // 기본메세지 셋팅입니다.
	private final String defaultMsg02 = " 변경된 내용을 저장하시겠습니까"; // 기본메세지 셋팅입니다.
	private String path = "d:\\temp\\test";
	private String file = "제목 없음";

	//========================================================
	// 이 벤 트 핸 들 러 모 음
	//========================================================

	//--------------------------------------------------------
	// 윈 도 우 이 벤 트 핸 들 러 ( 어 댑 터 )
	//--------------------------------------------------------
	public void windowClosing(WindowEvent we) {// 종료 이벤트 발생시
		dl.setVisible(false);// dialog를 보이지 않게함
		dl.dispose();// di 해제입니다.
	}

	//--------------------------------------------------------
	// 액 션 이 벤 트 핸 들 러
	//--------------------------------------------------------
	public void actionPerformed( ActionEvent ae) {//버튼이 눌러졌을때 호출입니다.
		String itemPressed = ae.getActionCommand();//itemPressed에 이벤트로 발생한 액션명령어 등록입니다.

		if ( itemPressed.equals(" 예 ") ) { //itemPressed가 "예" 라고 합니다.
			dl.setVisible(false);//dl 개개체 visible 에 false 저장입니다.
			dl.dispose();//di 해제입니다.

			try {
				if ( file.equals("제목 없음") )   { //file 변수에 담김 데이터가 제목 없음과 같습니다.
					String strReturn = saveFileDialog(); //saveFileDialog() 호출입니다.

					if ( strReturn != null )   { //strReturn 에 담긴 데이터가 null 가 같습니다.
						file = strReturn; //file 변수에 strReturn 데이터 복사입니다.
						saveFile(path, file);  //saveFile 메소드 호출입니다.
					}       
				}
				else   {
					saveFile(path, file); //strReturn 이 null 이면 saveFile 호출입니다.
				}

				file = "제목 없음"; //file 변수에 제목 없음 저장입니다.
				Notepad.txtArea.setText(null); //Notepad 겍체 txtArea 의 Text 변수에 null 저장입니다.        
			}
			catch ( FileNotFoundException e1 ) {} //파일을 찾지 못했을 발생되는 오류를 처리 하기 위한 부분입니다.
			catch ( IOException e2 ) {} //파일 관련 다른 오류를 처리 하기 위한 부분입니다.
		}

		if ( itemPressed.equals("   아니오   ") ) { //itemPressed 가 아닙니다.
			file = "제목 없음"; //file 변수에 제목 없음 저장입니다.
			Notepad.frame.setTitle(file + Notepad.progName); //Notepad 객채 frame 의 Title 변수에 file + Notepad.ProgName 저장입니다.
			Notepad.txtArea.setText(null); //Notepad 겍체 txtArea 의 Text 변수에 null 저장입니다.        

			Notepad.editState = false; //Notepad.editState 를 false 로 변경입니다.
			dl.setVisible(false); //dl 개개체 visible 에 false 저장입니다.
			dl.dispose();   //dl 해제입니다.
		}

		if ( itemPressed.equals("    취소    ") )  { //itemPressed 가 취소입니다.   
			dl.setVisible(false); //dl 개개체 visible 에 false 저장입니다.
			dl.dispose(); // 해제입니다.
		}
	}

	//--------------------------------------------------------

	public void setOpenDialogbox () {  
		if ( Notepad.curFilename.equals("제목 없음") ) //Notepad.curFileName 이 제목 없음 입니다.
			lblStateMsg.setText(Notepad.curFilename + defaultMsg01);  //lblStateMsg 의 text 를 Notepad.curFilename + defaultMsg01 저장입니다.
		else    
			lblStateMsg.setText(getFileinfo() + defaultMsg01);  //Notepad.curFileName 이 제목 없음 아니면 getFileinfo() + defaultMsg01 저장입니다.

		dl.setVisible(true); //dl 객체 visible true 로 변경입니다.
	}

	public String getPathinfo () {
		return path; //path 반환입니다.
	}

	public String getFileinfo () {
		return file; //file 반환입니다.
	}

	public void openFile ( String path, String file ) throws FileNotFoundException, IOException {
		String strFile = path + file;

		FileInputStream fis ;
		ByteArrayOutputStream baos ;

		try {
			fis = new FileInputStream(strFile); //strFile 경로에 있는 파일로 FileInputStream 생성입니다.
			baos = new ByteArrayOutputStream(); //ByteArrayOutputStream 생성입니다.

			int i = 0;
			while( (i = fis.read()) != -1 ) { //fis 를 읽으면서 읽어 들인 양이 -1 이 될때까지 반복입니다.
				baos.write(i);  //읽어 드린 데이터를 ByteArrayOutputStream 에 저장입니다.
			}

			Notepad.txtArea.setText(baos.toString()); //Notepad 겍체 txtArea 의 Text 변수에 baos.toString() 값 저장입니다.        
			fis.close(); //fis 닫기입니다.
			baos.close(); //baos 닫기입니다.     
		}
		catch(FileNotFoundException fnfe)   {  //파일을 찾지 못했을 발생되는 오류를 처리 하기 위한 부분입니다.
			System.out.println("File Not Found!");
		}
		catch(IOException ioe)   {  //파일 관련 다른 오류를 처리 하기 위한 부분입니다.
			System.out.println("I/O error!"); 
		}
	} 
	public void saveFile ( String path, String file ) throws FileNotFoundException, IOException  { // 위 메소드는 예외처리가 걸려져 있습니다.

		String saveFile = path + file; // 파일 path + fire 파일 저장입니다.

		PrintWriter pWriter = new PrintWriter(new BufferedWriter(new FileWriter(saveFile))); // 위 파일에 쓸꺼입니다.
		pWriter.write(Notepad.txtArea.getText()); // 거기에 저장입니다.
		pWriter.close(); 
	}

	public String openFileDialog ()  {
		if ( fd != null ) { // 파일을 열었을 때 null 이 아니라면 보여주기 위함입니다.
			fd.setVisible(false);
			fd.dispose();      
		} 

		fd = new FileDialog(Notepad.frame, "열기", FileDialog.LOAD); //파일을 열기 버튼 눌렀을시에 Load를 불러옵니다.

		fd.setDirectory(path);  
		fd.setVisible(true);     

		path = fd.getDirectory(); // 열으려는 파일의 path (경로) 로 초기화입니다.
		file = fd.getFile();   // 그 파일을 file에 초기화입니다.

		return file;  // 파일입니다.
	}

	public String saveFileDialog () throws FileNotFoundException, IOException {// 파일을 저장하기위한 메소드입니다.


		if ( fd != null ) { // 파일을 열었을 때 null 이 아니라면 보여주기 위함입니다.
			fd.setVisible(false);
			fd.dispose();      
		} 

		fd = new FileDialog(Notepad.frame, "다른 이름으로 저장", FileDialog.SAVE);
		// 버튼 누르면 다른 이름으로 저장나오고 저장하는 역할입니다. 


		fd.setDirectory(path);  //fd 개개체 Directory에 path를 저장입니다.
		fd.setVisible(true);     //ture 선언을 통해 메모장 생성했을때 위에 선언한 것을 보여줍니다.


		//이 두 친구는 위와 같습니다.
		path = fd.getDirectory();
		file = fd.getFile();   

		return file; // 저장하려는 파일입니다.
	}

	MessageBox () {  
		dl = new Dialog(Notepad.frame, "메모장", true);// dl이 Dialog인데 전역으로 잡혔습니다.
		dl.addWindowListener(this);       

		panel1 = new Panel(); // pannel이라는 객체가있습니다.
		panel2 = new Panel();
		lblStateMsg = new Label(defaultMsg01); // 기본 메세지 셋팅
		lblQuestMsg = new Label(defaultMsg02);  // 기본 메세지 셋팅
		btnOk = new Button("     예     ");
		btnOk.addActionListener(this); // 버튼 ok가 역할을 할 수 있게 되었습니다.
		btnNo = new Button("   아니오   ");
		btnNo.addActionListener(this); // no 역할입니다.
		btnCancel = new Button("    취소    ");
		btnCancel.addActionListener(this);     // 취소 역할입니다. 

		panel1.setLayout(new BorderLayout());
		panel1.add(lblStateMsg, "North");
		panel1.add(lblQuestMsg, BorderLayout.CENTER);
		// pannel 셋팅하고 North나 중앙에 위치하도록 합니다. 





		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panel2.add(btnOk);
		panel2.add(btnNo);
		panel2.add(btnCancel);
		// 판넬도 flowlayout에서는 중앙에 오도록, 양옆 10 간격주고 버튼 셋팅입니다. 


		dl.add(panel1, "North"); // dialog에 panel1을 북쪽에 추가
		dl.add(panel2, "South");  // dialog에 panel2을 남쪽에 추가

		dl.setResizable(false); // 위에 지정한 대로 하고, 사이즈 바꾸지 않음.
		dl.pack();  // 셋팅
	}
}
