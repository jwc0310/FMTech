import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class hno
  extends loa
  implements View.OnClickListener
{
  private int a;
  private final ImageView d;
  private final TextView e;
  private final TextView f;
  private final TextView g;
  private final Button h;
  private final Button i;
  private final SparseArray<String> j;
  private final int k;
  private final int l;
  private final int m;
  private final int n;
  private final int o;
  private final int p;
  private final int q;
  private final int r;
  
  public hno(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getResources();
    Context localContext = getContext();
    this.k = localResources.getDimensionPixelSize(efj.IR);
    this.l = localResources.getDimensionPixelSize(efj.IP);
    this.m = localResources.getDimensionPixelSize(efj.IQ);
    this.n = localResources.getDimensionPixelSize(efj.IO);
    this.o = localResources.getDimensionPixelSize(efj.IN);
    this.p = localResources.getDimensionPixelSize(efj.IM);
    this.q = localResources.getDimensionPixelSize(efj.IL);
    this.r = localResources.getDimensionPixelSize(efj.IK);
    this.d = new ImageView(localContext);
    this.d.setImageResource(efj.IT);
    this.e = new TextView(localContext);
    this.e.setTextAppearance(localContext, ehr.bb);
    this.e.setId(efj.IZ);
    this.f = new TextView(localContext);
    this.f.setTextAppearance(localContext, ehr.be);
    this.f.setId(efj.IY);
    this.g = new TextView(localContext);
    this.g.setTextAppearance(localContext, ehr.ba);
    this.g.setId(efj.IW);
    this.h = lur.a(localContext, null, 0, 9, this.H.aQ, this.H.aQ);
    efj.a(this.h, new gxq(pju.l));
    this.h.setId(efj.IV);
    this.i = lur.a(localContext, null, 0, 11, this.H.aQ, this.H.aQ);
    efj.a(this.i, new gxq(pju.m));
    this.i.setId(efj.IX);
    this.j = new SparseArray();
  }
  
  public final void D_()
  {
    super.D_();
    setContentDescription(null);
    lwo.e(this);
    this.j.clear();
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    addView(this.d);
    this.d.measure(i1, i1);
    int i2 = this.l + this.d.getMeasuredWidth() + this.m;
    int i3 = View.MeasureSpec.makeMeasureSpec(paramInt1 - this.H.m - i2, 1073741824);
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.e.measure(i3, i4);
    this.a = (this.d.getMeasuredHeight() / 2 - this.e.getMeasuredHeight() / 2);
    int i5 = this.k;
    if (this.a > 0) {
      i5 += this.a;
    }
    int i6 = i5 + 0 + this.e.getMeasuredHeight();
    if (this.f.getVisibility() != 8)
    {
      int i11 = i6 + this.H.m;
      this.f.measure(i3, i4);
      i6 = i11 + this.f.getMeasuredHeight();
    }
    int i7 = i6 + this.n;
    this.g.measure(i3, i4);
    int i8 = i7 + this.g.getMeasuredHeight() + this.o;
    int i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.h.measure(i9, i9);
    if (this.i.getVisibility() != 8) {
      this.i.measure(i9, i9);
    }
    for (int i10 = i8 + Math.max(this.h.getMeasuredHeight(), this.i.getMeasuredHeight());; i10 = i8 + this.h.getMeasuredHeight()) {
      return i10 + this.p;
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return paramInt5 + getHeight();
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    rdi localrdi;
    SparseArray localSparseArray;
    try
    {
      localrdi = new rdi();
      byte[] arrayOfByte = paramCursor.getBlob(30);
      qat.b(localrdi, arrayOfByte, 0, arrayOfByte.length);
      localSparseArray = this.j;
      if ((localrdi.b == null) || (localrdi.b.length == 0)) {
        throw new IllegalStateException("Create spaces promo data contains no labels.");
      }
    }
    catch (qas localqas)
    {
      throw new IllegalStateException("Invalid promo data message", localqas);
    }
    for (rdj localrdj : localrdi.b) {
      localSparseArray.put(localrdj.a, localrdj.b);
    }
    if ((localSparseArray.get(1) == null) || (localSparseArray.get(3) == null) || (localSparseArray.get(4) == null)) {
      throw new IllegalStateException("Create spaces promo is missing one or more of the required labels.");
    }
    this.e.setText((CharSequence)this.j.get(1));
    addView(this.e);
    this.g.setText((CharSequence)this.j.get(3));
    addView(this.g);
    mfz localmfz;
    if (this.j.get(2) != null)
    {
      this.f.setText((CharSequence)this.j.get(2));
      addView(this.f);
      if (efj.B(getContext()))
      {
        localmfz = (mfz)mfx.a.get();
        localmfz.b = (1 + localmfz.b);
        if (localmfz.b != 1) {
          break label512;
        }
      }
    }
    label512:
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.e.getText();
      efj.a(localStringBuilder, arrayOfCharSequence1);
      if (this.f.getVisibility() != 8)
      {
        CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
        arrayOfCharSequence3[0] = this.f.getText();
        efj.a(localStringBuilder, arrayOfCharSequence3);
      }
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.g.getText();
      efj.a(localStringBuilder, arrayOfCharSequence2);
      setContentDescription(mfx.b(localStringBuilder));
      this.h.setText((CharSequence)this.j.get(4));
      this.h.setOnClickListener(new gxn(this));
      addView(this.h);
      if (this.j.get(5) == null) {
        break label527;
      }
      this.i.setText((CharSequence)this.j.get(5));
      this.i.setOnClickListener(new gxn(this));
      addView(this.i);
      return;
      this.f.setVisibility(8);
      break;
    }
    label527:
    this.i.setVisibility(8);
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.k;
    int i2 = this.l + this.d.getMeasuredWidth();
    int i3 = i1 + this.d.getMeasuredHeight();
    this.d.layout(this.l, i1, i2, i3);
    int i4 = i2 + this.m;
    if (this.a > 0) {
      i1 += this.a;
    }
    int i5 = i1 + this.e.getMeasuredHeight();
    this.e.layout(i4, i1, this.P - this.H.m, i5);
    int i6;
    if (this.f.getVisibility() != 8)
    {
      int i15 = i5 + this.H.m;
      i6 = i15 + this.f.getMeasuredHeight();
      this.f.layout(i4, i15, this.P - this.H.m, i6);
    }
    for (;;)
    {
      int i7 = i6 + this.n;
      int i8 = i7 + this.g.getMeasuredHeight();
      this.g.layout(i4, i7, this.P - this.H.m, i8);
      int i9 = i8 + this.o;
      int i10 = this.q + this.h.getMeasuredWidth();
      int i11 = i9 + this.h.getMeasuredHeight();
      this.h.layout(this.q, i9, i10, i11);
      if (this.i.getVisibility() != 8)
      {
        int i12 = i10 + this.r;
        int i13 = i12 + this.i.getMeasuredWidth();
        int i14 = i9 + this.i.getMeasuredHeight();
        this.i.layout(i12, i9, i13, i14);
      }
      return;
      i6 = i5;
    }
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.h) {
      this.b.ai();
    }
    while (paramView != this.i) {
      return;
    }
    this.b.aj();
  }
  
  public final gxq v()
  {
    return new gxq(pju.k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hno
 * JD-Core Version:    0.7.0.1
 */