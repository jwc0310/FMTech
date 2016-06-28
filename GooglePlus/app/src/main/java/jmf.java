import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.google.android.libraries.social.people.providers.acl.CircleAvatarView;
import java.util.ArrayList;
import java.util.List;

public final class jmf
  extends mca
  implements gos, hrd, hrx, jhy, luu
{
  private git Z;
  jjm<jgw> a = jgx.g;
  private jiw aa;
  private hrs ab;
  private List<Pair<jgw, List<jjg>>> ac;
  private jjm<jgw> ad;
  private SparseArray<jmm> ae = new SparseArray();
  private boolean af;
  private jmu ag = new jmu(this, this.bp);
  private boolean ah;
  private ifj ai;
  private final jjm<jgw> b = new jmg(this);
  private jmm c;
  private hrf d;
  
  private void y()
  {
    if (this.aa != null) {
      this.aa.a(this, this.Z.c(), 3, this.ad);
    }
  }
  
  public final void Q_() {}
  
  public final int a(Context paramContext)
  {
    return goy.a(paramContext);
  }
  
  public final Parcelable a(int paramInt)
  {
    jmm localjmm = (jmm)this.ae.get(paramInt);
    if (localjmm == null)
    {
      jmo localjmo = jmm.a();
      localjmo.a = ((jgw)((Pair)this.ac.get(paramInt)).first);
      localjmm = new jmm(localjmo);
      this.ae.put(paramInt, localjmm);
    }
    return localjmm;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jgw localjgw = (jgw)((Pair)this.ac.get(paramInt)).first;
    List localList = (List)((Pair)this.ac.get(paramInt)).second;
    goy localgoy = (goy)paramView;
    String str1 = localjgw.c();
    localgoy.a(str1);
    String str2;
    CircleAvatarView localCircleAvatarView;
    if (paramBoolean)
    {
      str2 = paramContext.getString(aaw.pP, new Object[] { str1 });
      localgoy.setContentDescription(str2);
      localCircleAvatarView = (CircleAvatarView)localgoy.b;
      if ((localjgw.e() != 1) || (localList.isEmpty())) {
        break label216;
      }
      localCircleAvatarView.a(localList);
    }
    for (;;)
    {
      jmm localjmm = (jmm)a(paramInt);
      localCircleAvatarView.a.a(localjmm);
      gxt localgxt = pkd.q;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localjmm.a.b();
      efj.a(paramView, new kut(localgxt, arrayOfString));
      return;
      str2 = paramContext.getString(aaw.pQ, new Object[] { str1 });
      break;
      label216:
      int i = localjgw.e();
      switch (i)
      {
      case 8: 
      default: 
        localCircleAvatarView.a(i, false);
        break;
      case 7: 
      case 9: 
        if (this.ah) {
          localCircleAvatarView.a(i, true);
        } else {
          localCircleAvatarView.a(i, false);
        }
        break;
      }
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    this.ag.a();
    this.ab.a(paramBundle.getParcelable("MinorWarningDialogExtra"));
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((this.ab != null) && ((paramParcelable instanceof jmm)))
    {
      if (this.ab.c(paramParcelable)) {
        this.ab.b(paramParcelable);
      }
    }
    else {
      return;
    }
    jmm localjmm = (jmm)paramParcelable;
    int j;
    if (this.ah) {
      switch (localjmm.a.e())
      {
      case 8: 
      default: 
        j = 0;
        label91:
        if ((j != 0) && (!this.Z.f().c("minor_public_extended_dialog"))) {
          this.ag.a(localjmm.a.c(), localjmm);
        }
        break;
      }
    }
    for (int i = 1; i == 0; i = 0)
    {
      this.ab.a(paramParcelable);
      return;
      j = 1;
      break label91;
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.d = paramhrf;
  }
  
  public final void a(jjr paramjjr)
  {
    Object localObject1 = null;
    List localList = paramjjr.a();
    paramjjr.b();
    int i = localList.size();
    ArrayList localArrayList1 = new ArrayList(i);
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5;
    jgw localjgw;
    Object localObject6;
    Object localObject8;
    Object localObject7;
    if (j < i)
    {
      localObject5 = (Pair)localList.get(j);
      localjgw = (jgw)((Pair)localObject5).first;
      if (localjgw.e() == 9)
      {
        jmo localjmo = jmm.a();
        localjmo.a = localjgw;
        this.c = new jmm(localjmo);
        localObject6 = localObject2;
        localObject8 = localObject5;
        localObject5 = localObject1;
        localObject7 = localObject3;
      }
    }
    for (;;)
    {
      j++;
      localObject4 = localObject8;
      localObject2 = localObject6;
      localObject3 = localObject7;
      localObject1 = localObject5;
      break;
      if (localjgw.e() == 8)
      {
        localObject6 = localObject2;
        localObject8 = localObject4;
        Object localObject9 = localObject5;
        localObject5 = localObject1;
        localObject7 = localObject9;
      }
      else if (localjgw.e() == 5)
      {
        localObject6 = localObject5;
        localObject8 = localObject4;
        localObject5 = localObject1;
        localObject7 = localObject3;
      }
      else if (localjgw.e() == 7)
      {
        localObject6 = localObject2;
        localObject7 = localObject3;
        localObject8 = localObject4;
      }
      else if (this.ad.a(localjgw))
      {
        localArrayList1.add(localObject5);
        k += Math.min(((List)((Pair)localObject5).second).size(), 3);
        localObject5 = localObject1;
        localObject6 = localObject2;
        localObject7 = localObject3;
        localObject8 = localObject4;
        continue;
        ArrayList localArrayList2 = new ArrayList(i);
        if ((localObject4 != null) && (this.ad.a(localObject4.first))) {
          localArrayList2.add(localObject4);
        }
        if ((localObject3 != null) && (this.ad.a(localObject3.first))) {
          localArrayList2.add(localObject3);
        }
        if ((localObject2 != null) && (this.ad.a(localObject2.first))) {
          localArrayList2.add(localObject2);
        }
        localArrayList2.addAll(localArrayList1);
        if ((localObject1 != null) && (this.ad.a(localObject1.first))) {
          localArrayList2.add(localObject1);
        }
        this.ac = localArrayList2;
        this.ae.clear();
        if (k > 0)
        {
          int m = jmi.a(this.bn);
          this.ai.a(m, m, k, 0.2D);
        }
        if (this.d != null) {
          this.d.aL_();
        }
      }
      else
      {
        localObject5 = localObject1;
        localObject6 = localObject2;
        localObject7 = localObject3;
        localObject8 = localObject4;
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    jjm localjjm;
    if (paramBoolean)
    {
      localjjm = this.b;
      this.ad = localjjm;
      if ((this.ab != null) && (this.c != null))
      {
        if (this.ad != this.b) {
          break label83;
        }
        this.af = this.ab.c(this.c);
        this.ab.b(this.c);
      }
    }
    for (;;)
    {
      y();
      return;
      localjjm = this.a;
      break;
      label83:
      if (this.af) {
        this.ab.a(this.c);
      }
    }
  }
  
  public final View b(Context paramContext)
  {
    goy localgoy = new goy(paramContext);
    localgoy.a(new CircleAvatarView(paramContext));
    return localgoy;
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((git)this.bo.a(git.class));
    this.aa = ((jiw)this.bo.a(jiw.class));
    this.ab = ((hrs)this.bo.b(hrs.class));
    this.ah = this.Z.f().c("is_child");
    this.ai = ((ifj)this.bo.a(ifj.class));
    jme localjme = (jme)this.bo.b(jme.class);
    if ((localjme != null) && (localjme.a != null))
    {
      this.a = localjme.a;
      if (this.ad == null) {
        this.ad = this.a;
      }
    }
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null) {
      localgor.a(this);
    }
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void p_()
  {
    super.p_();
    if (this.ad == null) {
      this.ad = this.a;
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
    if (this.ac == null) {
      return 0;
    }
    return this.ac.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmf
 * JD-Core Version:    0.7.0.1
 */