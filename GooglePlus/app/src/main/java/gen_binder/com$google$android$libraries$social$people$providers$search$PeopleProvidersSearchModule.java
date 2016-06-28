package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import joh;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$people$providers$search$PeopleProvidersSearchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(2);
      this.a.put(joh.a, Integer.valueOf(0));
      this.a.put(joh.b, Integer.valueOf(1));
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
      joh.a(paramContext, parammbb);
      return;
    }
    joh.a(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.people.providers.search.PeopleProvidersSearchModule
 * JD-Core Version:    0.7.0.1
 */