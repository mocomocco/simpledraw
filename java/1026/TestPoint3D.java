public class TestPoint3D{
	public static void main(String args[]){
			Point3D pt1 = new Point3D();
		Point3D pt2 = new Point3D();
		pt1.x=10;
		pt1.y=20;
		pt1.z=30;
		
		pt2.x=-pt1.x;
		pt2.y=-pt1.y;
		pt2.z=-pt1.z;
		
		pt1.print();
		pt2.print();
		
		pt1.set(30,20,10);
		pt2.set(-30,-20,-10);
		
		pt1.print();
		pt2.print();
		
		Point3D pt3 = new Point3D();
		pt3.set(pt1.getx(),pt2.gety(),pt1.getz());
		pt3.print();
			
		Point3D pt4 = new Point3D();
		pt4.add(pt1,pt3);
		pt4.print();	
		
		System.out.println(pt4.distance(pt1));
	
		}
		
		}