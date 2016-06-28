import android.view.View;
import android.view.ViewParent;

public final class my
{
  public ViewParent a;
  public boolean b;
  private final View c;
  private int[] d;
  
  public my(View paramView)
  {
    this.c = paramView;
  }
  
  public final void a()
  {
    if (this.a != null)
    {
      ViewParent localViewParent = this.a;
      View localView = this.c;
      or.a.a(localViewParent, localView);
      this.a = null;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b)
    {
      View localView = this.c;
      nj.a.D(localView);
    }
    this.b = paramBoolean;
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    if ((this.b) && (this.a != null))
    {
      ViewParent localViewParent = this.a;
      View localView = this.c;
      return or.a.a(localViewParent, localView, paramFloat1, paramFloat2);
    }
    return false;
  }
  
  public final boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((this.b) && (this.a != null))
    {
      ViewParent localViewParent = this.a;
      View localView = this.c;
      return or.a.a(localViewParent, localView, paramFloat1, paramFloat2, paramBoolean);
    }
    return false;
  }
  
  public final boolean a(int paramInt)
  {
    if (this.a != null) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    if (this.b)
    {
      ViewParent localViewParent = this.c.getParent();
      View localView1 = this.c;
      while (localViewParent != null)
      {
        View localView2 = this.c;
        if (or.a.a(localViewParent, localView1, localView2, paramInt))
        {
          this.a = localViewParent;
          View localView3 = this.c;
          or.a.b(localViewParent, localView1, localView3, paramInt);
          return true;
        }
        if ((localViewParent instanceof View)) {
          localView1 = (View)localViewParent;
        }
        localViewParent = localViewParent.getParent();
      }
    }
    return false;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    int k;
    int i;
    if ((this.b) && (this.a != null)) {
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramInt3 != 0) || (paramInt4 != 0))
      {
        if (paramArrayOfInt == null) {
          break label143;
        }
        this.c.getLocationInWindow(paramArrayOfInt);
        k = paramArrayOfInt[0];
        i = paramArrayOfInt[1];
      }
    }
    for (int j = k;; j = 0)
    {
      ViewParent localViewParent = this.a;
      View localView = this.c;
      or.a.a(localViewParent, localView, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfInt != null)
      {
        this.c.getLocationInWindow(paramArrayOfInt);
        paramArrayOfInt[0] -= j;
        paramArrayOfInt[1] -= i;
      }
      return true;
      if (paramArrayOfInt != null)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
      }
      return false;
      label143:
      i = 0;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int k;
    int i;
    if ((this.b) && (this.a != null)) {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paramArrayOfInt2 == null) {
          break label189;
        }
        this.c.getLocationInWindow(paramArrayOfInt2);
        k = paramArrayOfInt2[0];
        i = paramArrayOfInt2[1];
      }
    }
    for (int j = k;; j = 0)
    {
      if (paramArrayOfInt1 == null) {
        if (this.d == null) {
          this.d = new int[2];
        }
      }
      for (int[] arrayOfInt = this.d;; arrayOfInt = paramArrayOfInt1)
      {
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        ViewParent localViewParent = this.a;
        View localView = this.c;
        or.a.a(localViewParent, localView, paramInt1, paramInt2, arrayOfInt);
        if (paramArrayOfInt2 != null)
        {
          this.c.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] -= j;
          paramArrayOfInt2[1] -= i;
        }
        return (arrayOfInt[0] != 0) || (arrayOfInt[1] != 0);
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
        }
        return false;
      }
      label189:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     my
 * JD-Core Version:    0.7.0.1
 */