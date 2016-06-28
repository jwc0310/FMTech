package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import ebd;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$apps$plusone$prod$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(7);
      this.a.put(ebd.a, Integer.valueOf(0));
      this.a.put(ebd.b, Integer.valueOf(1));
      this.a.put(ebd.c, Integer.valueOf(2));
      this.a.put(ebd.d, Integer.valueOf(3));
      this.a.put(ebd.e, Integer.valueOf(4));
      this.a.put(ebd.f, Integer.valueOf(5));
      this.a.put(ebd.g, Integer.valueOf(6));
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
      ebd.a(parammbb);
      return;
    case 1: 
      ebd.b(parammbb);
      return;
    case 2: 
      ebd.c(parammbb);
      return;
    case 3: 
      ebd.d(parammbb);
      return;
    case 4: 
      ebd.a(paramContext, parammbb);
      return;
    case 5: 
      ebd.b(paramContext, parammbb);
      return;
    }
    ebd.e(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.apps.plusone.prod.StitchModule
 * JD-Core Version:    0.7.0.1
 */