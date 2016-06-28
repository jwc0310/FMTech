package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import gkk;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$account$impl$AccountStoreModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(gkk.a, Integer.valueOf(0));
      this.a.put(gkk.b, Integer.valueOf(1));
      this.a.put(gkk.c, Integer.valueOf(2));
      this.a.put(gkk.d, Integer.valueOf(3));
      this.a.put(gkk.e, Integer.valueOf(4));
      this.a.put(gkk.f, Integer.valueOf(5));
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
      gkk.a(parammbb);
      return;
    case 1: 
      gkk.a(paramContext, parammbb);
      return;
    case 2: 
      gkk.b(paramContext, parammbb);
      return;
    case 3: 
      gkk.c(paramContext, parammbb);
      return;
    case 4: 
      gkk.b(parammbb);
      return;
    }
    gkk.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.account.impl.AccountStoreModule
 * JD-Core Version:    0.7.0.1
 */