import java.io.PrintWriter;
import java.io.StringWriter;

public final class mcp
  extends PrintWriter
{
  public mcp()
  {
    super(new StringWriter());
  }
  
  public final String toString()
  {
    return this.out.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mcp
 * JD-Core Version:    0.7.0.1
 */