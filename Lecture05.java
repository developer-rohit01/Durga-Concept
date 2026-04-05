

public class Lecture05 {
  public static void main(String[] args) {
     int a =true; //incompatible types: boolean cannot be converted to int
     int b=2147483648; //integer no too large 
     int c =21474836477L; //incompatible types: possible lossy conversion from long to int
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);

  }
  
  
}
