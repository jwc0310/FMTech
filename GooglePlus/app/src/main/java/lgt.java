import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.squares.providers.acl.SquareAvatarView;
import java.util.List;

public final class lgt
  extends mca
  implements cw<Cursor>, gos, gpb, hrd, hrx, kym, luu
{
  private static final String[] a = { "square_id", "square_name", "photo_url", "restricted_domain", "square_streams", "post_visibility" };
  private hrs Z;
  private boolean aa;
  private boolean ab;
  private SparseArray<lgu> ac = new SparseArray();
  private kyl ad;
  private goi ae;
  private git af;
  private boolean ag;
  private jmu ah = new jmu(this, this.bp);
  private ifj ai;
  private boolean aj;
  private Cursor b;
  private int c;
  private hrf d;
  
  private final void a(lgu paramlgu)
  {
    if (paramlgu.a.c == null)
    {
      this.ad.a(paramlgu.a).a(h(), null);
      return;
    }
    c(paramlgu);
  }
  
  private final void c(Parcelable paramParcelable)
  {
    if (!this.Z.b())
    {
      gpa.a(paramParcelable, this).a(this.x, "RemoveCirclesWarning");
      return;
    }
    d(paramParcelable);
  }
  
  private final void d(Parcelable paramParcelable)
  {
    this.Z.a();
    this.Z.a(paramParcelable);
    this.ae.a(-1);
  }
  
  private void y()
  {
    if (this.ab) {
      k().b(0, null, this);
    }
  }
  
  public final int a(Context paramContext)
  {
    return goy.a(paramContext);
  }
  
  public final Parcelable a(int paramInt)
  {
    int i = 1;
    this.b.moveToPosition(paramInt);
    lgu locallgu = (lgu)this.ac.get(paramInt);
    kzc[] arrayOfkzc;
    String str1;
    if (locallgu == null)
    {
      arrayOfkzc = kzc.a(this.b.getBlob(4));
      if ((arrayOfkzc == null) || (arrayOfkzc.length != i)) {
        break label215;
      }
      str1 = arrayOfkzc[0].a;
    }
    for (String str2 = arrayOfkzc[0].b;; str2 = null)
    {
      lgw locallgw = lgu.a();
      locallgw.b = this.b.getString(2);
      String str3;
      String str4;
      if (this.b.getInt(5) == 0)
      {
        int k = i;
        locallgw.c = k;
        str3 = this.b.getString(0);
        str4 = this.b.getString(i);
        if (TextUtils.isEmpty(this.b.getString(3))) {
          break label210;
        }
      }
      for (;;)
      {
        locallgw.a = new lhp(str3, str4, str1, str2, i);
        locallgu = new lgu(locallgw);
        this.ac.put(paramInt, locallgu);
        return locallgu;
        int m = 0;
        break;
        label210:
        int j = 0;
      }
      label215:
      str1 = null;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    kzp localkzp = new kzp(this.bn, this.c, a);
    localkzp.a(1);
    if (this.aa) {
      localkzp.r.appendWhere(" AND restricted_domain!=''");
    }
    if (this.aj) {
      localkzp.b(1);
    }
    return localkzp;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    this.b.moveToPosition(paramInt);
    goy localgoy = (goy)paramView;
    localgoy.a(this.b.getString(1));
    lgu locallgu = (lgu)a(paramInt);
    SquareAvatarView localSquareAvatarView = (SquareAvatarView)localgoy.b;
    String str = this.b.getString(2);
    if (str != null) {
      localSquareAvatarView.a.a(null, str);
    }
    localSquareAvatarView.b.a(locallgu);
    efj.a(paramView, new kuw(pjo.u, locallgu.a.a));
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    this.ah.a();
    a((lgu)paramBundle.getParcelable("MinorWarningDialogExtra"));
  }
  
  public final void a(Parcelable paramParcelable)
  {
    int i;
    if ((this.Z != null) && ((paramParcelable instanceof lgu)))
    {
      if (!this.Z.c(paramParcelable)) {
        break label53;
      }
      this.Z.b(paramParcelable);
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        a((lgu)paramParcelable);
      }
      return;
      label53:
      lgu locallgu = (lgu)paramParcelable;
      if ((this.ag) && (locallgu.c) && (!this.af.f().c("minor_public_extended_dialog")))
      {
        i = 1;
        this.ah.a(null, paramParcelable);
      }
      else
      {
        i = 0;
      }
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(hrf paramhrf)
  {
    this.d = paramhrf;
  }
  
  public final void a(lhp paramlhp)
  {
    lgw locallgw = lgu.a();
    locallgw.a = paramlhp;
    c(new lgu(locallgw));
  }
  
  public final void a(boolean paramBoolean)
  {
    this.aa = paramBoolean;
    if ((this.Z != null) && (this.aa))
    {
      List localList = this.Z.c();
      for (int i = 0; i < localList.size(); i++) {
        if ((localList.get(i) instanceof lgu))
        {
          lgu locallgu = (lgu)localList.get(i);
          if (!locallgu.a.e) {
            this.Z.b(locallgu);
          }
        }
      }
    }
    y();
  }
  
  public final void aM_() {}
  
  public final View b(Context paramContext)
  {
    goy localgoy = new goy(paramContext);
    localgoy.a(new SquareAvatarView(paramContext));
    return localgoy;
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(Parcelable paramParcelable)
  {
    d(paramParcelable);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((git)this.bo.a(git.class)).c();
    this.Z = ((hrs)this.bo.b(hrs.class));
    ((gor)this.bo.a(gor.class)).a(this);
    this.bo.a(kym.class, this);
    this.ad = ((kyl)this.bo.a(kyl.class));
    this.ae = ((goi)this.bo.a(goi.class));
    this.af = ((git)this.bo.a(git.class));
    this.ag = this.af.f().c("is_child");
    this.ai = ((ifj)this.bo.a(ifj.class));
    kys localkys = (kys)this.bo.b(kys.class);
    if ((localkys != null) && (localkys.a)) {}
    for (boolean bool = true;; bool = false)
    {
      this.aj = bool;
      return;
    }
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void m()
  {
    super.m();
    this.ab = true;
    k().a(0, null, this);
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
    return false;
  }
  
  public final int x()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.getCount();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lgt
 * JD-Core Version:    0.7.0.1
 */