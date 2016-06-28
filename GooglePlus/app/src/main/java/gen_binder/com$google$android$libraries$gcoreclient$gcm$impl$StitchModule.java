package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fui;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$gcm$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(5);
      this.a.put(fui.a, Integer.valueOf(0));
      this.a.put(fui.b, Integer.valueOf(1));
      this.a.put(fui.c, Integer.valueOf(2));
      this.a.put(fui.d, Integer.valueOf(3));
      this.a.put(fui.e, Integer.valueOf(4));
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
      fui.a(paramContext, parammbb);
      return;
    case 1: 
      fui.a(parammbb);
      return;
    case 2: 
      fui.b(parammbb);
      return;
    case 3: 
      fui.b(paramContext, parammbb);
      return;
    }
    fui.c(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.gcoreclient.gcm.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */