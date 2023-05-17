public class Main
{
	public static void main(String[] args) {
		Mother m=new Mother();
        m.show();
        Child ch=new Child();
        ch.show();
    }
}
class Mother{
    int x;
    void show(){
        System.out.println("Hello");
    }
}
class Child extends Mother{
    
}
class Application{

}