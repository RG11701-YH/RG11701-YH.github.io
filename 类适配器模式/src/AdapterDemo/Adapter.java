//类适配器模式
package AdapterDemo;

public class Adapter extends OldJuicer implements InewJuicer {

    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	String str = "混合果汁："+oldPort(fruit1)+"果汁和 "+oldPort(fruit2)+"果汁。";
        return str;
    }

}
