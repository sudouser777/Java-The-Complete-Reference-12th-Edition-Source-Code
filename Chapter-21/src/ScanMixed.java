// Use Scanner to read various types of data from a file. 
import java.util.*; 
import java.io.*; 
 
class ScanMixed { 
  public static void main(String[] args) 
    throws IOException { 
 
    int i; 
    double d; 
    boolean b; 
    String str; 
 
    // Write output to a file. 
    FileWriter fout = new FileWriter("test.txt"); 
    fout.write("Testing Scanner 10 12.2 one true two false"); 
    fout.close(); 
 
    FileReader fin = new FileReader("Test.txt"); 
 
    Scanner src = new Scanner(fin); 
 
 
    // Read to end. 
    while(src.hasNext()) { 
      if(src.hasNextInt()) { 
        i = src.nextInt(); 
        System.out.println("int: " + i); 
      } 
      else if(src.hasNextDouble()) { 
        d = src.nextDouble(); 
        System.out.println("double: " + d); 
      } 
      else if(src.hasNextBoolean()) { 
        b = src.nextBoolean(); 
        System.out.println("boolean: " + b); 
      } 
      else { 
        str = src.next(); 
        System.out.println("String: " + str); 
      } 
    } 
 
    src.close(); 
  } 
}