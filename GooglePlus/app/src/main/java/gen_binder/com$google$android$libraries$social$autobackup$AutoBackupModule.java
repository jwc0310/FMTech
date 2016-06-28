package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import has;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$libraries$social$autobackup$AutoBackupModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(11);
      this.a.put(has.a, Integer.valueOf(0));
      this.a.put(has.b, Integer.valueOf(1));
      this.a.put(has.c, Integer.valueOf(2));
      this.a.put(has.d, Integer.valueOf(3));
      this.a.put(has.e, Integer.valueOf(4));
      this.a.put(has.f, Integer.valueOf(5));
      this.a.put(has.g, Integer.valueOf(6));
      this.a.put(has.h, Integer.valueOf(7));
      this.a.put(has.i, Integer.valueOf(8));
      this.a.put(has.j, Integer.valueOf(9));
      this.a.put(has.k, Integer.valueOf(10));
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
      has.a(paramContext, parammbb);
      return;
    case 1: 
      has.a(parammbb);
      return;
    case 2: 
      has.b(paramContext, parammbb);
      return;
    case 3: 
      has.c(paramContext, parammbb);
      return;
    case 4: 
      has.d(paramContext, parammbb);
      return;
    case 5: 
      has.e(paramContext, parammbb);
      return;
    case 6: 
      has.b(parammbb);
      return;
    case 7: 
      has.f(paramContext, parammbb);
      return;
    case 8: 
      has.c(parammbb);
      return;
    case 9: 
      has.g(paramContext, parammbb);
      return;
    }
    has.d(parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.libraries.social.autobackup.AutoBackupModule
 * JD-Core Version:    0.7.0.1
 */