/*
 * httpc.java
 * Distributed under terms of the MIT license.
 */
package client;

//import java.net.Socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class httpc
{
	public static void main(String[] args) {
	    System.out.println("========== Starting ==========\n");
        String server_addr = "127.0.0.1";
        // Try with resources
        try (Socket s = new Socket( server_addr, 80) ){
        	// Work with socket
		}
        catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String arg: args){
	        System.out.println(arg);
	    }
	System.out.println("\n========== Done ==========");
	}
}

