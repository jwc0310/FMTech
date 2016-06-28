import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dwy
  extends ViewGroup
  implements lxj
{
  public qdj a;
  public String b;
  public String c;
  public String d;
  private loj e;
  private MediaView f;
  private TextView g;
  private TextView h;
  private ImageView i;
  private TextView j;
  private TextView k;
  private ImageView l;
  
  public dwy(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = loj.a(paramContext);
    this.f = new MediaView(paramContext, paramAttributeSet, paramInt);
    this.f.s = 1;
    this.f.e(4);
    this.f.b(1);
    this.f.N = 0.5F;
    this.f.setBackgroundColor(-16777216);
    this.g = new TextView(paramContext, paramAttributeSet, paramInt);
    this.g.setTextColor(-1);
    this.g.setPadding(this.e.M, this.e.P, this.e.M, this.e.P);
    this.g.setText(getContext().getString(aau.de));
    this.h = new TextView(paramContext, paramAttributeSet, paramInt);
    this.h.setTextColor(-1);
    this.h.setPadding(this.e.M, this.e.P, this.e.N, this.e.P);
    this.l = new ImageView(paramContext, paramAttributeSet, paramInt);
    this.l.setImageBitmap(this.e.J);
    this.l.setScaleType(ImageView.ScaleType.FIT_START);
    this.i = new ImageView(paramContext, paramAttributeSet, paramInt);
    this.i.setImageBitmap(this.e.f);
    this.i.setScaleType(ImageView.ScaleType.CENTER);
    this.j = new TextView(paramContext, paramAttributeSet, paramInt);
    this.j.setTextAppearance(paramContext, efj.yv);
    this.j.setPadding(this.e.ax, this.e.ay, this.e.ax, this.e.ay);
    this.j.setGravity(17);
    this.j.setShadowLayer(this.e.az, this.e.aA, this.e.aB, -7829368);
    this.k = new TextView(paramContext, paramAttributeSet, paramInt);
    this.k.setTextAppearance(paramContext, efj.yy);
    this.k.setPadding(this.e.ax, this.e.ay, this.e.ax, this.e.ay);
    this.k.setGravity(17);
    this.k.setShadowLayer(this.e.az, this.e.aA, this.e.aB, -7829368);
  }
  
  private final boolean c()
  {
    if ((this.a == null) || (this.a.q == null)) {}
    for (;;)
    {
      return false;
      for (int m = 0; m < this.a.q.length; m++) {
        if (this.a.q[m].a == 1) {
          return true;
        }
      }
    }
  }
  
  private final String d()
  {
    if (this.d != null) {
      return this.d;
    }
    if ((this.a != null) && (this.a.l != null) && (this.a.l.f != null)) {
      return this.a.l.f.a;
    }
    return null;
  }
  
  private final qdc e()
  {
    if (this.a.n != null) {
      return (qdc)this.a.n.b(qdc.a);
    }
    return null;
  }
  
  public final void D_()
  {
    lwo.e(this);
    removeAllViews();
    this.d = null;
    this.a = null;
    this.f.ap_();
  }
  
  public final void a(qdj paramqdj, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.d = null;
    this.a = paramqdj;
    this.b = paramString1;
    this.c = paramString2;
    a(paramBoolean);
  }
  
  public final void a(boolean paramBoolean)
  {
    int m = 1;
    removeAllViews();
    ((git)mbb.a(getContext(), git.class)).c();
    addView(this.f);
    int n;
    StringBuilder localStringBuilder1;
    label94:
    long l1;
    label123:
    int i2;
    if ((!TextUtils.isEmpty(d())) || (bqo.a(this.a)))
    {
      n = m;
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      if (localmfz.b != m) {
        break label523;
      }
      localStringBuilder1 = localmfz.a;
      if (!bqo.d(this.a)) {
        break label597;
      }
      if (e() == null) {
        break label538;
      }
      l1 = e().b.longValue();
      i2 = (int)Math.floor((l1 - 10000L) / 300000L);
      if (i2 <= 4571423) {
        break label544;
      }
      StringBuilder localStringBuilder5 = localStringBuilder1.append("https://i1.ytimg.com/vi/");
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = this.a.m;
      arrayOfObject4[m] = Integer.valueOf(i2);
      localStringBuilder5.append(String.format("%s/wide_360p_v%s.jpg", arrayOfObject4));
      label198:
      if ((this.a != null) && (localStringBuilder1.length() == 0))
      {
        if (TextUtils.isEmpty(this.a.r)) {
          break label711;
        }
        localStringBuilder1.append(this.a.r);
      }
    }
    label272:
    label291:
    label309:
    label363:
    label879:
    for (;;)
    {
      String str2 = mfx.b(localStringBuilder1);
      boolean bool = TextUtils.isEmpty(str2);
      int i1;
      ipm localipm;
      Bitmap localBitmap;
      String str3;
      qdo localqdo;
      if ((!bool) && (str2.endsWith(".gif")))
      {
        i1 = m;
        if (!bool)
        {
          if ((!paramBoolean) || (n == 0)) {
            break label800;
          }
          localipm = ipm.b;
          if (i1 == 0) {
            break label808;
          }
          localipm = ipm.d;
          this.f.o = false;
          ipf localipf = ipf.a(getContext(), str2, localipm);
          this.f.a(localipf);
        }
        if ((!paramBoolean) || (((bool) || (i1 != 0)) && (n != 0)))
        {
          if (!paramBoolean) {
            break label819;
          }
          localBitmap = this.e.f;
          this.i.setImageBitmap(localBitmap);
          addView(this.i);
        }
        if (bqo.a(this.a)) {
          break label831;
        }
        if (m != 0) {
          addView(this.l);
        }
        if (!bqo.d(this.a)) {
          break label836;
        }
        if (c())
        {
          this.h.setBackgroundResource(efj.pa);
          this.h.setText(aau.dc);
          addView(this.h);
        }
        this.g.setText(aau.de);
        addView(this.g);
        this.g.setBackgroundResource(efj.oZ);
        if ((paramBoolean) && (this.a != null) && (!bqo.a(this.a)))
        {
          addView(this.j);
          addView(this.k);
        }
        b();
        return;
        n = 0;
        break;
        localStringBuilder1 = new StringBuilder(256);
        break label94;
        l1 = 0L;
        break label123;
        StringBuilder localStringBuilder4 = localStringBuilder1.append("https://i1.ytimg.com/vi/");
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = this.a.m;
        arrayOfObject3[m] = Integer.valueOf(i2);
        localStringBuilder4.append(String.format("%s/hddefault_v%s.jpg", arrayOfObject3));
        break label198;
        if (bqo.a(this.a))
        {
          StringBuilder localStringBuilder3 = localStringBuilder1.append("https://i1.ytimg.com/vi/");
          Object[] arrayOfObject2 = new Object[m];
          arrayOfObject2[0] = this.a.m;
          localStringBuilder3.append(String.format("%s/hqdefault.jpg", arrayOfObject2));
          break label198;
        }
        if (d() == null) {
          break label198;
        }
        String str1 = efj.z(d());
        if (str1 == null) {
          break label198;
        }
        StringBuilder localStringBuilder2 = localStringBuilder1.append("https://i1.ytimg.com/vi/");
        Object[] arrayOfObject1 = new Object[m];
        arrayOfObject1[0] = str1;
        localStringBuilder2.append(String.format("%s/hqdefault.jpg", arrayOfObject1));
        break label198;
        str3 = this.c;
        if (this.a.j == null) {
          break label874;
        }
        localqdo = (qdo)this.a.j.b(qdo.a);
        if (TextUtils.isEmpty(localqdo.b)) {
          break label874;
        }
      }
      for (String str4 = localqdo.b;; str4 = str3)
      {
        if (TextUtils.isEmpty(str4)) {
          break label879;
        }
        localStringBuilder1.append(iqw.a(efj.E(str4), 256).toString());
        break;
        i1 = 0;
        break label272;
        localipm = ipm.a;
        break label291;
        this.f.o = m;
        break label309;
        localBitmap = this.e.g;
        break label363;
        m = 0;
        break label390;
        if (!c()) {
          break label475;
        }
        this.g.setText(aau.dc);
        addView(this.g);
        this.g.setBackgroundResource(efj.pa);
        break label475;
      }
    }
  }
  
  public final void b()
  {
    Resources localResources = getResources();
    String str1 = this.b;
    if ((this.a != null) && (this.a.j != null))
    {
      qdo localqdo = (qdo)this.a.j.b(qdo.a);
      if (!TextUtils.isEmpty(localqdo.c)) {
        str1 = localqdo.c;
      }
    }
    TextView localTextView;
    int m;
    int n;
    int i1;
    String str2;
    label216:
    String str3;
    if ((this.j.getParent() == this) && (this.k.getParent() == this))
    {
      Long localLong = ((qdc)this.a.h.b(qdc.a)).b;
      long l1 = System.currentTimeMillis();
      if (localLong.longValue() <= l1) {
        break label390;
      }
      if (TextUtils.isEmpty(str1)) {
        break label268;
      }
      this.j.setText(localResources.getString(aau.iN, new Object[] { str1 }));
      long l2 = localLong.longValue() - l1;
      localTextView = this.k;
      long l3 = l2 + 60000L;
      m = (int)(l3 / 86400000L);
      n = (int)(l3 % 86400000L / 3600000L);
      i1 = (int)(l3 % 3600000L / 60000L);
      if (m != 0) {
        break label285;
      }
      str2 = "";
      if (n != 0) {
        break label320;
      }
      str3 = "";
      label226:
      if (i1 != 0) {
        break label355;
      }
    }
    label268:
    label285:
    label320:
    label355:
    int i4;
    Object[] arrayOfObject3;
    for (String str4 = "";; str4 = localResources.getQuantityString(i4, i1, arrayOfObject3))
    {
      localTextView.setText(localResources.getString(efj.LO, new Object[] { str2, str3, str4 }));
      return;
      this.j.setText(localResources.getString(aau.iO));
      break;
      int i2 = efj.LG;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(m);
      str2 = localResources.getQuantityString(i2, m, arrayOfObject1);
      break label216;
      int i3 = efj.LH;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(n);
      str3 = localResources.getQuantityString(i3, n, arrayOfObject2);
      break label226;
      i4 = efj.LI;
      arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(i1);
    }
    label390:
    if (!TextUtils.isEmpty(str1)) {
      this.j.setText(localResources.getString(aau.iL, new Object[] { str1 }));
    }
    for (;;)
    {
      this.k.setText(null);
      return;
      this.j.setText(localResources.getString(aau.iM));
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = this.f.getMeasuredWidth();
    int n = this.f.getMeasuredHeight();
    this.f.layout(0, 0, m, n);
    if (this.l.getParent() == this) {
      this.l.layout(this.e.z, this.e.A, this.l.getMeasuredWidth(), this.l.getMeasuredHeight());
    }
    if (this.g.getParent() == this)
    {
      int i16 = getMeasuredWidth() - this.g.getMeasuredWidth() - this.e.z;
      int i17 = this.e.A;
      this.g.layout(i16, i17, i16 + this.g.getMeasuredWidth(), i17 + this.g.getMeasuredHeight());
    }
    if (this.h.getParent() == this)
    {
      int i14 = this.e.O + (getMeasuredWidth() - this.g.getMeasuredWidth() - this.e.z - this.h.getMeasuredWidth());
      int i15 = this.e.A;
      this.h.layout(i14, i15, i14 + this.h.getMeasuredWidth(), i15 + this.h.getMeasuredHeight());
    }
    if (this.i.getParent() == this)
    {
      int i9 = this.i.getMeasuredWidth();
      int i10 = this.i.getMeasuredHeight();
      int i11 = m / 2 - i9 / 2;
      int i12 = n / 2 - i10 / 2;
      int i13 = i10 + i12;
      this.i.layout(i11, i12, i9 + i11, i13);
    }
    if ((this.j.getParent() == this) && (this.k.getParent() == this))
    {
      int i1 = this.j.getMeasuredHeight();
      int i2 = this.k.getMeasuredHeight();
      int i3 = this.j.getMeasuredWidth();
      int i4 = this.k.getMeasuredWidth();
      int i5 = m / 2 - i4 / 2;
      int i6 = n - i2 - this.e.l;
      this.k.layout(i5, i6, i4 + i5, i2 + i6);
      int i7 = m / 2 - i3 / 2;
      int i8 = i6 - i1;
      this.j.layout(i7, i8, i3 + i7, i1 + i8);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getSize(paramInt1);
    this.f.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec((int)Math.ceil(m / 1.77D), 1073741824));
    int n = this.f.getMeasuredHeight();
    if (this.l.getParent() == this) {
      this.l.measure(View.MeasureSpec.makeMeasureSpec(m / 4, -2147483648), View.MeasureSpec.makeMeasureSpec(n, -2147483648));
    }
    if (this.g.getParent() == this) {
      this.g.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(n, -2147483648));
    }
    if (this.h.getParent() == this) {
      this.h.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(n, -2147483648));
    }
    if (this.i.getParent() == this) {
      this.i.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
    if (this.j.getParent() == this) {
      this.j.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
    if (this.k.getParent() == this) {
      this.k.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
    setMeasuredDimension(m, n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwy
 * JD-Core Version:    0.7.0.1
 */