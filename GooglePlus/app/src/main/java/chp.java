import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.apps.plus.views.PhotoCropOverlay;
import com.google.android.apps.plus.views.PhotoView;

public final class chp
  extends mca
  implements View.OnClickListener, dyp, dyq, gpq, gxv, lzv
{
  private static Integer ag;
  private static int ah;
  private static int ai;
  private static int aj;
  private static int ak;
  boolean Z;
  final gpk a;
  int aa;
  public int ab;
  public int ac;
  public float ad;
  public String[] ae;
  public RectF af;
  private int al;
  private ipf am;
  private boolean an;
  private boolean ao;
  private int ap;
  private int aq;
  private Button ar;
  private Button as;
  private Button at;
  private boolean au;
  private boolean av;
  git b;
  public PhotoView c;
  public PhotoCropOverlay d;
  
  public chp()
  {
    new lzx(this.bp, this);
    this.a = new gpk(this, this.bp, this);
    this.ab = 0;
    this.ac = 0;
    this.ad = 1.0F;
    this.af = new RectF();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(efj.vR, paramViewGroup, false);
    this.c = ((PhotoView)localView1.findViewById(aaw.hw));
    PhotoView localPhotoView = this.c;
    ipf localipf = this.am;
    int i = this.al;
    switch (i)
    {
    case 2: 
    default: 
      throw new IllegalArgumentException(30 + "Unknown crop mode: " + i);
    }
    PhotoCropOverlay localPhotoCropOverlay1;
    for (dyo localdyo = new dyo(ak, ak, 800, false);; localdyo = new dyo(940, 0, 16, false))
    {
      localPhotoView.a(localipf, null, localdyo, this);
      this.c.n = this;
      this.c.d(true);
      this.d = ((PhotoCropOverlay)localView1.findViewById(aaw.ht));
      this.d.h = new dya(this);
      localPhotoCropOverlay1 = this.d;
      int j = this.al;
      switch (j)
      {
      case 2: 
      default: 
        throw new IllegalArgumentException(30 + "Unknown crop mode: " + j);
      }
    }
    PhotoCropOverlay localPhotoCropOverlay2;
    for (int k = aj;; k = ai)
    {
      localPhotoCropOverlay1.b = k;
      localPhotoCropOverlay1.a();
      localPhotoCropOverlay2 = this.d;
      int m = this.al;
      switch (m)
      {
      case 2: 
      default: 
        throw new IllegalArgumentException(30 + "Unknown crop mode: " + m);
      }
    }
    for (float f = 1.777778F;; f = 1.0F)
    {
      localPhotoCropOverlay2.a = f;
      localPhotoCropOverlay2.a();
      this.av = efj.B(this.bn);
      View localView2 = localView1.findViewById(aaw.n);
      if (this.av)
      {
        this.ar = ((Button)localView2.findViewById(aaw.mE));
        this.ar.setOnClickListener(this);
        this.as = ((Button)localView2.findViewById(aaw.mF));
        this.as.setOnClickListener(this);
        this.at = ((Button)localView2.findViewById(aaw.mR));
        this.at.setOnClickListener(this);
        v();
        localView2.setVisibility(0);
        this.c.a(false);
        if (Build.VERSION.SDK_INT >= 16) {
          this.c.setImportantForAccessibility(2);
        }
      }
      if ((this.al == 3) || (this.al == 1))
      {
        if (!this.m.containsKey("rotation")) {
          break;
        }
        this.aa = this.m.getInt("rotation");
      }
      this.Z = true;
      return localView1;
    }
    if ((this.m.containsKey("view_id")) && (this.m.containsKey("tile_id")))
    {
      k().a(1, this.m, new chq(this));
      return localView1;
    }
    this.Z = true;
    return localView1;
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    PhotoCropOverlay localPhotoCropOverlay = this.d;
    ru localru1 = localPhotoCropOverlay.d;
    boolean bool2 = ru.b.a(localru1.a, paramFloat1);
    ru localru2 = localPhotoCropOverlay.c;
    boolean bool3 = bool2 | ru.b.a(localru2.a, paramFloat2);
    boolean bool4;
    if (paramFloat2 > 0.0F)
    {
      bool4 = bool1;
      localPhotoCropOverlay.e = bool4;
      if (paramFloat1 <= 0.0F) {
        break label105;
      }
    }
    for (;;)
    {
      localPhotoCropOverlay.f = bool1;
      if (bool3) {
        nj.a.l(localPhotoCropOverlay);
      }
      return;
      bool4 = false;
      break;
      label105:
      bool1 = false;
    }
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < this.ap) || (paramInt2 < this.aq))
    {
      Resources localResources = g();
      int i = aau.fO;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.ap);
      arrayOfObject[1] = Integer.valueOf(this.aq);
      String str = localResources.getString(i, arrayOfObject);
      Toast.makeText(f(), str, 0).show();
      f().setResult(0, null);
      f().finish();
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (ag == null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramActivity.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      ag = Integer.valueOf(Math.max(localDisplayMetrics.heightPixels, localDisplayMetrics.widthPixels));
      Resources localResources = paramActivity.getResources();
      ah = localResources.getColor(efj.jH);
      ai = localResources.getDimensionPixelSize(efj.mI);
      aj = localResources.getDimensionPixelSize(efj.mH);
      ak = localResources.getDimensionPixelSize(efj.nw);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.ap = localBundle.getInt("photo_min_width", 0);
    this.aq = localBundle.getInt("photo_min_height", 0);
    this.am = ((ipf)localBundle.getParcelable("photo_ref"));
    this.al = localBundle.getInt("photo_picker_crop_mode", 0);
  }
  
  public final void a(PhotoView paramPhotoView, kaz paramkaz)
  {
    if ((paramkaz instanceof iph)) {
      if (this.am.d == null) {
        break label123;
      }
    }
    label123:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        int j = ife.b(((iph)paramkaz).p);
        iph localiph = (iph)paramkaz;
        a(j, localiph.k());
      }
      this.an = true;
      this.a.a();
      if (paramPhotoView.l)
      {
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn);
        localgxw.c = gxz.dz;
        localgxx.a(localgxw);
      }
      return;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    if (this.al != 0) {
      paramgpr.d(aau.nG);
    }
    for (;;)
    {
      if ((this.ao) && (this.an) && (this.Z)) {
        paramgpr.b(aaw.hE);
      }
      return;
      if (this.m.containsKey("title")) {
        paramgpr.a(this.m.getString("title"));
      }
    }
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.hE)
    {
      bp localbp = f();
      Intent localIntent = cff.a(this.b.c(), this.am);
      RectF localRectF1;
      if (this.al != 0)
      {
        localIntent.putExtra("photo_picker_crop_mode", this.al);
        localIntent.putExtra("photo_picker_rotation", this.aa);
        localRectF1 = new RectF();
        this.c.a(localRectF1);
        switch (this.al)
        {
        }
      }
      for (;;)
      {
        String str = this.am.b.b;
        if ((str != null) && (str.equals("115239603441691718952"))) {
          localIntent.putExtra("is_gallery_photo", true);
        }
        localbp.setResult(-1, localIntent);
        localbp.finish();
        return true;
        Drawable localDrawable1 = this.c.b;
        if ((localDrawable1 == null) || (localDrawable1.getIntrinsicWidth() <= 0) || (localDrawable1.getIntrinsicHeight() <= 0)) {
          return true;
        }
        Drawable localDrawable2 = this.c.b;
        int i = (int)(localRectF1.width() * localDrawable2.getIntrinsicWidth());
        int j = (int)(localRectF1.height() * localDrawable2.getIntrinsicHeight());
        if ((i > 1200) || (j > 1200))
        {
          float f = 1200 / Math.max(i, j);
          i = (int)(f * i);
          j = (int)(f * j);
        }
        Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        RectF localRectF2 = new RectF(localRectF1.left * localDrawable2.getIntrinsicWidth(), localRectF1.top * localDrawable2.getIntrinsicHeight(), localRectF1.right * localDrawable2.getIntrinsicWidth(), localRectF1.bottom * localDrawable2.getIntrinsicHeight());
        Matrix localMatrix = new Matrix();
        localMatrix.setRectToRect(localRectF2, new RectF(0.0F, 0.0F, i, j), Matrix.ScaleToFit.CENTER);
        localCanvas.drawColor(ah);
        localCanvas.concat(localMatrix);
        localDrawable2.draw(localCanvas);
        localIntent.putExtra("data", mfo.a(localBitmap, 90, false));
        continue;
        localIntent.putExtra("coordinates", localRectF1);
      }
    }
    return false;
  }
  
  public final void ad_() {}
  
  public final void b()
  {
    if (this.m.containsKey("coordinates"))
    {
      PhotoView localPhotoView = this.c;
      RectF localRectF = (RectF)this.m.getParcelable("coordinates");
      float f1 = Math.max(0.0F, Math.min(localRectF.left, 1.0F));
      float f2 = Math.max(0.0F, Math.min(localRectF.top, 1.0F));
      float f3 = Math.max(0.0F, Math.min(localRectF.right, 1.0F));
      localPhotoView.g.getValues(localPhotoView.r);
      float f4 = 1.0F / (f3 - f1) * localPhotoView.r[0];
      localPhotoView.g.setScale(f4, f4);
      localPhotoView.g.postTranslate(localPhotoView.r[2], localPhotoView.r[5]);
      int i = localPhotoView.b.getIntrinsicWidth();
      int j = localPhotoView.b.getIntrinsicHeight();
      float f5 = f1 * (f4 * i);
      float f6 = f2 * (f4 * j);
      localPhotoView.g.postTranslate(-f5, -f6);
      localPhotoView.invalidate();
    }
    this.ao = true;
    this.a.a();
    if ((this.av) && (!this.au) && (this.c.r[0] > 0.0F))
    {
      this.c.a(this.af);
      this.ad = this.c.r[0];
      this.ab = ((int)Math.floor(100.0F * this.af.left));
      this.ac = ((int)Math.floor(100.0F * this.af.top));
      v();
      this.au = true;
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.b = ((git)this.bo.a(git.class));
  }
  
  public final void onClick(View paramView)
  {
    int i = this.c.b.getIntrinsicWidth();
    int j = this.c.b.getIntrinsicHeight();
    this.c.a(this.af);
    int k = (int)(i * this.af.width());
    int m = (int)(j * this.af.height());
    Resources localResources = g();
    if (paramView == this.ar)
    {
      int i8 = (int)Math.floor(100.0F * ((i - k) / i));
      String[] arrayOfString3 = new String[i8 + 1];
      for (int i9 = 0; i9 < arrayOfString3.length; i9++)
      {
        int i11 = aau.ba;
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[0] = Integer.valueOf(i9);
        arrayOfString3[i9] = localResources.getString(i11, arrayOfObject6);
      }
      int i10 = aau.aX;
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = Integer.valueOf(0);
      arrayOfObject5[1] = Integer.valueOf(i8);
      giq.a(localResources.getString(i10, arrayOfObject5), this.ab, 0, i8, arrayOfString3).a(this.x, "xPosition");
    }
    do
    {
      return;
      if (paramView == this.as)
      {
        int i4 = (int)Math.floor(100.0F * ((j - m) / j));
        String[] arrayOfString2 = new String[i4 + 1];
        for (int i5 = 0; i5 < arrayOfString2.length; i5++)
        {
          int i7 = aau.ba;
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = Integer.valueOf(i5);
          arrayOfString2[i5] = localResources.getString(i7, arrayOfObject4);
        }
        int i6 = aau.aY;
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(0);
        arrayOfObject3[1] = Integer.valueOf(i4);
        giq.a(localResources.getString(i6, arrayOfObject3), this.ac, 0, i4, arrayOfString2).a(this.x, "yPosition");
        return;
      }
    } while (paramView != this.at);
    int n = 0;
    float f1 = 3.4028235E+38F;
    float f2 = this.c.o;
    float f3 = this.c.p - f2;
    this.ae = new String[101];
    float f4 = f3 / 100.0F;
    int i1 = 0;
    float f6;
    if (i1 <= 100)
    {
      float f5 = 100.0F * (f2 + f4 * i1);
      String[] arrayOfString1 = this.ae;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Float.valueOf(f5);
      arrayOfString1[i1] = String.format("%.2f", arrayOfObject2);
      f6 = Math.abs(100.0F * this.ad - f5);
      if (f6 >= f1) {
        break label578;
      }
    }
    for (int i3 = i1;; i3 = n)
    {
      i1++;
      n = i3;
      f1 = f6;
      break;
      int i2 = aau.aZ;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = this.ae[0];
      arrayOfObject1[1] = this.ae[100];
      giq.a(localResources.getString(i2, arrayOfObject1), n, 0, 100, this.ae).a(this.x, "zoomPercent");
      return;
      label578:
      f6 = f1;
    }
  }
  
  public final gya r_()
  {
    return gya.ad;
  }
  
  public final boolean s_()
  {
    f().finish();
    return true;
  }
  
  public final void v()
  {
    Resources localResources = g();
    Button localButton1 = this.ar;
    int i = aau.bc;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.ab);
    localButton1.setText(localResources.getString(i, arrayOfObject1));
    Button localButton2 = this.as;
    int j = aau.bd;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(this.ac);
    localButton2.setText(localResources.getString(j, arrayOfObject2));
    Button localButton3 = this.at;
    int k = aau.be;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Float.valueOf(100.0F * this.ad);
    localButton3.setText(localResources.getString(k, arrayOfObject3));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chp
 * JD-Core Version:    0.7.0.1
 */