import android.graphics.Rect;

public final class dvt
  implements lwu
{
  public Rect a;
  private dvu b;
  private boolean c;
  private CharSequence d;
  
  public dvt(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dvu paramdvu, CharSequence paramCharSequence)
  {
    this(new Rect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4), paramdvu, null);
  }
  
  public dvt(Rect paramRect, dvu paramdvu, CharSequence paramCharSequence)
  {
    this.a = paramRect;
    this.b = paramdvu;
    this.d = paramCharSequence;
  }
  
  public final Rect a()
  {
    return this.a;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == 3)
    {
      this.c = false;
      return true;
    }
    if (!this.a.contains(paramInt1, paramInt2))
    {
      if (paramInt3 == 1) {
        this.c = false;
      }
      return false;
    }
    switch (paramInt3)
    {
    default: 
      return true;
    case 0: 
      this.c = true;
      return true;
    }
    if ((this.c) && (this.b != null)) {
      this.b.a(this);
    }
    this.c = false;
    return true;
  }
  
  public final CharSequence ay_()
  {
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvt
 * JD-Core Version:    0.7.0.1
 */