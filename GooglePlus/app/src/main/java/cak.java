import android.content.res.Resources;
import android.view.View;

public final class cak
  extends bxp
{
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.aT) {
      G();
    }
    while (i != aaw.jk) {
      return;
    }
    if ((!this.b.f) && (this.c.f))
    {
      int j = aau.em;
      String str1 = g().getString(j);
      int k = aau.vS;
      String str2 = g().getString(k);
      int m = aau.cM;
      lut locallut = lut.a(null, str1, str2, g().getString(m), 0, 0);
      locallut.n = this;
      locallut.p = 0;
      locallut.a(this.x, "disable_share_to_following");
      return;
    }
    E();
  }
  
  protected final boolean v()
  {
    return false;
  }
  
  protected final boolean x()
  {
    return !this.b.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cak
 * JD-Core Version:    0.7.0.1
 */