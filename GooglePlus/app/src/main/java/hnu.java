import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.social.collexions.impl.providers.acl.CollexionAvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.media.ui.RoundedMediaView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class hnu
  extends mca
  implements cw<Cursor>, gos, gpb, hrd, hrx, luu
{
  private int Z;
  Set<hrf> a = new HashSet();
  private boolean aa;
  private final hhp ab;
  private boolean ac;
  private git ad;
  private final jmu ae;
  private boolean af;
  private ifj ag;
  private guf ah;
  hrs b;
  goi c;
  private Cursor d;
  
  public hnu()
  {
    hph localhph = new hph(this.bp);
    this.bo.a(hhp.class, localhph);
    this.ab = ((hph)localhph);
    this.ae = new jmu(this, this.bp);
    this.ah = new hnv(this);
    new gxl(new gxq(pjn.Y)).a(this.bo);
    new gxj(this.bp, (byte)0);
    new gug(this.bp, (byte)0).a(this.bo).a(hhp.a, this.ah);
  }
  
  private final void c(Parcelable paramParcelable)
  {
    if (!this.b.b())
    {
      gpa.a(paramParcelable, this).a(this.x, "RemoveCirclesWarning");
      return;
    }
    d(paramParcelable);
  }
  
  private final void d(Parcelable paramParcelable)
  {
    this.b.a();
    this.b.a(paramParcelable);
    this.c.a(-1);
  }
  
  public final int a(Context paramContext)
  {
    return goy.a(paramContext);
  }
  
  public final Parcelable a(int paramInt)
  {
    int i = 1;
    hps localhps2;
    String str1;
    if (paramInt != 0)
    {
      this.d.moveToPosition(paramInt - 1);
      String str2 = this.d.getString(this.d.getColumnIndexOrThrow("cxn_id"));
      String str3 = this.d.getString(this.d.getColumnIndexOrThrow("cxn_name"));
      if (this.d.getInt(this.d.getColumnIndexOrThrow("sharing_target_group_type")) == 2)
      {
        int j = i;
        localhps2 = new hps(str2, str3, j);
        Cursor localCursor = this.d;
        str1 = localCursor.getString(localCursor.getColumnIndexOrThrow("cover_photo_url"));
        if (this.d.getInt(this.d.getColumnIndexOrThrow("visibility_type")) != i) {
          break label196;
        }
      }
    }
    label152:
    for (hps localhps1 = localhps2;; localhps1 = null)
    {
      hpr localhpr = hpp.a();
      localhpr.a = localhps1;
      localhpr.b = str1;
      localhpr.c = i;
      return new hpp(localhpr);
      int k = 0;
      break;
      label196:
      i = 0;
      break label152;
      str1 = null;
      i = 0;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new hmh(this.bn, this.Z, null, this.aa, this.ac);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    goy localgoy = (goy)paramView;
    CollexionAvatarView localCollexionAvatarView = (CollexionAvatarView)localgoy.b;
    Resources localResources = paramContext.getResources();
    int m;
    Object localObject;
    if (paramInt == 0)
    {
      localgoy.a(localResources.getString(efj.Jm));
      localCollexionAvatarView.a(null);
      int n = aaw.oJ;
      int i1 = localResources.getColor(ehr.bg);
      gxq localgxq = new gxq(pjn.Z);
      i = n;
      m = i1;
      localObject = localgxq;
      if (localCollexionAvatarView.d != i)
      {
        localCollexionAvatarView.d = i;
        RoundedMediaView localRoundedMediaView = localCollexionAvatarView.a;
        Bitmap localBitmap = BitmapFactory.decodeResource(localRoundedMediaView.getContext().getResources(), i);
        if (localBitmap == null) {
          localBitmap = (Bitmap)MediaView.j.b();
        }
        localRoundedMediaView.C = localBitmap;
        localCollexionAvatarView.b.setImageResource(i);
        localCollexionAvatarView.b.invalidate();
        localCollexionAvatarView.a.invalidate();
      }
      localCollexionAvatarView.a(m);
      efj.a(localgoy, (gxq)localObject);
      return;
    }
    this.d.moveToPosition(paramInt - 1);
    localgoy.a(this.d.getString(this.d.getColumnIndexOrThrow("cxn_name")));
    hpp localhpp = (hpp)a(paramInt);
    localCollexionAvatarView.a(localhpp.b).c.a(localhpp);
    int i = aaw.oK;
    int j = this.d.getColumnIndexOrThrow("color");
    if (this.d.isNull(j)) {}
    for (int k = localResources.getColor(ehr.bh);; k = this.d.getInt(j))
    {
      kuu localkuu = new kuu(pjn.X, localhpp.a.a);
      m = k;
      localObject = localkuu;
      break;
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    this.ae.a();
    c(paramBundle.getParcelable("MinorWarningDialogExtra"));
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((this.b != null) && ((paramParcelable instanceof hpp)))
    {
      if (((hpp)paramParcelable).a == null) {
        this.ab.a();
      }
    }
    else {
      return;
    }
    if (this.b.c(paramParcelable))
    {
      this.b.b(paramParcelable);
      return;
    }
    if ((this.af) && (((hpp)paramParcelable).c) && (!this.ad.f().c("minor_public_extended_dialog")))
    {
      this.ae.a(null, paramParcelable);
      return;
    }
    c(paramParcelable);
  }
  
  public final void a(View paramView) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(hrf paramhrf)
  {
    this.a.add(paramhrf);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.aa = paramBoolean;
    if ((this.b != null) && (this.aa))
    {
      List localList = this.b.c();
      for (int i = 0; i < localList.size(); i++) {
        if ((localList.get(i) instanceof hpp))
        {
          hpp localhpp = (hpp)localList.get(i);
          if (!localhpp.a.c) {
            this.b.b(localhpp);
          }
        }
      }
    }
    k().b(0, null, this);
  }
  
  public final View b(Context paramContext)
  {
    goy localgoy = new goy(paramContext);
    localgoy.a(new CollexionAvatarView(paramContext));
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
    this.Z = ((git)this.bo.a(git.class)).c();
    this.b = ((hrs)this.bo.b(hrs.class));
    this.c = ((goi)this.bo.a(goi.class));
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null) {
      localgor.a(this);
    }
    hhj localhhj = (hhj)this.bo.b(hhj.class);
    if (localhhj != null) {
      this.ac = localhhj.a;
    }
    hhg localhhg = new hhg();
    localhhg.a.putBoolean("allowPrivate", true);
    localhhg.a.putBoolean("allowDomain", true);
    if (!this.ac) {}
    for (boolean bool = true;; bool = false)
    {
      localhhg.a.putBoolean("allowPublic", bool);
      Bundle localBundle = localhhg.a;
      this.ab.a(localBundle);
      this.ad = ((git)this.bo.a(git.class));
      this.af = this.ad.f().c("is_child");
      this.ag = ((ifj)this.bo.a(ifj.class));
      return;
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
    k().b(0, null, this);
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
    if (this.d == null) {}
    for (int i = 0;; i = this.d.getCount()) {
      return i + 1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnu
 * JD-Core Version:    0.7.0.1
 */