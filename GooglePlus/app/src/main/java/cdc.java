import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

final class cdc
  implements View.OnClickListener
{
  cdc(cda paramcda) {}
  
  public final void onClick(View paramView)
  {
    ResolveInfo localResolveInfo = (ResolveInfo)paramView.getTag(aaw.lg);
    ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
    ComponentName localComponentName = new ComponentName(localActivityInfo.applicationInfo.packageName, localActivityInfo.name);
    cda localcda1 = this.a;
    CharSequence localCharSequence = localResolveInfo.loadLabel(localcda1.bn.getPackageManager());
    int i = aau.cf;
    boolean bool1 = TextUtils.equals(localCharSequence, localcda1.g().getString(i));
    bp localbp = this.a.f();
    if ((bool1) && ((!this.a.a.e()) || (!this.a.a.f().c("is_google_plus"))))
    {
      cda localcda6 = this.a;
      ikx localikx = new ikx(this.a.bn);
      ilf localilf = new ilf();
      localilf.s = ilm.class;
      localilf.t = null;
      localilf.u.add(ine.class);
      localikx.a = localilf;
      localikx.b = cda.a(this.a, localbp);
      localcda6.ac = localikx.a();
      this.a.ab.startAnimation(this.a.ae);
      return;
    }
    if (bool1)
    {
      this.a.a(null);
      return;
    }
    cda localcda2 = this.a;
    int j;
    if ((localcda2.c == null) || (localcda2.c.size() != 1)) {
      j = 0;
    }
    while (j != 0)
    {
      this.a.al = new cdm(this.a);
      jpx localjpx = (jpx)this.a.c.get(0);
      cdm localcdm = this.a.al;
      localcdm.a = Long.valueOf(localjpx.e().b.a);
      localcdm.c = paramView;
      localcdm.b = localResolveInfo;
      if ((this.a.al.a == null) || (this.a.al.a.longValue() == 0L))
      {
        this.a.k().a(4, null, this.a.ao);
        return;
        ipf localipf = ((jpx)localcda2.c.get(0)).e();
        if ((localipf == null) || (localipf.e != ipm.b)) {
          j = 0;
        } else if ((localipf.c != null) && (("com.facebook.katana".equals(localComponentName.getPackageName())) || ("com.whatsapp".equals(localComponentName.getPackageName())) || ("com.google.android.apps.inbox".equals(localComponentName.getPackageName())) || ("com.google.android.gm".equals(localComponentName.getPackageName())) || ("com.google.android.email".equals(localComponentName.getPackageName())))) {
          j = 1;
        } else {
          j = 0;
        }
      }
      else
      {
        cda.b(this.a);
        return;
      }
    }
    this.a.b(localComponentName.getPackageName());
    Intent localIntent1 = (Intent)paramView.getTag(aaw.kZ);
    cda localcda3 = this.a;
    Resources localResources = localcda3.g();
    int k = localResources.getIdentifier("share_to_clx_label", "string", localcda3.bn.getPackageName());
    if (k == 0) {}
    String str;
    for (boolean bool2 = false; (bool2) && (this.a.a.e()); bool2 = TextUtils.equals(localResolveInfo.loadLabel(localcda3.bn.getPackageManager()), str))
    {
      hpo localhpo = (hpo)this.a.bo.b(hpo.class);
      if (localhpo == null) {
        break;
      }
      Intent localIntent2 = localhpo.a(localIntent1);
      localIntent2.putExtra("account_id", this.a.a.c());
      this.a.a(localIntent2);
      localbp.finish();
      return;
      str = localResources.getString(k);
    }
    localIntent1.setComponent(localComponentName);
    localIntent1.addFlags(268435456);
    this.a.ac = localIntent1;
    if ((this.a.ak != null) && (this.a.ak.c()))
    {
      this.a.k().a(3, null, this.a.an);
      cda localcda4 = this.a;
      cda localcda5 = this.a;
      int m = aau.jp;
      localcda4.a(localcda5.g().getString(m));
      return;
    }
    this.a.ab.startAnimation(this.a.ae);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdc
 * JD-Core Version:    0.7.0.1
 */