public class NBody {

	public static double readRadius(String args){
		In in = new In(args);
		int firstItemInFile = in.readInt();
		double secondItemInFile = in.readDouble();

		return secondItemInFile;
	}
    
    public static Planet[] readPlanets(String args){
    	In in = new In(args);
		int n = in.readInt();
		Planet [] planets = new Planet[n];
		double radius = in.readDouble();
		for (int i = 0; i < n; i++)
		{
			
			planets[i] = new Planet(in.readDouble(), in.readDouble(),
				in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		}
		return planets;
    }

    public static void main (String[] args) {
    	double T = Double.parseDouble(args[0]);
    	double dt = Double.parseDouble(args[1]);
    	String filename = args[2];
    	double radius = readRadius(filename);
    	Planet[] planets = readPlanets(filename);
    	StdDraw.setXscale(-radius, radius);
    	StdDraw.setYscale(-radius, radius);
    	StdDraw.picture(0, 0, "images/starfield.jpg");
    	for (int i = 0; i< planets.length; i = i + 1)
    	{
    		planets[i].draw();
    	}
    	StdDraw.enableDoubleBuffering();
    	for (double t = 0; t <=T; t = t + dt)
    	{

    		int n = planets.length;

    		double [] xForces = new double [n];
    		double [] yForces = new double [n];

    		for (int i = 0; i< planets.length; i = i + 1)
    		{
    			xForces[i] = planets[i].calcNetForceExertedByX(planets);
    			yForces[i] = planets[i].calcNetForceExertedByY(planets);
    		}
    		for (int i = 0; i< planets.length; i = i + 1)
    		{
    			planets[i].update(dt, xForces[i], yForces[i]);
    		}
    		StdDraw.picture(0, 0, "images/starfield.jpg");
    		for (int i = 0; i< planets.length; i = i + 1)
    		{
    			planets[i].draw();
    		}
    		StdDraw.show();
    		StdDraw.pause(10);
    	}

    	StdOut.printf("%d\n", planets.length);
		StdOut.printf("%.2e\n", radius);
		for (int i = 0; i < planets.length; i++) {
    		StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                  planets[i].xxPos, planets[i].yyPos, planets[i].xxVel,
                  planets[i].yyVel, planets[i].mass, planets[i].imgFileName);   
			}

    }

}