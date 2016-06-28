package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fso;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$common$api$impl$StitchModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(3);
      this.a.put(fso.a, Integer.valueOf(0));
      this.a.put(fso.b, Integer.valueOf(1));
      this.a.put(fso.c, Integer.valueOf(2));
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
      fso.a(paramContext, parammbb);
      return;
    case 1: 
      fso.a(parammbb);
      return;
    }
    fso.b(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.gcoreclient.common.api.impl.StitchModule
 * JD-Core Version:    0.7.0.1
 */