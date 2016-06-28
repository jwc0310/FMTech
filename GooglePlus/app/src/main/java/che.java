import android.content.Context;
import android.os.Bundle;

final class che
  extends dgd
{
  public che(cgr paramcgr, Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a(String paramString)
  {
    Bundle localBundle = gxy.a("extra_gaia_id", paramString);
    int i = ((git)mbb.a(this.a.bn, git.class)).c();
    gxx localgxx = (gxx)this.a.bo.a(gxx.class);
    gxw localgxw = new gxw(this.a.bn, i);
    localgxw.c = gxz.A;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    super.a(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     che
 * JD-Core Version:    0.7.0.1
 */