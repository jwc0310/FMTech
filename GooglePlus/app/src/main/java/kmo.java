import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class kmo
  implements kij, mes, mfa, mfd
{
  final ArrayList<kii> a = new ArrayList();
  kii b = null;
  final ArrayList<kik> c = new ArrayList();
  private final Context d;
  private final kib e = new kib();
  
  public kmo(Activity paramActivity, mek parammek)
  {
    this.d = paramActivity;
    parammek.a(this);
  }
  
  public final kii a()
  {
    return this.b;
  }
  
  public final <T extends kii> T a(Class<T> paramClass)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      kii localkii = (kii)localIterator.next();
      if (localkii.getClass() == paramClass) {
        return localkii;
      }
    }
    return null;
  }
  
  public final kii a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      kii localkii = (kii)localIterator.next();
      if (localkii.j().equals(paramString)) {
        return localkii;
      }
    }
    return null;
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject;
    label21:
    kii localkii;
    if (paramBundle == null)
    {
      localObject = null;
      Iterator localIterator = mbb.c(this.d, kil.class).iterator();
      if (!localIterator.hasNext()) {
        return;
      }
      localkii = ((kil)localIterator.next()).a(this.d);
      this.a.add(localkii);
      if (paramBundle != null) {
        break label109;
      }
    }
    label109:
    for (Bundle localBundle = null;; localBundle = paramBundle.getBundle(localkii.j()))
    {
      localkii.a(localBundle);
      if (!TextUtils.equals((CharSequence)localObject, localkii.j())) {
        break label21;
      }
      this.b = localkii;
      break label21;
      localObject = paramBundle.getString("SELECTED_SHARELET_NAME");
      break;
    }
  }
  
  public final void a(kii paramkii)
  {
    if (this.b == paramkii) {}
    for (;;)
    {
      return;
      if (this.b != null) {
        this.b.b();
      }
      this.b = paramkii;
      if (this.b != null) {
        this.b.a();
      }
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((kik)localIterator.next()).f();
      }
    }
  }
  
  public final void a(kik paramkik)
  {
    this.c.add(paramkik);
  }
  
  public final kib b()
  {
    if (this.b != null) {}
    for (kib localkib = this.b.e();; localkib = null)
    {
      if (localkib == null) {
        localkib = this.e;
      }
      return localkib;
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    if (this.b == null) {}
    for (String str = null;; str = this.b.j())
    {
      paramBundle.putString("SELECTED_SHARELET_NAME", str);
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        kii localkii = (kii)localIterator.next();
        Bundle localBundle = new Bundle();
        localkii.b(localBundle);
        paramBundle.putBundle(localkii.j(), localBundle);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmo
 * JD-Core Version:    0.7.0.1
 */