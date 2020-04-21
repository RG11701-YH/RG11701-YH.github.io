package CommandDemo;

import java.util.ArrayList;

public class Waitorinvoker {
	private ArrayList<Command> commands = null;
	public Waitorinvoker() {
		commands = new ArrayList<Command>();
	}
	public void SetCommand(Command cmd) {
		commands.add(cmd);
	}
	public void OrderUp() {
		System.out.println("ÓÐ¶©µ¥");
		for(Command cmd:commands) {
			if(cmd != null) {
				cmd.execute();
			}
		}
	}
}
