import android.content.Context;
import android.os.Bundle;

public final class lib
  extends gzf
{
  private final int a;
  private final kcg b;
  private final String c;
  private final String d;
  private int l;
  
  public lib(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    super("SetSquarePinnedStateTask");
    this.a = paramInt1;
    this.b = new kch().a(paramContext, this.a).a();
    this.c = paramString1;
    this.d = paramString2;
    this.l = paramInt2;
  }
  
  private final String a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int j;
      switch (this.l)
      {
      default: 
        j = aaw.qz;
      }
      for (;;)
      {
        return paramContext.getString(j);
        j = aaw.qA;
        continue;
        j = aaw.qE;
      }
    }
    int i;
    switch (this.l)
    {
    default: 
      i = aaw.qz;
    }
    for (;;)
    {
      return paramContext.getString(i);
      i = aaw.qC;
      continue;
      i = aaw.qD;
    }
  }
  
  protected final hae a(Context paramContext)
  {
    if (kyo.a(paramContext, this.a))
    {
      kcg localkcg = this.b;
      String str1 = this.c;
      String str2 = this.d;
      int i;
      switch (this.l)
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        lhz locallhz = new lhz(paramContext, localkcg, str1, str2, i);
        locallhz.a.i();
        locallhz.a.c("SetSquarePinnedStateOperation");
        hae localhae2 = new hae(locallhz.a.o, locallhz.a.q, a(paramContext, locallhz.a.n()));
        localhae2.a().putInt("pinned_state", this.l);
        return localhae2;
        i = 2;
        continue;
        i = 1;
      }
    }
    lia locallia = new lia(paramContext, this.b, this.c, this.d, this.l);
    locallia.i();
    hae localhae1 = new hae(locallia.o, locallia.q, a(paramContext, locallia.n()));
    localhae1.a().putInt("pinned_state", this.l);
    return localhae1;
  }
  
  public final String b(Context paramContext)
  {
    switch (this.l)
    {
    default: 
      int j = this.l;
      throw new IllegalArgumentException(38 + "Unknown SquarePinnedState: " + j);
    }
    for (int i = aaw.qB;; i = aaw.qF) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lib
 * JD-Core Version:    0.7.0.1
 */