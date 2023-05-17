public class Main
{
	public static void main(String[] args) {
	    int i,j,r=4;
	    for(i=1;i<=r;i++){
	        for(j=1;j<=(r-i);j++) {
	            System.out.print(" ");    }
	        for(j=1;j<=i;j++){
	            System.out.print(" *");    }
	        System.out.println(" ");    }
	}
}
