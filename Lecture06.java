

public class Lecture06 {
  public static void main(String[] args) {
    float a = 10.0f/3;//for low precision upto 6-7 digits after decimal point
    
    double b = 10.0f/3;//for much precision upto 15-16 digits after decimal point

    char ch = 'ञ';

    System.out.println(a);
    System.out.println(b);
    System.out.println(ch);
    System.out.println(b+ch); //what would be the error ??

    // int c =0;
    // if(c==0)//incompatible types: int cannot be converted to boolean
    //   {  
    //   System.out.println("Hello");
    // }

    System.out.println(ch);
    
    }
  
}
 