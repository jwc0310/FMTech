import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class lqh
  extends loa
  implements View.OnClickListener
{
  private static int i;
  private static int j;
  private static int q;
  private static int r;
  private static int s;
  private static int t;
  private static int u;
  private static int v;
  private static int w;
  private static Bitmap x;
  private static Bitmap y;
  private int A;
  private int B;
  private Runnable C = new lqi(this);
  public int a;
  private TextView d;
  private lnw e;
  private TextView f;
  private TextView g;
  private ArrayList<TextView> h;
  private TextView k;
  private TextView l;
  private ImageView m;
  private TextView n;
  private TextView o;
  private loj p;
  private int z;
  
  public lqh(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lqh(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lqh(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.p = loj.a(paramContext);
    if (x == null)
    {
      Resources localResources = getResources();
      i = localResources.getDimensionPixelOffset(ehr.fs);
      j = localResources.getDimensionPixelOffset(ehr.fk);
      q = localResources.getDimensionPixelOffset(ehr.fl);
      r = localResources.getDimensionPixelOffset(ehr.fq);
      s = localResources.getDimensionPixelOffset(ehr.fp);
      t = localResources.getDimensionPixelSize(ehr.fr);
      u = localResources.getDimensionPixelOffset(ehr.fo);
      v = localResources.getDimensionPixelOffset(ehr.fn);
      w = localResources.getDimensionPixelOffset(ehr.fm);
      x = BitmapFactory.decodeResource(localResources, ehr.gD);
      y = BitmapFactory.decodeResource(localResources, ehr.gE);
    }
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    lwo.e(this);
    removeAllViews();
    Context localContext = getContext();
    if (this.d == null)
    {
      this.d = new TextView(localContext);
      this.d.setTextAppearance(localContext, aw.eu);
    }
    this.d.setText(this.e.b);
    this.d.setSingleLine(false);
    this.d.setMaxLines(2);
    this.d.setPadding(this.p.m, this.p.m, this.p.m, 0);
    addView(this.d);
    if (this.f == null)
    {
      this.f = new TextView(localContext);
      this.f.setTextAppearance(localContext, aw.el);
    }
    this.f.setText(this.e.c);
    this.f.setSingleLine(false);
    this.f.setMaxLines(2);
    this.f.setPadding(this.p.m, 0, 0, i);
    addView(this.f);
    int i2 = getContext().getResources().getColor(da.av);
    this.h = new ArrayList();
    int i3 = this.e.g.size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      TextView localTextView1 = new TextView(localContext);
      localTextView1.setTextAppearance(localContext, aw.eh);
      localTextView1.setSingleLine(false);
      localTextView1.setMaxLines(2);
      localTextView1.setGravity(16);
      localTextView1.setPadding(this.p.m, this.p.m, this.p.m, this.p.m);
      localTextView1.setText(((lnx)this.e.g.get(i4)).b);
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(b(((lnx)this.e.g.get(i4)).c), 0, 0, 0);
      localTextView1.setBackgroundColor(i2);
      localTextView1.setCompoundDrawablePadding(this.p.m);
      localTextView1.setOnClickListener(this);
      this.h.add(localTextView1);
      addView(localTextView1);
    }
    if (this.g == null)
    {
      this.g = new TextView(localContext);
      this.g.setTextAppearance(localContext, aw.el);
    }
    this.g.setText(this.e.d);
    this.g.setPadding(this.p.m, this.p.m, this.p.m, this.p.m);
    this.g.setOnClickListener(this);
    this.g.setTag(Integer.valueOf(2));
    addView(this.g);
    int i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i6 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    int i7 = View.MeasureSpec.makeMeasureSpec(paramInt1 - (this.p.m + this.M.left << 1), 1073741824);
    this.d.measure(i6, i5);
    int i8 = paramInt2 + this.d.getMeasuredHeight();
    this.f.measure(i6, i5);
    int i9 = i8 + this.f.getMeasuredHeight() + j;
    int i10 = this.h.size();
    int i11 = i9;
    while (i1 < i10)
    {
      TextView localTextView2 = (TextView)this.h.get(i1);
      if (TextUtils.isEmpty(localTextView2.getText())) {
        break;
      }
      localTextView2.measure(i7, i5);
      i11 = i11 + localTextView2.getMeasuredHeight() + j;
      i1++;
    }
    this.g.measure(i6, i5);
    return i11 + this.g.getMeasuredHeight();
  }
  
  private static int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return ehr.fV;
    case 1: 
      return ehr.fZ;
    case 2: 
      return ehr.fT;
    case 3: 
      return ehr.fV;
    case 4: 
      return ehr.fX;
    case 5: 
      return ehr.gb;
    case 6: 
      return ehr.ga;
    case 7: 
      return ehr.fU;
    case 8: 
      return ehr.fW;
    case 9: 
      return ehr.fY;
    }
    return ehr.gc;
  }
  
  public final void D_()
  {
    super.D_();
    this.d = null;
    this.f = null;
    this.g = null;
    this.k = null;
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.e = null;
    this.h = null;
    Runnable localRunnable = this.C;
    efj.m().removeCallbacks(localRunnable);
  }
  
  protected final int a(int paramInt)
  {
    lwo.e(this);
    removeAllViews();
    Context localContext = getContext();
    this.k = new TextView(localContext);
    this.k.setTextAppearance(localContext, aw.et);
    this.k.setGravity(1);
    this.k.setPadding(this.p.m, 0, this.p.m, q);
    addView(this.k);
    this.l = new TextView(localContext);
    this.l.setTextAppearance(localContext, aw.el);
    this.l.setWidth(t);
    this.l.setGravity(1);
    this.l.setPadding(this.p.m, r, this.p.m, s);
    addView(this.l);
    this.m = new ImageView(localContext);
    this.m.setPadding(this.p.m, u, this.p.m, v);
    addView(this.m);
    if (this.e.e == 1)
    {
      this.n = new TextView(localContext);
      this.n.setTextAppearance(localContext, aw.ep);
      this.n.setGravity(1);
      this.n.setText(localContext.getResources().getString(do.aJ));
      this.n.setOnClickListener(this);
      this.n.setPadding(this.p.m, 0, this.p.m, v);
      addView(this.n);
      this.k.setText(localContext.getResources().getString(do.aI));
      this.l.setText(localContext.getResources().getString(do.aH));
      this.m.setImageBitmap(x);
    }
    for (;;)
    {
      int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      int i2 = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
      int i3 = View.MeasureSpec.makeMeasureSpec(t, 1073741824);
      this.k.measure(i2, i1);
      int i4 = paramInt + this.k.getMeasuredHeight();
      this.l.measure(i3, i1);
      int i5 = i4 + this.l.getMeasuredHeight();
      this.m.measure(i2, i1);
      int i6 = i5 + this.m.getMeasuredHeight();
      if (this.e.e == 1)
      {
        this.n.measure(i2, i1);
        i6 += this.n.getMeasuredHeight();
      }
      return i6;
      this.k.setText(localContext.getResources().getString(do.aL));
      this.l.setText(localContext.getResources().getString(do.aK));
      this.m.setImageBitmap(y);
    }
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt2;
    this.z = paramInt1;
    if (this.e.e == 0)
    {
      this.B = a(this.a);
      this.A = a(paramInt1, paramInt2);
    }
    for (;;)
    {
      return Math.max(this.A, this.B);
      this.A = a(paramInt1, paramInt2);
      this.B = a(this.a);
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((this.e != null) && (!this.e.f) && (this.b != null)) {
      this.b.a(this.e, this.N);
    }
    return paramInt5 + getHeight();
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    super.a(paramCursor, paramhfa, paramInt);
    byte[] arrayOfByte = paramCursor.getBlob(30);
    if (arrayOfByte == null) {}
    lnw locallnw;
    for (Object localObject = null;; localObject = locallnw)
    {
      this.e = localObject;
      return;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      locallnw = new lnw();
      locallnw.a = localByteBuffer.getInt();
      locallnw.b = lnw.d(localByteBuffer);
      locallnw.c = lnw.d(localByteBuffer);
      locallnw.d = lnw.d(localByteBuffer);
      locallnw.e = localByteBuffer.getInt();
      if (localByteBuffer.get() == i1) {}
      for (;;)
      {
        locallnw.f = i1;
        int i3 = localByteBuffer.getInt();
        locallnw.g = new ArrayList(i3);
        while (i2 < i3)
        {
          locallnw.g.add(new lnx(localByteBuffer.getInt(), lnx.d(localByteBuffer), localByteBuffer.getInt(), localByteBuffer.getInt()));
          i2++;
        }
        i1 = 0;
      }
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.e.e == 0)
    {
      int i9 = (getHeight() - this.A) / 2;
      int i10 = this.d.getMeasuredHeight();
      this.d.layout(this.M.left, i9, this.M.left + this.d.getMeasuredWidth(), i9 + i10);
      int i11 = i9 + i10;
      int i12 = this.f.getMeasuredHeight();
      this.f.layout(this.M.left, i11, this.M.left + this.f.getMeasuredWidth(), i11 + i12);
      int i13 = i11 + i12;
      int i14 = this.M.left;
      int i15 = i13 + j;
      int i16 = this.h.size();
      int i17 = i15;
      for (int i18 = 0; i18 < i16; i18++)
      {
        TextView localTextView = (TextView)this.h.get(i18);
        if (TextUtils.isEmpty(localTextView.getText())) {
          break;
        }
        localTextView.layout(i14 + this.p.m, i17, this.P - (i14 + this.p.m), i17 + localTextView.getMeasuredHeight());
        i17 = i17 + localTextView.getMeasuredHeight() + j;
      }
      this.g.layout(this.M.left, i17, i14 + this.g.getMeasuredWidth(), i17 + this.g.getMeasuredHeight());
    }
    int i6;
    int i7;
    do
    {
      return;
      int i1 = this.k.getMeasuredHeight();
      this.k.layout(this.M.left, w, this.M.left + this.k.getMeasuredWidth(), i1 + w);
      int i2 = i1 + w;
      int i3 = this.l.getMeasuredHeight();
      int i4 = this.l.getMeasuredWidth();
      int i5 = this.M.left + (this.P - i4) / 2;
      this.l.layout(i5, i2, i4 + i5, i2 + i3);
      i6 = i2 + i3;
      i7 = this.m.getMeasuredHeight();
      this.m.layout(this.M.left, i6, this.M.left + this.m.getMeasuredWidth(), i6 + i7);
    } while (this.n == null);
    int i8 = i6 + i7;
    this.n.layout(this.M.left, i8, this.M.left + this.n.getMeasuredWidth(), i8 + this.n.getMeasuredHeight());
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.g)
    {
      this.e.e = 2;
      this.b.a(this.e, this.N, 2, true);
      a(this.a);
      requestLayout();
    }
    label316:
    for (;;)
    {
      return;
      if (paramView == this.n)
      {
        this.e.e = 0;
        a(this.z, this.a);
        this.b.a(this.e, this.N, 0, false);
        requestLayout();
        return;
      }
      TextView localTextView = (TextView)paramView;
      int i1 = this.h.size();
      int i2 = 0;
      if (i2 < i1) {
        if (localTextView != this.h.get(i2)) {}
      }
      for (lnx locallnx = (lnx)this.e.g.get(i2);; locallnx = null)
      {
        if (locallnx == null) {
          break label316;
        }
        Resources localResources = getContext().getResources();
        if (this.o != null)
        {
          this.o.setBackgroundColor(localResources.getColor(da.av));
          this.o.setCompoundDrawablesWithIntrinsicBounds(b(locallnx.c), 0, 0, 0);
        }
        this.o = localTextView;
        localTextView.setBackgroundColor(localResources.getColor(da.ax));
        localTextView.setCompoundDrawablesWithIntrinsicBounds(b(locallnx.d), 0, ehr.ge, 0);
        this.e.e = 1;
        this.b.a(this.e, this.N, locallnx.a, true);
        Runnable localRunnable1 = this.C;
        efj.m().removeCallbacks(localRunnable1);
        Runnable localRunnable2 = this.C;
        efj.m().postDelayed(localRunnable2, 500L);
        return;
        i2++;
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqh
 * JD-Core Version:    0.7.0.1
 */