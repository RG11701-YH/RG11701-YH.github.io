//对象适配器模式
package AdapterDemo;

public class Adapter implements InewJuicer {
	private OldJuicer oldjuicer;

    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	oldjuicer = new OldJuicer();
    	String str = "混合果汁："+oldjuicer.oldPort(fruit1)+"果汁和 "+oldjuicer.oldPort(fruit2)+"果汁。";
        return str;
    }

}
