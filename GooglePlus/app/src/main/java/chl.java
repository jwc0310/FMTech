import android.widget.FrameLayout.LayoutParams;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.apps.plus.views.StreamOneUpViewGroup;

final class chl
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  public chl(cgr paramcgr) {}
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a = paramInt5;
    this.b = paramInt6;
    this.c = paramInt7;
    this.d = paramInt8;
    this.e = paramInt1;
    this.g = paramInt3;
    this.f = paramInt2;
    this.h = paramInt4;
  }
  
  @UsedByReflection
  public final void setValues(float paramFloat)
  {
    float f1 = this.e;
    float f2 = f1 + paramFloat * (this.f - f1);
    float f3 = this.g;
    float f4 = f3 + paramFloat * (this.h - f3);
    float f5 = this.a;
    float f6 = f5 + paramFloat * (this.b - f5);
    float f7 = this.c;
    float f8 = f7 + paramFloat * (this.d - f7);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.i.aZ.getLayoutParams();
    localLayoutParams.height = ((int)f8);
    localLayoutParams.width = ((int)f6);
    localLayoutParams.leftMargin = ((int)f2);
    localLayoutParams.topMargin = ((int)f4);
    this.i.aZ.requestLayout();
    this.i.aZ.a((int)f6);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chl
 * JD-Core Version:    0.7.0.1
 */