import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

public abstract class hqo<T, Y>
  extends hql
{
  public Context c;
  public hqs<T, Y> d;
  boolean e;
  public int f = -1;
  public int g;
  private final Map<Y, Integer> h = new HashMap();
  private final HashMap<Object, Y> i = new HashMap();
  private Object j;
  private final hqq k = new hqq(this);
  
  public hqo(Context paramContext, bw parambw, hqs<T, Y> paramhqs)
  {
    super(parambw);
    if (paramhqs != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = paramhqs;
      this.e = bool;
      if (bool) {
        paramhqs.a(this.k);
      }
      this.c = paramContext;
      super.d();
      return;
    }
  }
  
  private final boolean c(int paramInt)
  {
    if (this.d != null) {
      return this.d.a(paramInt);
    }
    return false;
  }
  
  public final int a(Object paramObject)
  {
    if (paramObject == this.j)
    {
      if (this.f != -1) {}
      for (int m = 1; m == 0; m = 0) {
        return -2;
      }
    }
    Object localObject = this.i.get(paramObject);
    if (localObject == null) {
      return -2;
    }
    Integer localInteger = (Integer)this.h.get(localObject);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    return -2;
  }
  
  public bk a(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    Object localObject;
    bk localbk;
    Bundle localBundle;
    boolean bool5;
    if (this.f != -1)
    {
      bool2 = bool1;
      if (bool2) {
        paramInt = this.f;
      }
      boolean bool3 = this.e;
      localObject = null;
      if (bool3)
      {
        boolean bool4 = c(paramInt);
        localObject = null;
        if (bool4)
        {
          localbk = a(this.c, this.d, paramInt);
          localBundle = localbk.m;
          if (this.f == -1) {
            break label122;
          }
          bool5 = bool1;
          label83:
          localBundle.putBoolean("for_animation", bool5);
          if (paramInt != -1 + b()) {
            break label128;
          }
        }
      }
    }
    for (;;)
    {
      localBundle.putBoolean("never_show_slide_show", bool1);
      localObject = localbk;
      return localObject;
      bool2 = false;
      break;
      label122:
      bool5 = false;
      break label83;
      label128:
      bool1 = false;
    }
  }
  
  public abstract bk a(Context paramContext, hqs<T, Y> paramhqs, int paramInt);
  
  public hqs<T, Y> a(hqs<T, Y> paramhqs, int paramInt)
  {
    int m = -1;
    int n;
    if (Log.isLoggable("EsListPagerAdapter", 2))
    {
      if (this.d != null) {
        break label64;
      }
      n = m;
      if (paramhqs != null) {
        break label78;
      }
    }
    for (;;)
    {
      new StringBuilder(43).append("swapCursor old=").append(n).append("; new=").append(m);
      if (paramhqs != this.d) {
        break label88;
      }
      return null;
      label64:
      n = this.d.a();
      break;
      label78:
      m = paramhqs.a();
    }
    label88:
    hqs localhqs = this.d;
    if (localhqs != null) {
      localhqs.b(this.k);
    }
    this.d = paramhqs;
    if ((paramhqs != null) && (paramhqs.b())) {
      paramhqs.a(this.k);
    }
    for (this.e = true;; this.e = false)
    {
      this.g = paramInt;
      d();
      return localhqs;
    }
  }
  
  public final Object a(View paramView, int paramInt)
  {
    if (!this.e) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    if (c(paramInt))
    {
      Object localObject1 = this.d.b(paramInt);
      this.h.put(localObject1, Integer.valueOf(paramInt));
      Object localObject2 = super.a(paramView, paramInt);
      if (localObject2 != null) {
        this.i.put(localObject2, localObject1);
      }
      return localObject2;
    }
    throw new IllegalStateException("Trying to instantiate item we can't retrieve from cursor");
  }
  
  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject = super.a(paramViewGroup, paramInt);
    if (this.f != -1) {}
    for (int m = 1;; m = 0)
    {
      if (m != 0) {
        this.j = localObject;
      }
      return localObject;
    }
  }
  
  protected final String a(int paramInt1, int paramInt2)
  {
    if (c(paramInt2))
    {
      Object localObject = this.d.b(paramInt2);
      if (localObject != null)
      {
        String str1 = localObject.toString();
        String str2 = String.valueOf("android:switcher:espager:");
        return 12 + String.valueOf(str2).length() + String.valueOf(str1).length() + str2 + paramInt1 + ":" + str1;
      }
    }
    return super.a(paramInt1, paramInt2);
  }
  
  public final void a(View paramView, int paramInt, Object paramObject)
  {
    this.i.remove(paramObject);
    super.a(paramView, paramInt, paramObject);
  }
  
  public final void a(hqn paramhqn)
  {
    if (paramhqn == null)
    {
      super.a(null);
      return;
    }
    super.a(new hqp(this, paramhqn));
  }
  
  protected final boolean a(bk parambk)
  {
    return parambk != this.j;
  }
  
  public final int b()
  {
    if ((this.e) && (this.d != null))
    {
      int m = this.d.a();
      if (m > 0)
      {
        int n = this.f;
        int i1 = 0;
        if (n != -1) {
          i1 = 1;
        }
        if (i1 != 0) {
          return 1;
        }
      }
      return m;
    }
    return 0;
  }
  
  public final void d()
  {
    int m;
    if (this.g != -1)
    {
      m = this.g;
      this.h.clear();
      if ((this.e) && (this.d != null) && (this.d.b())) {
        break label53;
      }
    }
    for (;;)
    {
      super.d();
      return;
      label53:
      int n = Math.max(m - 25, 0);
      int i1 = Math.min(m + 25, this.d.a());
      while (n < i1)
      {
        this.h.put(this.d.b(n), Integer.valueOf(n));
        n++;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqo
 * JD-Core Version:    0.7.0.1
 */