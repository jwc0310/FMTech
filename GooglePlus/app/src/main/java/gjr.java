import java.io.PrintWriter;
import java.util.Arrays;

public final class gjr
  implements hta, mcn
{
  private final giz b;
  
  public gjr(giz paramgiz)
  {
    mco[] arrayOfmco = new mco[1];
    arrayOfmco[0] = new gjs(this, "print");
    Arrays.asList(arrayOfmco);
    this.b = paramgiz;
  }
  
  public final String a()
  {
    return "AccountStore";
  }
  
  public final void a(PrintWriter paramPrintWriter)
  {
    paramPrintWriter.append(this.b.b());
  }
  
  public final String b()
  {
    return "Prints all attributes for each account.";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjr
 * JD-Core Version:    0.7.0.1
 */