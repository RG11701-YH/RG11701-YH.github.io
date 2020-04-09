package FactoryDemo_2;

public class AConF implements ACreateFV {

    public Fruit ACreateF(){
        return new Apple();
    }

	@Override
	public Vegetables ACreateV() {
		// TODO Auto-generated method stub
		return null;
	}

}
