import android.content.Context;
import android.content.res.Resources;
import java.util.Date;

public final class klb
  implements iyq
{
  final kol a;
  private Context b;
  private int c;
  
  public klb(Context paramContext, int paramInt, khx paramkhx, myt parammyt) {}
  
  public klb(Context paramContext, int paramInt, kol paramkol)
  {
    this.b = paramContext;
    this.c = paramInt;
    this.a = paramkol;
  }
  
  public final int a(iys paramiys, iyr paramiyr)
  {
    int i = 1;
    Object localObject = null;
    kla localkla = new kla(this.b, this.c, this.a.a);
    localkla.i();
    qat localqat1;
    qat localqat2;
    label77:
    int j;
    if (!localkla.n()) {
      if (localkla.x)
      {
        localqat1 = localkla.w;
        if (localqat1 == null) {
          break label204;
        }
        if (!localkla.x) {
          break label162;
        }
        localqat2 = localkla.w;
        olr localolr = ((myu)localqat2).a;
        kmf localkmf = (kmf)mbb.a(this.b, kmf.class);
        if ((localolr.b != null) && (localolr.b.a != null)) {
          localkmf.a(this.c, localolr.b.a);
        }
        j = i;
        i = 0;
      }
    }
    for (;;)
    {
      paramiyr.a = localObject;
      paramiyr.b = i;
      return j;
      localqat1 = null;
      break;
      label162:
      localqat2 = null;
      break label77;
      Exception localException = localkla.q;
      if ((localException instanceof kdd))
      {
        j = 5;
        localObject = localException;
        i = 0;
      }
      else
      {
        j = 4;
        localObject = null;
        continue;
        label204:
        j = i;
        localObject = null;
        i = 0;
      }
    }
  }
  
  public final String a()
  {
    return "reshare_network_request";
  }
  
  public final String b()
  {
    Resources localResources = this.b.getResources();
    int i = efj.UU;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(1);
    return localResources.getQuantityString(i, 1, arrayOfObject);
  }
  
  public final String c()
  {
    return this.a.c;
  }
  
  public final void d() {}
  
  public final boolean e()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klb
 * JD-Core Version:    0.7.0.1
 */