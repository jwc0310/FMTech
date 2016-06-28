import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;

public final class aay
{
  final aax a;
  final String b;
  public final String c;
  public String d;
  public String e;
  public boolean f;
  public boolean g;
  public boolean h;
  int i;
  int j;
  public int k;
  public int l;
  public int m;
  public Bundle n;
  public IntentSender o;
  aac p;
  private final ArrayList<IntentFilter> q = new ArrayList();
  private int r = -1;
  
  aay(aax paramaax, String paramString1, String paramString2)
  {
    this.a = paramaax;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  final int a(aac paramaac)
  {
    aac localaac = this.p;
    int i1 = 0;
    if (localaac != paramaac)
    {
      this.p = paramaac;
      i1 = 0;
      if (paramaac != null)
      {
        if (aao.a(this.d, paramaac.a.getString("name"))) {
          break label567;
        }
        this.d = paramaac.a.getString("name");
      }
    }
    label567:
    for (int i2 = 1;; i2 = 0)
    {
      if (!aao.a(this.e, paramaac.a.getString("status")))
      {
        this.e = paramaac.a.getString("status");
        i2 = 1;
      }
      if (this.f != paramaac.a.getBoolean("enabled", true))
      {
        this.f = paramaac.a.getBoolean("enabled", true);
        i2 = 1;
      }
      if (this.g != paramaac.a.getBoolean("connecting", false))
      {
        this.g = paramaac.a.getBoolean("connecting", false);
        i2 |= 0x1;
      }
      ArrayList localArrayList1 = this.q;
      paramaac.a();
      if (!localArrayList1.equals(paramaac.b))
      {
        this.q.clear();
        ArrayList localArrayList2 = this.q;
        paramaac.a();
        localArrayList2.addAll(paramaac.b);
        i2 |= 0x1;
      }
      if (this.i != paramaac.a.getInt("playbackType", 1))
      {
        this.i = paramaac.a.getInt("playbackType", 1);
        i2 |= 0x1;
      }
      if (this.j != paramaac.a.getInt("playbackStream", -1))
      {
        this.j = paramaac.a.getInt("playbackStream", -1);
        i2 |= 0x1;
      }
      if (this.k != paramaac.a.getInt("volumeHandling", 0))
      {
        this.k = paramaac.a.getInt("volumeHandling", 0);
        i2 |= 0x3;
      }
      if (this.l != paramaac.a.getInt("volume"))
      {
        this.l = paramaac.a.getInt("volume");
        i2 |= 0x3;
      }
      if (this.m != paramaac.a.getInt("volumeMax"))
      {
        this.m = paramaac.a.getInt("volumeMax");
        i2 |= 0x3;
      }
      if (this.r != paramaac.a.getInt("presentationDisplayId", -1))
      {
        this.r = paramaac.a.getInt("presentationDisplayId", -1);
        i2 |= 0x5;
      }
      if (!aao.a(this.n, paramaac.a.getBundle("extras"))) {
        this.n = paramaac.a.getBundle("extras");
      }
      for (int i3 = i2 | 0x1;; i3 = i2)
      {
        if (!aao.a(this.o, (IntentSender)paramaac.a.getParcelable("settingsIntent")))
        {
          this.o = ((IntentSender)paramaac.a.getParcelable("settingsIntent"));
          i3 |= 0x1;
        }
        if (this.h != paramaac.a.getBoolean("canDisconnect", false))
        {
          this.h = paramaac.a.getBoolean("canDisconnect", false);
          i1 = i3 | 0x5;
          return i1;
        }
        return i3;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    aao.a();
    aas localaas = aao.b;
    int i1 = Math.min(this.m, Math.max(0, paramInt));
    if ((this == localaas.h) && (localaas.i != null)) {
      localaas.i.b(i1);
    }
  }
  
  public final boolean a()
  {
    aao.a();
    return aao.b.b() == this;
  }
  
  public final boolean a(aam paramaam)
  {
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    aao.a();
    return paramaam.a(this.q);
  }
  
  public final boolean a(String paramString)
  {
    aao.a();
    int i1 = this.q.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((IntentFilter)this.q.get(i2)).hasCategory(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public final void b(int paramInt)
  {
    
    if (paramInt != 0)
    {
      aas localaas = aao.b;
      if ((this == localaas.h) && (localaas.i != null)) {
        localaas.i.c(paramInt);
      }
    }
  }
  
  public final boolean b()
  {
    aao.a();
    return aao.b.a() == this;
  }
  
  public final String toString()
  {
    return "MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", enabled=" + this.f + ", connecting=" + this.g + ", canDisconnect=" + this.h + ", playbackType=" + this.i + ", playbackStream=" + this.j + ", volumeHandling=" + this.k + ", volume=" + this.l + ", volumeMax=" + this.m + ", presentationDisplayId=" + this.r + ", extras=" + this.n + ", settingsIntent=" + this.o + ", providerPackageName=" + this.a.c.a.getPackageName() + " }";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aay
 * JD-Core Version:    0.7.0.1
 */