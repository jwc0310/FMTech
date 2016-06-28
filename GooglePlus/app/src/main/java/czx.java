import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class czx
  implements giv, gzi, ica, mbo, mes, mfa, mfd
{
  private Activity a;
  private ibw b;
  private ikt c;
  private dam d;
  private gzj e;
  private int f;
  
  private final void c(Bundle paramBundle)
  {
    int i = this.f;
    String str1;
    Intent localIntent2;
    if (this.d.b != null)
    {
      String str2 = paramBundle.getString("profile_id");
      if (str2 != null) {
        this.d.b = str2;
      }
    }
    else
    {
      if (this.d.d == null) {
        break label110;
      }
      str1 = paramBundle.getString("activity_id");
      localIntent2 = null;
      if (str1 != null) {
        break label101;
      }
    }
    for (;;)
    {
      if (localIntent2 == null) {
        break label154;
      }
      this.b.a(localIntent2);
      return;
      if (!this.d.b.startsWith("+")) {
        break;
      }
      localIntent2 = null;
      continue;
      label101:
      this.d.c = str1;
      label110:
      Intent localIntent1 = this.a.getIntent();
      localIntent2 = this.d.a(this.a, i, localIntent1.getExtras(), false);
      if (localIntent2 != null) {
        localIntent2.putExtra("from_url_gateway", true);
      }
    }
    label154:
    this.b.a();
  }
  
  public final void a()
  {
    Intent localIntent = this.a.getIntent();
    dam localdam = this.d;
    Activity localActivity = this.a;
    String str;
    switch (localdam.a)
    {
    case 11: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 33: 
    case 34: 
    case 36: 
    case 37: 
    case 39: 
    case 40: 
    case 41: 
    default: 
      str = null;
    }
    for (;;)
    {
      ikt localikt = this.c;
      ilf localilf = new ilf();
      localilf.h = true;
      localilf.c = localIntent.getIntExtra("account_id", -1);
      localilf.r = new dac(this.d.b);
      iln localiln = new iln();
      localiln.a = str;
      Bundle localBundle = localiln.a();
      localilf.s = ilm.class;
      localilf.t = localBundle;
      localikt.a(localilf);
      return;
      str = localActivity.getString(aau.dB);
      continue;
      str = localActivity.getString(aau.dx);
      continue;
      str = localActivity.getString(aau.dy);
      continue;
      str = localActivity.getString(aau.dv);
      continue;
      str = localActivity.getString(aau.dw);
      continue;
      str = localActivity.getString(aau.dw);
      continue;
      str = localActivity.getString(aau.dz);
      continue;
      str = localActivity.getString(aau.dB);
      continue;
      str = localActivity.getString(aau.du);
      continue;
      str = localActivity.getString(aau.dA);
    }
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramActivity;
    this.b = paramibw;
    paramikt.g.add(this);
    this.c = ((ikt)paramikt);
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((gzj)parammbb.a(gzj.class));
    this.e.a.add(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.f = paramBundle.getInt("account_id");
      this.d = ((dam)paramBundle.getParcelable("url_parser"));
      return;
    }
    this.d = czw.b(this.a.getIntent());
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (TextUtils.equals(paramString, "resolve_task")) {
      if (paramhae.b == 200) {
        break label36;
      }
    }
    label36:
    for (int i = 1; i == 0; i = 0)
    {
      c(paramhae.a());
      return;
    }
    int j = paramhae.a().getInt("error", 0);
    this.b.a(0, this.a.getString(j));
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      this.f = paramInt2;
      dam localdam = this.d;
      boolean bool;
      switch (localdam.a)
      {
      case 9: 
      case 12: 
      case 21: 
      case 22: 
      case 23: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      default: 
        bool = false;
      }
      while (bool)
      {
        gzj localgzj = this.e;
        dab localdab = new dab(this.a, "resolve_task", this.d, this.f);
        localgzj.d.a(localdab, false);
        localgzj.b(localdab);
        return;
        if (localdam.c == null)
        {
          bool = true;
        }
        else
        {
          bool = false;
          continue;
          bool = localdam.a();
        }
      }
      c(new Bundle());
      return;
    }
    this.b.a(0);
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putInt("account_id", this.f);
    paramBundle.putParcelable("url_parser", this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czx
 * JD-Core Version:    0.7.0.1
 */