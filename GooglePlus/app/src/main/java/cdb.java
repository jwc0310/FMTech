import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;

final class cdb
  implements View.OnClickListener
{
  cdb(cda paramcda) {}
  
  public final void onClick(View paramView)
  {
    gnb localgnb = (gnb)paramView.getTag(aaw.fk);
    if (localgnb != null)
    {
      this.a.a(localgnb);
      return;
    }
    int i = ((Integer)paramView.getTag(aaw.fj)).intValue();
    int j = this.a.a.c();
    gnm localgnm = (gnm)this.a.aj.get(i);
    if (localgnm != null)
    {
      cda localcda5 = this.a;
      this.a.f();
      this.a.a.c();
      cda localcda6 = this.a;
      int n = aau.pm;
      localcda6.g().getString(n);
      localcda5.a(localgnm.e(), 1);
      return;
    }
    if (i == 1)
    {
      cda localcda3 = this.a;
      bp localbp2 = this.a.f();
      cda localcda4 = this.a;
      int m = aau.pm;
      localcda4.g().getString(m);
      localcda3.a(efj.a(localbp2, j, null, 5, true, false, false, false, true, i), 1);
      return;
    }
    cda localcda1 = this.a;
    bp localbp1 = this.a.f();
    cda localcda2 = this.a;
    int k = aau.pm;
    localcda2.g().getString(k);
    localcda1.a(efj.a(localbp1, j, null, 9, true, false, false, false, true, i), 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdb
 * JD-Core Version:    0.7.0.1
 */