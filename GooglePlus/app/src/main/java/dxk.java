import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.libraries.social.stream.legacy.views.OneUpCommentViewGroup;
import java.nio.ByteBuffer;

public final class dxk
  extends eab
{
  private llw V;
  private int W;
  private lox a;
  private OneUpCommentViewGroup b;
  
  public dxk(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dxk(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dxk(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.a = new lox(paramContext, paramAttributeSet, 0);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.a.D_();
    if (this.b != null) {
      this.b.D_();
    }
    this.W = 0;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.W = paramInt2;
    this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    return paramInt2 + this.a.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.a.getHeight();
  }
  
  protected final SpannableStringBuilder a(Cursor paramCursor, long paramLong)
  {
    Object localObject1 = super.a(paramCursor, paramLong);
    byte[] arrayOfByte = paramCursor.getBlob(26);
    if (arrayOfByte != null)
    {
      llw localllw = null;
      Context localContext;
      int i;
      Object localObject2;
      if (arrayOfByte == null)
      {
        localContext = getContext();
        if (localllw == null) {
          break label346;
        }
        i = localllw.g;
        if (i <= 0) {
          break label346;
        }
        if (localObject1 != null) {
          break label280;
        }
        localObject2 = new SpannableStringBuilder();
        ((SpannableStringBuilder)localObject2).insert(0, "     ");
      }
      for (;;)
      {
        for (int j = 0; j < i; j++) {
          ((SpannableStringBuilder)localObject2).setSpan(new ImageSpan(localContext, this.H.aC, 1), j, j + 1, 17);
        }
        ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
        localllw = null;
        if (localByteBuffer == null) {
          break;
        }
        localllw = new llw();
        localllw.a = llw.d(localByteBuffer);
        localllw.b = llw.d(localByteBuffer);
        localllw.c = llw.d(localByteBuffer);
        localllw.d = llw.d(localByteBuffer);
        localllw.e = localByteBuffer.getInt();
        localllw.f = localByteBuffer.getFloat();
        localllw.g = localByteBuffer.getInt();
        localllw.h = llw.d(localByteBuffer);
        localllw.i = llw.d(localByteBuffer);
        localllw.j = llw.d(localByteBuffer);
        localllw.k = llw.d(localByteBuffer);
        localllw.l = llw.d(localByteBuffer);
        localllw.m = localByteBuffer.getLong();
        break;
        label280:
        ((SpannableStringBuilder)localObject1).insert(0, "      - ");
        localObject2 = localObject1;
      }
      for (int k = i; k < 5; k++) {
        ((SpannableStringBuilder)localObject2).setSpan(new ImageSpan(localContext, this.H.aE, 1), k, k + 1, 17);
      }
      localObject1 = localObject2;
    }
    label346:
    return localObject1;
  }
  
  protected final void a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(26);
    llw localllw;
    if (arrayOfByte != null)
    {
      localllw = null;
      if (arrayOfByte != null) {
        break label25;
      }
    }
    for (;;)
    {
      this.V = localllw;
      return;
      label25:
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localllw = null;
      if (localByteBuffer != null)
      {
        localllw = new llw();
        localllw.a = llw.d(localByteBuffer);
        localllw.b = llw.d(localByteBuffer);
        localllw.c = llw.d(localByteBuffer);
        localllw.d = llw.d(localByteBuffer);
        localllw.e = localByteBuffer.getInt();
        localllw.f = localByteBuffer.getFloat();
        localllw.g = localByteBuffer.getInt();
        localllw.h = llw.d(localByteBuffer);
        localllw.i = llw.d(localByteBuffer);
        localllw.j = llw.d(localByteBuffer);
        localllw.k = llw.d(localByteBuffer);
        localllw.l = llw.d(localByteBuffer);
        localllw.m = localByteBuffer.getLong();
      }
    }
  }
  
  public final void a(StringBuilder paramStringBuilder)
  {
    if (this.a != null)
    {
      CharSequence[] arrayOfCharSequence = new CharSequence[1];
      arrayOfCharSequence[0] = this.a.getContentDescription();
      efj.a(paramStringBuilder, arrayOfCharSequence);
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a.getParent() == this) {
      this.a.layout(this.M.left, this.W, this.M.left + this.a.getMeasuredWidth(), this.W + this.a.getMeasuredHeight());
    }
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    if (this.V != null)
    {
      removeView(this.a);
      lox locallox = this.a;
      llw localllw = this.V;
      int i = paramhfa.a(this.K);
      if (localllw != null)
      {
        locallox.e = Math.min(i / 4, locallox.a.aO);
        locallox.b = localllw;
        String str1 = locallox.b.d;
        String str2 = locallox.b.c;
        if (!TextUtils.isEmpty(str1)) {
          locallox.c = ipf.a(locallox.getContext(), str1, ipm.a);
        }
        if (!TextUtils.isEmpty(str2)) {
          locallox.d = ipf.a(locallox.getContext(), str2, ipm.a);
        }
        locallox.requestLayout();
        efj.i(locallox);
      }
      addView(this.a);
    }
  }
  
  protected final int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return super.b(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxk
 * JD-Core Version:    0.7.0.1
 */