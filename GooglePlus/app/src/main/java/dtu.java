import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.nio.ByteBuffer;

public final class dtu
  extends eab
{
  private final dtt a;
  private dtq b;
  
  public dtu(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dtu(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dtu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.a = new dtt(paramContext, paramAttributeSet, 0);
    this.a.setOnClickListener(this);
    addView(this.a);
  }
  
  private final void a(View paramView)
  {
    if (paramView == this.a)
    {
      ((lli)mbb.a(getContext(), lli.class)).a(this.N, this.e, this.f, this.b.e, null);
      return;
    }
    super.onClick(paramView);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.a.D_();
    addView(this.a);
    this.b = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.C = paramInt2;
    int i = View.MeasureSpec.makeMeasureSpec(paramInt3, -2147483648);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.a.measure(i, j);
    return paramInt2 + this.a.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.a.getMeasuredHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(26);
    dtq localdtq;
    if (arrayOfByte != null)
    {
      if (arrayOfByte != null) {
        break label38;
      }
      localdtq = null;
    }
    for (;;)
    {
      this.b = localdtq;
      this.a.a(this.b);
      return;
      label38:
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localdtq = new dtq();
      localdtq.a = dtq.d(localByteBuffer);
      localdtq.b = dtq.d(localByteBuffer);
      localdtq.c = dtq.d(localByteBuffer);
      localdtq.d = dtq.d(localByteBuffer);
      localdtq.e = dtq.d(localByteBuffer);
      localdtq.f = localByteBuffer.getInt();
    }
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == efj.BH)
    {
      a(this.a);
      return true;
    }
    return super.a(paramInt);
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    if (this.b != null)
    {
      String str1 = this.b.a;
      if (!TextUtils.isEmpty(str1))
      {
        Resources localResources = getResources();
        int i = aau.xn;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = jr.a().a(str1);
        String str2 = localResources.getString(i, arrayOfObject);
        localla.put(Integer.valueOf(efj.BH), str2);
      }
    }
    return localla;
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (this.R == 0))
    {
      ((gil)mbb.a(getContext(), gil.class)).b(this);
      return;
    }
    a(paramView);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.layout(this.B, this.C, this.B + this.a.getMeasuredWidth(), this.C + this.a.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtu
 * JD-Core Version:    0.7.0.1
 */