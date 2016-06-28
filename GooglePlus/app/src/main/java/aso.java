import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class aso
  implements asm, asr, gzi, luo, mbo, meu, mew, mez, mfd
{
  final bp a;
  gzj b;
  asi c;
  asn d;
  git e;
  luk f;
  boolean g;
  private final Set<ass> h = new HashSet();
  
  public aso(bp parambp, mek parammek)
  {
    this.a = parambp;
    parammek.a(this);
  }
  
  private void b(bti parambti, jqu[] paramArrayOfjqu)
  {
    this.a.findViewById(16908290).post(new asp(this, parambti, paramArrayOfjqu));
  }
  
  public final void a()
  {
    this.f.a(true);
    asn localasn = this.d;
    localasn.c = null;
    localasn.a = null;
    localasn.b = false;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((asi)parammbb.a(asi.class));
    this.d = ((asn)parammbb.a(asn.class));
    this.e = ((git)parammbb.a(git.class));
    this.f = ((luk)parammbb.a(luk.class));
    this.b = ((gzj)parammbb.a(gzj.class));
    ((asl)parammbb.a(asl.class)).a.add(this);
  }
  
  public final void a(ass paramass)
  {
    this.h.add(paramass);
  }
  
  public final void a(bti parambti, jqu[] paramArrayOfjqu)
  {
    b(parambti, paramArrayOfjqu);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    Bundle localBundle;
    if (TextUtils.equals(paramString, "RemovePhotosFromTrashTask"))
    {
      paramhaa.a(paramString);
      this.c.b();
      if (paramhae != null)
      {
        localBundle = paramhae.a();
        if ((localBundle != null) && (localBundle.getBoolean("restore", false)) && (localBundle.containsKey("restored_uris")) && (localBundle.containsKey("resolver"))) {
          break label68;
        }
      }
    }
    for (;;)
    {
      return;
      label68:
      ArrayList localArrayList = localBundle.getParcelableArrayList("restored_uris");
      bti localbti = (bti)localBundle.getParcelable("resolver");
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext()) {
        ((ass)localIterator.next()).a(localArrayList, localbti);
      }
    }
  }
  
  public final void b()
  {
    if (this.d.b) {
      b(this.d.c, this.d.a);
    }
    this.f.d.add(this);
    this.b.a.add(this);
  }
  
  public final void b(ass paramass)
  {
    this.h.remove(paramass);
  }
  
  public final void c()
  {
    this.f.a(false);
    this.f.d.remove(this);
    this.b.a.remove(this);
  }
  
  public final void d()
  {
    asn localasn = this.d;
    localasn.c = null;
    localasn.a = null;
    localasn.b = false;
  }
  
  public final void m_()
  {
    this.g = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aso
 * JD-Core Version:    0.7.0.1
 */