public class Rectangle
{
    private int height;
    private int width;

    public Rectangle()
    {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle)
    {
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getArea()
    {
        return this.height * this.width;
    }

    public void doubleSize()
    {
        this.height *= 2;
        this.width *= 2;

    }

    public void doubleWidth()
    {
        this.width *= 2;
    }

    public String toString()
    {
        String dimensionsAndArea = "Height: " + this.height + " Width: " + this.width + " Area: " + getArea();
        return dimensionsAndArea;
    }


}
