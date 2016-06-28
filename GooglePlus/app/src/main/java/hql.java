import android.util.Log;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public abstract class hql
  extends nc
{
  cl b = null;
  private final bw c;
  private final kq<String, bk> d;
  private bk e = null;
  private hqn f;
  
  public hql(bw parambw)
  {
    this(parambw, (byte)0);
  }
  
  private hql(bw parambw, byte paramByte)
  {
    this.c = parambw;
    this.d = new hqm(this, 5);
  }
  
  public abstract bk a(int paramInt);
  
  public Object a(View paramView, int paramInt)
  {
    if (this.b == null) {
      this.b = this.c.a();
    }
    String str1 = a(paramView.getId(), paramInt);
    this.d.b(str1);
    bk localbk = this.c.a(str1);
    if (localbk != null)
    {
      if (Log.isLoggable("FragmentPagerAdapter", 2))
      {
        String str3 = String.valueOf(localbk);
        new StringBuilder(31 + String.valueOf(str3).length()).append("Attaching item #").append(paramInt).append(": f=").append(str3);
      }
      this.b.c(localbk);
    }
    for (;;)
    {
      if (localbk != this.e)
      {
        localbk.e(false);
        localbk.f(false);
      }
      return localbk;
      localbk = a(paramInt);
      if (Log.isLoggable("FragmentPagerAdapter", 2))
      {
        String str2 = String.valueOf(localbk);
        new StringBuilder(28 + String.valueOf(str2).length()).append("Adding item #").append(paramInt).append(": f=").append(str2);
      }
      this.b.a(paramView.getId(), localbk, str1);
    }
  }
  
  protected String a(int paramInt1, int paramInt2)
  {
    String str = String.valueOf("android:switcher:");
    return 23 + String.valueOf(str).length() + str + paramInt1 + ":" + paramInt2;
  }
  
  public final void a()
  {
    if (this.c.f() == null) {
      return;
    }
    cl localcl = this.c.a();
    Iterator localIterator = this.c.f().iterator();
    while (localIterator.hasNext())
    {
      bk localbk = (bk)localIterator.next();
      if (localbk != null)
      {
        String str5 = localbk.D;
        if ((str5 == null) || (!str5.startsWith("android:switcher:"))) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label183;
        }
        if (!localbk.F) {
          break label185;
        }
        localcl.a(localbk);
        if (!Log.isLoggable("FragmentPagerAdapter", 2)) {
          break;
        }
        String str3 = String.valueOf(localbk);
        String str4 = String.valueOf(localbk.N);
        new StringBuilder(19 + String.valueOf(str3).length() + String.valueOf(str4).length()).append("Removing item f=").append(str3).append(" v=").append(str4);
        break;
      }
      label183:
      continue;
      label185:
      localcl.b(localbk);
      if (Log.isLoggable("FragmentPagerAdapter", 2))
      {
        String str1 = String.valueOf(localbk);
        String str2 = String.valueOf(localbk.N);
        new StringBuilder(20 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Detaching item f=").append(str1).append(" v=").append(str2);
      }
    }
    localcl.c();
    this.c.b();
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    bk localbk = (bk)paramObject;
    if (localbk != this.e)
    {
      if (this.e != null)
      {
        this.e.e(false);
        this.e.f(false);
      }
      if (localbk != null)
      {
        localbk.e(true);
        localbk.f(true);
      }
      this.e = localbk;
    }
    if (this.f != null) {
      this.f.a(localbk, paramInt);
    }
  }
  
  public void a(View paramView, int paramInt, Object paramObject)
  {
    if (this.b == null) {
      this.b = this.c.a();
    }
    bk localbk = (bk)paramObject;
    if (Log.isLoggable("FragmentPagerAdapter", 2))
    {
      String str2 = String.valueOf(localbk);
      String str3 = String.valueOf(localbk.N);
      new StringBuilder(34 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("Detaching item #").append(paramInt).append(": f=").append(str2).append(" v=").append(str3);
    }
    String str1 = localbk.D;
    if (str1 == null) {
      str1 = a(paramView.getId(), paramInt);
    }
    if (a(localbk))
    {
      this.d.a(str1, localbk);
      this.b.b(localbk);
      return;
    }
    this.b.a(localbk);
  }
  
  public void a(hqn paramhqn)
  {
    this.f = paramhqn;
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    View localView = ((bk)paramObject).N;
    for (Object localObject = paramView; (localObject instanceof View); localObject = ((View)localObject).getParent()) {
      if (localObject == localView) {
        return true;
      }
    }
    return false;
  }
  
  protected boolean a(bk parambk)
  {
    return true;
  }
  
  public final void c()
  {
    if (this.b != null)
    {
      this.b.c();
      this.b = null;
      this.c.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hql
 * JD-Core Version:    0.7.0.1
 */