public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle myDefaultRectangle = new Rectangle();
        Rectangle mySpecialRectangle = new Rectangle(3,6);
        Rectangle myCopiedRectangle = new Rectangle(mySpecialRectangle);


        System.out.println(myCopiedRectangle);
        myCopiedRectangle.doubleSize();
        myCopiedRectangle.doubleWidth();
        System.out.println(myCopiedRectangle);


    }
}
