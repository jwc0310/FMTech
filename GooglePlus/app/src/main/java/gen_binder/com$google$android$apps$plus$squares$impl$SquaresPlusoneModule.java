package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dto;
import java.util.HashMap;
import mbb;
import mbk;

@UsedByReflection
public final class com$google$android$apps$plus$squares$impl$SquaresPlusoneModule
  implements mbk
{
  private HashMap<String, Integer> a;
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    if (this.a == null)
    {
      this.a = new HashMap(6);
      this.a.put(dto.a, Integer.valueOf(0));
      this.a.put(dto.b, Integer.valueOf(1));
      this.a.put(dto.c, Integer.valueOf(2));
      this.a.put(dto.d, Integer.valueOf(3));
      this.a.put(dto.e, Integer.valueOf(4));
      this.a.put(dto.f, Integer.valueOf(5));
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
      dto.a(paramContext, parammbb);
      return;
    case 1: 
      dto.a(parammbb);
      return;
    case 2: 
      dto.b(paramContext, parammbb);
      return;
    case 3: 
      dto.b(parammbb);
      return;
    case 4: 
      dto.c(paramContext, parammbb);
      return;
    }
    dto.d(paramContext, parammbb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen_binder.com.google.android.apps.plus.squares.impl.SquaresPlusoneModule
 * JD-Core Version:    0.7.0.1
 */