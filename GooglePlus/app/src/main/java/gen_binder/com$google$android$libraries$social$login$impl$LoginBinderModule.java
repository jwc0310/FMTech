package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import imc;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$login$impl$LoginBinderModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(7);
      this.a.put(imc.a, Integer.valueOf(0));
      this.a.put(imc.b, Integer.valueOf(1));
      this.a.put(imc.c, Integer.valueOf(2));
      this.a.put(imc.d, Integer.valueOf(3));
      this.a.put(imc.e, Integer.valueOf(4));
      this.a.put(imc.f, Integer.valueOf(5));
      this.a.put(imc.g, Integer.valueOf(6));
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
      imc.a(paramContext, parammbb);
      return;
    case 1: 
      imc.b(paramContext, parammbb);
      return;
    case 2: 
      imc.c(paramContext, parammbb);
      return;
    case 3: 
      imc.d(paramContext, parammbb);
      return;
    case 4: 
      imc.e(paramContext, parammbb);
      return;
    case 5: 
      imc.f(paramContext, parammbb);
      return;
    }
    imc.g(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.login.impl.LoginBinderModule
 * JD-Core Version:    0.7.0.1
 */