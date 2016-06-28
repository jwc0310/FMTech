import java.io.PrintWriter;
import java.io.Writer;

public final class hsz
  extends PrintWriter
{
  public hsz(Writer paramWriter)
  {
    super(paramWriter);
  }
  
  public final String toString()
  {
    return this.out.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsz
 * JD-Core Version:    0.7.0.1
 */