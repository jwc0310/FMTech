package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import ltt;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$timingbreakdown$impl$TimingBreakdownModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(5);
      this.a.put(ltt.a, Integer.valueOf(0));
      this.a.put(ltt.b, Integer.valueOf(1));
      this.a.put(ltt.c, Integer.valueOf(2));
      this.a.put(ltt.d, Integer.valueOf(3));
      this.a.put(ltt.e, Integer.valueOf(4));
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
      ltt.a(parammbb);
      return;
    case 1: 
      ltt.a(paramContext, parammbb);
      return;
    case 2: 
      ltt.b(paramContext, parammbb);
      return;
    case 3: 
      ltt.b(parammbb);
      return;
    }
    ltt.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.timingbreakdown.impl.TimingBreakdownModule
 * JD-Core Version:    0.7.0.1
 */