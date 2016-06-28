import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.nio.ByteBuffer;

public final class lpa
  extends loa
{
  private lns a;
  private StaticLayout d;
  private int e;
  
  public lpa(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lpa(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lpa(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    setClickable(false);
  }
  
  public final void D_()
  {
    super.D_();
    lwo.e(this);
    removeAllViews();
    this.a = null;
    this.d = null;
    this.e = 0;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    Context localContext = getContext();
    String str = localContext.getString(do.aB);
    this.d = new StaticLayout(str, efj.B(localContext, aw.er), paramInt4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    int j = paramInt2 + (this.H.aP + this.d.getHeight() + this.H.aP);
    this.e = j;
    int k = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getChildCount();
    while (i < n)
    {
      View localView = getChildAt(i);
      localView.measure(k, m);
      j += localView.getMeasuredHeight();
      i++;
    }
    setContentDescription(str);
    return j;
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = paramInt5 + this.H.aP;
    if (this.d != null)
    {
      paramCanvas.translate(paramInt3, i);
      this.d.draw(paramCanvas);
      paramCanvas.translate(-paramInt3, -i);
      int j = i + (this.d.getHeight() + this.H.aP);
      int k = paramInt2 - this.H.m;
      paramCanvas.drawLine(this.H.m, j, k, j, this.H.u);
    }
    return paramInt5 + getHeight();
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    byte[] arrayOfByte = paramCursor.getBlob(30);
    lns locallns;
    int m;
    label62:
    loz localloz;
    lob locallob;
    String str;
    int n;
    if (arrayOfByte == null)
    {
      locallns = null;
      this.a = locallns;
      lwo.e(this);
      removeAllViews();
      Context localContext = getContext();
      int k = Math.min(this.a.a.length, 3);
      m = 0;
      if (m >= k) {
        break label252;
      }
      localloz = new loz(localContext);
      locallob = this.b;
      str = this.a.a[m];
      n = this.a.b[m];
      if (m == k - 1) {
        break label246;
      }
    }
    label246:
    for (boolean bool = true;; bool = false)
    {
      localloz.a = locallob;
      localloz.b = str;
      localloz.c = n;
      localloz.d = bool;
      addView(localloz);
      m++;
      break label62;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      locallns = new lns();
      int i = localByteBuffer.getInt();
      locallns.a = new String[i];
      locallns.b = new int[i];
      for (int j = 0; j < i; j++)
      {
        locallns.a[j] = lns.d(localByteBuffer);
        locallns.b[j] = localByteBuffer.getInt();
      }
      break;
    }
    label252:
    requestLayout();
    invalidate();
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int j = this.e;
    int k = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getChildCount();
    while (i < n)
    {
      View localView = getChildAt(i);
      localView.measure(k, m);
      int i1 = localView.getMeasuredHeight();
      localView.layout(this.M.left, j, this.M.left + this.P, j + i1);
      j += i1;
      i++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpa
 * JD-Core Version:    0.7.0.1
 */