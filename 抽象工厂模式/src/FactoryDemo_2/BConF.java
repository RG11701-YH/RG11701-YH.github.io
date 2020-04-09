package FactoryDemo_2;

public class BConF implements BCreateFV {

    public Fruit BCreateF(){
        return new Banana();
    }

	@Override
	public Vegetables BCreateV() {
		// TODO Auto-generated method stub
		return null;
	}

}
