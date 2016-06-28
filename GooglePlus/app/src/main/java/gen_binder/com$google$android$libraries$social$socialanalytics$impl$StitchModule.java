package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import ksl;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$socialanalytics$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(5);
      this.a.put(ksl.a, Integer.valueOf(0));
      this.a.put(ksl.b, Integer.valueOf(1));
      this.a.put(ksl.c, Integer.valueOf(2));
      this.a.put(ksl.d, Integer.valueOf(3));
      this.a.put(ksl.e, Integer.valueOf(4));
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
      ksl.a(paramContext, parammbb);
      return;
    case 1: 
      ksl.b(paramContext, parammbb);
      return;
    case 2: 
      ksl.c(paramContext, parammbb);
      return;
    case 3: 
      ksl.a(parammbb);
      return;
    }
    ksl.b(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.socialanalytics.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */