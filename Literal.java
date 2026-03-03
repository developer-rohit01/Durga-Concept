
public class Literal {
  public static void main(String[] args) {
    int a =200; //Decimal form of Integral Literal allowed = 0 t0 9
    int b =010;//Octal form of Integral Literal allowed = 0 to 7
    int c =0x200;//HexaDecimal form of Integral Literal , should be prefixed with OX
    int e=0XFace;//HexaDecimal form of Integral Literal , should be prefixed with OX
//What is the meaning of Face in OXFace 
    int d = a+b+c;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);


    int String =10;
    System.out.println(String);

    
  }
}
