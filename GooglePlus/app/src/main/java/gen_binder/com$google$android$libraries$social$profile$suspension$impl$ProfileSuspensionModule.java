package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyt;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$profile$suspension$impl$ProfileSuspensionModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(4);
      this.a.put(jyt.a, Integer.valueOf(0));
      this.a.put(jyt.b, Integer.valueOf(1));
      this.a.put(jyt.c, Integer.valueOf(2));
      this.a.put(jyt.d, Integer.valueOf(3));
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
      jyt.a(parammbb);
      return;
    case 1: 
      jyt.b(parammbb);
      return;
    case 2: 
      jyt.a(paramContext, parammbb);
      return;
    }
    jyt.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.profile.suspension.impl.ProfileSuspensionModule
 * JD-Core Version:    0.7.0.1
 */