import android.os.Bundle;
import java.util.LinkedList;

public abstract class eus<T extends eur>
{
  public T a;
  public Bundle b;
  LinkedList<euy> c;
  private final evd<T> d = new evd(this);
  
  public final void a(int paramInt)
  {
    while ((!this.c.isEmpty()) && (((euy)this.c.getLast()).a() >= paramInt)) {
      this.c.removeLast();
    }
  }
  
  public final void a(Bundle paramBundle, euy parameuy)
  {
    if (this.a != null)
    {
      parameuy.b();
      return;
    }
    if (this.c == null) {
      this.c = new LinkedList();
    }
    this.c.add(parameuy);
    if (paramBundle != null)
    {
      if (this.b != null) {
        break label72;
      }
      this.b = ((Bundle)paramBundle.clone());
    }
    for (;;)
    {
      a(this.d);
      return;
      label72:
      this.b.putAll(paramBundle);
    }
  }
  
  public abstract void a(evd<T> paramevd);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eus
 * JD-Core Version:    0.7.0.1
 */