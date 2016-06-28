import android.graphics.PointF;

public final class ggk
{
  public final Object a;
  final PointF b = new PointF();
  
  public ggk(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.b.toString());
    return 20 + String.valueOf(str).length() + "Point { position: " + str + " }";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggk
 * JD-Core Version:    0.7.0.1
 */