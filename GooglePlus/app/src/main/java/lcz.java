import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;

final class lcz
  extends ci
  implements lzl
{
  bk b;
  private final Context c;
  private final git d;
  private jxt e;
  
  public lcz(Context paramContext, bw parambw, git paramgit, jxt paramjxt)
  {
    super(parambw);
    this.c = paramContext;
    this.d = paramgit;
    this.e = paramjxt;
  }
  
  public final bk a(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      lcr locallcr = new lcr();
      int k = az.K;
      locallcr.a.putInt("refreshMenuId", k);
      localObject = locallcr.a();
    }
    for (;;)
    {
      this.b = ((bk)localObject);
      this.e.c();
      return this.b;
      lcw locallcw = new lcw();
      int j = az.K;
      locallcw.a.putInt("refreshMenuId", j);
      localObject = new lcu();
      ((lcu)localObject).f(locallcw.a);
      continue;
      lct locallct = new lct();
      int i = az.K;
      locallct.a.putInt("refreshMenuId", i);
      localObject = locallct.a();
    }
  }
  
  public final int b()
  {
    if ((this.d.d()) && (this.d.f().c("is_google_plus"))) {
      return 3;
    }
    return 1;
  }
  
  public final CharSequence b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return this.c.getString(lcp.v());
    case 1: 
      return this.c.getString(lcs.v());
    }
    return this.c.getString(lcu.v());
  }
  
  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    super.b(paramViewGroup, paramInt, paramObject);
    bk localbk = (bk)paramObject;
    if (this.b != localbk)
    {
      this.b = localbk;
      this.e.c();
    }
  }
  
  public final gxq c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new gxq(pjo.aI);
    case 1: 
      return new gxq(pjo.aA);
    }
    return new gxq(pjo.aX);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcz
 * JD-Core Version:    0.7.0.1
 */