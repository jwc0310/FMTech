package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fxn;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$maps$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(5);
      this.a.put(fxn.a, Integer.valueOf(0));
      this.a.put(fxn.b, Integer.valueOf(1));
      this.a.put(fxn.c, Integer.valueOf(2));
      this.a.put(fxn.d, Integer.valueOf(3));
      this.a.put(fxn.e, Integer.valueOf(4));
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
      fxn.a(parammbb);
      return;
    case 1: 
      fxn.b(parammbb);
      return;
    case 2: 
      fxn.c(parammbb);
      return;
    case 3: 
      fxn.d(parammbb);
      return;
    }
    fxn.e(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.gcoreclient.maps.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */