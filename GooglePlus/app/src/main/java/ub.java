import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v7.widget.Toolbar;

public class ub
  implements tv
{
  public final d a;
  public final ComponentName b;
  private Toolbar c;
  private Drawable d;
  private CharSequence e;
  
  public ub(g paramg, d paramd, ComponentName paramComponentName)
  {
    this.a = paramd;
    this.b = paramComponentName;
  }
  
  public final Drawable a()
  {
    return this.d;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 0)
    {
      this.c.c(this.e);
      return;
    }
    this.c.b(paramInt);
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    this.c.b(paramDrawable);
    a(paramInt);
  }
  
  public final Context b()
  {
    return this.c.getContext();
  }
  
  public final boolean c()
  {
    return true;
  }
  
  public IBinder d()
  {
    return this.a.asBinder();
  }
  
  public ComponentName e()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ub
 * JD-Core Version:    0.7.0.1
 */