import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;

final class boz
  extends ci
  implements lzl
{
  bk b;
  private final Context c;
  private final git d;
  private final boolean e;
  private final jxt f;
  
  public boz(Context paramContext, bw parambw, git paramgit, boolean paramBoolean, jxt paramjxt)
  {
    super(parambw);
    this.c = paramContext;
    this.d = paramgit;
    this.e = paramBoolean;
    this.f = paramjxt;
  }
  
  public final bk a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return hiy.a(efj.zx, this.e);
    case 1: 
      return hjb.a(efj.zx, this.d.f().b("gaia_id"), false, this.e);
    }
    int i = efj.zx;
    boolean bool = this.e;
    hiz localhiz = new hiz();
    Bundle localBundle = new Bundle();
    localBundle.putInt("refreshMenuId", i);
    localBundle.putBoolean("enableViewMyFollowedCollexions", false);
    localBundle.putBoolean("clx_enable_search", bool);
    localhiz.f(localBundle);
    return localhiz;
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
      return null;
    case 0: 
      return this.c.getString(hiy.x());
    case 1: 
      return this.c.getString(hjb.x());
    }
    return this.c.getString(hiz.x());
  }
  
  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    super.b(paramViewGroup, paramInt, paramObject);
    bk localbk = (bk)paramObject;
    if (this.b != localbk)
    {
      this.b = localbk;
      this.f.c();
    }
  }
  
  public final gxq c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new gxq(pjn.E);
    case 1: 
      return new gxq(pjn.L);
    }
    return new gxq(pjn.P);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boz
 * JD-Core Version:    0.7.0.1
 */