
public class Calculator {
public double operandOne;
public double operandTwo;
public String operation;
public double result;



public void setOperandOne(double num) {
	this.operandOne = num;
}

public void setOperation(String sign) {
	this.operation = sign;
}

public void setOperandTwo(double num) {
	this.operandTwo = num;
}

public void performOperation() {
	if (this.operation == "+") {
		result = (this.operandOne + this.operandTwo);
	} else if(this.operation == "-") {
		result = (this.operandOne - this.operandTwo);
	} else {
		System.out.println("Go away!");
	}
}

public double getResult() {
	
	return this.result;
}
}