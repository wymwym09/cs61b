public class Planet {

    static final double G = 6.67* Math.pow(10,-11); 

	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

 	public Planet(double xP, double yP, double xV, 
 	double yV, double m, String img){
 		xxPos = xP;
 		yyPos = yP;
 		xxVel = xV;
 		yyVel = yV;
 		mass = m;
 		imgFileName = img;
 	}

 	public Planet(Planet p){
 	    xxPos = p.xxPos;
		yyPos = p.yyPos;
		xxVel = p.xxVel;
		yyVel = p.yyVel;
		mass = p.mass;
		imgFileName = p.imgFileName;
 	}

 	public double calcDistance (Planet b) {

		double x_b = b.xxPos;
		double y_b = b.yyPos;

		double x_a = this.xxPos;
		double y_a = this.yyPos;
		
		double r_2 = Math.pow(x_b - x_a,2) + Math.pow(y_b - y_a,2);
		double dist =  Math.sqrt(r_2);

		return dist;


	}

	public double calcForceExertBy(Planet p) {
		double dist = this.calcDistance(p);
		double force = G*(this.mass * p.mass)/Math.pow(dist,2);
		return force;
	}

	public double calcForceExertedByX(Planet p){
        double dist_x = p.xxPos - this.xxPos;
        double force_x = this.calcForceExertBy(p) * dist_x / this.calcDistance(p);
        return force_x;
	}

	public double calcForceExertedByY(Planet p){
        double dist_y = p.yyPos - this.yyPos;
        double force_y = this.calcForceExertBy(p) * dist_y / this.calcDistance(p);
        return force_y;
	}

	public double calcNetForceExertedByX(Planet[] ps){
		double net_forcex = 0;
		for (int i = 0; i< ps.length; i++)
		{
			if(this.equals(ps[i])){
				continue;
			}
			else
			{
				net_forcex = net_forcex + calcForceExertedByX(ps[i]);
			}
		}

		return net_forcex;
	}

	public double calcNetForceExertedByY(Planet[] ps){
		double net_forcey = 0;
		for (int i = 0; i< ps.length; i++)
		{
			if(this.equals(ps[i])){
				continue;
			}
			else
			{
				net_forcey = net_forcey + calcForceExertedByY(ps[i]);
			}
		}
		return net_forcey;
	}

	public void update(double dt, double fX, double fY) {

		double ax = fX/this.mass;
		double ay = fY/this.mass;
		this.xxVel = this.xxVel + dt*ax;
		this.yyVel = this.yyVel + dt*ay;
		this.xxPos = this.xxPos + dt*this.xxVel;
		this.yyPos = this.yyPos + dt*this.yyVel;


	}
    
    public void draw(){

    	StdDraw.picture(this.xxPos, this.yyPos, "images/" + this.imgFileName);

    }

}