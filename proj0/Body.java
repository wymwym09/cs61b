public class Body {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

 	public Body(double xP, double yP, double xV, 
 	double yV, double m, String img){
 		xxPos = xP;
 		yyPos = yP;
 		xxVel = xV;
 		yyVel = yV;
 		mass = m;
 		imgFileName = img;
 	}

 	public Body(Body b){
 		Body a = b;
 	}

 	public double calcDistance (Body b) {

		double x_b = b.xxPos;
		double y_b = b.yyPos;

		double x_a = this.xxPos;
		double y_a = this.yyPos;
		
		double r_2 = Math.pow(x_b - x_a,2) + Math.pow(y_b - y_a,2);
		double dist =  Math.sqrt(r_2);

		return dist;


	}

}