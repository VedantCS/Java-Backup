package hello_wrld;

public class This {
int a=10;
int b=12;
public This(int x,int y) {
	this.a+=x;
	this.b+=y;
}
void display()
{
	System.out.println("Changes are as follows:"+"\n"+a+"\n"+b);
}
public static void main(String[] args) {
	This var=new This(10,12);
	var.display();
	
}
}
