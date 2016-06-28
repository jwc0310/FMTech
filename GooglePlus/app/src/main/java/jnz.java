import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.social.acl2.AclPickerActionBarView;
import com.google.android.libraries.social.people.providers.acl.CircleAvatarView;
import com.google.android.libraries.social.people.providers.search.CircleSearchRowView;
import com.google.android.libraries.social.people.ui.PeopleListRowNameView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class jnz
  extends mca
  implements gos, hrd, hrx, jhw, jhy, lzp
{
  private int Z;
  String a;
  private jiw aa;
  private List<jmm> ab;
  private Map<jgw, List<jjg>> ac;
  private hrs ad;
  private lzo ae;
  private goa af;
  private jjm<jgw> ag = new joa(this);
  jjm<jgw> b = this.c;
  private jjm<jgw> c = jgx.g;
  private hrf d;
  
  private final void a(List<jgw> paramList)
  {
    ArrayList localArrayList;
    if (paramList != null)
    {
      localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        jgw localjgw = (jgw)localIterator.next();
        if ((!(this.ad instanceof hrr)) || (!((hrr)this.ad).a(170, localjgw.b())))
        {
          jmo localjmo = jmm.a();
          localjmo.a = localjgw;
          localArrayList.add(new jmm(localjmo));
        }
      }
    }
    for (this.ab = localArrayList;; this.ab = null)
    {
      if (this.d != null) {
        this.d.aL_();
      }
      return;
    }
  }
  
  private void y()
  {
    if (this.aa != null) {
      this.aa.a(this, this.Z, this.ag);
    }
  }
  
  public final void Q_() {}
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.ab.get(paramInt);
  }
  
  public final void a() {}
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jgw localjgw = ((jmm)this.ab.get(paramInt)).a;
    CircleSearchRowView localCircleSearchRowView = (CircleSearchRowView)paramView;
    List localList;
    if (this.ac != null)
    {
      localList = (List)this.ac.get(localjgw);
      if ((localList != null) && (!localList.isEmpty())) {
        break label144;
      }
      localCircleSearchRowView.a.a(localjgw.e(), false);
    }
    for (;;)
    {
      localCircleSearchRowView.b.a(localjgw.c(), false, null, null, false, false);
      gxt localgxt = pkd.q;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localjgw.b();
      efj.a(paramView, new kut(localgxt, arrayOfString));
      return;
      localList = null;
      break;
      label144:
      if ((localjgw.e() == 1) && (!localList.isEmpty())) {
        localCircleSearchRowView.a.a(localList);
      }
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.a = paramBundle.getString("state_query");
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((this.ad != null) && ((paramParcelable instanceof jmm)))
    {
      if (!this.ad.c(paramParcelable)) {
        break label84;
      }
      this.ad.b(paramParcelable);
    }
    for (;;)
    {
      if (this.ae != null) {
        this.ae.a.a(null, true);
      }
      if (this.af != null)
      {
        goa localgoa = this.af;
        if (localgoa.a != null) {
          localgoa.a.a();
        }
      }
      return;
      label84:
      this.ad.a(paramParcelable);
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.d = paramhrf;
  }
  
  public final void a(String paramString)
  {
    if (paramString != null)
    {
      String str = this.a;
      this.a = paramString.trim();
      if (!this.a.equals(str))
      {
        if (!TextUtils.isEmpty(this.a)) {
          break label44;
        }
        a(null);
      }
    }
    return;
    label44:
    y();
  }
  
  public final void a(jgu paramjgu)
  {
    a(paramjgu.a());
    paramjgu.b();
  }
  
  public final void a(jjr paramjjr)
  {
    List localList = paramjjr.a();
    paramjjr.b();
    this.ac = new kl(localList.size());
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      this.ac.put(localPair.first, localPair.second);
    }
    if (this.d != null) {
      this.d.aL_();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (jjm localjjm = jgx.i;; localjjm = this.c)
    {
      this.b = localjjm;
      y();
      return;
    }
  }
  
  public final View b(Context paramContext)
  {
    return a_(null).inflate(efj.SK, null);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((git)this.bo.a(git.class)).c();
    this.aa = ((jiw)this.bo.a(jiw.class));
    this.ae = ((lzo)this.bo.b(lzo.class));
    if (this.ae != null) {
      this.ae.a(this);
    }
    this.ad = ((hrs)this.bo.b(hrs.class));
    jme localjme = (jme)this.bo.b(jme.class);
    if ((localjme != null) && (localjme.a != null))
    {
      this.c = localjme.a;
      this.b = this.c;
    }
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null) {
      localgor.a(this);
    }
    this.af = ((goa)this.bo.b(goa.class));
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("state_query", this.a);
  }
  
  public final void p_()
  {
    super.p_();
    if (this.aa != null) {
      this.aa.a(this, this.Z, 3, this.b);
    }
    y();
  }
  
  public final boolean v()
  {
    return false;
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final int x()
  {
    if (this.ab == null) {
      return 0;
    }
    return this.ab.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnz
 * JD-Core Version:    0.7.0.1
 */