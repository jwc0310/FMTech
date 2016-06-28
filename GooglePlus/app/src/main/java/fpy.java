import android.content.Intent;

public class fpy
  extends fpv
{
  public final Intent a;
  
  public fpy(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.a = paramIntent;
  }
  
  public fpy(String paramString, Intent paramIntent, Exception paramException)
  {
    super(paramString, paramException);
    this.a = paramIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpy
 * JD-Core Version:    0.7.0.1
 */