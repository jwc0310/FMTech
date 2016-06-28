package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import gze;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$async$AsyncModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(5);
      this.a.put(gze.a, Integer.valueOf(0));
      this.a.put(gze.b, Integer.valueOf(1));
      this.a.put(gze.c, Integer.valueOf(2));
      this.a.put(gze.d, Integer.valueOf(3));
      this.a.put(gze.e, Integer.valueOf(4));
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
      gze.a(parammbb);
      return;
    case 1: 
      gze.a(paramContext, parammbb);
      return;
    case 2: 
      gze.b(paramContext, parammbb);
      return;
    case 3: 
      gze.b(parammbb);
      return;
    }
    gze.c(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.async.AsyncModule
 * JD-Core Version:    0.7.0.1
 */