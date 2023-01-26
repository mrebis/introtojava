package introtojava;

public class Solution {

	public int numberOfSteps (int num) {
		// TODO Auto-generated method stub
		num =100;
		
		//Initialize step count to 0.
        int steps=1;

        //the loop keeps executing while num is greater than 0
        while(num > 0){
            //Use the % (modulo) operator to check if number is odd or even
            //if num is even, divide by 2. 
            if(num % 2 == 0){
                num = num/2;
            }else{
                num--; //else, num is odd so subtract 1
            }
           steps++; //rmb to add the steps by 1
        }
        //once num is 0, the loop stops and returns the output steps
        return steps;

	}

}
