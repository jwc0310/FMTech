import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

final class ldd
  implements giv, ica
{
  private final String a;
  private final String b;
  private Activity c;
  private ibw d;
  private ikt e;
  
  ldd(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final void a()
  {
    ikt localikt = this.e;
    ilf localilf = new ilf();
    iln localiln = new iln();
    localiln.a = this.c.getString(eyg.bH);
    Bundle localBundle = localiln.a();
    localilf.s = ilm.class;
    localilf.t = localBundle;
    localikt.a(localilf);
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.c = paramActivity;
    this.d = paramibw;
    this.e = ((ikt)paramikt.a(this));
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      ibw localibw = this.d;
      Intent localIntent1 = this.c.getIntent();
      kyh localkyh = (kyh)mbb.a(this.c, kyh.class);
      String str1 = this.a;
      String str2 = this.b;
      int i;
      if ("moderator".equals(str2)) {
        i = 2;
      }
      for (;;)
      {
        Intent localIntent2 = localkyh.a(paramInt2, str1, -1, -1, Integer.valueOf(i));
        Bundle localBundle = localIntent1.getExtras();
        if (localBundle != null) {
          localIntent2.putExtras(localBundle);
        }
        localibw.a(localIntent2);
        return;
        if ("pending".equals(str2))
        {
          i = 3;
        }
        else if ("banned".equals(str2))
        {
          i = 4;
        }
        else
        {
          boolean bool = "invited".equals(str2);
          i = 0;
          if (bool) {
            i = 5;
          }
        }
      }
    }
    this.d.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldd
 * JD-Core Version:    0.7.0.1
 */