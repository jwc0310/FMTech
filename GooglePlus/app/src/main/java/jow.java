import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import java.util.Set;

final class jow
  implements jov, jpk, mbo, mew, mez, mfd
{
  jph a;
  private guz b;
  private final SparseArray<jpe> c = new SparseArray();
  
  jow(mek parammek)
  {
    parammek.a(this);
  }
  
  public final jov a(int paramInt, jpe paramjpe)
  {
    if (this.c.get(paramInt) != null)
    {
      String str = String.valueOf("Cannot register more than one handler for a given  id: ");
      throw new IllegalArgumentException(11 + String.valueOf(str).length() + str + paramInt);
    }
    new StringBuilder(21).append("register: ").append(paramInt);
    this.c.put(paramInt, paramjpe);
    return this;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((jph)parammbb.a(jph.class));
    this.b = ((guz)parammbb.a(guz.class));
  }
  
  public final void a(jpd paramjpd, int paramInt, List<String> paramList)
  {
    this.b.a(paramInt);
    if ((jpe)this.c.get(paramInt) == null) {
      throw new IllegalStateException(116 + "You must register a result handler for request code " + paramInt + " before requesting permissions with that request code");
    }
    int i = this.b.b(paramInt);
    this.a.a(paramjpd, i, paramList);
  }
  
  public final boolean a(jpb paramjpb)
  {
    return this.b.a(paramjpb.a, new joy(this, paramjpb));
  }
  
  public final void b()
  {
    this.a.a.add(this);
    this.b.a(new jox(this));
  }
  
  public final void c()
  {
    this.a.a.remove(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jow
 * JD-Core Version:    0.7.0.1
 */