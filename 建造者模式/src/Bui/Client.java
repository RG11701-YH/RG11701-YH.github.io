package Bui;

public class Client {
	public static void main(String[] args) {
		//��̬ȷ���ײ�����
		MealBuilder mb = (MealBuilder)XMLUtil.getBean();
		//����Ա��ָ����
		KFCWaiter waiter = new KFCWaiter();
		//����Ա׼���ײ�
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
