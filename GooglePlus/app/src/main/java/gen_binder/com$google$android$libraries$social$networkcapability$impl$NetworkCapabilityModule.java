package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import ixk;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$networkcapability$impl$NetworkCapabilityModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(4);
      this.a.put(ixk.a, Integer.valueOf(0));
      this.a.put(ixk.b, Integer.valueOf(1));
      this.a.put(ixk.c, Integer.valueOf(2));
      this.a.put(ixk.d, Integer.valueOf(3));
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
      ixk.a(parammbb);
      return;
    case 1: 
      ixk.a(paramContext, parammbb);
      return;
    case 2: 
      ixk.b(paramContext, parammbb);
      return;
    }
    ixk.b(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.networkcapability.impl.NetworkCapabilityModule
 * JD-Core Version:    0.7.0.1
 */