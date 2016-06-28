import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.apps.plus.settings.AccountSettingsActivity;
import com.google.android.apps.plus.settings.ContactsSettingsActivity;
import com.google.android.apps.plus.settings.GplusDeveloperSettingsActivity;
import com.google.android.apps.plus.settings.GplusPhotosSettingsActivity;
import com.google.android.apps.plus.settings.NotificationSettingsActivity;
import com.google.android.apps.plus.settings.SharingSettingsActivity;
import com.google.android.apps.plus.settings.profile.ProfileSettingsActivity;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dqw
  extends mca
  implements keo, luu
{
  private final ken Z = new ken(this, this.bp);
  lut a;
  private dqo aa = new dqo(this.bp, this.d);
  private kez ab;
  private git ac;
  private hyi ad;
  dqo b = new dqo(this.bp);
  int c;
  private final dqs d = new dqs();
  
  public dqw()
  {
    gxl localgxl = new gxl(pjk.a);
    this.bo.a(gxs.class, localgxl);
    new gxj(this.bp, (byte)0);
  }
  
  private final Drawable a(int paramInt)
  {
    Drawable localDrawable = g().getDrawable(paramInt);
    localDrawable.setAlpha(138);
    return localDrawable;
  }
  
  private final void w()
  {
    kez localkez = this.ab;
    int i = aau.kD;
    ket localket = localkez.a(g().getString(i), null);
    localket.p = new dqz(this);
    this.Z.a.b(localket);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if (paramString.equals("delete_dialog_tag"))
    {
      String str = this.ac.f().b("gaia_id");
      this.d.a(str);
      this.aa.a();
    }
  }
  
  public final void b(Bundle paramBundle, String paramString)
  {
    if ((paramString.equals("delete_dialog_tag")) && (this.a != null)) {
      this.a.d.cancel();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ac = ((git)this.bo.a(git.class));
    this.c = this.ac.c();
    this.ad = ((hyi)mbb.a(this.bn, hyi.class));
  }
  
  public final void c(Bundle paramBundle, String paramString)
  {
    if ((paramString.equals("delete_dialog_tag")) && (this.a != null)) {
      this.a.d.cancel();
    }
  }
  
  public final void v()
  {
    this.ab = new kez(this.bn);
    gjb localgjb = this.ac.f();
    if (!localgjb.a())
    {
      f().finish();
      return;
    }
    boolean bool1 = localgjb.c("is_google_plus");
    boolean bool2 = localgjb.c("is_managed_account");
    boolean bool3 = "TRUE".equalsIgnoreCase(dun.d.a());
    Intent localIntent3;
    label311:
    String str;
    label723:
    int i7;
    label744:
    bhd localbhd;
    if (bool1)
    {
      Intent localIntent1 = new Intent(this.bn, ProfileSettingsActivity.class);
      localIntent1.putExtra("account_id", this.c);
      kez localkez1 = this.ab;
      int i = aau.rk;
      LabelPreference localLabelPreference1 = localkez1.b(g().getString(i), null, localIntent1);
      localLabelPreference1.d("profile_preference_key");
      localLabelPreference1.a(a(efj.rl));
      this.Z.a.b(localLabelPreference1);
      Intent localIntent2 = new Intent(this.bn, NotificationSettingsActivity.class);
      localIntent2.putExtra("account_id", this.c);
      kez localkez2 = this.ab;
      int j = aau.eh;
      LabelPreference localLabelPreference2 = localkez2.b(g().getString(j), null, localIntent2);
      localLabelPreference2.d("notifications_preference_key");
      localLabelPreference2.a(a(efj.rK));
      this.Z.a.b(localLabelPreference2);
      dra localdra = (dra)mbb.b(this.bn, dra.class);
      if ((localdra != null) && (localdra.a(this.c)))
      {
        localIntent3 = new Intent().setClassName(this.bn, "com.google.android.apps.plus.settings.impl.GstsPhotosSettingsActivity");
        localIntent3.putExtra("account_id", this.c);
        kez localkez3 = this.ab;
        int k = aau.oP;
        LabelPreference localLabelPreference3 = localkez3.b(g().getString(k), null, localIntent3);
        localLabelPreference3.d("photos_preference_key");
        localLabelPreference3.a(a(efj.rO));
        this.Z.a.b(localLabelPreference3);
        Intent localIntent4 = new Intent(this.bn, SharingSettingsActivity.class);
        localIntent4.putExtra("account_id", this.c);
        kez localkez4 = this.ab;
        int m = aau.ts;
        LabelPreference localLabelPreference4 = localkez4.b(g().getString(m), null, localIntent4);
        localLabelPreference4.d("sharing_preference_key");
        localLabelPreference4.a(a(efj.rW));
        this.Z.a.b(localLabelPreference4);
        if (!bool2)
        {
          if (!this.ac.f().c("is_plus_page"))
          {
            kez localkez12 = this.ab;
            int i9 = aau.eg;
            LabelPreference localLabelPreference9 = localkez12.b(g().getString(i9), null);
            localLabelPreference9.d("device_location_preference_key");
            localLabelPreference9.a(a(efj.rG));
            localLabelPreference9.p = new dqx(this);
            this.Z.a.b(localLabelPreference9);
          }
          Intent localIntent8 = new Intent(this.bn, ContactsSettingsActivity.class);
          localIntent8.putExtra("account_id", this.c);
          kez localkez10 = this.ab;
          int i5 = aau.ep;
          LabelPreference localLabelPreference7 = localkez10.b(g().getString(i5), null, localIntent8);
          localLabelPreference7.d("contacts_preference_key");
          localLabelPreference7.a(a(efj.rL));
          this.Z.a.b(localLabelPreference7);
          if (this.ac.e())
          {
            mbf localmbf = this.bn;
            int i6 = this.c;
            PackageManager localPackageManager = localmbf.getPackageManager();
            ComponentName localComponentName = efj.n(localmbf, i6).resolveActivity(localPackageManager);
            if (localComponentName == null) {
              break label1144;
            }
            str = localComponentName.getPackageName();
            if ((str == null) || (localPackageManager.checkPermission("android.permission.GET_ACCOUNTS", str) != 0)) {
              break label1150;
            }
            i7 = 1;
            if (i7 != 0)
            {
              Intent localIntent9 = efj.n(this.bn, this.c);
              localIntent9.putExtra("account_id", this.c);
              kez localkez11 = this.ab;
              int i8 = aau.cg;
              LabelPreference localLabelPreference8 = localkez11.b(g().getString(i8), null, localIntent9);
              localLabelPreference8.d("apps_preference_key");
              localLabelPreference8.a(a(efj.rm));
              this.Z.a.b(localLabelPreference8);
            }
          }
        }
        localbhd = (bhd)mbb.b(this.bn, bhd.class);
        if ((localbhd != null) && (localbhd.a(this.c))) {
          break label1156;
        }
      }
    }
    else
    {
      label871:
      if ((dun.b()) && (!bool3))
      {
        Intent localIntent6 = new Intent(this.bn, GplusDeveloperSettingsActivity.class);
        localIntent6.putExtra("account_id", this.c);
        kez localkez8 = this.ab;
        int i3 = aau.pw;
        ket localket2 = localkez8.a(g().getString(i3), null, localIntent6);
        localket2.d("developer_preference_key");
        this.Z.a.b(localket2);
      }
      if ((!bool1) || (bool2) || (bool3)) {
        break label1345;
      }
      if (!this.ad.b(bwb.z, this.c)) {
        break label1254;
      }
      w();
      kez localkez6 = this.ab;
      int i1 = aau.kY;
      PreferenceCategory localPreferenceCategory = localkez6.b(localkez6.a.getString(i1));
      kez localkez7 = this.ab;
      int i2 = aau.pt;
      ket localket1 = localkez7.a(g().getString(i2), null);
      localket1.p = new dqy(this);
      localPreferenceCategory.b(localket1);
    }
    for (;;)
    {
      this.a = ((lut)f().b.a.d.a("delete_dialog_tag"));
      if (this.a == null) {
        break;
      }
      lut locallut = this.a;
      locallut.n = this;
      locallut.p = 0;
      return;
      localIntent3 = new Intent(this.bn, GplusPhotosSettingsActivity.class);
      break label311;
      label1144:
      str = null;
      break label723;
      label1150:
      i7 = 0;
      break label744;
      label1156:
      Intent localIntent7 = localbhd.a().a(((git)mbb.a(this.bn, git.class)).c()).a();
      kez localkez9 = this.ab;
      int i4 = aau.pv;
      LabelPreference localLabelPreference6 = localkez9.b(g().getString(i4), null, localIntent7);
      localLabelPreference6.d("activitylog_preference_key");
      localLabelPreference6.a(a(efj.rF));
      this.Z.a.b(localLabelPreference6);
      break label871;
      label1254:
      Intent localIntent5 = new Intent(this.bn, AccountSettingsActivity.class);
      localIntent5.putExtra("account_id", this.c);
      kez localkez5 = this.ab;
      int n = aau.pu;
      LabelPreference localLabelPreference5 = localkez5.b(g().getString(n), null, localIntent5);
      localLabelPreference5.d("account_preference_key");
      localLabelPreference5.a(a(efj.rS));
      this.Z.a.b(localLabelPreference5);
      label1345:
      w();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqw
 * JD-Core Version:    0.7.0.1
 */