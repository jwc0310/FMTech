package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import lno;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$stream$legacy$impl$StreamModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(7);
      this.a.put(lno.a, Integer.valueOf(0));
      this.a.put(lno.b, Integer.valueOf(1));
      this.a.put(lno.c, Integer.valueOf(2));
      this.a.put(lno.d, Integer.valueOf(3));
      this.a.put(lno.e, Integer.valueOf(4));
      this.a.put(lno.f, Integer.valueOf(5));
      this.a.put(lno.g, Integer.valueOf(6));
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
      lno.a(paramContext, parammbb);
      return;
    case 1: 
      lno.b(paramContext, parammbb);
      return;
    case 2: 
      lno.c(paramContext, parammbb);
      return;
    case 3: 
      lno.d(paramContext, parammbb);
      return;
    case 4: 
      lno.e(paramContext, parammbb);
      return;
    case 5: 
      lno.f(paramContext, parammbb);
      return;
    }
    lno.a(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.stream.legacy.impl.StreamModule
 * JD-Core Version:    0.7.0.1
 */