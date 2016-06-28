import android.util.Log;
import java.util.Locale;

public final class gxi
  implements gxp, meu, mfd
{
  private jxu a;
  
  public gxi(jxu paramjxu, mek parammek)
  {
    this.a = paramjxu;
    parammek.a(this);
  }
  
  public final gxp a(mbb parammbb)
  {
    parammbb.a(gxp.class, this);
    return this;
  }
  
  public final void m_()
  {
    this.a = null;
  }
  
  public final gxq v()
  {
    bk localbk = this.a.H_();
    Object localObject;
    if (localbk != null)
    {
      if (Log.isLoggable("DeferredVEProvider", 3))
      {
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localbk.getClass().getCanonicalName();
        String.format(localLocale, "Primary Fragment: %s", arrayOfObject);
      }
      if ((localbk instanceof gxs)) {
        localObject = (gxs)localbk;
      }
    }
    for (;;)
    {
      gxs localgxs;
      if (localObject != null)
      {
        return ((gxs)localObject).v();
        if (!(localbk instanceof mbe)) {
          break label135;
        }
        localgxs = (gxs)((mbe)localbk).aE_().b(gxs.class);
        if (localgxs == null) {
          localObject = (gxs)((mbe)localbk).aE_().b(gxp.class);
        }
      }
      else
      {
        return null;
      }
      localObject = localgxs;
      continue;
      label135:
      localObject = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxi
 * JD-Core Version:    0.7.0.1
 */