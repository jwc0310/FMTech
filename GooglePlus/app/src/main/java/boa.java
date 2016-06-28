import android.content.Context;
import java.util.ArrayList;

public final class boa
  extends gzf
{
  private final int a;
  private final String b;
  private final ArrayList<String> c;
  private final hum d;
  
  public boa(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, "RejectInferredPostTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = new ArrayList();
    this.c.add(paramString2);
    this.d = ((hum)mbb.a(paramContext, hum.class));
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    boolean bool = this.d.a(localContext, this.a, 34, this.c, null, 3, 216, System.currentTimeMillis());
    if (bool)
    {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      lmp.a(this.e, this.a, this.b);
    }
    return new hae(bool);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boa
 * JD-Core Version:    0.7.0.1
 */