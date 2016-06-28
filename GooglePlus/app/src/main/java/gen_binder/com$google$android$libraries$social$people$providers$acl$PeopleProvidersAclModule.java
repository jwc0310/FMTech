package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jna;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$people$providers$acl$PeopleProvidersAclModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(3);
      this.a.put(jna.a, Integer.valueOf(0));
      this.a.put(jna.b, Integer.valueOf(1));
      this.a.put(jna.c, Integer.valueOf(2));
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
      jna.a(parammbb);
      return;
    case 1: 
      jna.b(parammbb);
      return;
    }
    jna.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.people.providers.acl.PeopleProvidersAclModule
 * JD-Core Version:    0.7.0.1
 */