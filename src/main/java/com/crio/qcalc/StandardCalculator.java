package com.crio.qcalc;


public class StandardCalculator {

   
      private double result;
   
   
      public double getResult() {
   
          return result;
   
      }

   
public void setResult(int value) {

    if (value != 0)

        return;

       

    this.result = value;

}

   
public void clearResult() {

    result = 0;

}

public void printResult(){

    System.out.println("Standard Calculator Result:"+ result);

}

/*public void subtract(int num1, int num2)
{
    result=num1-num2;
    
}*/


/*ublic void multiply(int num1, int num2)
{
    result=num1*num2;
}*/


/*public void divide(int num1, int num2)
{
    result=num1/num2;
}*/

public void add(int num1, int num2){

    add((double)num1, (double)num2);

}
public void multiply(int num1 ,int num2)
{
    multiply((double)num1 ,(double)num2);
}
  

public void divide(int num1 , int num2)
{
    divide((double)num1,(double)num2);
}

public void subtract(int num1, int num2)
{
    subtract((double)num1 , (double)num2);
}

public void add(double num1, double num2){

result = num1 + num2;

}

public void subtract(double num1, double num2)
{
    result=num1-num2;
}


public void multiply(double num1, double num2)
{
    result=num1*num2;
}


public void divide(double num1, double num2)
{
    result=num1/num2;
}

   // other arithmetic operation methods
   
     
   
   
   

}

    

////public void subtract(int num1, int num2)


//Public void multiply(int num1, int num2)


//////public void divide(int num1, int num2)



// other arithmetic operation methods

