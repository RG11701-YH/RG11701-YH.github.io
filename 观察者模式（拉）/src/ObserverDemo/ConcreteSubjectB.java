package ObserverDemo;

public class ConcreteSubjectB extends Subjects {
	
	public ConcreteSubjectB() {
		super();
	}

	@Override
	public void notifyobserver() {
		// TODO Auto-generated method stub
		System.out.println("BĿ�귢���仯");
		for(ObserverO obs : observers) {
			obs.reponse();
		}
	}

}
