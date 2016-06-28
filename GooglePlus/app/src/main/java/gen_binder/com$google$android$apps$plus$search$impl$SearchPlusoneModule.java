package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import djr;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$apps$plus$search$impl$SearchPlusoneModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(2);
      this.a.put(djr.a, Integer.valueOf(0));
      this.a.put(djr.b, Integer.valueOf(1));
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
      djr.a(paramContext, parammbb);
      return;
    }
    djr.b(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.apps.plus.search.impl.SearchPlusoneModule
 * JD-Core Version:    0.7.0.1
 */