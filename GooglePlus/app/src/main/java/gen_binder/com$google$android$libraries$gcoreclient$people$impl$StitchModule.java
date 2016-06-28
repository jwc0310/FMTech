package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import gbf;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$people$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(13);
      this.a.put(gbf.a, Integer.valueOf(0));
      this.a.put(gbf.b, Integer.valueOf(1));
      this.a.put(gbf.c, Integer.valueOf(2));
      this.a.put(gbf.d, Integer.valueOf(3));
      this.a.put(gbf.e, Integer.valueOf(4));
      this.a.put(gbf.f, Integer.valueOf(5));
      this.a.put(gbf.g, Integer.valueOf(6));
      this.a.put(gbf.h, Integer.valueOf(7));
      this.a.put(gbf.i, Integer.valueOf(8));
      this.a.put(gbf.j, Integer.valueOf(9));
      this.a.put(gbf.k, Integer.valueOf(10));
      this.a.put(gbf.l, Integer.valueOf(11));
      this.a.put(gbf.m, Integer.valueOf(12));
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
      gbf.a(paramContext, parammbb);
      return;
    case 1: 
      gbf.a(parammbb);
      return;
    case 2: 
      gbf.b(paramContext, parammbb);
      return;
    case 3: 
      gbf.b(parammbb);
      return;
    case 4: 
      gbf.c(parammbb);
      return;
    case 5: 
      gbf.d(parammbb);
      return;
    case 6: 
      gbf.e(parammbb);
      return;
    case 7: 
      gbf.f(parammbb);
      return;
    case 8: 
      gbf.g(parammbb);
      return;
    case 9: 
      gbf.h(parammbb);
      return;
    case 10: 
      gbf.i(parammbb);
      return;
    case 11: 
      gbf.c(paramContext, parammbb);
      return;
    }
    gbf.j(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.gcoreclient.people.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */