import android.content.Context;
import android.widget.Toast;

public final class jxn
{
  private static jxn a;
  private final Context b;
  private Toast c;
  
  private jxn(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static jxn a(Context paramContext)
  {
    if (a == null) {
      a = new jxn(paramContext);
    }
    return a;
  }
  
  public final void a(String paramString)
  {
    if (this.c != null) {
      this.c.cancel();
    }
    this.c = Toast.makeText(this.b, paramString, 0);
    this.c.show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxn
 * JD-Core Version:    0.7.0.1
 */