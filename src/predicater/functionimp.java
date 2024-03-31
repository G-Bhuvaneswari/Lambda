package predicater;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class functionimp {
	
	
	
	public static void main( String []args) {
		
		
		
ArrayList <functtion>as= new ArrayList <functtion>();

as.add(new functtion("bhuvana",14656) );
as.add(new functtion("jaya",35877) );
as.add(new functtion("manja",25465) );
as.add(new functtion("viji",46767) );
as.add(new functtion("mama",65344) );

		Function<functtion,Integer>fn=i->{
			
		int a=	i.salary;
		
		if((a>10000) && (a<20000))
		System.out.println(a*10/100);
		if((a>20000)&&(a<30000))
		System.out.println(a*20/100);	
		if((a>30000) && (a<50000))
			System.out.println(a*30/100);
		else {
			System.out.println(a*40/100);

		};
		
		Predicate<Integer>p=b>5000;
		
	for(functtion ff:as) {
		int bonus= fn.apply(ff); 
		if(p.test(bonus)) {
			System.out.println(ff.name + "  "+ff.salary  );

			System.out.println("bonus:"+bonus);
		}
		}
	
		}
			
		
			
			
			
			
			
			
			
			
			
			
		
	



