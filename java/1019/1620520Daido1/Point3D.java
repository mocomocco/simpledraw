public class Point3D{
	private int x,y,z;

	void print(){
	System.out.println(x+","+y+","+z);	
	}

	void set(int ptx,int pty,int ptz){
	x=ptx;
	y=pty;
	z=ptz;	
	}

	int getx(){
	return x;	
	}

	int gety(){
		return y;
	}

	int getz(){
		return z;
	}

	void add(Point3D pt1,Point3D pt2){
		x=pt1.getx()+pt2.getx();	
		y=pt1.gety()+pt2.gety();
		z=pt1.getz()+pt2.getz();
	}

	double distance(Point3D goal){
		double distance;
		int goalx=goal.getx(),goaly=goal.gety(),goalz=goal.getz();
		int dx=goalx-x,dy=goaly-y,dz=goalz-z;	
		distance=Math.sqrt(dx*dx+dy*dy+dz*dz);
		return distance;	
	}

	public static void main(String args[]){
	 	Point3D pt1 = new Point3D();
        Point3D pt2 = new Point3D();
        pt1.set(10, 20, 30);
        pt2.set(-pt1.getx(), -pt1.gety(), -pt1.getz());
        pt1.print();         
        pt2.print();
	}

}