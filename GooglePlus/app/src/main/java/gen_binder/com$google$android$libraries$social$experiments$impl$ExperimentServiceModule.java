package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import hzl;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$experiments$impl$ExperimentServiceModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(8);
      this.a.put(hzl.a, Integer.valueOf(0));
      this.a.put(hzl.b, Integer.valueOf(1));
      this.a.put(hzl.c, Integer.valueOf(2));
      this.a.put(hzl.d, Integer.valueOf(3));
      this.a.put(hzl.e, Integer.valueOf(4));
      this.a.put(hzl.f, Integer.valueOf(5));
      this.a.put(hzl.g, Integer.valueOf(6));
      this.a.put(hzl.h, Integer.valueOf(7));
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
      hzl.a(parammbb);
      return;
    case 1: 
      hzl.b(parammbb);
      return;
    case 2: 
      hzl.a(paramContext, parammbb);
      return;
    case 3: 
      hzl.b(paramContext, parammbb);
      return;
    case 4: 
      hzl.c(paramContext, parammbb);
      return;
    case 5: 
      hzl.d(paramContext, parammbb);
      return;
    case 6: 
      hzl.c(parammbb);
      return;
    }
    hzl.d(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.experiments.impl.ExperimentServiceModule
 * JD-Core Version:    0.7.0.1
 */