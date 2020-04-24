package ObserverDemo;

public class ConcreteSubjectB extends Subjects {
	
	public ConcreteSubjectB() {
		super();
	}

	@Override
	public void notifyobserver() {
		// TODO Auto-generated method stub
		System.out.println("B目标发生变化");
		for(ObserverO obs : observers) {
			obs.reponse();
		}
	}

}
