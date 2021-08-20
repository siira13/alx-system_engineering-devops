import java.util.Scanner;
public class email
{
  public static void main(String[] args) {
 	public String geEmamil;
 	Scanner scan = new Scanner(System.in);
 	geEmamil=scan.nextLine();
 	public String temp;
 	public String temp2;
 	temp=geEmamil.substring(geEmamil.indexOf(".") + 1,geEmamil.indexOf("/"));
 	temp2=geEmamil.substring(geEmamil.indexOf("~") + 1);

 	System.out.println(temp2 + "@" + temp);

 }

	
}