import android.util.Log;

public class gei
  extends gej
{
  private frj a;
  private String b;
  
  public gei(frj paramfrj, String paramString)
  {
    this.a = paramfrj;
    this.b = paramString;
  }
  
  protected final void b(rhf paramrhf)
  {
    if (Log.isLoggable("ClearcutTransmitter", 3)) {
      paramrhf.toString();
    }
    this.a.a(this.b, null, 0, qat.a(paramrhf));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gei
 * JD-Core Version:    0.7.0.1
 */