package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fvn;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$herrevad$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(fvn.a, Integer.valueOf(0));
      this.a.put(fvn.b, Integer.valueOf(1));
      this.a.put(fvn.c, Integer.valueOf(2));
      this.a.put(fvn.d, Integer.valueOf(3));
      this.a.put(fvn.e, Integer.valueOf(4));
      this.a.put(fvn.f, Integer.valueOf(5));
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
      fvn.a(parammbb);
      return;
    case 1: 
      fvn.b(parammbb);
      return;
    case 2: 
      fvn.c(parammbb);
      return;
    case 3: 
      fvn.d(parammbb);
      return;
    case 4: 
      fvn.e(parammbb);
      return;
    }
    fvn.f(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.gcoreclient.herrevad.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */