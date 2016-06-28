import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class dfm
  extends loe
  implements lux
{
  public dfm(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a(hae paramhae)
  {
    super.a(bni.a(paramhae), bni.c(paramhae), bni.b(paramhae), bni.d(paramhae), null);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, llu paramllu)
  {
    mbb localmbb = mbb.b(this.a);
    lln locallln = (lln)localmbb.a(lln.class);
    int i = ((git)localmbb.a(git.class)).c();
    if ((locallln.b(i)) && (paramllu == null))
    {
      gzj localgzj = (gzj)mbb.a(this.a, gzj.class);
      bni localbni = new bni(this.a, i, paramString1, paramString2, paramString3, paramString4);
      localgzj.d.a(localbni, true);
      localgzj.b(localbni);
      return;
    }
    super.a(paramString1, paramString2, paramString3, paramString4, paramllu);
  }
  
  public final void h(Bundle paramBundle)
  {
    int i = 0;
    String str = paramBundle.getString("arg_task_tag");
    gzj localgzj = (gzj)mbb.a(this.a, gzj.class);
    gzy localgzy = localgzj.b;
    if (localgzj != null) {}
    for (int j = localgzj.c.b;; j = 0)
    {
      int k = localgzy.c.size();
      while (i < k)
      {
        gzf localgzf = (gzf)localgzy.c.get(i);
        if ((localgzf.h == j) && (localgzf.f.equals(str))) {
          localgzf.i = true;
        }
        i++;
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfm
 * JD-Core Version:    0.7.0.1
 */