import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.plus.settings.InstantUploadSettingsLauncherActivity;
import com.google.android.apps.plus.views.AutoBackupBarView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.text.NumberFormat;
import java.util.Map;

public final class cpv
  implements bwn, cpu, cw<hcg>, dva, luu, mbo, mfd
{
  Context a;
  int b;
  boolean c;
  cqb d;
  private final Runnable e = new cpw(this);
  private git f;
  private final bk g;
  private int h;
  private giz i;
  private cqa j;
  private hcg k;
  
  public cpv(bk parambk, mek parammek, cqa paramcqa, int paramInt)
  {
    this.g = parambk;
    this.h = paramInt;
    this.j = paramcqa;
    parammek.a(this);
  }
  
  private final void a(gxz paramgxz)
  {
    int m = this.b;
    gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
    gxw localgxw = new gxw(this.a, m);
    localgxw.c = paramgxz;
    localgxx.a(localgxw);
  }
  
  public final fu<hcg> a(int paramInt, Bundle paramBundle)
  {
    return new cqb(this.a, this.b);
  }
  
  public final void a()
  {
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public final void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      if (this.c)
      {
        a(gxz.i);
        boolean bool = hbj.a();
        int n = this.b;
        Resources localResources;
        String str1;
        String str2;
        if ((!bool) && (this.g.x.a("dialog_sync_disabled") == null))
        {
          localResources = this.a.getResources();
          str1 = this.i.a(n).b("account_name");
          str2 = localResources.getString(efj.Fz);
          if (bool) {
            break label193;
          }
        }
        for (String str3 = localResources.getString(aau.nz);; str3 = localResources.getString(aau.mF, new Object[] { str2, str1 }))
        {
          lut locallut = lut.b(localResources.getString(aau.oj), str3, localResources.getString(aau.uY), localResources.getString(aau.lP));
          locallut.ab = this;
          locallut.a(this.g.x, "dialog_sync_disabled");
          new cpy(this).execute(null);
          return;
        }
      }
      a(gxz.dR);
      new cpx(this, this.a.getApplicationContext(), true).execute(null);
      return;
    case 2: 
      label193:
      int m = this.b;
      this.a.startActivity(InstantUploadSettingsLauncherActivity.a(this.a, m));
      return;
    }
    new cpz(this.a.getApplicationContext()).execute(null);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Context paramContext, AutoBackupBarView paramAutoBackupBarView)
  {
    dka localdka = (dka)mbb.a(paramContext, dka.class);
    int i5;
    int i6;
    int i21;
    int i22;
    int i23;
    Float localFloat2;
    label109:
    ipf localipf;
    Float localFloat1;
    int i7;
    int i8;
    if (this.k == null)
    {
      i5 = 0;
      i6 = -1;
      if (this.k == null) {
        break label1596;
      }
      i21 = this.k.f + this.k.g;
      i22 = this.k.i;
      i23 = this.k.d;
      if ((this.k.b == null) || (this.k.m == null)) {
        break label1590;
      }
      localFloat2 = (Float)this.k.b.get(this.k.m);
      if ((i5 != 4) || (this.k.m == null)) {
        break label1568;
      }
      localipf = ipf.a(this.a, Uri.parse(this.k.m), ipm.a);
      localFloat1 = localFloat2;
      i6 = i23;
      i7 = i22;
      i8 = i21;
    }
    for (;;)
    {
      boolean bool3 = this.c;
      int i9 = this.b;
      Long localLong;
      label218:
      String str;
      label258:
      Resources localResources1;
      label333:
      int i10;
      label350:
      int i11;
      label383:
      TextView localTextView1;
      if (i9 != -1)
      {
        gjb localgjb = localdka.a(i9);
        if (localgjb.a("all_photos_count"))
        {
          localLong = Long.valueOf(localgjb.a("all_photos_count", 0L));
          if ((paramAutoBackupBarView.m == -1) && (i8 != 0)) {
            paramAutoBackupBarView.m = i7;
          }
          paramAutoBackupBarView.n = i5;
          paramAutoBackupBarView.o = bool3;
          if (i6 != -1) {
            break label866;
          }
          str = null;
          paramAutoBackupBarView.p = str;
          localResources1 = paramAutoBackupBarView.getResources();
          paramAutoBackupBarView.f.setText(aau.cu);
          switch (paramAutoBackupBarView.n)
          {
          default: 
            paramAutoBackupBarView.l = null;
            View localView = paramAutoBackupBarView.a;
            if (paramAutoBackupBarView.n == 0)
            {
              i10 = 8;
              localView.setVisibility(i10);
              if ((!"TRUE".equalsIgnoreCase(dun.k.a())) || (paramAutoBackupBarView.n != 1)) {
                break label1555;
              }
              i11 = 1;
              localTextView1 = paramAutoBackupBarView.h;
              if (i11 == 0) {
                break label1561;
              }
            }
            break;
          }
        }
      }
      label530:
      label1555:
      label1561:
      for (int i12 = 0;; i12 = 8)
      {
        localTextView1.setVisibility(i12);
        paramAutoBackupBarView.q = this;
        return;
        int m;
        label430:
        int n;
        label450:
        int i1;
        int i2;
        label568:
        int i3;
        if ((this.c) || (this.k.e))
        {
          m = 1;
          if ((!this.k.e) || (!this.c)) {
            break label676;
          }
          n = 1;
          ixf localixf = (ixf)mbb.a(this.a, ixf.class);
          boolean bool1 = localixf.a();
          boolean bool2 = localixf.c();
          hcd localhcd = hcd.a(this.a);
          if ((this.k.g != 0) || (bool1) || (this.k.j <= 0) || (localhcd.c())) {
            break label682;
          }
          i1 = 1;
          if ((this.k.g != 0) || (bool1) || (this.k.k <= 0) || (localhcd.b())) {
            break label688;
          }
          i2 = 1;
          if ((i1 == 0) && (i2 == 0)) {
            break label694;
          }
          i3 = 1;
          label581:
          if ((i3 != 0) || (bool2) || (this.k.g != 0) || (((this.k.j <= 0) || (!localhcd.c())) && ((this.k.k <= 0) || (!localhcd.b())))) {
            break label700;
          }
        }
        label676:
        label682:
        label688:
        label694:
        label700:
        for (int i4 = 1;; i4 = 0)
        {
          if ((this.b != -1) && (this.j.A())) {
            break label706;
          }
          i5 = 0;
          break;
          m = 0;
          break label430;
          n = 0;
          break label450;
          i1 = 0;
          break label530;
          i2 = 0;
          break label568;
          i3 = 0;
          break label581;
        }
        label706:
        if ((m != 0) && (n == 0))
        {
          i5 = 1;
          break;
        }
        if ((n != 0) && (this.k.d != -1) && (this.k.d != this.b))
        {
          i5 = 2;
          break;
        }
        if ((n != 0) && (i3 != 0))
        {
          i5 = 6;
          break;
        }
        if ((n != 0) && (i4 != 0))
        {
          i5 = 5;
          break;
        }
        if ((n != 0) && (this.k.h > 0) && (this.k.g == 0))
        {
          i5 = 3;
          break;
        }
        if (((n != 0) && (this.k.g > 0)) || (this.k.f > 0))
        {
          i5 = 4;
          break;
        }
        i5 = 7;
        break;
        localLong = null;
        break label218;
        label866:
        str = paramAutoBackupBarView.r.a(i6).b("account_name");
        break label258;
        paramAutoBackupBarView.b();
        paramAutoBackupBarView.l = null;
        paramAutoBackupBarView.b.setImageResource(efj.ru);
        TextView localTextView7 = paramAutoBackupBarView.g;
        if (paramAutoBackupBarView.o) {}
        for (int i20 = aau.cn;; i20 = aau.co)
        {
          localTextView7.setText(i20);
          paramAutoBackupBarView.a(aau.gk);
          break;
        }
        paramAutoBackupBarView.b();
        paramAutoBackupBarView.l = null;
        paramAutoBackupBarView.b.setImageResource(efj.rw);
        TextView localTextView6 = paramAutoBackupBarView.g;
        int i19 = aau.cp;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = paramAutoBackupBarView.p;
        localTextView6.setText(localResources1.getString(i19, arrayOfObject5));
        paramAutoBackupBarView.a(aau.cq);
        break label333;
        paramAutoBackupBarView.b();
        paramAutoBackupBarView.l = null;
        paramAutoBackupBarView.b.setImageResource(efj.sd);
        paramAutoBackupBarView.g.setText(aau.cl);
        int i18 = efj.rU;
        paramAutoBackupBarView.j.setText(null);
        paramAutoBackupBarView.j.setCompoundDrawablesWithIntrinsicBounds(i18, 0, 0, 0);
        break label333;
        paramAutoBackupBarView.c.setVisibility(0);
        paramAutoBackupBarView.k.setVisibility(0);
        paramAutoBackupBarView.b.setVisibility(8);
        paramAutoBackupBarView.i.setVisibility(8);
        paramAutoBackupBarView.j.setVisibility(8);
        paramAutoBackupBarView.f.setVisibility(0);
        paramAutoBackupBarView.g.setVisibility(8);
        if (localipf != null)
        {
          if ((paramAutoBackupBarView.l == null) || (!localipf.a(paramAutoBackupBarView.l)))
          {
            if (paramAutoBackupBarView.l != null)
            {
              paramAutoBackupBarView.d.a(paramAutoBackupBarView.l);
              paramAutoBackupBarView.d.setVisibility(0);
            }
            AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
            localAlphaAnimation.setDuration(500L);
            paramAutoBackupBarView.e.clearAnimation();
            paramAutoBackupBarView.e.setAnimation(localAlphaAnimation);
          }
          paramAutoBackupBarView.l = localipf;
          paramAutoBackupBarView.e.a(paramAutoBackupBarView.l);
        }
        TextView localTextView5 = paramAutoBackupBarView.f;
        int i17 = efj.xi;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(i8);
        localTextView5.setText(localResources1.getQuantityString(i17, i8, arrayOfObject4));
        paramAutoBackupBarView.k.setMax(100);
        if (localFloat1 == null) {
          break label333;
        }
        paramAutoBackupBarView.k.setProgress((int)(100.0F * localFloat1.floatValue()));
        break label333;
        paramAutoBackupBarView.a();
        paramAutoBackupBarView.b.setImageResource(efj.rv);
        TextView localTextView4 = paramAutoBackupBarView.g;
        int i16 = efj.xh;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i8);
        localTextView4.setText(localResources1.getQuantityString(i16, i8, arrayOfObject3));
        break label333;
        paramAutoBackupBarView.a();
        paramAutoBackupBarView.b.setImageResource(efj.rv);
        TextView localTextView3 = paramAutoBackupBarView.g;
        int i15 = efj.xg;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i8);
        localTextView3.setText(localResources1.getQuantityString(i15, i8, arrayOfObject2));
        break label333;
        paramAutoBackupBarView.a();
        paramAutoBackupBarView.m = i7;
        paramAutoBackupBarView.b.setImageResource(efj.rt);
        if (localLong != null)
        {
          int i13 = localLong.intValue();
          paramAutoBackupBarView.f.setText(aau.ck);
          TextView localTextView2 = paramAutoBackupBarView.g;
          Resources localResources2 = paramAutoBackupBarView.getContext().getResources();
          int i14 = efj.xf;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = NumberFormat.getInstance().format(localLong);
          localTextView2.setText(localResources2.getQuantityString(i14, i13, arrayOfObject1));
          break label333;
        }
        paramAutoBackupBarView.g.setText(localResources1.getString(aau.cm));
        break label333;
        i10 = 0;
        break label350;
        i11 = 0;
        break label383;
      }
      label1568:
      localFloat1 = localFloat2;
      i6 = i23;
      i7 = i22;
      i8 = i21;
      localipf = null;
      continue;
      label1590:
      localFloat2 = null;
      break label109;
      label1596:
      localipf = null;
      localFloat1 = null;
      i7 = 0;
      i8 = 0;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
    this.f = ((git)parammbb.a(git.class));
    this.b = this.f.c();
    this.i = ((giz)parammbb.a(giz.class));
    lut locallut = (lut)this.g.x.a("dialog_sync_disabled");
    if (locallut != null) {
      locallut.ab = this;
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("dialog_sync_disabled".equals(paramString)) {
      hbj.b();
    }
  }
  
  public final void a(fu<hcg> paramfu) {}
  
  public final void a(ipf paramipf, PhotoTileView paramPhotoTileView)
  {
    if ((this.k == null) || (!this.k.e) || (!this.c) || (paramipf == null) || (paramipf.d == null))
    {
      paramPhotoTileView.a(hch.a, 0.0F, 0L);
      return;
    }
    String str = paramipf.d.toString();
    if (!this.k.a.containsKey(str))
    {
      paramPhotoTileView.a(hch.a, 0.0F, 0L);
      return;
    }
    hch localhch = (hch)this.k.a.get(str);
    Float localFloat = (Float)this.k.b.get(str);
    float f1 = 0.0F;
    if (localFloat == null) {}
    for (;;)
    {
      paramPhotoTileView.a(localhch, f1, ((Long)this.k.c.get(str)).longValue());
      return;
      f1 = localFloat.floatValue();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (!hbj.a(this.a)))
    {
      this.d = ((cqb)this.g.k().a(this.h, null, this));
      return;
    }
    this.g.k().a(this.h);
    this.d = null;
    this.k = null;
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c(Bundle paramBundle, String paramString) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpv
 * JD-Core Version:    0.7.0.1
 */