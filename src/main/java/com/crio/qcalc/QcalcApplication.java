package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;


public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
	//System.out.println("Hello world");
	

     /*   System.out.println("Starting QCalc..");

       StandardCalculator calc = new StandardCalculator();

       calc.add(1, 1);

       System.out.println(calc.getResult());*/
       
/*StandardCalculator calc = new StandardCalculator();

calc.add(Double.MAX_VALUE, 1.0);

calc.printResult();*/



StandardCalculator calc = new StandardCalculator();

calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

calc.printResult();

   
LogicCalculator calc2 = new LogicCalculator();

calc2.OR(8, 6);

calc2.printResult();

LogicCalculator calc3 = new LogicCalculator();

calc3.AND(8, 6);

calc3.printResult();


	}
}
