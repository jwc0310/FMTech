import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class kcx
  extends kcu<mhq, mhr>
{
  private final List<mhw> a = new ArrayList();
  
  public kcx(Context paramContext, kcg paramkcg)
  {
    super(paramContext, paramkcg, "batchfetch", new mhq(), new mhr(), "plusdatamixer", "oauth2:https://www.googleapis.com/auth/plus.native");
  }
  
  public static int a(qao<?, ?> paramqao)
  {
    return paramqao.b >>> 3;
  }
  
  public final int a(int paramInt)
  {
    qat localqat1;
    mhz[] arrayOfmhz;
    if (this.x)
    {
      localqat1 = this.w;
      if (localqat1 != null)
      {
        boolean bool = this.x;
        qat localqat2 = null;
        if (bool) {
          localqat2 = this.w;
        }
        arrayOfmhz = ((mhr)localqat2).a;
      }
    }
    else
    {
      for (int i = 0;; i++)
      {
        if (i >= arrayOfmhz.length) {
          break label104;
        }
        mhy localmhy = arrayOfmhz[i].a;
        if ((localmhy != null) && (localmhy.a != null) && (localmhy.a.intValue() == paramInt))
        {
          return i;
          localqat1 = null;
          break;
        }
      }
    }
    label104:
    return -1;
  }
  
  public final <T extends qat> T a(int paramInt, qao<mhy, T> paramqao)
  {
    if (this.x) {}
    for (qat localqat = this.w;; localqat = null)
    {
      mhy localmhy = ((mhr)localqat).a[paramInt].a;
      if (localmhy == null) {
        break;
      }
      return (qat)localmhy.b(paramqao);
    }
    return null;
  }
  
  public final void a(int paramInt1, mhx parammhx, int paramInt2)
  {
    mhw localmhw = new mhw();
    localmhw.a = Integer.valueOf(paramInt1);
    localmhw.c = Integer.valueOf(paramInt2);
    localmhw.b = parammhx;
    this.a.add(localmhw);
  }
  
  public final <T extends qat> void a(qao<mhy, T> paramqao, int paramInt)
  {
    a(paramqao.b >>> 3, null, paramInt);
  }
  
  public final <T extends qat> void a(qao<mhx, T> paramqao, T paramT, int paramInt)
  {
    mhx localmhx = new mhx();
    localmhx.a(paramqao, paramT);
    a(paramqao.b >>> 3, localmhx, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcx
 * JD-Core Version:    0.7.0.1
 */