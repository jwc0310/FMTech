package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import cui;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$apps$plus$navdrawer$NavigationModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(cui.a, Integer.valueOf(0));
      this.a.put(cui.b, Integer.valueOf(1));
      this.a.put(cui.c, Integer.valueOf(2));
      this.a.put(cui.d, Integer.valueOf(3));
      this.a.put(cui.e, Integer.valueOf(4));
      this.a.put(cui.f, Integer.valueOf(5));
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
      cui.a(parammbb);
      return;
    case 1: 
      cui.b(parammbb);
      return;
    case 2: 
      cui.c(parammbb);
      return;
    case 3: 
      cui.a(paramContext, parammbb);
      return;
    case 4: 
      cui.b(paramContext, parammbb);
      return;
    }
    cui.c(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.apps.plus.navdrawer.NavigationModule
 * JD-Core Version:    0.7.0.1
 */