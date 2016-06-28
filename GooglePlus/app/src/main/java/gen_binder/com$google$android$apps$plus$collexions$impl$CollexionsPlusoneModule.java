package gen_binder;

import android.content.Context;
import bpb;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$apps$plus$collexions$impl$CollexionsPlusoneModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(bpb.a, Integer.valueOf(0));
      this.a.put(bpb.b, Integer.valueOf(1));
      this.a.put(bpb.c, Integer.valueOf(2));
      this.a.put(bpb.d, Integer.valueOf(3));
      this.a.put(bpb.e, Integer.valueOf(4));
      this.a.put(bpb.f, Integer.valueOf(5));
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
      bpb.a(paramContext, parammbb);
      return;
    case 1: 
      bpb.b(paramContext, parammbb);
      return;
    case 2: 
      bpb.a(parammbb);
      return;
    case 3: 
      bpb.c(paramContext, parammbb);
      return;
    case 4: 
      bpb.d(paramContext, parammbb);
      return;
    }
    bpb.e(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.apps.plus.collexions.impl.CollexionsPlusoneModule
 * JD-Core Version:    0.7.0.1
 */