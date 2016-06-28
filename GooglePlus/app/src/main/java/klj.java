import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import java.util.List;

final class klj
  implements View.OnClickListener
{
  klj(klg paramklg) {}
  
  public final void onClick(View paramView)
  {
    gnb localgnb1 = (gnb)paramView.getTag();
    if (localgnb1 == null)
    {
      bp localbp2 = this.a.f;
      gxr localgxr2 = new gxr();
      gxq localgxq2 = new gxq(pkd.n);
      localgxr2.b.add(localgxq2);
      new gwz(4, localgxr2.a(this.a.f)).b(localbp2);
      this.a.k();
    }
    for (;;)
    {
      this.a.S.b.dismiss();
      return;
      bp localbp1 = this.a.f;
      gxr localgxr1 = new gxr();
      gxq localgxq1 = new gxq(pkd.p);
      localgxr1.b.add(localgxq1);
      new gwz(4, localgxr1.a(this.a.f)).b(localbp1);
      gnb localgnb2 = gnb.a(this.a.M.c);
      if (efj.z(this.a.f.getBaseContext(), this.a.O))
      {
        this.a.W = null;
        if (localgnb2 != null) {
          this.a.W = localgnb2.b;
        }
        if (klg.a(localgnb1))
        {
          klg localklg = this.a;
          lhp locallhp = localgnb1.d[0];
          localklg.X = localklg.V.a(locallhp);
          localklg.X.a(localklg.f.b.a.d, "ShareboxMixin");
        }
        else
        {
          klg.a(this.a, localgnb1, this.a.W);
        }
      }
      else
      {
        jjd[] arrayOfjjd = null;
        if (localgnb2 != null) {
          arrayOfjjd = localgnb2.b;
        }
        klg.a(this.a, localgnb1, arrayOfjjd);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klj
 * JD-Core Version:    0.7.0.1
 */