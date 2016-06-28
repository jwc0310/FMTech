package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import kml;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$sharekit$impl$SharekitModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(20);
      this.a.put(kml.a, Integer.valueOf(0));
      this.a.put(kml.b, Integer.valueOf(1));
      this.a.put(kml.c, Integer.valueOf(2));
      this.a.put(kml.d, Integer.valueOf(3));
      this.a.put(kml.e, Integer.valueOf(4));
      this.a.put(kml.f, Integer.valueOf(5));
      this.a.put(kml.g, Integer.valueOf(6));
      this.a.put(kml.h, Integer.valueOf(7));
      this.a.put(kml.i, Integer.valueOf(8));
      this.a.put(kml.j, Integer.valueOf(9));
      this.a.put(kml.k, Integer.valueOf(10));
      this.a.put(kml.l, Integer.valueOf(11));
      this.a.put(kml.m, Integer.valueOf(12));
      this.a.put(kml.n, Integer.valueOf(13));
      this.a.put(kml.o, Integer.valueOf(14));
      this.a.put(kml.p, Integer.valueOf(15));
      this.a.put(kml.q, Integer.valueOf(16));
      this.a.put(kml.r, Integer.valueOf(17));
      this.a.put(kml.s, Integer.valueOf(18));
      this.a.put(kml.t, Integer.valueOf(19));
    }
    Integer localInteger = (Integer)this.a.get(paramClass.getName());
    if (localInteger == null) {
      return;
    }
    switch (localInteger.intValue())
    {
    default: 
      return;
    case 0: 
      kml.a(parammbb);
      return;
    case 1: 
      kml.b(parammbb);
      return;
    case 2: 
      kml.a(paramContext, parammbb);
      return;
    case 3: 
      kml.b(paramContext, parammbb);
      return;
    case 4: 
      kml.c(parammbb);
      return;
    case 5: 
      kml.d(parammbb);
      return;
    case 6: 
      kml.e(parammbb);
      return;
    case 7: 
      kml.c(paramContext, parammbb);
      return;
    case 8: 
      kml.f(parammbb);
      return;
    case 9: 
      kml.g(parammbb);
      return;
    case 10: 
      kml.d(paramContext, parammbb);
      return;
    case 11: 
      kml.h(parammbb);
      return;
    case 12: 
      kml.i(parammbb);
      return;
    case 13: 
      kml.j(parammbb);
      return;
    case 14: 
      kml.e(paramContext, parammbb);
      return;
    case 15: 
      kml.k(parammbb);
      return;
    case 16: 
      kml.l(parammbb);
      return;
    case 17: 
      kml.f(paramContext, parammbb);
      return;
    case 18: 
      kml.m(parammbb);
      return;
    }
    kml.n(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.sharekit.impl.SharekitModule
 * JD-Core Version:    0.7.0.1
 */