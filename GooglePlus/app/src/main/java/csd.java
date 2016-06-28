import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public final class csd
  implements giv, mbo, mdo, mds, mes, mfa, mfd
{
  private final Activity a;
  private gxx b;
  private boolean c;
  
  public csd(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((gxx)parammbb.a(gxx.class));
    git localgit = (git)parammbb.b(git.class);
    if (localgit != null) {
      localgit.a(this);
    }
  }
  
  public final void a(Intent paramIntent)
  {
    this.a.setIntent(paramIntent);
    this.c = false;
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.c = paramBundle.getBoolean("com.google.android.apps.plus.instrumentation.ActivityNotificationInstrumentation.EventRecorded", false);
    }
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    int i;
    Bundle localBundle;
    gxz localgxz;
    ArrayList localArrayList1;
    label121:
    ArrayList localArrayList2;
    if ((paramgiu2 == giu.c) && (!this.c))
    {
      Intent localIntent = this.a.getIntent();
      if ((localIntent == null) || (!localIntent.getBooleanExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", false))) {
        break label329;
      }
      i = 1;
      if (i != 0)
      {
        localBundle = new Bundle();
        String str = localIntent.getStringExtra("com.google.android.libraries.social.notifications.notif_id");
        localgxz = gxz.bn;
        if (!TextUtils.isEmpty(str))
        {
          localBundle.putString("extra_notification_id", str);
          localBundle.putBoolean("extra_notification_read", localIntent.getBooleanExtra("com.google.android.libraries.social.notifications.NOTIFICATION_READ", false));
        }
        if (!localIntent.hasExtra("com.google.android.libraries.social.notifications.notif_types")) {
          break label335;
        }
        localArrayList1 = localIntent.getIntegerArrayListExtra("com.google.android.libraries.social.notifications.notif_types");
        if (!localIntent.hasExtra("com.google.android.libraries.social.notifications.coalescing_codes")) {
          break label348;
        }
        localArrayList2 = localIntent.getStringArrayListExtra("com.google.android.libraries.social.notifications.coalescing_codes");
        label140:
        if ((!localArrayList1.isEmpty()) && (localArrayList1.size() == localArrayList2.size()))
        {
          localBundle.putIntegerArrayList("extra_notification_types", localArrayList1);
          localBundle.putStringArrayList("extra_coalescing_codes", localArrayList2);
        }
        if (!localIntent.getBooleanExtra("EXTRA_ACTIVITY_IS_ENTRY_POINT", true)) {
          break label361;
        }
      }
    }
    label329:
    label335:
    label348:
    label361:
    for (gya localgya = gya.w;; localgya = gya.u)
    {
      gxx localgxx1 = this.b;
      gxw localgxw1 = new gxw(this.a);
      localgxw1.c = localgxz;
      localgxw1.d = localgya;
      if (localBundle != null) {
        localgxw1.h.putAll(localBundle);
      }
      localgxx1.a(localgxw1);
      if (localArrayList1.contains(Integer.valueOf(18)))
      {
        gxx localgxx2 = this.b;
        gxw localgxw2 = new gxw(this.a);
        localgxw2.c = gxz.dA;
        localgxw2.d = localgya;
        if (localBundle != null) {
          localgxw2.h.putAll(localBundle);
        }
        localgxx2.a(localgxw2);
      }
      this.c = true;
      return;
      i = 0;
      break;
      localArrayList1 = new ArrayList(0);
      break label121;
      localArrayList2 = new ArrayList(0);
      break label140;
    }
  }
  
  public final void b(Intent paramIntent)
  {
    paramIntent.putExtra("EXTRA_ACTIVITY_IS_ENTRY_POINT", false);
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.apps.plus.instrumentation.ActivityNotificationInstrumentation.EventRecorded", this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csd
 * JD-Core Version:    0.7.0.1
 */