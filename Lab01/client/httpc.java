/*
 * httpc.java
 * Distributed under terms of the MIT license.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;


public class httpc
{
	public static void main(String[] args) throws UnknownHostException {
	    System.out.println("========== Starting ==========\n");
            for (String val : args){
                System.out.println(val);
            }
        String server_name = "127.0.0.1";

        // Try with resources
        try (Socket socket = new Socket( server_name, 8000);
        		PrintWriter out = new PrintWriter( socket.getOutputStream(), true );
        		BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
        		BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
        		){ 
        	// Wrap output byte stream with PrintWriter to be 
        	//	able to avoid conversion of strings to byte arrays
        	// What does the second argument do in PrintWriter?
        	out.println("GET / HTTP/1.1");
        	out.println("Host: " + server_name);
        	out.println();
        	System.out.println("Sent data to server. Waiting for response.");
        	
        	String userInput;
        	while (( (userInput = in.readLine() ) != null)) {
        	    System.out.println(userInput);
        	}
		}
        catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	System.out.println("\n========== Done ==========");
	}
}

