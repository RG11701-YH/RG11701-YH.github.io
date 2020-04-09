package FactoryDemo_2;

public class BConV implements BCreateFV {

    public Vegetables BCreateV(){
        return new tomato() ;
    }

	@Override
	public Fruit BCreateF() {
		// TODO Auto-generated method stub
		return null;
	}

}
