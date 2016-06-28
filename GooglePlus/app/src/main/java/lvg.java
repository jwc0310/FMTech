import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

public abstract class lvg
  implements lvh
{
  public final Context a;
  public final boolean b;
  public int c;
  public float d;
  public int e;
  public boolean f;
  public int g;
  private int h;
  
  protected lvg(Context paramContext, int paramInt, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramBoolean;
    this.h = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.c = paramInt;
  }
  
  public final void a()
  {
    this.f = false;
    if (this.c == 2) {
      a(true);
    }
    while (this.c == 1) {
      return;
    }
    d();
    this.c = 1;
    this.d = b(true);
    a(true);
  }
  
  public void a(View paramView, int paramInt)
  {
    if (this.f) {}
    while (paramInt == 1) {
      return;
    }
    this.e = 0;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    if (this.f) {}
    boolean bool2;
    boolean bool3;
    label129:
    do
    {
      return;
      if ((paramInt1 == 0) && (paramInt3 == 0) && (paramInt2 == 0)) {}
      for (boolean bool1 = i; (bool1) && (this.b); bool1 = false)
      {
        this.e = 0;
        a();
        return;
      }
      if (((paramInt2 >= 0) || (this.e <= 0)) && ((paramInt2 <= 0) || (this.e >= 0))) {
        break;
      }
      bool2 = i;
      if (bool2) {
        this.e = 0;
      }
      this.e = (paramInt2 + this.e);
      if ((this.e > -this.h) && (this.e < this.h)) {
        break label214;
      }
      bool3 = i;
    } while (!bool3);
    boolean bool4;
    if (this.e > 0) {
      bool4 = i;
    }
    for (;;)
    {
      if (bool4) {
        switch (this.c)
        {
        case 1: 
        case 2: 
        default: 
          return;
        case 0: 
          this.c = i;
          a(i);
          this.d = b(i);
          return;
          bool2 = false;
          break;
          bool3 = false;
          break label129;
          bool4 = false;
          break;
        case 3: 
          label214:
          d();
          this.c = 2;
          a(i);
          return;
        }
      }
    }
    if ((paramInt1 == 0) && (this.g >= paramInt3)) {}
    while (i == 0) {
      switch (this.c)
      {
      default: 
        return;
      case 1: 
        d();
        this.c = 0;
        a(false);
        return;
        i = 0;
      }
    }
    this.c = 3;
    this.d = b(false);
  }
  
  public abstract void a(boolean paramBoolean);
  
  protected abstract float b(boolean paramBoolean);
  
  public final void b()
  {
    if (this.c == 0) {
      a(false);
    }
    while (this.c == 3) {
      return;
    }
    d();
    this.c = 3;
    this.d = b(false);
  }
  
  public final void c()
  {
    this.f = false;
    d();
    this.c = 2;
    a(true);
    this.d = 0.0F;
  }
  
  protected abstract void d();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvg
 * JD-Core Version:    0.7.0.1
 */