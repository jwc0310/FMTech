import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public final class lyc
  extends ViewGroup.LayoutParams
{
  public int a = 1;
  public int b = 1;
  public int c;
  public int d;
  public int e;
  public long f = -1L;
  public boolean g = true;
  public int h = 2;
  
  public lyc(int paramInt1, int paramInt2) {}
  
  public lyc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramInt1, paramInt2);
    this.b = paramInt3;
    this.a = paramInt4;
  }
  
  public lyc(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lyk.a);
    this.b = localTypedArray.getInteger(lyk.c, 1);
    this.a = localTypedArray.getInteger(lyk.b, 1);
    this.h = localTypedArray.getInteger(lyk.d, 2);
    localTypedArray.recycle();
    if (this.h == 1) {
      if (this.height != -1)
      {
        j = this.height;
        new StringBuilder(75).append("Inflation setting LayoutParams height to ").append(j).append(" - must be MATCH_PARENT");
        this.height = -1;
      }
    }
    while (this.width == -1)
    {
      int j;
      return;
    }
    int i = this.width;
    new StringBuilder(74).append("Inflation setting LayoutParams width to ").append(i).append(" - must be MATCH_PARENT");
    this.width = -1;
  }
  
  public lyc(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    if (this.h == 1) {
      if (this.height != -1)
      {
        j = this.height;
        new StringBuilder(72).append("Constructing LayoutParams with height ").append(j).append(" - must be MATCH_PARENT");
        this.height = -1;
      }
    }
    while (this.width == -1)
    {
      int j;
      return;
    }
    int i = this.width;
    new StringBuilder(71).append("Constructing LayoutParams with width ").append(i).append(" - must be MATCH_PARENT");
    this.width = -1;
  }
  
  public final String toString()
  {
    long l = this.f;
    int i = this.a;
    int j = this.b;
    int k = this.c;
    int m = this.d;
    int n = this.e;
    boolean bool = this.g;
    int i1 = this.h;
    return 171 + "ColumnGridView.LayoutParams: id=" + l + " major=" + i + " minor=" + j + " pos=" + k + " type=" + m + " col=" + n + " boxstart=" + bool + " orient=" + i1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyc
 * JD-Core Version:    0.7.0.1
 */