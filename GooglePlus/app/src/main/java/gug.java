import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.Set;

public class gug
  implements guo, mbo, mew, mez, mfd
{
  public gun a;
  public gvh b;
  private guz c;
  private final SparseArray<guf> d = new SparseArray();
  
  public gug(mek parammek)
  {
    this(parammek, '\000');
  }
  
  public gug(mek parammek, byte paramByte)
  {
    this(parammek, '\000');
  }
  
  public gug(mek parammek, char paramChar)
  {
    parammek.a(this);
  }
  
  public final gug a(int paramInt, guf paramguf)
  {
    if (this.d.get(paramInt) != null)
    {
      String str = String.valueOf("Cannot register more than one handler for a given  id: ");
      throw new IllegalArgumentException(11 + String.valueOf(str).length() + str + paramInt);
    }
    this.d.put(paramInt, paramguf);
    return this;
  }
  
  public final gug a(mbb parammbb)
  {
    parammbb.a(gug.class, this);
    return this;
  }
  
  public final void a(int paramInt, Intent paramIntent)
  {
    this.c.a(paramInt);
    if (paramIntent == null) {
      throw new NullPointerException("Intent must not be null!");
    }
    if ((guf)this.d.get(paramInt) == null) {
      throw new IllegalStateException(124 + "You must register a result handler for request code" + paramInt + " before starting an activity for result with that request code");
    }
    int i = this.c.b(paramInt);
    this.a.a.startActivityForResult(paramIntent, i);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((gun)parammbb.a(gun.class));
    this.b = ((gvh)parammbb.a(gvh.class));
    this.c = ((guz)parammbb.a(guz.class));
  }
  
  public final boolean a(gud paramgud)
  {
    return this.c.a(paramgud.a, new gui(this, paramgud));
  }
  
  public final void b()
  {
    this.a.b.add(this);
    this.c.a(new guh(this));
  }
  
  public final void c()
  {
    this.a.b.remove(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gug
 * JD-Core Version:    0.7.0.1
 */