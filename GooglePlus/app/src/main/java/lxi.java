import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;

public class lxi
  extends StaticLayout
{
  public Rect a = new Rect();
  
  public lxi(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    super(paramCharSequence, paramTextPaint, Math.max(0, paramInt), paramAlignment, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.set(paramInt1, paramInt2, paramInt1 + getWidth(), paramInt2 + getHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxi
 * JD-Core Version:    0.7.0.1
 */