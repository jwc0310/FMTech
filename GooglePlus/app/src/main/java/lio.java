import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;

public final class lio
  extends mca
  implements gzi, kds
{
  static final String[] a = { "volume", "notifications_enabled", "disable_subscription", "post_visibility" };
  lij Z;
  lij aa;
  kfx ab;
  ket ac;
  final lin ad = new lin(this, this.bp);
  final lfz ae = new lfz(this, this.bp);
  private kej af;
  private final kdp ag = new kdp(this, this.bp);
  private final cw<Cursor> ah = new lip(this, this, this.ag, this.bp);
  git b;
  String c;
  int d;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.Z = ((lij)paramBundle.getParcelable("square_stream_settings"));
      this.c = paramBundle.getString("square_id");
      this.d = paramBundle.getInt("square_volume");
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    boolean bool;
    if ("SetSquareVolumeControlsTask".equals(paramString))
    {
      this.ag.c();
      if (!hae.a(paramhae)) {
        break label88;
      }
      if (this.ac != null)
      {
        kfx localkfx = (kfx)this.ac;
        if (((kfx)this.ac).b) {
          break label82;
        }
        bool = true;
        localkfx.a(bool);
      }
      k().b(1, null, this.ah);
    }
    for (;;)
    {
      this.ac = null;
      return;
      label82:
      bool = false;
      break;
      label88:
      this.Z = this.aa;
      v();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    mbb localmbb = this.bo;
    localmbb.a(lfy.class, this.ae);
    localmbb.a(liv.class, this.ad);
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    this.b = ((git)this.bo.a(git.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.Z != null) {
      paramBundle.putParcelable("square_stream_settings", this.Z);
    }
    paramBundle.putString("square_id", this.c);
    paramBundle.putInt("square_volume", this.d);
  }
  
  final void v()
  {
    if (this.Z == null) {
      return;
    }
    label76:
    int i;
    if (this.ab != null)
    {
      if ((!this.Z.c) && (!this.Z.b))
      {
        this.ab.b(false);
        this.ab.a(false);
        kfx localkfx2 = this.ab;
        int k = fh.s;
        localkfx2.a_(g().getString(k));
      }
    }
    else
    {
      if (this.af == null) {
        break label194;
      }
      CharSequence[] arrayOfCharSequence = this.af.b;
      i = 0;
      label93:
      if (i >= arrayOfCharSequence.length) {
        break label202;
      }
      if (Integer.valueOf(arrayOfCharSequence[i].toString()).intValue() != this.Z.a) {
        break label196;
      }
    }
    for (;;)
    {
      this.af.a(i);
      this.af.a_(this.af.a[i]);
      return;
      this.ab.b(true);
      this.ab.a(this.Z.b);
      kfx localkfx1 = this.ab;
      int j = fh.d;
      localkfx1.a_(g().getString(j));
      break label76;
      label194:
      break;
      label196:
      i++;
      break label93;
      label202:
      i = 0;
    }
  }
  
  public final void x()
  {
    k().a(1, null, this.ah);
  }
  
  public final void y()
  {
    k().b(1, null, this.ah);
  }
  
  public final void z()
  {
    kez localkez = new kez(this.bn);
    int i = fh.n;
    PreferenceCategory localPreferenceCategory1 = localkez.b(g().getString(i));
    int j = fh.t;
    this.af = localkez.g(g().getString(j), null);
    this.af.w = false;
    kej localkej1 = this.af;
    int k = fh.u;
    localkej1.a(g().getString(k));
    kej localkej2 = this.af;
    int m = fh.v;
    localkej2.h = g().getString(m);
    kej localkej3 = this.af;
    int n = efj.YF;
    localkej3.a = localkej3.l.getResources().getTextArray(n);
    kej localkej4 = this.af;
    int i1 = efj.YG;
    localkej4.b = localkej4.l.getResources().getTextArray(i1);
    this.af.d("square_volume");
    this.af.o = new liq(this);
    localPreferenceCategory1.b(this.af);
    int i2 = fh.c;
    PreferenceCategory localPreferenceCategory2 = localkez.b(g().getString(i2));
    int i3 = fh.e;
    String str = g().getString(i3);
    int i4 = fh.d;
    this.ab = localkez.d(str, g().getString(i4));
    this.ab.w = false;
    this.ab.a(Boolean.valueOf(false));
    this.ab.d("square_notifications_enabled");
    this.ab.o = new lir(this);
    this.ag.a(this.ab);
    localPreferenceCategory2.b(this.ab);
    int i5 = fh.b;
    PreferenceCategory localPreferenceCategory3 = localkez.b(g().getString(i5));
    int i6 = fh.k;
    ket localket = localkez.a(g().getString(i6), null);
    localket.w = false;
    localket.d("square_leave_square");
    localket.p = new lis(this);
    localPreferenceCategory3.b(localket);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lio
 * JD-Core Version:    0.7.0.1
 */