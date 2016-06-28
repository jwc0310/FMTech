import android.view.View;
import android.view.View.OnClickListener;

final class csv
  implements View.OnClickListener
{
  csv(cso paramcso) {}
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    cso localcso = this.a;
    boolean bool1;
    gxz localgxz;
    if (i == aaw.hN)
    {
      bool1 = true;
      localcso.k = bool1;
      if (!this.a.k) {
        break label169;
      }
      if (this.a.h) {
        break label161;
      }
      if (this.a.f.b.booleanValue()) {
        break label153;
      }
      localgxz = gxz.cB;
      label67:
      if (this.a.a != null)
      {
        csx localcsx = this.a.a;
        int j = this.a.i;
        boolean bool2 = this.a.l;
        boolean bool3 = false;
        if (!bool2) {
          bool3 = true;
        }
        localcsx.a(j, bool3, true);
      }
    }
    for (;;)
    {
      this.a.a(localgxz, gya.T);
      this.a.a();
      return;
      bool1 = false;
      break;
      label153:
      localgxz = gxz.cz;
      break label67;
      label161:
      localgxz = gxz.cA;
      break label67;
      label169:
      localgxz = gxz.cD;
      if (this.a.a != null) {
        this.a.a.b(true);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csv
 * JD-Core Version:    0.7.0.1
 */