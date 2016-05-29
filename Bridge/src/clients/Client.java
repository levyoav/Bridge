package clients;

import abstracts.Abstraction;
import abstracts.RefinedAbstraction;

public class Client {
	public static void main(String[] args) {
		/*
		 * Client chooses to instantiate an Object of Abstraction as a RefinedAbstraction
		 * object to use its implementation. 
		 */
		Abstraction abs = new RefinedAbstraction();
		
		/*
		 * Loading the Implementor class that was chosen to implement the methods of
		 * RefinedAbstraction.
		 */
		abs.loadImplementor();
		
		/*
		 * Invoking the operationImp() method of ConcreteImplementor via the operation()
		 * method of class Abstraction.
		 */
		abs.operation();
	}
}
