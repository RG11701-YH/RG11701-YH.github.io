package FactoryDemo_2;

public class AConV implements ACreateFV {

    public Vegetables ACreateV(){
        return new cabbage();
    }

	@Override
	public Fruit ACreateF() {
		// TODO Auto-generated method stub
		return null;
	}

}
