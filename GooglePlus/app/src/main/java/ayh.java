import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.plus.service.EsService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ayh
  implements bfg
{
  ayh(ayg paramayg) {}
  
  public final void a()
  {
    ayg localayg = this.a;
    bcp localbcp = localayg.c.b;
    if ((localbcp.o() == 0L) || (localbcp.j() == null)) {
      return;
    }
    bdk localbdk = localayg.c;
    localbdk.e = false;
    localbdk.a.a();
    String str1 = localbcp.j();
    long l1 = localbcp.o();
    Iterator localIterator = EsService.b.values().iterator();
    int i;
    label153:
    boolean bool;
    while (localIterator.hasNext())
    {
      Bundle localBundle = ((Intent)localIterator.next()).getExtras();
      if ((localBundle.getInt("op") == 79) && (TextUtils.equals(localBundle.getString("gaia_id"), str1)) && (localBundle.getLong("photo_id", 0L) == l1))
      {
        i = 1;
        if (i != 0) {
          break label404;
        }
        int j = localayg.m.getInt("account_id", -1);
        String str2 = localayg.m.getString("view_id");
        if (localbcp.N()) {
          break label406;
        }
        bool = true;
        label193:
        Context localContext = localayg.f().getApplicationContext();
        String str3 = localbcp.j();
        long l2 = localbcp.o();
        String str4 = localbcp.k();
        Intent localIntent = EsService.e.a(localContext, EsService.class);
        localIntent.putExtra("op", 79);
        localIntent.putExtra("account_id", j);
        localIntent.putExtra("gaia_id", str3);
        localIntent.putExtra("photo_id", l2);
        localIntent.putExtra("plus_oned", bool);
        localIntent.putExtra("tile_id", str4);
        localIntent.putExtra("view_id", str2);
        localayg.d = Integer.valueOf(EsService.a(localContext, localIntent));
        if (!bool) {
          break label412;
        }
      }
    }
    label404:
    label406:
    label412:
    for (int k = aau.nI;; k = aau.nJ)
    {
      if (efj.B(localayg.f()))
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(16384);
        localAccessibilityEvent.getText().add(localayg.g().getString(k));
        ((AccessibilityManager)localayg.bn.getSystemService("accessibility")).sendAccessibilityEvent(localAccessibilityEvent);
      }
      localayg.a.a(gxz.dy);
      return;
      i = 0;
      break label153;
      break;
      bool = false;
      break label193;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayh
 * JD-Core Version:    0.7.0.1
 */