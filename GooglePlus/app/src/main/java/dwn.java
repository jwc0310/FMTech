import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.plus.views.EventThemeView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.List;

public final class dwn
  extends dwz
  implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, View.OnClickListener, dvs, iqp, lxj
{
  private static int A;
  private static int B;
  private static String C;
  private static String D;
  public static String a;
  public static float b;
  public static Drawable c;
  public static int d;
  public static String e;
  public static String f;
  public static int g;
  private static boolean x = false;
  private static int y;
  private static int z;
  private boolean E;
  private String F;
  private dvr G;
  private int H;
  public EventThemeView h;
  public dwy i;
  public duy j;
  public AvatarView k;
  public TextView l;
  public TextView m;
  public TextView n;
  public boolean o;
  public ImageView p;
  public View q;
  public TextView r;
  public View.OnClickListener s;
  public dwb t;
  public hxj u;
  public lmj v;
  
  public dwn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!x)
    {
      x = true;
      mbb.a(paramContext, dui.class);
      Resources localResources2 = getResources();
      int i1 = localResources2.getDimensionPixelSize(efj.lB);
      y = i1;
      z = (int)(i1 * localResources2.getDimension(efj.lA));
      A = localResources2.getDimensionPixelSize(efj.lL);
      B = localResources2.getDimensionPixelSize(efj.lG);
      a = localResources2.getString(aau.gd);
      d = localResources2.getColor(efj.kq);
      e = localResources2.getString(aau.ge);
      f = localResources2.getString(aau.gf);
      g = localResources2.getColor(efj.ko);
      b = localResources2.getDimension(efj.nK);
      c = localResources2.getDrawable(efj.oJ);
      C = localResources2.getString(aau.rq);
      D = localResources2.getString(aau.rp);
    }
    Resources localResources1 = getResources();
    if (Build.VERSION.SDK_INT >= 14)
    {
      this.j = new duy(paramContext);
      addView(this.j);
    }
    this.h = new EventThemeView(paramContext);
    this.h.n = true;
    addView(this.h);
    this.i = new dwy(paramContext, paramAttributeSet, paramInt);
    addView(this.i);
    this.k = new AvatarView(paramContext);
    this.k.e = 1;
    addView(this.k);
    this.l = new TextView(paramContext);
    this.l.setTextAppearance(paramContext, efj.yL);
    addView(this.l);
    this.p = new ImageView(paramContext);
    this.p.setImageResource(efj.qk);
    this.H = efj.qk;
    addView(this.p);
    this.q = new View(paramContext);
    this.q.setContentDescription(C);
    addView(this.q);
    this.m = new TextView(paramContext);
    this.m.setTextSize(0, localResources1.getDimension(efj.nK));
    this.m.setSingleLine();
    this.m.setGravity(17);
    addView(this.m);
    this.n = new TextView(paramContext);
    this.n.setTextSize(0, localResources1.getDimension(efj.nK));
    this.n.setSingleLine();
    this.n.setGravity(17);
    addView(this.n);
    this.r = new TextView(paramContext);
    this.r.setTextAppearance(paramContext, efj.yO);
    this.r.setText(C);
    this.r.setSingleLine();
    this.r.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.r);
    this.E = false;
  }
  
  private final void b()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    CharSequence[] arrayOfCharSequence4;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.l.getText();
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.m.getText();
      efj.a(localStringBuilder, arrayOfCharSequence2);
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      arrayOfCharSequence3[0] = this.n.getText();
      efj.a(localStringBuilder, arrayOfCharSequence3);
      arrayOfCharSequence4 = new CharSequence[1];
      if (!this.E) {
        break label155;
      }
    }
    label155:
    for (String str = D;; str = C)
    {
      arrayOfCharSequence4[0] = str;
      efj.a(localStringBuilder, arrayOfCharSequence4);
      this.q.setContentDescription(mfx.b(localStringBuilder));
      return;
      localStringBuilder = new StringBuilder(256);
      break;
    }
  }
  
  public final void D_()
  {
    this.o = false;
    this.l.setText(null);
    this.F = null;
    this.h.D_();
    this.i.D_();
    this.q.setOnClickListener(null);
    this.k.setOnClickListener(null);
    this.k.setContentDescription(null);
    this.h.F = null;
    if (this.j != null)
    {
      this.j.a(null);
      this.j.a(null);
      this.j.d();
    }
    this.s = null;
  }
  
  protected final void a(Canvas paramCanvas)
  {
    if ((this.o) && (this.G != null)) {
      this.G.a(paramCanvas);
    }
  }
  
  public final void a(MediaView paramMediaView)
  {
    if ((this.j != null) && (!TextUtils.isEmpty(this.F)))
    {
      new Uri.Builder().path(this.F);
      this.j.a(this.F);
      this.j.a(this);
      this.j.a(this);
    }
  }
  
  public final void a(dvr paramdvr)
  {
    if ((paramdvr == this.G) && (this.t != null))
    {
      if (this.j != null)
      {
        this.h.clearAnimation();
        this.h.setVisibility(0);
        this.h.setAlpha(1.0F);
        invalidate();
      }
      this.t.F();
    }
  }
  
  public final void a(mip parammip)
  {
    miq[] arrayOfmiq;
    int i1;
    if ((this.j != null) && (parammip != null) && (parammip.b != null))
    {
      arrayOfmiq = parammip.b;
      i1 = arrayOfmiq.length;
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 < i1)
      {
        miq localmiq = arrayOfmiq[i2];
        if ((!"MOV".equals(Integer.valueOf(localmiq.a))) || (!"WITH_DATA".equals(Integer.valueOf(localmiq.b))) || (!localmiq.c.endsWith("mp4"))) {
          continue;
        }
        if (!TextUtils.equals(this.F, localmiq.c))
        {
          this.F = localmiq.c;
          this.j.d();
        }
      }
      EventThemeView localEventThemeView = this.h;
      localEventThemeView.a(bqo.b(parammip), null);
      localEventThemeView.b(1);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.E = paramBoolean;
    int i1;
    TextView localTextView;
    if (paramBoolean)
    {
      i1 = efj.qm;
      this.H = i1;
      localTextView = this.r;
      if (!paramBoolean) {
        break label78;
      }
    }
    label78:
    for (String str = D;; str = C)
    {
      localTextView.setText(str);
      this.p.setImageResource(this.H);
      b();
      if (this.t != null) {
        this.t.b(paramBoolean);
      }
      return;
      i1 = efj.qk;
      break;
    }
  }
  
  protected final Point f_(int paramInt)
  {
    if (this.h.getVisibility() != 8)
    {
      int i1 = Math.max(this.h.getMeasuredWidth() - A, 0);
      int i2 = Math.max(this.h.getMeasuredHeight() - A, 0);
      Context localContext = getContext();
      int i3;
      int i4;
      label80:
      String str;
      TextPaint localTextPaint;
      label149:
      NinePatchDrawable localNinePatchDrawable1;
      if ((this.v != null) && (this.v.c))
      {
        i3 = 1;
        if (this.v != null) {
          break label282;
        }
        i4 = 1;
        Resources localResources = getResources();
        int i5 = aau.oX;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(Math.max(i4, 1));
        str = localResources.getString(i5, arrayOfObject);
        dvr localdvr1 = this.G;
        this.w.remove(localdvr1);
        if (i3 == 0) {
          break label294;
        }
        localTextPaint = dui.f;
        if (i3 == 0) {
          break label302;
        }
        localNinePatchDrawable1 = dui.c;
        label159:
        if (i3 == 0) {
          break label310;
        }
      }
      label282:
      label294:
      label302:
      label310:
      for (NinePatchDrawable localNinePatchDrawable2 = dui.d;; localNinePatchDrawable2 = dui.b)
      {
        this.G = new dvr(localContext, str, localTextPaint, localNinePatchDrawable1, localNinePatchDrawable2, this, i1, i2);
        this.G.a.offsetTo(i1 - this.G.a.width(), i2 - this.G.a.height());
        dvr localdvr2 = this.G;
        this.w.remove(localdvr2);
        this.w.add(localdvr2);
        return new Point(paramInt, this.G.a.bottom);
        i3 = 0;
        break;
        i4 = this.v.b;
        break label80;
        localTextPaint = dui.e;
        break label149;
        localNinePatchDrawable1 = dui.a;
        break label159;
      }
    }
    return null;
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3;
    int i5;
    int i4;
    if (this.s != null)
    {
      i3 = 1;
      if (i2 == 0) {
        i2 = View.MeasureSpec.getSize(paramInt2);
      }
      a(this.k, y, 1073741824, y, 1073741824);
      if (this.h.getVisibility() == 8) {
        break label737;
      }
      int i12 = bqo.a(i2);
      a(this.h, i2, 1073741824, i12, 1073741824);
      a(this.h, 0, 0);
      if (this.j != null)
      {
        a(this.j, this.h.getMeasuredWidth(), 1073741824, this.h.getMeasuredHeight(), 1073741824);
        a(this.j, a(this.h, 0), a(this.h, 1));
      }
      i5 = a(this.h, 3);
      i4 = a(this.h, 2);
    }
    for (;;)
    {
      if (this.i.getVisibility() != 8)
      {
        a(this.i, i2, 1073741824, 0, 0);
        a(this.i, 0, i5);
        a(this.k, a(this.i, 0) + A, a(this.i, 3) + A);
        i5 = a(this.i, 3);
        i4 = Math.max(i4, a(this.i, 2));
      }
      View localView;
      int i10;
      for (;;)
      {
        int i6 = a(this.k, 2) + A;
        int i7 = i4 - A;
        int i8 = Math.max(0, i7 - i6);
        if (i3 != 0)
        {
          a(this.p, 0, 0, 0, 0);
          i8 = Math.max(0, i8 - (this.p.getMeasuredWidth() + B));
          a(this.p, i7 - this.p.getMeasuredWidth(), i5 + A);
        }
        a(this.l, i8, -2147483648, 0, 0);
        a(this.l, a(this.k, 2) + A, i5 + A);
        a(this.m, i8, -2147483648, 0, 0);
        a(this.m, a(this.l, 0), a(this.l, 3));
        if (this.n.getVisibility() != 8)
        {
          a(this.n, i8, -2147483648, 0, 0);
          a(this.n, a(this.m, 0), a(this.m, 3));
        }
        int i9 = Math.max(i8 - (Math.max(this.m.getMeasuredHeight(), Math.max(this.n.getMeasuredWidth(), this.l.getMeasuredWidth())) + A), 0);
        if (i3 == 0) {
          break label732;
        }
        a(this.r, i9, -2147483648, 0, 0);
        a(this.r, a(this.p, 0) - B - this.r.getMeasuredWidth(), a(this.p, 1));
        View[] arrayOfView = new View[2];
        arrayOfView[0] = this.r;
        arrayOfView[1] = this.p;
        dwz.a(dwz.a(arrayOfView), arrayOfView);
        localView = this.q;
        i10 = i4 - a(this.k, 2);
        for (int i11 = -1 + getChildCount(); i11 >= 0; i11--) {
          i1 = Math.max(i1, dwz.a(getChildAt(i11), 3));
        }
        i3 = 0;
        break;
        a(this.k, a(this.h, 0) + A, a(this.h, 3) - z);
      }
      a(localView, i10, 1073741824, i1 - i5, 1073741824);
      a(this.q, a(this.k, 2), i5);
      label732:
      b();
      return;
      label737:
      i4 = 0;
      i5 = 0;
    }
  }
  
  public final void onClick(View paramView)
  {
    if (((paramView instanceof AvatarView)) && (this.t != null)) {
      this.t.b(((AvatarView)paramView).a);
    }
    do
    {
      return;
      if ((paramView == this.i) && (this.t != null))
      {
        this.t.B();
        return;
      }
    } while (this.s == null);
    this.s.onClick(paramView);
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    if ((this.h != null) && (this.h.getVisibility() != 8))
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(2000L);
      localAlphaAnimation.setFillAfter(true);
      localAlphaAnimation.setStartOffset(500L);
      this.h.startAnimation(localAlphaAnimation);
      paramMediaPlayer.setLooping(true);
      paramMediaPlayer.start();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwn
 * JD-Core Version:    0.7.0.1
 */