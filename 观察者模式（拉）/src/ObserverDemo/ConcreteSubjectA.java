package ObserverDemo;

public class ConcreteSubjectA extends Subjects {
	
	public ConcreteSubjectA() {
		super();
	}

	@Override
	public void notifyobserver() {
		// TODO Auto-generated method stub
		System.out.println("AĿ�귢���仯");
		for(ObserverO obs : observers) {
			obs.reponse();
		}
	}

}
