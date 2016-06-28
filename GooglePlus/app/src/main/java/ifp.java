import java.io.PrintWriter;
import java.io.Writer;

final class ifp
  extends PrintWriter
{
  ifp(ifl paramifl, Writer paramWriter)
  {
    super(paramWriter);
  }
  
  public final String toString()
  {
    return this.out.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifp
 * JD-Core Version:    0.7.0.1
 */