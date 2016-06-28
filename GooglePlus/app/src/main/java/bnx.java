import android.content.Context;
import java.io.IOException;

public final class bnx
  extends gzf
{
  private final int a;
  private final String b;
  private final lnw c;
  
  public bnx(Context paramContext, int paramInt, String paramString, lnw paramlnw)
  {
    super(paramContext, "PromoModifyUserSurveyPostTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = paramlnw;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    try
    {
      efj.a(localContext, this.a, this.b, lnw.a(this.c));
      hae localhae = new hae(true);
      return localhae;
    }
    catch (IOException localIOException) {}
    return new hae(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnx
 * JD-Core Version:    0.7.0.1
 */