package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jnj;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$people$providers$navigation$CirclesNavigationModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(2);
      this.a.put(jnj.a, Integer.valueOf(0));
      this.a.put(jnj.b, Integer.valueOf(1));
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
      jnj.a(parammbb);
      return;
    }
    jnj.a(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.people.providers.navigation.CirclesNavigationModule
 * JD-Core Version:    0.7.0.1
 */