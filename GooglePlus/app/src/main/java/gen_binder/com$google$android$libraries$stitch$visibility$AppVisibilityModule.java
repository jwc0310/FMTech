package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import mbb;
import mbk;
import mgg;

@UsedByReflection
public final class com$google$android$libraries$stitch$visibility$AppVisibilityModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(2);
      this.a.put(mgg.a, Integer.valueOf(0));
      this.a.put(mgg.b, Integer.valueOf(1));
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
      mgg.a(paramContext, parammbb);
      return;
    }
    mgg.a(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.stitch.visibility.AppVisibilityModule
 * JD-Core Version:    0.7.0.1
 */