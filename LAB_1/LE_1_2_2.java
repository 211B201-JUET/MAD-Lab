public class Main {
  public static void main(String[] args){
      int i,j;
      for(i=4;i>=1;--i) {
        for(j=1;j<=4-i;++j) {
            System.out.print("  "); }
    for(j=i;j<=2*i-1;++j) {
        System.out.print("* "); }
    for(j=0;j<i-1;++j) {
        System.out.print("* "); }
    System.out.println();   }
  }
}