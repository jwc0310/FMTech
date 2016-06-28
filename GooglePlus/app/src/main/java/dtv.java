import android.content.Context;
import android.view.View;

public final class dtv
  extends khy
{
  private final int a;
  
  public dtv(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final View a(Context paramContext, String paramString, qbe paramqbe)
  {
    dtt localdtt = new dtt(paramContext);
    localdtt.a(new dtq(paramContext, (qef)paramqbe.b(qef.a), paramString));
    return localdtt;
  }
  
  public final boolean a(qbe paramqbe)
  {
    int[] arrayOfInt = paramqbe.a;
    int i = arrayOfInt.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfInt[j] == 380) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtv
 * JD-Core Version:    0.7.0.1
 */