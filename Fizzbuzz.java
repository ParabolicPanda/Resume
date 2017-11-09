package fizz;

public class Buzz {

	public static void main(String[] args) {

		int num=0;                                  //sets the initial integer
		
		while(num<150){                             //while statement. Program will run until "num" = 150
			num++;                                    //increments num
			if(num%3==0){                             //checks to see if num is evenly divisible by 3
				if(num%5==0){                           //if num is evenly divisible by 3, checks to see if num is evenly divisible by 5
					System.out.println("FizzBuzz!");      //prints "FizzBuzz!" on its own line if num is evenly divisible by both 3 and 5
				}
				else
					System.out.println("Fizz!");          //prints "Fizz!" if num is only evenly divisible by 3, but not 5
					
			}
			else if(num%5==0){                        //checks if num is evenly divisible by 5
				System.out.println("Buzz!");            //prints "Buzz!" if num is only evenly divisible by 5, but not 3
				
			}
			else{                                     //catches any num that is not evenly divisible by either 3 or 5
				System.out.println(num);                //prints the number contained in num if num is not evenly divisible by either 3 or 5
				
			}
		}
		
	}

}
