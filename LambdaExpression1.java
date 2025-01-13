package Java8Samples;
@FunctionalInterface 
interface Drawable{  
    public void draw();  
}  

public class LambdaExpression1 {

	public static void main(String[] args) {
		
		int width = 20;
		Drawable d=()->{
			System.out.println("result........"+ width);
			
		};
		d.draw();
	}

}
