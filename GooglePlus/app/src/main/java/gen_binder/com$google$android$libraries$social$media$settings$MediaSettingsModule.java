package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import iqg;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$media$settings$MediaSettingsModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(4);
      this.a.put(iqg.a, Integer.valueOf(0));
      this.a.put(iqg.b, Integer.valueOf(1));
      this.a.put(iqg.c, Integer.valueOf(2));
      this.a.put(iqg.d, Integer.valueOf(3));
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
      iqg.a(paramContext, parammbb);
      return;
    case 1: 
      iqg.b(paramContext, parammbb);
      return;
    case 2: 
      iqg.c(paramContext, parammbb);
      return;
    }
    iqg.d(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.media.settings.MediaSettingsModule
 * JD-Core Version:    0.7.0.1
 */