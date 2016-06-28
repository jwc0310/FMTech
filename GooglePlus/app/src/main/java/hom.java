import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

final class hom
  extends aga<hon>
  implements mbo, mes, mfd
{
  private agi c;
  private int d;
  private hgz e;
  private hha f;
  private kxq g;
  private final Context h;
  private final hoo i;
  private hhf j;
  private boolean k;
  
  public hom(Context paramContext, hoo paramhoo, mek parammek)
  {
    this.h = paramContext;
    this.i = paramhoo;
    parammek.a(this);
  }
  
  public final int a()
  {
    if (this.k) {}
    for (int m = 1;; m = 0)
    {
      hhf localhhf = this.j;
      int n = 0;
      if (localhhf == null) {}
      for (;;)
      {
        return m + n;
        n = this.j.a();
      }
    }
  }
  
  public final int a(int paramInt)
  {
    if ((this.k) && (paramInt == -1 + a())) {
      return 1;
    }
    return 0;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.f = ((hha)parammbb.a(hha.class));
    this.g = ((kxq)parammbb.a(kxq.class));
    this.e = ((hgz)parammbb.a(hgz.class));
    this.d = ((git)parammbb.a(git.class)).c();
  }
  
  public final void a(Bundle paramBundle)
  {
    this.c = new agi(this.h.getResources().getDimensionPixelSize(efj.Kg), -2);
    int m = this.h.getResources().getDimensionPixelSize(efj.Kh);
    this.c.setMargins(m, m, m, m);
  }
  
  public final void a(hhf paramhhf)
  {
    if (this.j == paramhhf) {
      return;
    }
    if (this.j != null) {
      this.j.d();
    }
    this.j = paramhhf;
    if ((this.j != null) && (!TextUtils.isEmpty(this.j.c()))) {}
    for (boolean bool = true;; bool = false)
    {
      this.k = bool;
      this.a.b();
      return;
    }
  }
  
  public final String b()
  {
    if (this.j == null) {
      return null;
    }
    return this.j.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hom
 * JD-Core Version:    0.7.0.1
 */