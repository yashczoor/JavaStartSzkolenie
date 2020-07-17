package application;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;

public class Scripter {
	public static void main(String[] args) {
		ScriptEngine jsEngine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			jsEngine.eval("print('Hello World JS2!');");
		} catch (ScriptException e	) {
			e.printStackTrace();
		}
	}
}
