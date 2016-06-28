import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

class jml
  implements gom
{
  private static int a = -1;
  private static int b = -1;
  private static int c = -1;
  private static int d = -1;
  private final Context e;
  private final boolean f;
  private final jgw g;
  
  jml(Context paramContext, jmm paramjmm)
  {
    this.e = paramContext;
    this.g = paramjmm.a;
    this.f = ((git)mbb.b(paramContext).a(git.class)).f().c("is_child");
  }
  
  jml(jmk paramjmk, Context paramContext, jmm paramjmm)
  {
    this(paramContext, paramjmm);
  }
  
  @TargetApi(21)
  private final joo a(int paramInt1, int paramInt2)
  {
    Resources localResources = this.e.getResources();
    joo localjoo = new joo(this.e);
    if (Build.VERSION.SDK_INT >= 21) {}
    for (Drawable localDrawable = localResources.getDrawable(paramInt2, this.e.getTheme());; localDrawable = localResources.getDrawable(paramInt2))
    {
      localjoo.a(paramInt1, localDrawable);
      return localjoo;
    }
  }
  
  private final int g()
  {
    if (d == -1) {
      d = this.e.getResources().getColor(efj.Sn);
    }
    return d;
  }
  
  private final int h()
  {
    if (c == -1) {
      c = this.e.getResources().getColor(efj.Sh);
    }
    return c;
  }
  
  private final int i()
  {
    if (b == -1) {
      b = this.e.getResources().getColor(efj.Sk);
    }
    return b;
  }
  
  private final int j()
  {
    if (a == -1) {
      a = this.e.getResources().getColor(efj.Sm);
    }
    return a;
  }
  
  public final View a()
  {
    switch (this.g.e())
    {
    default: 
      return a(h(), efj.Sv);
    case 9: 
      if (this.f) {
        return a(g(), efj.Sw);
      }
      return a(j(), efj.Sy);
    case 8: 
      return a(j(), efj.Sx);
    }
    if (this.f) {
      return a(g(), efj.Sw);
    }
    return a(i(), efj.Su);
  }
  
  public final String b()
  {
    return this.g.c();
  }
  
  public final int c()
  {
    int i = this.g.e();
    int j;
    switch (i)
    {
    default: 
      j = h();
    }
    for (;;)
    {
      if ((this.f) && ((i == 9) || (i == 7))) {
        j = g();
      }
      return j;
      j = j();
      continue;
      j = i();
    }
  }
  
  public final int d()
  {
    int i = this.g.e();
    if ((i != 9) && (i != 8) && (i != 7)) {
      return ehr.de;
    }
    return ehr.df;
  }
  
  public final String e()
  {
    int i = this.g.e();
    String str;
    switch (i)
    {
    default: 
      Context localContext2 = this.e;
      int k = aaw.pG;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.g.c();
      str = localContext2.getString(k, arrayOfObject2);
    }
    for (;;)
    {
      if ((this.f) && ((i == 9) || (i == 7))) {
        str = this.g.c();
      }
      return str;
      str = this.g.c();
      continue;
      Context localContext1 = this.e;
      int j = aaw.pH;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.g.c();
      str = localContext1.getString(j, arrayOfObject1);
      continue;
      str = this.g.c();
    }
  }
  
  public final boolean f()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jml
 * JD-Core Version:    0.7.0.1
 */