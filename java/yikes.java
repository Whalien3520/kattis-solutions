import java.io.*;
public class yikes {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		while(N-- > 0) {
			double M = Double.parseDouble(scan.readLine()), B = Double.parseDouble(scan.readLine()), D = Double.parseDouble(scan.readLine()), T = Double.parseDouble(scan.readLine());
			//System.out.println(String.format("%d %f %f %f %f", N, M, B, D, T));
			double leftY = (D - 0.5) * M / B;
			double rightY = ((D - 0.5) * M + M) / B;
			double offset = 2.0 * M / B;
			Trapezoid t = new Trapezoid(leftY, rightY, offset);
			Circle c = new Circle(T * M);
			int prev = overlap(c, t);
			
			boolean done = false;;
			//if circle is below first trapezoid, dog passed before first bike
			if(prev == -1) {
				System.out.println("Max beats the first bicycle");
				done = true;
			}
			if(!done && prev == 0) {
				System.out.println("Collision with bicycle 1");
				done = true;
			}
			for(int i = 1; i <= 9 && !done; i++) {
				t.offset();
				int cur = overlap(c, t);
				//if intersects current trapezoid
				if(cur == 0) {
					System.out.println(String.format("Collision with bicycle %d", i + 1));
					done = true;
					continue;
				}
				//if below current trapezoid
				if(cur == -1) {
					System.out.println(String.format("Max crosses safely after bicycle %d", i));
					done = true;
					continue;
				}
				prev = cur;
			}
			if(!done)
				System.out.println("Max crosses safely after bicycle 10");
		}
		scan.close();
	}
	public static class Circle {
		double centerX, centerY, radius;
		public Circle(double T) {
			centerX = 0.5;
			centerY = 5.5 + T;
			radius = 0.5;
		}
	}
	public static class Trapezoid {
		double oneX, oneY;
		double twoX, twoY;
		double threeX, threeY;
		double fourX, fourY;
		double offset;
		//creates points based on bottom line segment & length of vertical edges
		public Trapezoid(double leftY, double rightY, double off) {
			oneX = 1;
			oneY = rightY;
			twoX = 0;
			twoY = leftY;
			threeX = twoX;
			threeY = twoY + off;
			fourX = oneX;
			fourY = oneY + off;
			offset = off;
		}
		public void offset() {
			oneY += 2 * offset;
			twoY += 2 * offset;
			threeY += 2 * offset;
			fourY += 2 * offset;
		}
	}
	// returns -1 if circle is below t, 0 if intersect, 1 if above
	public static int overlap(Circle c, Trapezoid t) {
		//return...
		//...if circle is fully below trapezoid
		if(t.twoY >= c.centerY + c.radius)
			return -1;
		//...if circle is fully above trapezoid
		if(t.fourY <= c.centerY - c.radius)
			return 1;
		
		//if center of circle is within rectangle of trapezoid, intersect
		if(c.centerY >= t.oneY && c.centerY <= t.threeY)
			return 0;
		//circle center is above rectangle
		if(c.centerY > t.threeY) {
			//if circle center is on/below diagonal line, intersect
			double diagMidY = (t.threeY + t.fourY) / 2;
			if(c.centerY <= diagMidY)
				return 0;
			//find distance from circle center to diagonal line
			double abx = t.fourX - t.threeX, aby = t.fourY - t.threeY;
			double acx = c.centerX - t.threeX, acy = c.centerY - t.threeY;
			double dotprod = Math.abs(abx * acy - acx * aby);
			double distSqr = dotprod * dotprod / (abx * abx + aby * aby);
			if(distSqr <= c.radius * c.radius)
				return 0;
			return 1;
		}
		//circle center is below rectangle
		else {
			//if circle center is on/above diagonal line, intersect
			double diagMidY = (t.oneY + t.twoY) / 2;
			if(c.centerY >= diagMidY)
				return 0;
			double abx = t.twoX - t.oneX, aby = t.twoY - t.oneY;
			double acx = c.centerX - t.oneX, acy = c.centerY - t.oneY;
			double dotprod = Math.abs(abx * acy - acx * aby);
			double distSqr = dotprod * dotprod / (abx * abx + aby * aby);
			if(distSqr <= c.radius * c.radius)
				return 0;
			return -1;
		}
	}
}