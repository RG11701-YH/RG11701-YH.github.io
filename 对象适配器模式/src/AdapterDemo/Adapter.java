//����������ģʽ
package AdapterDemo;

public class Adapter implements InewJuicer {
	private OldJuicer oldjuicer;

    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	oldjuicer = new OldJuicer();
    	String str = "��Ϲ�֭��"+oldjuicer.oldPort(fruit1)+"��֭�� "+oldjuicer.oldPort(fruit2)+"��֭��";
        return str;
    }

}
