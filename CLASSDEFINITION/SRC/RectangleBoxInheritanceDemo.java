class RectangleBoxInheritanceDemo
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.print();
		r.setdimension(3,4);
		r.print();

		Box b = new Box();
		b.print();
        b.setDimension(3,4,5);
        b.print();
	}
}

