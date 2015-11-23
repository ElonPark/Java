import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ms949Utf8Decoder {
	public static void main(String[] args) {

		if (args.length == 0) {                   // args.length 는 옵션 개수
			System.err.println("Input Filename...");
			System.exit(1);                         // 읽을 파일명을 주지 않았을 때는 종료
		}

		String outFilename = args[0] + ".uni";    // 출력 파일명 만들기, uni 라는 확장자를 붙여서


		try {
			////////////////////////////////////////////////////////////////
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(args[0]),
							"MS949"
							)
					);

			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(outFilename),
							"UTF-8"
							)
					);


			String s;

			while ((s = in.readLine()) != null) {
				out.write(s); out.newLine();
			}

			in.close(); out.close();
			////////////////////////////////////////////////////////////////
		} catch (IOException e) {
			System.err.println(e); // 에러가 있다면 메시지 출력
			System.exit(1);
		}


	}
}
