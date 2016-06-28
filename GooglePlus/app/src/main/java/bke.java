import java.io.InputStream;
import java.util.Enumeration;

final class bke
  implements Enumeration<InputStream>
{
  private int a = 0;
  
  bke(bkd parambkd) {}
  
  public final boolean hasMoreElements()
  {
    return this.a < 3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bke
 * JD-Core Version:    0.7.0.1
 */