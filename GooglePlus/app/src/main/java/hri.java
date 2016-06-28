import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.List;

public final class hri
  implements mbo, mec, mfa, mfd, mfe
{
  private final bw a;
  private final hrk b;
  private final hqt c;
  private final hrg d;
  private final String e;
  private Context f;
  private hrm g;
  
  public hri(hrg paramhrg, String paramString, hrk paramhrk, bw parambw, mek parammek, hqt paramhqt, hrm paramhrm)
  {
    this.d = paramhrg;
    this.e = paramString;
    this.b = paramhrk;
    this.a = parambw;
    this.c = paramhqt;
    this.g = paramhrm;
    parammek.a(this);
  }
  
  public hri(hrg paramhrg, String paramString, hrk paramhrk, bw parambw, mek parammek, hrm paramhrm)
  {
    this(paramhrg, paramString, paramhrk, parambw, parammek, new hrl(), paramhrm);
  }
  
  private final void a(hrd paramhrd)
  {
    hre localhre = new hre(this.f, paramhrd);
    this.c.a(localhre);
    hrl localhrl;
    hrm localhrm1;
    hrn localhrn;
    if ((this.g != null) && ((paramhrd instanceof hrn)))
    {
      if (!(this.c instanceof hrl)) {
        throw new IllegalArgumentException();
      }
      localhrl = (hrl)this.c;
      localhrm1 = this.g;
      localhrn = (hrn)paramhrd;
      if (localhrm1.b != null) {
        break label137;
      }
    }
    label137:
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "Cannot have more than one EmptyViewProvider!");
      localhrm1.b = localhrn;
      hrm localhrm2 = this.g;
      localhrl.registerDataSetObserver(localhrm2);
      localhrm2.a = localhrl;
      localhrl.a = localhre;
      paramhrd.a(new hrj(this, localhre));
      return;
    }
  }
  
  public final String a()
  {
    return this.e;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.f = paramContext;
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    List localList = this.a.f();
    if ((localList == null) || (localList.isEmpty()))
    {
      cl localcl = this.a.a();
      int i = 0;
      while (i < this.d.size())
      {
        hrd localhrd = (hrd)this.d.get(i);
        if ((localhrd instanceof bk))
        {
          a(localhrd);
          localcl.a((bk)localhrd, this.e);
          i++;
        }
        else
        {
          throw new IllegalArgumentException("DataProvider must extend Fragment.");
        }
      }
      localcl.b();
    }
    for (;;)
    {
      this.b.a(this.c);
      return;
      for (int j = 0; j < localList.size(); j++)
      {
        bk localbk = (bk)localList.get(j);
        if ((localbk != null) && (TextUtils.equals(localbk.D, this.e))) {
          a((hrd)localbk);
        }
      }
    }
  }
  
  public final void b(Bundle paramBundle) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hri
 * JD-Core Version:    0.7.0.1
 */