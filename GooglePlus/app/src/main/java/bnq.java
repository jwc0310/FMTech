import android.content.Context;
import java.io.IOException;

public final class bnq
  extends gzf
{
  private final int a;
  private final String b;
  private final boolean c;
  
  public bnq(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    super(paramContext, "ModifyInferredPostTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    try
    {
      lmp.j(localContext, this.a, this.b, this.c);
      hae localhae = new hae(true);
      return localhae;
    }
    catch (IOException localIOException) {}
    return new hae(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnq
 * JD-Core Version:    0.7.0.1
 */