import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ijx
  implements ikd
{
  fxz a;
  ikb b;
  public final List<nve> c;
  public fxw d;
  public Point e;
  int f;
  Context g;
  private String h;
  
  public ijx(Context paramContext, nve paramnve, fxw paramfxw, Point paramPoint)
  {
    this.g = paramContext;
    this.c = new ArrayList();
    this.c.add(paramnve);
    this.d = paramfxw;
    this.e = paramPoint;
    this.f = ikc.a;
  }
  
  private final void d()
  {
    if (this.b != null)
    {
      Bitmap localBitmap = this.b.d();
      this.a.a(localBitmap);
    }
  }
  
  public final String a()
  {
    if (this.h == null)
    {
      int i = this.c.size();
      String[] arrayOfString = new String[i];
      for (int j = 0; j < i; j++) {
        arrayOfString[j] = ((nve)this.c.get(j)).a;
      }
      Arrays.sort(arrayOfString);
      this.h = TextUtils.join(",", arrayOfString);
    }
    return this.h;
  }
  
  public final void a(int paramInt)
  {
    this.f = paramInt;
    if ((this.b != null) && (this.b.g != paramInt))
    {
      this.b.g = paramInt;
      d();
    }
  }
  
  public final void a(ijx paramijx, Map<String, ijx> paramMap)
  {
    if (this == paramijx) {
      return;
    }
    if (Log.isLoggable("MarkerCluster", 3))
    {
      String str1 = String.valueOf(paramijx);
      String str2 = String.valueOf(this);
      new StringBuilder(12 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("merge ").append(str1).append(" into ").append(str2);
    }
    this.c.addAll(paramijx.c);
    Iterator localIterator = paramijx.c.iterator();
    while (localIterator.hasNext()) {
      paramMap.put(((nve)localIterator.next()).a, this);
    }
    this.h = null;
  }
  
  public final void a(ikb paramikb)
  {
    if (this.b == paramikb) {
      d();
    }
  }
  
  public final void b()
  {
    if (this.a != null)
    {
      this.a.a();
      this.a = null;
    }
    if (this.b != null)
    {
      this.b.ap_();
      this.b = null;
    }
  }
  
  public final void c()
  {
    if (this.c.size() == 1) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      nvv localnvv = efj.a(((nve)localIterator.next()).b);
      if ((localnvv != null) && (localnvv.b != null) && (localnvv.c != null)) {
        localArrayList.add(new fxw(localnvv.b.doubleValue(), localnvv.c.doubleValue()));
      }
    }
    fxx localfxx = ((fxy)mbb.a(this.g, fxy.class)).a(localArrayList);
    double d1 = (localfxx.a().a + localfxx.b().a) / 2.0D;
    double d2;
    if (localfxx.a().b > localfxx.b().b)
    {
      d2 = (360.0D + (localfxx.a().b + localfxx.b().b)) / 2.0D;
      if (d2 <= 180.0D) {}
    }
    for (d2 -= 360.0D;; d2 = (localfxx.a().b + localfxx.b().b) / 2.0D)
    {
      this.d = new fxw(d1, d2);
      return;
    }
  }
  
  public final String toString()
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[MarkerCluster: ");
    int j;
    if (this.c != null) {
      j = this.c.size();
    }
    while (i < j)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(((nve)this.c.get(i)).c);
      i++;
      continue;
      j = 0;
      i = 0;
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijx
 * JD-Core Version:    0.7.0.1
 */