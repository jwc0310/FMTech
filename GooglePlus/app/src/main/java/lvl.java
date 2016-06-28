import android.content.Context;
import android.content.res.Resources;
import android.view.View;

public final class lvl
  extends lvg
{
  lvm h;
  private final tp i;
  private final int j;
  private lvh k;
  private boolean l;
  
  public lvl(tp paramtp, lvh paramlvh) {}
  
  public final void a(View paramView, int paramInt)
  {
    super.a(paramView, paramInt);
    if (this.k != null) {
      this.k.a(paramView, paramInt);
    }
    this.l = false;
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int m;
    int n;
    label44:
    int i1;
    label77:
    int i2;
    label84:
    int i3;
    label100:
    int i4;
    label116:
    int i5;
    label132:
    lvh locallvh;
    if (this.i.f())
    {
      m = 2;
      this.c = m;
      if (((paramInt2 >= 0) || (this.e <= 0)) && ((paramInt2 <= 0) || (this.e >= 0))) {
        break label174;
      }
      n = 1;
      if (n != 0) {
        this.l = false;
      }
      super.a(paramView, paramInt1, paramInt2, paramInt3);
      if (this.k != null)
      {
        if (paramInt2 >= 0) {
          break label180;
        }
        i1 = 1;
        if (paramInt2 <= 0) {
          break label186;
        }
        i2 = 1;
        if ((paramInt1 != 0) || (paramInt2 != 0) || (paramInt3 != 0)) {
          break label192;
        }
        i3 = 1;
        if ((paramInt1 != 0) || (this.g < paramInt3)) {
          break label198;
        }
        i4 = 1;
        if (i1 == 0) {
          break label204;
        }
        i5 = 0;
        if (i4 == 0) {
          i5 = 1;
        }
        if (i5 != 0)
        {
          locallvh = this.k;
          if (!this.l) {
            break label256;
          }
        }
      }
    }
    for (;;)
    {
      locallvh.a(paramView, paramInt1, paramInt2, paramInt3);
      this.l = true;
      return;
      m = 0;
      break;
      label174:
      n = 0;
      break label44;
      label180:
      i1 = 0;
      break label77;
      label186:
      i2 = 0;
      break label84;
      label192:
      i3 = 0;
      break label100;
      label198:
      i4 = 0;
      break label116;
      label204:
      if (i2 == 0)
      {
        i5 = 0;
        if (i3 == 0) {
          break label132;
        }
      }
      if (this.e > this.j) {}
      for (int i6 = 1;; i6 = 0)
      {
        if (i4 == 0)
        {
          i5 = 0;
          if (i6 == 0) {
            break;
          }
        }
        i5 = 1;
        break;
      }
      label256:
      paramInt2 = this.e;
    }
  }
  
  protected final void a(boolean paramBoolean)
  {
    this.d = b(paramBoolean);
  }
  
  protected final float b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      boolean bool2 = this.i.f();
      int n = 0;
      if (bool2) {}
      while (n != 0)
      {
        return 0.0F;
        this.i.d();
        this.c = 2;
        if (this.h != null) {
          this.h.a(true);
        }
        n = 1;
      }
    }
    boolean bool1 = this.i.f();
    int m = 0;
    if (!bool1) {}
    while (m != 0)
    {
      return -this.i.c();
      if (this.h != null) {
        this.h.a(false);
      }
      this.i.e();
      this.c = 0;
      m = 1;
    }
    return this.d;
  }
  
  protected final void d() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvl
 * JD-Core Version:    0.7.0.1
 */