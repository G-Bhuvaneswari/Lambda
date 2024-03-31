package javaaa;



@FunctionalInterface
interface lamp
{
	public String rice(String idli,String normalrice);
	

default void wheet() {
	
	System.out.println("wheet chappati");
}

static void meet() {
	
	System.out.println("meet food");
}


}
