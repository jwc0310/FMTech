package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import djb;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$apps$plus$profile$impl$ProfilePlusoneModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(5);
      this.a.put(djb.a, Integer.valueOf(0));
      this.a.put(djb.b, Integer.valueOf(1));
      this.a.put(djb.c, Integer.valueOf(2));
      this.a.put(djb.d, Integer.valueOf(3));
      this.a.put(djb.e, Integer.valueOf(4));
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
      djb.a(paramContext, parammbb);
      return;
    case 1: 
      djb.b(paramContext, parammbb);
      return;
    case 2: 
      djb.c(paramContext, parammbb);
      return;
    case 3: 
      djb.a(parammbb);
      return;
    }
    djb.d(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.apps.plus.profile.impl.ProfilePlusoneModule
 * JD-Core Version:    0.7.0.1
 */