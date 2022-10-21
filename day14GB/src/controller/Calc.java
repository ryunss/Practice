package controller;

import model.Datas;

public class Calc {
	public String doing(Datas model) {
		int num1 = model.num1;
		int num2 = model.num2;
		String oper = model.oper;
		
		String result = null;
		switch(oper) {
		case "+":
			result = num1+num2+"";
			break;
		case "-":
			result = num1-num2+"";
			break;
		case "*":
			result = num1*num2+"";
			break;
		case "/":
			result = num1/num2+"";
			break;
		}
		return result;
	}
}
