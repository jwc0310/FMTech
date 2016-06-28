package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import lrv;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$sync$impl$SyncModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(3);
      this.a.put(lrv.a, Integer.valueOf(0));
      this.a.put(lrv.b, Integer.valueOf(1));
      this.a.put(lrv.c, Integer.valueOf(2));
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
      lrv.a(parammbb);
      return;
    case 1: 
      lrv.a(paramContext, parammbb);
      return;
    }
    lrv.b(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.sync.impl.SyncModule
 * JD-Core Version:    0.7.0.1
 */