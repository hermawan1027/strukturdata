import java.util.Stack;
public class kasusA { 
static String nama; 
public static void main(String[] args) { 
 System.out.println("\n");
 System.out.println("        _________________________________        \n"); 
 System.out.println("   PENGGUNAAN LIBRARY STACK PADA PEMROGRAMAN JAVA  ");
 System.out.println("        _________________________________        \n");  
 System.out.println("                      KASUS A                      ");
 System.out.println("        _________________________________        \n"); 

 Stack<String> obj_tumpukan = new Stack<String>();
 obj_tumpukan.push("MUSANG"); 
 obj_tumpukan.push(" KIJANG"); 
 obj_tumpukan.push(" JERAPAH");
 obj_tumpukan.push(" TIKUS");
 obj_tumpukan.push(" KUCING"); 
 obj_tumpukan.push(" KELINCI"); 
 obj_tumpukan.push(" AYAM");
 System.out.println("Berikut Tampilan isi stack =");
 System.out.println(obj_tumpukan);
 String hapus = obj_tumpukan.remove(3);
 System.out.println("\nStack Index yang dihapus = " + hapus);
 System.out.println("\nBerikut Hasil stack PASCA POP =");
 System.out.println(obj_tumpukan);
 System.out.println("        _________________________________        \n"); 
 }
}