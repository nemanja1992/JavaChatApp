package Server;

import javax.swing.JFrame;

public class ServerTest {

	public static void main(String[] args) {
		Server co= new Server();
		co.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		co.startRunning();

	}

}
