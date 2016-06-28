package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import hva;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$discovery$impl$DiscoveryModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(hva.a, Integer.valueOf(0));
      this.a.put(hva.b, Integer.valueOf(1));
      this.a.put(hva.c, Integer.valueOf(2));
      this.a.put(hva.d, Integer.valueOf(3));
      this.a.put(hva.e, Integer.valueOf(4));
      this.a.put(hva.f, Integer.valueOf(5));
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
      hva.a(paramContext, parammbb);
      return;
    case 1: 
      hva.a(parammbb);
      return;
    case 2: 
      hva.b(parammbb);
      return;
    case 3: 
      hva.c(parammbb);
      return;
    case 4: 
      hva.d(parammbb);
      return;
    }
    hva.e(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.discovery.impl.DiscoveryModule
 * JD-Core Version:    0.7.0.1
 */