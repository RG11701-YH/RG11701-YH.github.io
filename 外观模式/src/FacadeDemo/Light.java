package FacadeDemo;

public class Light {
    private String Position;

    public Light(String string){
    	Position = string;
    }

    public void on(){
    	System.out.println("打开"+Position+"电灯");
    }

    public void off(){
    	System.out.println("关闭"+Position+"电灯");
    }

}
