package FacadeDemo;

public class Light {
    private String Position;

    public Light(String string){
    	Position = string;
    }

    public void on(){
    	System.out.println("��"+Position+"���");
    }

    public void off(){
    	System.out.println("�ر�"+Position+"���");
    }

}
