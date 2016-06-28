import android.view.View;
import android.view.ViewGroup;

public abstract class ci
  extends nc
{
  private final bw b;
  private cl c = null;
  private bk d = null;
  
  public ci(bw parambw)
  {
    this.b = parambw;
  }
  
  private static String a(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public abstract bk a(int paramInt);
  
  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    long l = paramInt;
    String str = a(paramViewGroup.getId(), l);
    bk localbk = this.b.a(str);
    if (localbk != null) {
      this.c.c(localbk);
    }
    for (;;)
    {
      if (localbk != this.d)
      {
        localbk.e(false);
        localbk.f(false);
      }
      return localbk;
      localbk = a(paramInt);
      this.c.a(paramViewGroup.getId(), localbk, a(paramViewGroup.getId(), l));
    }
  }
  
  public final void a() {}
  
  public final void a(ViewGroup paramViewGroup)
  {
    if (this.c != null)
    {
      this.c.c();
      this.c = null;
      this.b.b();
    }
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    this.c.b((bk)paramObject);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return ((bk)paramObject).N == paramView;
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    bk localbk = (bk)paramObject;
    if (localbk != this.d)
    {
      if (this.d != null)
      {
        this.d.e(false);
        this.d.f(false);
      }
      if (localbk != null)
      {
        localbk.e(true);
        localbk.f(true);
      }
      this.d = localbk;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ci
 * JD-Core Version:    0.7.0.1
 */