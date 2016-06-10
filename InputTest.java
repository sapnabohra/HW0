import java.lang.*;
import java.io.*;

class SampleInput{
  public static void main(String args[]) throws IOException {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.print("Enter any data: ");
    String str=br.readLine();
    System.out.println("Data Entered : " + str);
    int n=Integer.parseInt(str);
    n=n+10;
    System.out.println("Added Value : " + n);
  }
}
