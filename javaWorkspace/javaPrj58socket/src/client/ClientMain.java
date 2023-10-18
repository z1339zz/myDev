package client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception {

		// 스캐너 준비
		Scanner sc = new Scanner(System.in);

		System.out.println("=====client=====");

		// 소켓 연결 (발신)
		Socket socket = new Socket("192.168.40.6", 12345);

		// 소켓 스트림 준비
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();

		// 스트림 준비 (수신)
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);

		// 스트림 준비 (발신)
		PrintStream ps = new PrintStream(out);
		
		while (true) {
			// 데이터 수신
			String rcvMsg = br.readLine();
			System.out.print("서버한테 받은 메세지 : " + rcvMsg);
			
			// 데이터 발신
			System.out.print("보낼 메세지 : ");
			String msg = sc.nextLine();
			ps.println(msg);

		}

	}

}
