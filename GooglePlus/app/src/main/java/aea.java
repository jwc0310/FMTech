import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class aea
{
  public final aec a;
  public final aeb b;
  public final List<View> c;
  
  public aea(aec paramaec)
  {
    this.a = paramaec;
    this.b = new aeb();
    this.c = new ArrayList();
  }
  
  public final int a()
  {
    return this.a.a() - this.c.size();
  }
  
  final int a(int paramInt)
  {
    if (paramInt < 0)
    {
      j = -1;
      return j;
    }
    int i = this.a.a();
    int j = paramInt;
    for (;;)
    {
      if (j >= i) {
        break label67;
      }
      int k = paramInt - (j - this.b.d(j));
      if (k == 0)
      {
        while (this.b.b(j)) {
          j++;
        }
        break;
      }
      j += k;
    }
    label67:
    return -1;
  }
  
  public final void a(View paramView)
  {
    this.c.add(paramView);
    this.a.c(paramView);
  }
  
  public final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (int i = this.a.a();; i = a(paramInt))
    {
      this.b.a(i, paramBoolean);
      if (paramBoolean) {
        a(paramView);
      }
      this.a.a(paramView, i, paramLayoutParams);
      return;
    }
  }
  
  public final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (int i = this.a.a();; i = a(paramInt))
    {
      this.b.a(i, paramBoolean);
      if (paramBoolean) {
        a(paramView);
      }
      this.a.a(paramView, i);
      return;
    }
  }
  
  public final View b(int paramInt)
  {
    int i = a(paramInt);
    return this.a.b(i);
  }
  
  public final boolean b(View paramView)
  {
    if (this.c.remove(paramView))
    {
      this.a.d(paramView);
      return true;
    }
    return false;
  }
  
  final void c(int paramInt)
  {
    int i = a(paramInt);
    this.b.c(i);
    this.a.c(i);
  }
  
  public final String toString()
  {
    return this.b.toString() + ", hidden list:" + this.c.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aea
 * JD-Core Version:    0.7.0.1
 */