import android.view.View;

final class ai
  extends to
{
  private int a;
  
  ai(ah paramah) {}
  
  public final int a(View paramView, int paramInt)
  {
    int i;
    int j;
    int k;
    if (nj.a.t(paramView) == 1)
    {
      i = 1;
      if (this.b.c != 0) {
        break label81;
      }
      if (i == 0) {
        break label61;
      }
      j = this.a - paramView.getWidth();
      k = this.a;
    }
    for (;;)
    {
      return Math.min(Math.max(j, paramInt), k);
      i = 0;
      break;
      label61:
      j = this.a;
      k = this.a + paramView.getWidth();
      continue;
      label81:
      if (this.b.c == 1)
      {
        if (i != 0)
        {
          j = this.a;
          k = this.a + paramView.getWidth();
        }
        else
        {
          j = this.a - paramView.getWidth();
          k = this.a;
        }
      }
      else
      {
        j = this.a - paramView.getWidth();
        k = this.a + paramView.getWidth();
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.b.b != null) {
      this.b.b.a(paramInt);
    }
  }
  
  public final void a(View paramView, float paramFloat)
  {
    int i = 1;
    int k = paramView.getWidth();
    int i1;
    label42:
    int i3;
    if (paramFloat != 0.0F) {
      if (nj.a.t(paramView) == i)
      {
        int i4 = i;
        if (this.b.c != 2) {
          break label117;
        }
        i1 = i;
        if (i1 == 0) {
          break label289;
        }
        if (paramView.getLeft() >= this.a) {
          break label277;
        }
        i3 = this.a - k;
        label67:
        if (!this.b.a.a(i3, paramView.getTop())) {
          break label300;
        }
        localaj = new aj(this.b, paramView, i);
        nj.a.a(paramView, localaj);
      }
    }
    label117:
    int j;
    label277:
    label289:
    label300:
    while ((j == 0) || (this.b.b == null))
    {
      aj localaj;
      return;
      int i5 = 0;
      break;
      if (this.b.c == 0)
      {
        if (i5 != 0)
        {
          if (paramFloat < 0.0F)
          {
            i1 = i;
            break label42;
          }
          i2 = 0;
          break label42;
        }
        if (paramFloat > 0.0F)
        {
          i2 = i;
          break label42;
        }
        i2 = 0;
        break label42;
      }
      if (this.b.c == i)
      {
        if (i5 != 0)
        {
          if (paramFloat > 0.0F)
          {
            i2 = i;
            break label42;
          }
          i2 = 0;
          break label42;
        }
        if (paramFloat < 0.0F)
        {
          i2 = i;
          break label42;
        }
        i2 = 0;
        break label42;
        int m = paramView.getLeft() - this.a;
        int n = Math.round(paramView.getWidth() * this.b.d);
        if (Math.abs(m) >= n)
        {
          i2 = i;
          break label42;
        }
        i2 = 0;
        break label42;
      }
      int i2 = 0;
      break label42;
      i3 = k + this.a;
      break label67;
      i3 = this.a;
      j = 0;
      break label67;
    }
    this.b.b.a();
  }
  
  public final boolean a(View paramView)
  {
    this.a = paramView.getLeft();
    return true;
  }
  
  public final int b(View paramView)
  {
    return paramView.getWidth();
  }
  
  public final void b(View paramView, int paramInt)
  {
    float f1 = this.a + paramView.getWidth() * this.b.e;
    float f2 = this.a + paramView.getWidth() * this.b.f;
    if (paramInt <= f1)
    {
      nj.a.c(paramView, 1.0F);
      return;
    }
    if (paramInt >= f2)
    {
      nj.a.c(paramView, 0.0F);
      return;
    }
    float f3 = Math.min(Math.max(0.0F, 1.0F - (paramInt - f1) / (f2 - f1)), 1.0F);
    nj.a.c(paramView, f3);
  }
  
  public final int c(View paramView)
  {
    return paramView.getTop();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ai
 * JD-Core Version:    0.7.0.1
 */