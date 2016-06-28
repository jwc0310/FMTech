package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fwj;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$location$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(10);
      this.a.put(fwj.a, Integer.valueOf(0));
      this.a.put(fwj.b, Integer.valueOf(1));
      this.a.put(fwj.c, Integer.valueOf(2));
      this.a.put(fwj.d, Integer.valueOf(3));
      this.a.put(fwj.e, Integer.valueOf(4));
      this.a.put(fwj.f, Integer.valueOf(5));
      this.a.put(fwj.g, Integer.valueOf(6));
      this.a.put(fwj.h, Integer.valueOf(7));
      this.a.put(fwj.i, Integer.valueOf(8));
      this.a.put(fwj.j, Integer.valueOf(9));
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
      fwj.a(parammbb);
      return;
    case 1: 
      fwj.b(parammbb);
      return;
    case 2: 
      fwj.c(parammbb);
      return;
    case 3: 
      fwj.d(parammbb);
      return;
    case 4: 
      fwj.e(parammbb);
      return;
    case 5: 
      fwj.f(parammbb);
      return;
    case 6: 
      fwj.g(parammbb);
      return;
    case 7: 
      fwj.h(parammbb);
      return;
    case 8: 
      fwj.i(parammbb);
      return;
    }
    fwj.j(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.gcoreclient.location.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */