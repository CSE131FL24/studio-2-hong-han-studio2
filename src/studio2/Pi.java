package studio2;

public class Pi {

	public static void main(String[] args) {
		double pi;
		double x = Math.random();
		double y = Math.random();
		double radius = Math.sqrt(x*x+y*y);
		System.out.println(radius);
		double area=0;
		int i;
		for(i=1;i<500000000;i++) {
			double xtest = Math.random();
			double ytest = Math.random();
			if(Math.sqrt(xtest*xtest+ytest*ytest)<radius){
				area++;
			}
		}
		area = area/i;
		pi = (4*area)/(radius*radius);
		System.out.println(pi);
	}
}
