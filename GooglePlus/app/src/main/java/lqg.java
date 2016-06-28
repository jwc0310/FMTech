import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.TimeZone;

public final class lqg
  extends loa
  implements View.OnClickListener, lor
{
  private lol a;
  private hxg d;
  private loc e;
  private TextView f;
  private int g;
  
  public lqg(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lqg(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lqg(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.e = new loc(paramContext, paramAttributeSet, 0);
    this.f = new TextView(paramContext);
    this.f.setTextAppearance(paramContext, aw.eg);
    this.f.setText(do.aF);
    this.f.setOnClickListener(this);
    this.f.setBackgroundDrawable(paramContext.getResources().getDrawable(da.aY));
    this.f.setPadding(this.H.m, this.H.m, this.H.m, this.H.m);
    setClickable(false);
    this.a = new lol(this);
  }
  
  public final void D_()
  {
    super.D_();
    lwo.e(this);
    removeAllViews();
    this.d = null;
    this.g = 0;
    this.a.D_();
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.e.measure(j, k);
    int m = paramInt2 + this.e.getMeasuredHeight();
    while (i < this.g)
    {
      View localView = getChildAt(i + 1);
      localView.measure(j, k);
      m += localView.getMeasuredHeight();
      i++;
    }
    if (this.f != null)
    {
      this.f.measure(j, k);
      m += this.f.getMeasuredHeight();
    }
    return m;
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return paramInt5 + getHeight();
  }
  
  public final View a(int paramInt, boolean paramBoolean)
  {
    lqf locallqf = new lqf(getContext());
    lob locallob = this.b;
    hxh localhxh = (hxh)this.d.a.get(paramInt);
    String str1 = this.N;
    Context localContext = locallqf.getContext();
    locallqf.a = locallob;
    locallqf.b = localhxh;
    String str2;
    switch (locallqf.b.i)
    {
    case 3: 
    default: 
      str2 = null;
    }
    for (;;)
    {
      locallqf.f = str2;
      Long localLong = locallqf.b.c;
      if (localLong != null) {
        locallqf.g = efj.a(localContext, localLong.longValue(), locallqf.b.d, false, TimeZone.getDefault(), false);
      }
      String str3 = locallqf.b.f;
      if (str3 != null) {
        locallqf.h = localContext.getString(do.aY, new Object[] { str3 });
      }
      locallqf.c = str1;
      locallqf.e = lqf.a(localContext);
      efj.i(locallqf);
      locallqf.d.a(localhxh.g, localhxh.h);
      locallqf.addView(locallqf.d);
      return locallqf;
      str2 = localContext.getResources().getString(do.aU);
      continue;
      str2 = localContext.getResources().getString(do.aV);
      continue;
      str2 = localContext.getResources().getString(do.aW);
      continue;
      str2 = localContext.getResources().getString(do.aX);
    }
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    byte[] arrayOfByte = paramCursor.getBlob(30);
    if (arrayOfByte == null) {}
    hxg localhxg;
    for (Object localObject = null;; localObject = localhxg)
    {
      this.d = localObject;
      this.g = Math.min(2, this.d.a.size());
      this.a.a(this.d.a, this.g);
      return;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localhxg = new hxg();
      int i = localByteBuffer.getInt();
      localhxg.a = new ArrayList(i);
      int j = 0;
      if (j < i)
      {
        ArrayList localArrayList = localhxg.a;
        String str1 = hxh.d(localByteBuffer);
        String str2 = hxh.d(localByteBuffer);
        long l = localByteBuffer.getLong();
        Long localLong;
        label155:
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int k;
        String str8;
        if (l == -1L)
        {
          localLong = null;
          str3 = hxh.d(localByteBuffer);
          str4 = hxh.d(localByteBuffer);
          str5 = hxh.d(localByteBuffer);
          str6 = hxh.d(localByteBuffer);
          str7 = hxh.d(localByteBuffer);
          k = localByteBuffer.getInt();
          str8 = hxh.d(localByteBuffer);
          if (localByteBuffer.get() != 1) {
            break label267;
          }
        }
        label267:
        for (boolean bool = true;; bool = false)
        {
          localArrayList.add(new hxh(str1, str2, localLong, str3, str4, str5, str6, str7, k, str8, bool));
          j++;
          break;
          localLong = Long.valueOf(l);
          break label155;
        }
      }
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int j = this.M.top;
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
  
  public final void f()
  {
    this.e.a(this.H.am, getContext().getString(do.aG), this.H.an);
    addView(this.e);
  }
  
  public final void g()
  {
    addView(this.f);
  }
  
  public final int h()
  {
    return this.g;
  }
  
  public final int i()
  {
    return lqf.a(getContext());
  }
  
  public final lol j()
  {
    return this.a;
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView == this.f) && (this.b != null)) {
      this.b.al();
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.a.b(paramMotionEvent);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.a.a(paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqg
 * JD-Core Version:    0.7.0.1
 */