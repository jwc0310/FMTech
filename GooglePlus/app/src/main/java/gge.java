import android.content.Context;
import android.content.res.TypedArray;

final class gge
{
  private final Context a;
  private final int[] b;
  private TypedArray c;
  private final int d;
  private TypedArray e;
  
  public gge(Context paramContext, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      paramInt1 = paramInt2;
    }
    this.a = paramContext;
    this.b = paramArrayOfInt;
    this.d = paramInt2;
    this.c = paramContext.obtainStyledAttributes(paramInt1, paramArrayOfInt);
    if (paramInt1 == paramInt2) {
      this.e = this.c;
    }
  }
  
  final TypedArray a(int paramInt)
  {
    if (this.c.hasValue(paramInt)) {
      return this.c;
    }
    if (this.e == null) {
      this.e = this.a.obtainStyledAttributes(this.d, this.b);
    }
    return this.e;
  }
  
  public final void a()
  {
    if (this.c != null) {
      this.c.recycle();
    }
    if ((this.e != null) && (this.e != this.c)) {
      this.e.recycle();
    }
    this.c = null;
    this.e = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gge
 * JD-Core Version:    0.7.0.1
 */