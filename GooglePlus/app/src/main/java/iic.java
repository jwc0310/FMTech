import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;

public final class iic
  implements mbo, mes, mfa, mfd
{
  static final hyf a = new hyf("debug.plus.enable_hs_shortcuts", "false", "26a162d3", hym.b);
  Context b;
  ipb c;
  final iii d;
  public iih e;
  public boolean f;
  String g;
  Intent h;
  Parcelable i;
  String j;
  final kbb k;
  private hyi l;
  private jov m;
  private jpd n;
  private final bk o;
  private Activity p;
  private boolean q;
  private final jpe r;
  
  public iic(bk parambk, mek parammek, iii paramiii)
  {
    if (Build.VERSION.SDK_INT < 23) {}
    for (Object localObject = new jos();; localObject = new iil())
    {
      this.n = ((jpd)localObject);
      this.q = true;
      this.f = false;
      this.r = new iid(this);
      this.k = new iie(this);
      this.o = parambk;
      this.d = paramiii;
      parammek.a(this);
      return;
    }
  }
  
  final void a()
  {
    if (this.j != null)
    {
      this.k.b();
      return;
    }
    b();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.c = ((ipb)parammbb.a(ipb.class));
    this.m = ((jov)parammbb.a(jov.class));
    this.l = ((hyi)parammbb.a(hyi.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.q = paramBundle.getBoolean("should_log");
      if (paramBundle.containsKey("shortcut_intent"))
      {
        this.h = ((Intent)paramBundle.getParcelable("shortcut_intent"));
        this.g = paramBundle.getString("shortcut_name");
        this.i = paramBundle.getParcelable("shortcut_icon");
        this.j = paramBundle.getString("shortcut_icon_url");
      }
    }
    this.m.a(efj.NJ, this.r);
    this.p = this.o.f();
    if ((this.f) && (this.q) && (this.p != null))
    {
      if (this.p.getIntent().getBooleanExtra("from_shortcut", false))
      {
        Context localContext = this.b;
        gxr localgxr = new gxr();
        gxq localgxq = new gxq(pjp.c);
        localgxr.b.add(localgxq);
        new gwz(25, localgxr.a(this.b)).b(localContext);
      }
      this.q = false;
    }
    if (this.j != null) {
      a();
    }
  }
  
  public final boolean a(int paramInt)
  {
    if (this.l.b(a, paramInt))
    {
      Context localContext1 = this.b;
      boolean bool;
      int i3;
      if (Build.VERSION.SDK_INT >= 23)
      {
        bool = efj.d(localContext1, "com.android.launcher.permission.INSTALL_SHORTCUT");
        if (!bool) {
          break label202;
        }
        Context localContext2 = this.b;
        Intent localIntent = new Intent("android.intent.action.MAIN");
        localIntent.addCategory("android.intent.category.HOME");
        ResolveInfo localResolveInfo = localContext2.getPackageManager().resolveActivity(localIntent, 65536);
        if (localResolveInfo == null) {
          break label196;
        }
        String str = localResolveInfo.activityInfo.packageName;
        List localList = localContext2.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0);
        int i2 = localList.size();
        i3 = 0;
        label128:
        if (i3 >= i2) {
          break label196;
        }
        if (!TextUtils.equals(str, ((ResolveInfo)localList.get(i3)).activityInfo.packageName)) {
          break label190;
        }
      }
      label190:
      label196:
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 == 0) {
          break label202;
        }
        return true;
        if (localContext1.checkCallingOrSelfPermission("com.android.launcher.permission.INSTALL_SHORTCUT") == 0)
        {
          bool = true;
          break;
        }
        bool = false;
        break;
        i3++;
        break label128;
      }
    }
    label202:
    return false;
  }
  
  final void b()
  {
    this.m.a(this.n, efj.NJ, Collections.singletonList("com.android.launcher.permission.INSTALL_SHORTCUT"));
  }
  
  final void b(int paramInt)
  {
    this.h = null;
    this.g = null;
    this.i = null;
    this.j = null;
    Toast.makeText(this.b, paramInt, 1).show();
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("should_log", this.q);
    if (this.h != null)
    {
      paramBundle.putParcelable("shortcut_intent", this.h);
      paramBundle.putString("shortcut_name", this.g);
      paramBundle.putParcelable("shortcut_icon", this.i);
      paramBundle.putString("shortcut_icon_url", this.j);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iic
 * JD-Core Version:    0.7.0.1
 */