//��������ģʽ
package AdapterDemo;

public class Adapter extends OldJuicer implements InewJuicer {

    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	String str = "��Ϲ�֭��"+oldPort(fruit1)+"��֭�� "+oldPort(fruit2)+"��֭��";
        return str;
    }

}
