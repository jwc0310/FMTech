import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aty
  implements dxl, jer<aud>, mbo, mew, mez, mfd
{
  public aud a;
  private final bk b;
  private final auc c;
  private gxx d;
  private Context e;
  
  public aty(bk parambk, mek parammek, auc paramauc)
  {
    this.b = parambk;
    this.c = paramauc;
    parammek.a(this);
  }
  
  public final void a()
  {
    int i = this.a.b.b;
    if (efj.C(this.b.f()))
    {
      Resources localResources = this.b.g();
      int j = efj.xS;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      String str = localResources.getQuantityString(j, i, arrayOfObject);
      this.b.N.announceForAccessibility(str);
    }
    this.c.w_();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = paramContext;
    this.a = ((aud)parammbb.a(aud.class));
    this.d = ((gxx)parammbb.a(gxx.class));
  }
  
  public final boolean a(isp paramisp)
  {
    return a(new atz(this, 1, paramisp));
  }
  
  public final boolean a(ArrayList<? extends isp> paramArrayList)
  {
    Iterator localIterator1 = paramArrayList.iterator();
    while (localIterator1.hasNext())
    {
      isp localisp2 = (isp)localIterator1.next();
      if (((localisp2 instanceof jpx)) && (((jpx)localisp2).h() != null))
      {
        Resources localResources = this.b.g();
        lut locallut = lut.b(localResources.getString(aau.eY), localResources.getQuantityString(efj.xs, paramArrayList.size()), localResources.getString(aau.vS), localResources.getString(aau.ly));
        locallut.m.putParcelableArrayList("selected_media", paramArrayList);
        locallut.a(this.b.x, "deselect_photos");
        locallut.ab = new aub(this);
        return false;
      }
    }
    aud localaud = this.a;
    Iterator localIterator2 = paramArrayList.iterator();
    if (localIterator2.hasNext())
    {
      isp localisp1 = (isp)localIterator2.next();
      isq localisq = localaud.b;
      long l = localisp1.c();
      String str;
      if (Log.isLoggable("MediaSelection", 4))
      {
        str = String.valueOf(localisp1);
        if ((0x2 & l) == 0L) {
          break label341;
        }
      }
      label341:
      for (boolean bool = true;; bool = false)
      {
        new StringBuilder(27 + String.valueOf(str).length()).append("Removing ").append(str).append(", deletable: ").append(bool);
        aip localaip = localisp1.b();
        isn localisn = localisp1.a();
        Map localMap = (Map)localisq.a.get(localisn);
        if ((localMap == null) || (localMap.remove(localaip) == null)) {
          break;
        }
        if (localMap.isEmpty()) {
          localisq.a.remove(localisn);
        }
        localisq.a(l, false);
        break;
      }
    }
    localaud.c();
    a();
    return true;
  }
  
  public final void b()
  {
    this.a.a.a(this, true);
  }
  
  public final void b(isp paramisp)
  {
    c(new aua(this, 1, paramisp));
  }
  
  final void b(ArrayList<? extends isp> paramArrayList)
  {
    aud localaud = this.a;
    Iterator localIterator = paramArrayList.iterator();
    if (localIterator.hasNext())
    {
      isp localisp = (isp)localIterator.next();
      isq localisq = localaud.b;
      long l = localisp.c();
      String str;
      if (Log.isLoggable("MediaSelection", 4))
      {
        str = String.valueOf(localisp);
        if ((0x2 & l) == 0L) {
          break label202;
        }
      }
      label202:
      for (boolean bool = true;; bool = false)
      {
        new StringBuilder(27 + String.valueOf(str).length()).append("Removing ").append(str).append(", deletable: ").append(bool);
        aip localaip = localisp.b();
        isn localisn = localisp.a();
        Map localMap = (Map)localisq.a.get(localisn);
        if ((localMap == null) || (localMap.remove(localaip) == null)) {
          break;
        }
        if (localMap.isEmpty()) {
          localisq.a.remove(localisn);
        }
        localisq.a(l, false);
        break;
      }
    }
    localaud.c();
    a();
  }
  
  public final void c()
  {
    this.a.a.a(this);
  }
  
  public final void c(isp paramisp)
  {
    aud localaud = this.a;
    localaud.b.a(paramisp);
    localaud.c();
    a();
  }
  
  public final void c(ArrayList<? extends isp> paramArrayList)
  {
    int i = paramArrayList.size();
    int j = this.b.m.getInt("account_id", -1);
    if (j != -1) {
      for (int k = 0; k < i; k++)
      {
        gxx localgxx = this.d;
        gxw localgxw = new gxw(this.e, j);
        localgxw.c = gxz.dt;
        localgxx.a(localgxw);
      }
    }
    aud localaud = this.a;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      isp localisp = (isp)localIterator.next();
      localaud.b.a(localisp);
    }
    localaud.c();
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aty
 * JD-Core Version:    0.7.0.1
 */