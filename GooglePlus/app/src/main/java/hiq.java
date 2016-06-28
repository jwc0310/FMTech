import android.content.Context;
import android.view.View;

public final class hiq
  extends khy
{
  private final int a;
  
  public hiq(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final View a(Context paramContext, String paramString, qbe paramqbe)
  {
    hif localhif = new hif(paramContext, null, 0, true);
    localhif.a(new hmw((qda)paramqbe.b(qda.a), paramContext), null);
    return localhif;
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
        if (arrayOfInt[j] == 413) {
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
 * Qualified Name:     hiq
 * JD-Core Version:    0.7.0.1
 */