import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class kwz
{
  public Context a;
  public kxb b;
  public List<kxa> c = new LinkedList();
  public CharSequence d;
  private int e = 0;
  
  public kwz(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, kxb paramkxb)
  {
    if ((this.e == paramInt) && (TextUtils.equals(paramCharSequence, this.d))) {}
    for (;;)
    {
      return;
      this.e = paramInt;
      this.d = paramCharSequence;
      this.b = paramkxb;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((kxa)localIterator.next()).a(this.b);
      }
    }
  }
  
  public final void a(kxa paramkxa)
  {
    this.c.add(paramkxa);
    if (this.b != null) {
      paramkxa.a(this.b);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwz
 * JD-Core Version:    0.7.0.1
 */