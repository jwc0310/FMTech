import android.content.Context;
import java.util.List;

public final class cqk
  implements ilt
{
  private giz a;
  private Context b;
  
  public cqk(Context paramContext)
  {
    this.b = paramContext;
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final void a()
  {
    List localList1 = this.a.a();
    int i = localList1.size();
    int j = 0;
    int k = 0;
    if (j < i) {
      if (!this.a.a(((Integer)localList1.get(j)).intValue()).a()) {
        break label164;
      }
    }
    label164:
    for (int i1 = k + 1;; i1 = k)
    {
      j++;
      k = i1;
      break;
      if (k < 3)
      {
        List localList2 = this.a.a();
        int m = localList2.size();
        for (int n = 0; n < m; n++)
        {
          Integer localInteger = (Integer)localList2.get(n);
          if (this.a.a(localInteger.intValue()).a()) {
            dkk.a(this.b, localInteger.intValue());
          }
        }
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    if (((jaq)mbb.a(this.b, jaq.class)).d()) {}
    gjb localgjb;
    do
    {
      return;
      localgjb = this.a.a(paramInt);
      hyi localhyi = (hyi)mbb.a(this.b, hyi.class);
      boolean bool1 = localgjb.c("logged_in");
      boolean bool2 = localgjb.c("gunslegacy_notifications_active");
      boolean bool3 = localhyi.b(bwb.k, paramInt);
      if (bool1 != bool2)
      {
        a();
        if ((bool3) && (bool1)) {
          gzj.a(this.b, new bnc(this.b, dmr.a(paramInt), paramInt));
        }
        this.a.b(paramInt).b("gunslegacy_notifications_active", bool1).d();
      }
    } while (!localgjb.c("gplus_no_mobile_tos"));
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqk
 * JD-Core Version:    0.7.0.1
 */