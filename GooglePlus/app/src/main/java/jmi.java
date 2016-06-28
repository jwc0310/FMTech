import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class jmi
  extends View
  implements kbb
{
  private static int d;
  private static int e;
  private static int f;
  private static int g;
  private static SparseArray<Pair<Bitmap, Bitmap>> h;
  private static Bitmap i;
  private static hdg j;
  private static Matrix k = new Matrix();
  private static final Paint[] p;
  public boolean a;
  public boolean b;
  public int c;
  private final ArrayList<String> l = new ArrayList(3);
  private final kaz[] m = new kaz[3];
  private final jmj[] n = new jmj[3];
  private float o = 1.0F;
  
  static
  {
    Paint[] arrayOfPaint = new Paint[3];
    p = arrayOfPaint;
    for (int i1 = -1 + arrayOfPaint.length; i1 >= 0; i1--)
    {
      double d1 = Math.abs(i1 + 1 - 3.0D);
      Paint localPaint = new Paint(2);
      localPaint.setAlpha((int)(255.0D * Math.pow(0.7D, d1)));
      p[((int)d1)] = localPaint;
    }
  }
  
  public jmi(Context paramContext)
  {
    super(paramContext, null);
    if (j == null)
    {
      j = (hdg)mbb.a(getContext(), hdg.class);
      d = efj.k(getContext());
      Resources localResources = getResources();
      e = localResources.getDimensionPixelSize(efj.Sq);
      f = localResources.getDimensionPixelSize(efj.Sp);
      g = localResources.getDimensionPixelSize(efj.So);
      int i2 = efj.Sn;
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(new OvalShape());
      localShapeDrawable1.getPaint().setColor(getResources().getColor(i2));
      int i3 = d;
      int i4 = d;
      Bitmap localBitmap1 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
      Canvas localCanvas1 = new Canvas(localBitmap1);
      localShapeDrawable1.setBounds(0, 0, i3, i4);
      localShapeDrawable1.draw(localCanvas1);
      i = localBitmap1;
      SparseArray localSparseArray1 = new SparseArray(5);
      h = localSparseArray1;
      int i5 = efj.Sm;
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(new OvalShape());
      localShapeDrawable2.getPaint().setColor(getResources().getColor(i5));
      int i6 = d;
      int i7 = d;
      Bitmap localBitmap2 = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
      Canvas localCanvas2 = new Canvas(localBitmap2);
      localShapeDrawable2.setBounds(0, 0, i6, i7);
      localShapeDrawable2.draw(localCanvas2);
      int i8 = efj.Sy;
      localSparseArray1.put(9, new Pair(localBitmap2, BitmapFactory.decodeResource(getResources(), i8)));
      SparseArray localSparseArray2 = h;
      int i9 = efj.Sm;
      ShapeDrawable localShapeDrawable3 = new ShapeDrawable(new OvalShape());
      localShapeDrawable3.getPaint().setColor(getResources().getColor(i9));
      int i10 = d;
      int i11 = d;
      Bitmap localBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
      Canvas localCanvas3 = new Canvas(localBitmap3);
      localShapeDrawable3.setBounds(0, 0, i10, i11);
      localShapeDrawable3.draw(localCanvas3);
      int i12 = efj.Sx;
      localSparseArray2.put(8, new Pair(localBitmap3, BitmapFactory.decodeResource(getResources(), i12)));
      SparseArray localSparseArray3 = h;
      int i13 = efj.Si;
      ShapeDrawable localShapeDrawable4 = new ShapeDrawable(new OvalShape());
      localShapeDrawable4.getPaint().setColor(getResources().getColor(i13));
      int i14 = d;
      int i15 = d;
      Bitmap localBitmap4 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
      Canvas localCanvas4 = new Canvas(localBitmap4);
      localShapeDrawable4.setBounds(0, 0, i14, i15);
      localShapeDrawable4.draw(localCanvas4);
      int i16 = efj.Sw;
      localSparseArray3.put(5, new Pair(localBitmap4, BitmapFactory.decodeResource(getResources(), i16)));
      SparseArray localSparseArray4 = h;
      int i17 = efj.Sk;
      ShapeDrawable localShapeDrawable5 = new ShapeDrawable(new OvalShape());
      localShapeDrawable5.getPaint().setColor(getResources().getColor(i17));
      int i18 = d;
      int i19 = d;
      Bitmap localBitmap5 = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_8888);
      Canvas localCanvas5 = new Canvas(localBitmap5);
      localShapeDrawable5.setBounds(0, 0, i18, i19);
      localShapeDrawable5.draw(localCanvas5);
      int i20 = efj.Su;
      localSparseArray4.put(7, new Pair(localBitmap5, BitmapFactory.decodeResource(getResources(), i20)));
      SparseArray localSparseArray5 = h;
      int i21 = efj.Sj;
      ShapeDrawable localShapeDrawable6 = new ShapeDrawable(new OvalShape());
      localShapeDrawable6.getPaint().setColor(getResources().getColor(i21));
      int i22 = d;
      int i23 = d;
      Bitmap localBitmap6 = Bitmap.createBitmap(i22, i23, Bitmap.Config.ARGB_8888);
      Canvas localCanvas6 = new Canvas(localBitmap6);
      localShapeDrawable6.setBounds(0, 0, i22, i23);
      localShapeDrawable6.draw(localCanvas6);
      int i24 = efj.Sw;
      localSparseArray5.put(1, new Pair(localBitmap6, BitmapFactory.decodeResource(getResources(), i24)));
    }
    setWillNotDraw(false);
    setLayoutParams(new RelativeLayout.LayoutParams(e, e));
    for (int i1 = 0; i1 < 3; i1++) {
      this.n[i1] = new jmj(this);
    }
  }
  
  public static int a(Context paramContext)
  {
    return efj.k(paramContext);
  }
  
  public final void a(List<jjg> paramList)
  {
    this.l.clear();
    int i1 = Math.min(paramList.size(), 3);
    for (int i2 = 0; i2 < i1; i2++)
    {
      jjg localjjg = (jjg)paramList.get(i2);
      if (localjjg != null) {
        this.l.add(localjjg.e());
      }
    }
    this.a = false;
    this.c = -1;
    this.b = false;
    b();
  }
  
  public final void a(kaz paramkaz)
  {
    requestLayout();
  }
  
  public final void ap_()
  {
    for (int i1 = 0; i1 < this.m.length; i1++) {
      if (this.m[i1] != null)
      {
        this.m[i1].b(this);
        this.m[i1] = null;
      }
    }
  }
  
  public final void b()
  {
    int i1;
    if (getWindowToken() != null)
    {
      i1 = 1;
      if (i1 != 0) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      i1 = 0;
      break;
      label19:
      ap_();
      int i2 = this.l.size();
      for (int i3 = 0; i3 < i2; i3++) {
        this.m[i3] = j.a(getContext(), (String)this.l.get(i3), 2, 1, this);
      }
      int i4 = 0;
      int i5 = 0;
      while (i4 < this.m.length)
      {
        if (this.m[i4] != null) {
          i5++;
        }
        i4++;
      }
      int i6 = g * (i5 - 1) / 2;
      int i7 = g - i6;
      int i8 = g - i6;
      int i9 = i5 - 1;
      int i10 = i8;
      int i11 = i7;
      int i12 = i9;
      if (i12 >= 0)
      {
        if (this.m[i12] == null) {
          this.n[i12].e = false;
        }
        for (;;)
        {
          i12--;
          break;
          int i13 = Math.abs(i12 + 1 - i5);
          this.n[i12].a = i11;
          this.n[i12].b = i10;
          this.n[i12].c = this.m[i13];
          this.n[i12].d = i13;
          this.n[i12].e = true;
          i11 += g;
          i10 += g;
        }
      }
      while (i5 < this.n.length)
      {
        this.n[i5].e = false;
        i5++;
      }
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    Pair localPair;
    Bitmap localBitmap2;
    if (this.a)
    {
      localPair = (Pair)h.get(this.c);
      if (this.b)
      {
        localBitmap2 = i;
        Bitmap localBitmap3 = (Bitmap)localPair.second;
        k.reset();
        int i3 = getMeasuredWidth();
        if (i3 != d)
        {
          float f2 = i3 / d;
          k.setScale(f2, f2);
        }
        paramCanvas.drawBitmap(localBitmap2, k, null);
        int i4 = getMeasuredWidth() / 2 - localBitmap3.getWidth() / 2;
        int i5 = getMeasuredHeight() / 2 - localBitmap3.getHeight() / 2;
        k.setTranslate(i4, i5);
        paramCanvas.drawBitmap(localBitmap3, k, null);
      }
    }
    int i1;
    label164:
    jmj localjmj;
    do
    {
      return;
      localBitmap2 = (Bitmap)localPair.first;
      break;
      i1 = 0;
      if (i1 >= this.n.length) {
        break label312;
      }
      localjmj = this.n[i1];
    } while (!localjmj.e);
    kaz localkaz = localjmj.c;
    if ((localkaz != null) && (localkaz.q == 1)) {}
    for (Bitmap localBitmap1 = (Bitmap)localkaz.p;; localBitmap1 = efj.t(getContext(), 1))
    {
      k.reset();
      int i2 = localBitmap1.getWidth();
      if (f != i2)
      {
        float f1 = f / i2;
        k.postScale(f1, f1);
      }
      k.postTranslate(localjmj.a, localjmj.b);
      k.postScale(this.o, this.o);
      paramCanvas.drawBitmap(localBitmap1, k, p[localjmj.d]);
      i1++;
      break label164;
      label312:
      break;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2;
    int i3;
    label39:
    int i4;
    if (i1 == 1073741824)
    {
      i2 = View.MeasureSpec.getSize(paramInt1);
      if (View.MeasureSpec.getMode(paramInt2) != 1073741824) {
        break label107;
      }
      i3 = Math.min(i2, View.MeasureSpec.getSize(paramInt2));
      i4 = Math.min(i2, i3);
      if (i4 == d) {
        break label120;
      }
    }
    label107:
    label120:
    for (this.o = (i4 / d);; this.o = 1.0F)
    {
      setMeasuredDimension(i4, i4);
      return;
      if (i1 == -2147483648)
      {
        i2 = Math.min(d, View.MeasureSpec.getSize(paramInt1));
        break;
      }
      i2 = d;
      break;
      i3 = Math.min(i2, d);
      break label39;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmi
 * JD-Core Version:    0.7.0.1
 */