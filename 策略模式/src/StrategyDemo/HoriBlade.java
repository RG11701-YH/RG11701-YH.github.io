package StrategyDemo;

public class HoriBlade implements ICutFruit {

    public void CutStrategy(String fruitname){
    	System.out.println(fruitname + "一次被切成八片");
    }

}
