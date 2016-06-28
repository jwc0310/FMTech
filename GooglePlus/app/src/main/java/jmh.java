import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.people.providers.acl.PersonAvatarView;
import java.util.List;

public final class jmh
  extends mca
  implements View.OnClickListener, gos, hrd, hrx, jhx
{
  private static Drawable a;
  private List<jjg> Z;
  private hrs aa;
  private jjm<jjg> ab = jjh.a;
  private SparseArray<jne> ac = new SparseArray();
  private jme ad;
  private gov ae;
  private int af;
  private ifj ag;
  private hrf b;
  private int c;
  private jiw d;
  
  private final int a(String paramString, int paramInt)
  {
    if (this.m == null) {
      return paramInt;
    }
    return this.m.getInt(paramString, paramInt);
  }
  
  private void y()
  {
    if (this.d != null)
    {
      this.ac.clear();
      this.d.a(this, this.c, a("people_sort_order", 0), this.af, this.ab);
    }
  }
  
  private final void z()
  {
    if ((this.Z != null) && (!this.Z.isEmpty()) && (this.Z.size() < this.af) && (this.ae != null)) {
      this.ae.setVisibility(8);
    }
  }
  
  public final int a(Context paramContext)
  {
    return goy.a(paramContext);
  }
  
  public final Parcelable a(int paramInt)
  {
    jne localjne = (jne)this.ac.get(paramInt);
    jjg localjjg;
    Parcelable localParcelable;
    if (localjne == null)
    {
      localjjg = (jjg)this.Z.get(paramInt);
      String str = localjjg.a();
      if (!(this.aa instanceof hrr)) {
        break label124;
      }
      localParcelable = ((hrr)this.aa).b(170, str);
      if (!(localParcelable instanceof jne)) {
        break label124;
      }
    }
    label124:
    for (boolean bool = ((jne)localParcelable).b;; bool = true)
    {
      jng localjng = jne.a();
      localjng.a = localjjg;
      localjng.b = bool;
      localjne = new jne(localjng);
      this.ac.put(paramInt, localjne);
      return localjne;
    }
  }
  
  public final void a() {}
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jjg localjjg = (jjg)this.Z.get(paramInt);
    goy localgoy = (goy)paramView;
    Drawable localDrawable;
    if (localjjg.m())
    {
      String str2 = localjjg.d();
      if (a == null) {
        a = g().getDrawable(efj.St);
      }
      localDrawable = a;
      localgoy.a(str2);
      localgoy.a.setCompoundDrawablePadding(localgoy.getResources().getDimensionPixelSize(efj.Ed));
      if (Build.VERSION.SDK_INT >= 17) {
        localgoy.a.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, localDrawable, null);
      }
    }
    for (;;)
    {
      jne localjne = (jne)a(paramInt);
      ((PersonAvatarView)localgoy.b).a(localjjg).a.a(localjne);
      String str1 = localjne.a.c();
      if (str1 != null) {
        efj.a(paramView, new kvk(pkd.s, str1));
      }
      return;
      localgoy.a.setCompoundDrawablesWithIntrinsicBounds(null, null, localDrawable, null);
      continue;
      localgoy.a(localjjg.d());
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    int i = a("people_people_count per_page", 2147483647);
    if (paramBundle != null)
    {
      this.af = paramBundle.getInt("people_people_count per_page");
      return;
    }
    this.af = i;
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((this.aa != null) && ((paramParcelable instanceof jne)))
    {
      if (!this.aa.c(paramParcelable)) {
        break label49;
      }
      if (((jne)paramParcelable).b) {
        this.aa.b(paramParcelable);
      }
    }
    return;
    label49:
    this.aa.a(paramParcelable);
  }
  
  public final void a(View paramView)
  {
    this.ae = ((gov)paramView);
    this.ae.setText(a("people_footer_title_res_id", aaw.pE));
    this.ae.setOnClickListener(this);
    z();
  }
  
  public final void a(hrf paramhrf)
  {
    this.b = paramhrf;
  }
  
  public final void a(jil paramjil)
  {
    this.Z = paramjil.a();
    paramjil.b();
    if ((this.Z != null) && (this.Z.size() > 0))
    {
      int i = efj.m(this.bn);
      this.ag.a(i, i, this.Z.size(), 0.5D);
    }
    if (this.b != null) {
      this.b.aL_();
    }
    z();
  }
  
  public final void a(boolean paramBoolean)
  {
    jjm localjjm;
    int i;
    label54:
    Parcelable localParcelable;
    if ((this.ad != null) && (this.ad.b)) {
      if (paramBoolean)
      {
        localjjm = jjh.d;
        this.ab = localjjm;
        if ((this.aa == null) || (!paramBoolean)) {
          break label179;
        }
        List localList = this.aa.c();
        i = 0;
        if (i >= localList.size()) {
          break label179;
        }
        localParcelable = (Parcelable)localList.get(i);
        if (((!(localParcelable instanceof jne)) || (((jne)localParcelable).b)) && ((localParcelable instanceof jne))) {
          if (((jne)localParcelable).a.k() != 2) {
            break label173;
          }
        }
      }
    }
    label173:
    for (int j = 1;; j = 0)
    {
      if (j == 0) {
        this.aa.b(localParcelable);
      }
      i++;
      break label54;
      localjjm = jjh.b;
      break;
      if (paramBoolean)
      {
        localjjm = jjh.c;
        break;
      }
      localjjm = jjh.a;
      break;
    }
    label179:
    y();
  }
  
  public final View b(Context paramContext)
  {
    goy localgoy = new goy(paramContext);
    localgoy.a(new PersonAvatarView(paramContext));
    return localgoy;
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((git)this.bo.a(git.class)).c();
    this.d = ((jiw)this.bo.a(jiw.class));
    this.aa = ((hrs)this.bo.b(hrs.class));
    this.ad = ((jme)this.bo.b(jme.class));
    this.ag = ((ifj)this.bo.a(ifj.class));
    ((gor)this.bo.a(gor.class)).a(this);
  }
  
  public final View d(Context paramContext)
  {
    this.ae = new gov(paramContext);
    return this.ae;
  }
  
  public final void d_()
  {
    super.d_();
    this.ae = null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("people_people_count per_page", this.af);
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.ae)
    {
      this.af = 2147483647;
      y();
    }
  }
  
  public final void p_()
  {
    super.p_();
    y();
  }
  
  public final boolean v()
  {
    return false;
  }
  
  public final boolean w()
  {
    return true;
  }
  
  public final int x()
  {
    if (this.Z == null) {
      return 0;
    }
    return this.Z.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmh
 * JD-Core Version:    0.7.0.1
 */