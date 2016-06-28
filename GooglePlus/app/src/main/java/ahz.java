import android.view.View;
import java.util.ArrayList;

public final class ahz
{
  public ArrayList<View> a = new ArrayList();
  int b = -2147483648;
  int c = -2147483648;
  int d = 0;
  final int e;
  
  ahz(ahp paramahp, int paramInt)
  {
    this.e = paramInt;
  }
  
  private void f()
  {
    View localView = (View)this.a.get(0);
    aht localaht = (aht)localView.getLayoutParams();
    this.b = this.f.c.a(localView);
    if (localaht.b)
    {
      ahv localahv = this.f.k.d(localaht.c.c());
      if ((localahv != null) && (localahv.b == -1)) {
        this.b -= localahv.a(this.e);
      }
    }
  }
  
  private void g()
  {
    View localView = (View)this.a.get(-1 + this.a.size());
    aht localaht = (aht)localView.getLayoutParams();
    this.c = this.f.c.b(localView);
    if (localaht.b)
    {
      ahv localahv = this.f.k.d(localaht.c.c());
      if ((localahv != null) && (localahv.b == 1)) {
        this.c += localahv.a(this.e);
      }
    }
  }
  
  final int a()
  {
    if (this.b != -2147483648) {
      return this.b;
    }
    f();
    return this.b;
  }
  
  final int a(int paramInt)
  {
    if (this.b != -2147483648) {
      paramInt = this.b;
    }
    while (this.a.size() == 0) {
      return paramInt;
    }
    f();
    return this.b;
  }
  
  public final int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = -1;
    int j = this.f.c.b();
    int k = this.f.c.c();
    int m;
    if (paramInt2 > paramInt1) {
      m = 1;
    }
    for (;;)
    {
      if (paramInt1 != paramInt2)
      {
        View localView = (View)this.a.get(paramInt1);
        int n = this.f.c.a(localView);
        int i1 = this.f.c.b(localView);
        if ((n < k) && (i1 > j)) {
          i = ((agi)localView.getLayoutParams()).c.c();
        }
      }
      else
      {
        return i;
        m = i;
        continue;
      }
      paramInt1 += m;
    }
  }
  
  final void a(View paramView)
  {
    aht localaht = (aht)paramView.getLayoutParams();
    localaht.a = this;
    this.a.add(0, paramView);
    this.b = -2147483648;
    if (this.a.size() == 1) {
      this.c = -2147483648;
    }
    if ((localaht.a()) || (localaht.b())) {
      this.d += this.f.c.c(paramView);
    }
  }
  
  final int b()
  {
    if (this.c != -2147483648) {
      return this.c;
    }
    g();
    return this.c;
  }
  
  final int b(int paramInt)
  {
    if (this.c != -2147483648) {
      paramInt = this.c;
    }
    while (this.a.size() == 0) {
      return paramInt;
    }
    g();
    return this.c;
  }
  
  final void b(View paramView)
  {
    aht localaht = (aht)paramView.getLayoutParams();
    localaht.a = this;
    this.a.add(paramView);
    this.c = -2147483648;
    if (this.a.size() == 1) {
      this.b = -2147483648;
    }
    if ((localaht.a()) || (localaht.b())) {
      this.d += this.f.c.c(paramView);
    }
  }
  
  final void c()
  {
    this.a.clear();
    this.b = -2147483648;
    this.c = -2147483648;
    this.d = 0;
  }
  
  final void c(int paramInt)
  {
    if (this.b != -2147483648) {
      this.b = (paramInt + this.b);
    }
    if (this.c != -2147483648) {
      this.c = (paramInt + this.c);
    }
  }
  
  final void d()
  {
    int i = this.a.size();
    View localView = (View)this.a.remove(i - 1);
    aht localaht = (aht)localView.getLayoutParams();
    localaht.a = null;
    if ((localaht.a()) || (localaht.b())) {
      this.d -= this.f.c.c(localView);
    }
    if (i == 1) {
      this.b = -2147483648;
    }
    this.c = -2147483648;
  }
  
  final void e()
  {
    View localView = (View)this.a.remove(0);
    aht localaht = (aht)localView.getLayoutParams();
    localaht.a = null;
    if (this.a.size() == 0) {
      this.c = -2147483648;
    }
    if ((localaht.a()) || (localaht.b())) {
      this.d -= this.f.c.c(localView);
    }
    this.b = -2147483648;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahz
 * JD-Core Version:    0.7.0.1
 */