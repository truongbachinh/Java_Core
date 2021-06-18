/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package socket;

/**
 *
 * @author ManhHung
 */
import java.io.*;
import java.net.*;
public class ReverseSocketClient {
   public static void main(String[] args) {
      BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
      PrintStream out = System.out;
      try {
         Socket c = new Socket("localhost",8888);
         printSocketInfo(c);
         BufferedWriter w = new BufferedWriter(new OutputStreamWriter(
            c.getOutputStream()));
         BufferedReader r = new BufferedReader(new InputStreamReader(
            c.getInputStream()));
         String m = null;
         while ((m=r.readLine())!= null) {
            out.println(m);
            m = in.readLine();
            w.write(m,0,m.length());
            w.newLine();
            w.flush();
         }
         w.close();
         r.close();
         c.close();
      } catch (IOException e) {
         System.err.println(e.toString());
      }
   }
   private static void printSocketInfo(Socket s) {
      System.out.println("Remote address = "
         +s.getInetAddress().toString());
      System.out.println("Remote port = "
         +s.getPort());
      System.out.println("Local socket address = "
         +s.getLocalSocketAddress().toString());
      System.out.println("Local address = "
         +s.getLocalAddress().toString());
      System.out.println("Local port = "
         +s.getLocalPort());
   }
}



