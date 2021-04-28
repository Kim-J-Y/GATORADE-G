package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Controller controller = null;
		String packageName= this.getClass().getPackage().getName();
		String classInfo = new StringBuilder(packageName).append(command).toString();
		controller = (Controller) Class.forName(classInfo).newInstance();
		return controller;
	}
}
