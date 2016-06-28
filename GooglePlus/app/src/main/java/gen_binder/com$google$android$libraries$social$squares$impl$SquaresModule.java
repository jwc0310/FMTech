package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import laa;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$squares$impl$SquaresModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(20);
      this.a.put(laa.a, Integer.valueOf(0));
      this.a.put(laa.b, Integer.valueOf(1));
      this.a.put(laa.c, Integer.valueOf(2));
      this.a.put(laa.d, Integer.valueOf(3));
      this.a.put(laa.e, Integer.valueOf(4));
      this.a.put(laa.f, Integer.valueOf(5));
      this.a.put(laa.g, Integer.valueOf(6));
      this.a.put(laa.h, Integer.valueOf(7));
      this.a.put(laa.i, Integer.valueOf(8));
      this.a.put(laa.j, Integer.valueOf(9));
      this.a.put(laa.k, Integer.valueOf(10));
      this.a.put(laa.l, Integer.valueOf(11));
      this.a.put(laa.m, Integer.valueOf(12));
      this.a.put(laa.n, Integer.valueOf(13));
      this.a.put(laa.o, Integer.valueOf(14));
      this.a.put(laa.p, Integer.valueOf(15));
      this.a.put(laa.q, Integer.valueOf(16));
      this.a.put(laa.r, Integer.valueOf(17));
      this.a.put(laa.s, Integer.valueOf(18));
      this.a.put(laa.t, Integer.valueOf(19));
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
      laa.a(paramContext, parammbb);
      return;
    case 1: 
      laa.b(paramContext, parammbb);
      return;
    case 2: 
      laa.c(paramContext, parammbb);
      return;
    case 3: 
      laa.a(parammbb);
      return;
    case 4: 
      laa.d(paramContext, parammbb);
      return;
    case 5: 
      laa.b(parammbb);
      return;
    case 6: 
      laa.c(parammbb);
      return;
    case 7: 
      laa.e(paramContext, parammbb);
      return;
    case 8: 
      laa.d(parammbb);
      return;
    case 9: 
      laa.e(parammbb);
      return;
    case 10: 
      laa.f(parammbb);
      return;
    case 11: 
      laa.g(parammbb);
      return;
    case 12: 
      laa.h(parammbb);
      return;
    case 13: 
      laa.i(parammbb);
      return;
    case 14: 
      laa.f(paramContext, parammbb);
      return;
    case 15: 
      laa.j(parammbb);
      return;
    case 16: 
      laa.g(paramContext, parammbb);
      return;
    case 17: 
      laa.h(paramContext, parammbb);
      return;
    case 18: 
      laa.i(paramContext, parammbb);
      return;
    }
    laa.j(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.squares.impl.SquaresModule
 * JD-Core Version:    0.7.0.1
 */