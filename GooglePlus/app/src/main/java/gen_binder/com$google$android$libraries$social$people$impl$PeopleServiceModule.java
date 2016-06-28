package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jlq;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$people$impl$PeopleServiceModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(9);
      this.a.put(jlq.a, Integer.valueOf(0));
      this.a.put(jlq.b, Integer.valueOf(1));
      this.a.put(jlq.c, Integer.valueOf(2));
      this.a.put(jlq.d, Integer.valueOf(3));
      this.a.put(jlq.e, Integer.valueOf(4));
      this.a.put(jlq.f, Integer.valueOf(5));
      this.a.put(jlq.g, Integer.valueOf(6));
      this.a.put(jlq.h, Integer.valueOf(7));
      this.a.put(jlq.i, Integer.valueOf(8));
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
      jlq.a(parammbb);
      return;
    case 1: 
      jlq.a(paramContext, parammbb);
      return;
    case 2: 
      jlq.b(paramContext, parammbb);
      return;
    case 3: 
      jlq.c(paramContext, parammbb);
      return;
    case 4: 
      jlq.b(parammbb);
      return;
    case 5: 
      jlq.d(paramContext, parammbb);
      return;
    case 6: 
      jlq.c(parammbb);
      return;
    case 7: 
      jlq.e(paramContext, parammbb);
      return;
    }
    jlq.d(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.people.impl.PeopleServiceModule
 * JD-Core Version:    0.7.0.1
 */