import android.content.Context;
import java.util.List;

final class ing
  implements ilu
{
  private giz a;
  
  public ing(Context paramContext)
  {
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final int a(int paramInt)
  {
    if (this.a.a(paramInt).c("is_managed_account"))
    {
      List localList = this.a.a();
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        int k = ((Integer)localList.get(j)).intValue();
        if (k != paramInt)
        {
          gjb localgjb = this.a.a(k);
          if ((localgjb.a()) && (localgjb.c("is_managed_account"))) {
            return k;
          }
        }
      }
    }
    return -1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ing
 * JD-Core Version:    0.7.0.1
 */