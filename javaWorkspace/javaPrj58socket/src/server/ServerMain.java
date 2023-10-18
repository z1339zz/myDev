package server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception {

		//스케너 준비
		Scanner sc = new Scanner(System.in);

		System.out.println("====서버=====");

		// 서버 소켓 생성(연결 받을 수 있음)
		ServerSocket serverSocket = new ServerSocket(12345); //포트번호

		// 연결 대기하기
		System.out.println("연결 대기중...");
		Socket socket = serverSocket.accept();
		InetAddress inetAddr = socket.getInetAddress();
		System.out.println(inetAddr + "연결됨");

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
			String str = br.readLine();
			System.out.print("클라이언트가 보낸 메세지 : " + str);

			// 데이터 발신
			System.out.print("보낼 메세지 : ");
			String msg = sc.nextLine();
			ps.println(msg);
		}

	}

}
