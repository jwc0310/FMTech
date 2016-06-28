package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import izh;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$networkqueue$impl$NetworkQueueModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(izh.a, Integer.valueOf(0));
      this.a.put(izh.b, Integer.valueOf(1));
      this.a.put(izh.c, Integer.valueOf(2));
      this.a.put(izh.d, Integer.valueOf(3));
      this.a.put(izh.e, Integer.valueOf(4));
      this.a.put(izh.f, Integer.valueOf(5));
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
      izh.a(paramContext, parammbb);
      return;
    case 1: 
      izh.b(paramContext, parammbb);
      return;
    case 2: 
      izh.c(paramContext, parammbb);
      return;
    case 3: 
      izh.a(parammbb);
      return;
    case 4: 
      izh.b(parammbb);
      return;
    }
    izh.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.networkqueue.impl.NetworkQueueModule
 * JD-Core Version:    0.7.0.1
 */