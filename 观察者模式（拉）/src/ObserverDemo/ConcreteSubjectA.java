package ObserverDemo;

public class ConcreteSubjectA extends Subjects {
	
	public ConcreteSubjectA() {
		super();
	}

	@Override
	public void notifyobserver() {
		// TODO Auto-generated method stub
		System.out.println("A目标发生变化");
		for(ObserverO obs : observers) {
			obs.reponse();
		}
	}

}
