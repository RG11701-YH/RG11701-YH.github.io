package DecoratorDemo;

public class Cake implements IBirthdayCake {

    public Cake(){
    	System.out.println("Cake blank was created.");
    }

    public void Show(){
        System.out.println("Cake Blank");
    }

}
