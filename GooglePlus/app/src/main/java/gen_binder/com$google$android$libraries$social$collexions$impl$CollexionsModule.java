package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import hiv;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$collexions$impl$CollexionsModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(16);
      this.a.put(hiv.a, Integer.valueOf(0));
      this.a.put(hiv.b, Integer.valueOf(1));
      this.a.put(hiv.c, Integer.valueOf(2));
      this.a.put(hiv.d, Integer.valueOf(3));
      this.a.put(hiv.e, Integer.valueOf(4));
      this.a.put(hiv.f, Integer.valueOf(5));
      this.a.put(hiv.g, Integer.valueOf(6));
      this.a.put(hiv.h, Integer.valueOf(7));
      this.a.put(hiv.i, Integer.valueOf(8));
      this.a.put(hiv.j, Integer.valueOf(9));
      this.a.put(hiv.k, Integer.valueOf(10));
      this.a.put(hiv.l, Integer.valueOf(11));
      this.a.put(hiv.m, Integer.valueOf(12));
      this.a.put(hiv.n, Integer.valueOf(13));
      this.a.put(hiv.o, Integer.valueOf(14));
      this.a.put(hiv.p, Integer.valueOf(15));
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
      hiv.a(paramContext, parammbb);
      return;
    case 1: 
      hiv.b(paramContext, parammbb);
      return;
    case 2: 
      hiv.a(parammbb);
      return;
    case 3: 
      hiv.c(paramContext, parammbb);
      return;
    case 4: 
      hiv.d(paramContext, parammbb);
      return;
    case 5: 
      hiv.b(parammbb);
      return;
    case 6: 
      hiv.c(parammbb);
      return;
    case 7: 
      hiv.e(paramContext, parammbb);
      return;
    case 8: 
      hiv.d(parammbb);
      return;
    case 9: 
      hiv.e(parammbb);
      return;
    case 10: 
      hiv.f(paramContext, parammbb);
      return;
    case 11: 
      hiv.g(paramContext, parammbb);
      return;
    case 12: 
      hiv.f(parammbb);
      return;
    case 13: 
      hiv.g(parammbb);
      return;
    case 14: 
      hiv.h(paramContext, parammbb);
      return;
    }
    hiv.h(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.collexions.impl.CollexionsModule
 * JD-Core Version:    0.7.0.1
 */