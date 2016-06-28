import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ikb
  implements kbb
{
  public static Bitmap a;
  public static int b;
  public static int c;
  public static int d;
  public static PointF e;
  private static boolean h;
  private static Bitmap i;
  private static int j;
  private static int k;
  private static int l;
  private static Bitmap m;
  private static NinePatchDrawable n;
  private static NinePatchDrawable o;
  private static Rect p;
  private static Bitmap q;
  private static Bitmap r;
  private static Paint s;
  private static Paint t;
  private static TextPaint u;
  private static TextPaint v;
  private String A;
  private final lwj B;
  public ikd f;
  int g;
  private Context w;
  private List<kaz> x;
  private boolean y;
  private boolean z;
  
  public ikb(Context paramContext, List<nve> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramContext);
    this.w = paramContext;
    hdg localhdg = (hdg)mbb.a(paramContext, hdg.class);
    int i1 = paramList.size();
    int i2 = Math.min(i1, 4);
    this.x = new ArrayList(i2);
    this.y = paramBoolean1;
    this.z = paramBoolean2;
    this.B = ((lwj)mbb.a(paramContext, lwj.class));
    int i3 = 0;
    if (i3 < i2)
    {
      nve localnve = (nve)paramList.get(i3);
      if (TextUtils.isEmpty(localnve.d)) {
        this.x.add(null);
      }
      for (;;)
      {
        i3++;
        break;
        String str = efj.E(localnve.d);
        kaz localkaz = localhdg.a(this.w, str, 1, 2, this);
        this.x.add(localkaz);
      }
    }
    if (i1 > 1) {
      this.A = String.valueOf(i1);
    }
  }
  
  private static ColorMatrixColorFilter a(float paramFloat)
  {
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.setSaturation(paramFloat);
    return new ColorMatrixColorFilter(localColorMatrix);
  }
  
  public static void a(Context paramContext)
  {
    if (h) {
      return;
    }
    h = true;
    Resources localResources = paramContext.getResources();
    Paint localPaint1 = new Paint();
    s = localPaint1;
    localPaint1.setFilterBitmap(true);
    s.setColorFilter(a(0.99F));
    Paint localPaint2 = new Paint();
    t = localPaint2;
    localPaint2.setFilterBitmap(true);
    t.setAlpha(128);
    t.setColorFilter(a(0.2F));
    u = efj.B(paramContext, aau.Ad);
    TextPaint localTextPaint = new TextPaint(u);
    v = localTextPaint;
    localTextPaint.setAlpha(128);
    b = efj.i(paramContext);
    m = efj.s(paramContext, 2);
    Bitmap localBitmap = BitmapFactory.decodeResource(localResources, efj.NY);
    a = localBitmap;
    j = (localBitmap.getWidth() - b) / 2;
    i = BitmapFactory.decodeResource(localResources, efj.NZ);
    k = localResources.getDimensionPixelOffset(efj.NW);
    l = localResources.getDimensionPixelOffset(efj.NV);
    n = (NinePatchDrawable)localResources.getDrawable(efj.Oa);
    NinePatchDrawable localNinePatchDrawable = (NinePatchDrawable)localResources.getDrawable(efj.Oa);
    o = localNinePatchDrawable;
    localNinePatchDrawable.setAlpha(128);
    p = new Rect();
    n.getPadding(p);
    q = BitmapFactory.decodeResource(localResources, efj.Oc);
    r = BitmapFactory.decodeResource(localResources, efj.Ob);
    int i1 = localResources.getDimensionPixelOffset(efj.NU);
    int i2 = localResources.getDimensionPixelOffset(efj.NX);
    int i3 = a.getHeight() + k;
    int i4 = i3 - i1;
    int i5 = i4 - (q.getHeight() - i2) / 2;
    c = a.getWidth() + l;
    d = Math.max(i3, i5 + q.getHeight());
    float f1 = a.getWidth() / 2;
    float f2 = i4;
    e = new PointF(f1 / c, f2 / d);
  }
  
  public final void a()
  {
    ap_();
  }
  
  public final void a(kaz paramkaz)
  {
    if ((paramkaz.q == 1) && (this.f != null)) {
      this.f.a(this);
    }
  }
  
  public final void ap_()
  {
    if (this.x != null)
    {
      Iterator localIterator = this.x.iterator();
      while (localIterator.hasNext())
      {
        kaz localkaz = (kaz)localIterator.next();
        if (localkaz != null) {
          localkaz.b(this);
        }
      }
      this.x = null;
    }
  }
  
  public final void b() {}
  
  public final Bitmap d()
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Bitmap localBitmap1;
    Canvas localCanvas;
    Bitmap localBitmap4;
    label138:
    Bitmap localBitmap2;
    label165:
    ArrayList localArrayList;
    int i2;
    label204:
    Bitmap localBitmap3;
    if (this.g == ikc.c)
    {
      Paint localPaint2 = t;
      TextPaint localTextPaint2 = v;
      NinePatchDrawable localNinePatchDrawable2 = o;
      localObject1 = localPaint2;
      localObject2 = localTextPaint2;
      localObject3 = localNinePatchDrawable2;
      localBitmap1 = Bitmap.createBitmap(c, d, Bitmap.Config.ARGB_8888);
      localCanvas = new Canvas(localBitmap1);
      if ((!this.y) && ((this.g == ikc.b) || (this.z)))
      {
        int i11 = q.getWidth();
        int i12 = q.getHeight();
        int i13 = (a.getWidth() - i11) / 2;
        int i14 = d - i12;
        if (this.g != ikc.b) {
          break label277;
        }
        localBitmap4 = q;
        localCanvas.drawBitmap(localBitmap4, i13, i14, (Paint)localObject1);
      }
      if (!this.y) {
        break label285;
      }
      localBitmap2 = i;
      localCanvas.drawBitmap(localBitmap2, 0.0F, k, (Paint)localObject1);
      int i1 = this.x.size();
      localArrayList = new ArrayList(i1);
      i2 = 0;
      if (i2 >= i1) {
        break label353;
      }
      if ((this.x != null) && (i2 < this.x.size())) {
        break label293;
      }
      localBitmap3 = m;
    }
    for (;;)
    {
      localArrayList.add(localBitmap3);
      i2++;
      break label204;
      Paint localPaint1 = s;
      TextPaint localTextPaint1 = u;
      NinePatchDrawable localNinePatchDrawable1 = n;
      localObject1 = localPaint1;
      localObject2 = localTextPaint1;
      localObject3 = localNinePatchDrawable1;
      break;
      label277:
      localBitmap4 = r;
      break label138;
      label285:
      localBitmap2 = a;
      break label165;
      label293:
      kaz localkaz = (kaz)this.x.get(i2);
      if (localkaz != null) {}
      for (Object localObject4 = localkaz.p;; localObject4 = null)
      {
        if (!(localObject4 instanceof Bitmap)) {
          break label345;
        }
        localBitmap3 = (Bitmap)localObject4;
        break;
      }
      label345:
      localBitmap3 = m;
    }
    label353:
    int i3 = j;
    int i4 = j + k;
    localCanvas.translate(i3, i4);
    if (this.y)
    {
      a(this.w);
      localCanvas.drawBitmap(efj.a(localArrayList, b, s), 0.0F, 0.0F, (Paint)localObject1);
    }
    for (;;)
    {
      localCanvas.translate(-i3, -i4);
      if (this.A != null)
      {
        float f1 = lwj.a((TextPaint)localObject2, this.A);
        int i5 = lwj.a((TextPaint)localObject2);
        int i6 = (int)(f1 + p.left + p.right);
        int i7 = i5 + p.top + p.bottom;
        int i8 = c - i6;
        ((NinePatchDrawable)localObject3).setBounds(i8, 0, i6 + i8, i7 + 0);
        ((NinePatchDrawable)localObject3).draw(localCanvas);
        int i9 = i8 + p.left;
        int i10 = (int)(0.0F + ((i7 - i5) / 2 - ((TextPaint)localObject2).ascent()));
        localCanvas.drawText(this.A, i9, i10, (Paint)localObject2);
      }
      return localBitmap1;
      a(this.w);
      efj.a(localCanvas, localArrayList, b, (Paint)localObject1, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ikb
 * JD-Core Version:    0.7.0.1
 */