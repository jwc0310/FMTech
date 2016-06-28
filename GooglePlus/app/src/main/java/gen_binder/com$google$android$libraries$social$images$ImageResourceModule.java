package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import ifs;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$images$ImageResourceModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(4);
      this.a.put(ifs.a, Integer.valueOf(0));
      this.a.put(ifs.b, Integer.valueOf(1));
      this.a.put(ifs.c, Integer.valueOf(2));
      this.a.put(ifs.d, Integer.valueOf(3));
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
      ifs.a(paramContext, parammbb);
      return;
    case 1: 
      ifs.a(parammbb);
      return;
    case 2: 
      ifs.b(parammbb);
      return;
    }
    ifs.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.images.ImageResourceModule
 * JD-Core Version:    0.7.0.1
 */