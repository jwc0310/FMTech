import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.libraries.social.profile.suspension.impl.ProfileSuspensionActivity;
import java.util.ArrayList;

final class jyq
  implements giv, guf, gzi, mbo, mew, mez, mfd
{
  final bp a;
  private gug b;
  private git c;
  private giz d;
  private gzj e;
  private jyl f;
  private boolean g;
  private boolean h;
  
  public jyq(bp parambp, mek parammek)
  {
    this.a = parambp;
    parammek.a(this);
  }
  
  private final void a()
  {
    if ((this.g) && (this.h))
    {
      int i = this.c.c();
      if ((this.d.c(i)) && ((jyl.a(this.a, i)) || (((giz)mbb.a(this.a, giz.class)).a(i).c("profile_has_strikes"))) && (!this.d.a(i).c("suspension_status_checked"))) {
        this.e.b(new jyn(this.a, i, "GetProfileSuspensionInfoTask"));
      }
    }
  }
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if ((paramInt == az.u) && (paramIntent != null) && (paramIntent.getBooleanExtra("name_violation", false)))
    {
      jyr localjyr = new jyr(this);
      efj.m().post(localjyr);
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((git)parammbb.a(git.class));
    this.d = ((giz)parammbb.a(giz.class));
    this.e = ((gzj)parammbb.a(gzj.class));
    this.b = ((gug)parammbb.a(gug.class));
    this.f = ((jyl)parammbb.a(jyl.class));
    this.c.a(this);
    this.e.a.add(this);
    this.b.a(az.u, this);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    nwz localnwz;
    if ("GetProfileSuspensionInfoTask".equals(paramString))
    {
      hqw localhqw = (hqw)paramhae.a().getParcelable("psi_response");
      this.d.b(this.c.c()).b("suspension_status_checked", true).d();
      if (localhqw != null)
      {
        localnwz = (nwz)localhqw.a(new nwz());
        if (localnwz.a == null) {
          break label165;
        }
        Intent localIntent = new Intent(this.a, ProfileSuspensionActivity.class);
        localIntent.putExtra("account_id", this.c.c());
        localIntent.putExtra("extra_title", localnwz.b);
        localIntent.putExtra("extra_message", localnwz.c);
        localIntent.putExtra("extra_profile_suspension_info", qat.a(localnwz));
        this.b.a(az.u, localIntent);
      }
    }
    return;
    label165:
    paramhaa.c = false;
    Resources localResources = this.a.getResources();
    lut locallut = lut.b(localnwz.b, localnwz.c, localResources.getString(aw.eA), null);
    locallut.b(false);
    locallut.a(this.a.b.a.d, null);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    this.g = true;
    a();
  }
  
  public final void b()
  {
    this.h = true;
    a();
  }
  
  public final void c()
  {
    this.h = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyq
 * JD-Core Version:    0.7.0.1
 */