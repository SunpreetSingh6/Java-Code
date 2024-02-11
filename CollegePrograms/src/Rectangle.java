class Area{
	public double perimeter(float l , float w)
	{
		double peri = 2*(l+w);
		return peri;
	}
	public double area(float l , float w)
	{
		double area = l*w;
		return area;
	}
}
public class Rectangle {
	
	public static void main(String[] args) {
		
		float len=5 , width=10;
		Area a = new Area();
		double area = a.area(len, width);
		double perimeter = a.perimeter(len, width);
		
		System.out.println("Area is :-" + area);
		System.out.println("Perimeter is :-" + perimeter);
		
	}

}
