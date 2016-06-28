import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ioo
  extends mca
  implements gjh, keo
{
  private kez Z;
  ios a;
  private git aa;
  private giz ab;
  private PreferenceCategory ac;
  gug b = new gug(this.bp, (byte)0).a(this.bo).a(efj.ON, this.c);
  private final guf c = new iop(this);
  private final ken d = new ken(this, this.bp);
  
  private final void a(PreferenceCategory paramPreferenceCategory)
  {
    giz localgiz = (giz)mbb.a(this.bn, giz.class);
    List localList = localgiz.a();
    ikl localikl = x();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      gjb localgjb = localgiz.a(localInteger.intValue());
      localInteger.intValue();
      if (localikl.a(localgjb))
      {
        Intent localIntent1 = (Intent)this.m.getParcelable("account_intent");
        if (localIntent1 != null)
        {
          Intent localIntent2 = (Intent)localIntent1.clone();
          localIntent2.putExtra("account_id", localInteger);
          paramPreferenceCategory.b(this.Z.a(localgjb.b("display_name"), localgjb.b("account_name"), localIntent2));
        }
        else
        {
          throw new IllegalStateException("Must set intent for accounts to be visible");
        }
      }
    }
  }
  
  private final ket w()
  {
    kez localkez = this.Z;
    int i = efj.OP;
    ket localket = localkez.a(g().getString(i), null);
    localket.p = new ioq(this);
    return localket;
  }
  
  private final ikl x()
  {
    Object localObject = (ikl)this.m.getParcelable("account_filter");
    if (localObject == null)
    {
      localObject = new ikn();
      ((ikn)localObject).a.add("logged_in");
    }
    return localObject;
  }
  
  public final void az_()
  {
    if (!this.m.getBoolean("allow_no_accounts"))
    {
      ArrayList localArrayList1 = new ArrayList();
      List localList = this.ab.a();
      ikl localikl = x();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        int m = ((Integer)localIterator.next()).intValue();
        if (localikl.a(this.ab.a(m))) {
          localArrayList1.add(Integer.valueOf(m));
        }
      }
      Collections.sort(localArrayList1, new gis(this.ab));
      if (localArrayList1.isEmpty())
      {
        f().finish();
        return;
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    int k;
    for (int i = 0;; i++)
    {
      int j = this.ac.a.size();
      k = 0;
      if (i >= j) {
        break;
      }
      localArrayList2.add((ket)this.ac.a.get(i));
    }
    while (k < localArrayList2.size())
    {
      PreferenceCategory localPreferenceCategory = this.ac;
      localPreferenceCategory.c((ket)localArrayList2.get(k));
      localPreferenceCategory.h();
      k++;
    }
    a(this.ac);
    this.ac.b(w());
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((ios)this.bo.b(ios.class));
    this.aa = ((git)this.bo.a(git.class));
    this.ab = ((giz)this.bo.a(giz.class));
  }
  
  public final void m()
  {
    super.m();
    if ((!f().isFinishing()) && (this.aa.d()) && (!this.aa.f().a()) && (this.a != null)) {
      this.a.f();
    }
  }
  
  public final void p_()
  {
    super.p_();
    this.ab.a(this);
    az_();
  }
  
  public final void q_()
  {
    super.q_();
    this.ab.b(this);
  }
  
  public final void v()
  {
    this.Z = new kez(this.bn);
    kez localkez = this.Z;
    int i = efj.OO;
    this.ac = localkez.a(g().getString(i));
    ken localken = this.d;
    PreferenceCategory localPreferenceCategory = this.ac;
    localken.a.b(localPreferenceCategory);
    a(this.ac);
    this.ac.b(w());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ioo
 * JD-Core Version:    0.7.0.1
 */