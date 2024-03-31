package predicater;

import java.util.ArrayList;
import java.util.function.Predicate;

class prewitharray {

	 
		
		String name;
		int salary;
		int experience;
		
		prewitharray(String name,int salary,int experience ){
			
			this.name=name;
			this.salary=salary;
			this.experience=experience;
			
			
			
			
		}
		
		public static void main(String[] args) {
			prewitharray p=new prewitharray("bhuvana", 20000, 5);


			
			Predicate<prewitharray>piarr=i->(i.salary>25000 & i.experience>2);
			
			//System.out.println(piarr.test(p));
			

			ArrayList<prewitharray> as = new ArrayList<prewitharray>();
						as.add(new prewitharray("bhuvana", 20000, 4));
						as.add(new prewitharray("mani", 11000, 1));
						as.add(new prewitharray("santhu", 15000, 2));
						as.add(new prewitharray("gopi", 45000, 6));

						as.add(new prewitharray("nasi", 35000, 5));

	
			for(prewitharray n:as) {
			
			
				
				if(piarr.test(n)) {
					
					System.out.println(n.name+ " "+ n.salary +" "+ n.experience);
				}
					
					
				}
			
	}

		
}
