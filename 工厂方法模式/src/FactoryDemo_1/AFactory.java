package FactoryDemo_1;

public class AFactory extends Factory {

    public Fruit CreateFruit(){
    	return new Apple();
    }

}
