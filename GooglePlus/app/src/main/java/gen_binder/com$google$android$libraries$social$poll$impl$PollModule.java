package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jvg;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$poll$impl$PollModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(8);
      this.a.put(jvg.a, Integer.valueOf(0));
      this.a.put(jvg.b, Integer.valueOf(1));
      this.a.put(jvg.c, Integer.valueOf(2));
      this.a.put(jvg.d, Integer.valueOf(3));
      this.a.put(jvg.e, Integer.valueOf(4));
      this.a.put(jvg.f, Integer.valueOf(5));
      this.a.put(jvg.g, Integer.valueOf(6));
      this.a.put(jvg.h, Integer.valueOf(7));
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
      jvg.a(parammbb);
      return;
    case 1: 
      jvg.b(parammbb);
      return;
    case 2: 
      jvg.a(paramContext, parammbb);
      return;
    case 3: 
      jvg.c(parammbb);
      return;
    case 4: 
      jvg.d(parammbb);
      return;
    case 5: 
      jvg.e(parammbb);
      return;
    case 6: 
      jvg.f(parammbb);
      return;
    }
    jvg.g(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.poll.impl.PollModule
 * JD-Core Version:    0.7.0.1
 */