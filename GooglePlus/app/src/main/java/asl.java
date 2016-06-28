import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class asl
  implements gzi, mbo, mfd
{
  final Set<asm> a = new HashSet();
  private final bp b;
  private gzj c;
  private boolean d;
  private asi e;
  private aud f;
  private git g;
  
  public asl(bp parambp, mek parammek)
  {
    this.b = parambp;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((asi)parammbb.a(asi.class));
    this.f = ((aud)parammbb.a(aud.class));
    this.g = ((git)parammbb.a(git.class));
    this.c = ((gzj)parammbb.a(gzj.class));
    this.c.a.add(this);
  }
  
  public final void a(isq paramisq, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (paramisq.a(bpr.class).size() > 0) {}
    for (int i = bool1; (paramBoolean) && (i != 0); i = 0)
    {
      asf localasf = asf.a(paramisq);
      cl localcl = this.b.b.a.d.a();
      localcl.a(localasf, "first_time_trash_info");
      localcl.c();
      return;
    }
    boolean bool2;
    bnr localbnr;
    hai localhai;
    label167:
    int j;
    int k;
    if (paramisq.j == 0)
    {
      bool2 = bool1;
      this.e.c();
      btj localbtj = new btj(paramisq.a());
      this.d = bool1;
      localbnr = new bnr(this.b, this.g.c(), localbtj, bool2);
      localhai = new hai(this.b, this.b.b.a.d);
      if (paramisq.f <= 0) {
        break label235;
      }
      boolean bool3 = paramisq.b();
      j = paramisq.b;
      if ((!bool1) || (!bool3)) {
        break label240;
      }
      k = efj.xp;
    }
    for (;;)
    {
      localhai.a(this.b.getResources().getQuantityString(k, j), null, localbnr.f, false);
      this.c.b(localbnr);
      return;
      bool2 = false;
      break;
      label235:
      bool1 = false;
      break label167;
      label240:
      if (bool1) {
        k = efj.xr;
      } else {
        k = efj.xq;
      }
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    Bundle localBundle;
    if (TextUtils.equals(paramString, "MovePhotosToTrashTask"))
    {
      paramhaa.a(paramString);
      this.e.b();
      if (this.d)
      {
        aud localaud = this.f;
        isq localisq = localaud.b;
        localisq.a.clear();
        localisq.b = 0;
        localisq.c = 0;
        localisq.d = 0;
        localisq.g = 0;
        localisq.h = 0;
        localisq.e = 0;
        localisq.i = 0;
        localisq.j = 0;
        localisq.k = 0;
        localaud.c();
        this.d = false;
      }
      if (paramhae == null) {
        break label141;
      }
      localBundle = paramhae.a();
      if ((localBundle != null) && (localBundle.containsKey("resolver"))) {
        break label147;
      }
    }
    for (;;)
    {
      return;
      label141:
      localBundle = null;
      break;
      label147:
      bti localbti = (bti)localBundle.getParcelable("resolver");
      boolean bool = localBundle.containsKey("db_rows");
      Object localObject = null;
      if (bool)
      {
        Parcelable[] arrayOfParcelable = localBundle.getParcelableArray("db_rows");
        jqu[] arrayOfjqu = new jqu[arrayOfParcelable.length];
        for (int i = 0; i < arrayOfParcelable.length; i++) {
          arrayOfjqu[i] = ((jqu)arrayOfParcelable[i]);
        }
        localObject = arrayOfjqu;
      }
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((asm)localIterator.next()).a(localbti, localObject);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asl
 * JD-Core Version:    0.7.0.1
 */