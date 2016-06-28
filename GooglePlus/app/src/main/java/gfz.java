import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

public class gfz
{
  public static final gfz a = new gfz();
  public final List<gfy> b;
  public final Rect c = new Rect();
  public float d;
  public float e;
  private int f = -1;
  
  private gfz()
  {
    this.b = Collections.emptyList();
  }
  
  protected gfz(List<gfy> paramList)
  {
    if (paramList == null) {
      throw new NullPointerException("Parameter list cannot be null");
    }
    this.b = Collections.unmodifiableList(paramList);
  }
  
  public final int a(float paramFloat)
  {
    this.e = paramFloat;
    int i = (int)(paramFloat + this.c.centerY());
    for (int j = 0;; j++) {
      if (j < this.b.size())
      {
        Rect localRect = ((gfy)this.b.get(j)).a;
        if (localRect.contains(localRect.centerX(), i)) {
          this.f = j;
        }
      }
      else
      {
        return this.f;
      }
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2, Rect paramRect)
  {
    paramRect.set(this.c);
    paramRect.offsetTo((int)(paramFloat1 - this.d), (int)(paramFloat2 - paramRect.height() / 2 - this.e));
  }
  
  protected final boolean a(int paramInt)
  {
    return (paramInt >= 0) && (paramInt == this.f);
  }
  
  public final float b(int paramInt)
  {
    return ((gfy)this.b.get(paramInt)).a.centerY() - this.c.centerY();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfz
 * JD-Core Version:    0.7.0.1
 */