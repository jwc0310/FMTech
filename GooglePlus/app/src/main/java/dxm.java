import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class dxm
  extends ViewGroup
{
  private static int e;
  private static int f;
  private static int g;
  public TextView a;
  public ImageView b;
  public AvatarView[] c;
  public int d;
  private boolean h;
  private final lwj i;
  
  public dxm(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dxm(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dxm(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.a = new TextView(paramContext);
    this.a.setGravity(17);
    this.a.setMaxLines(2);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    this.a.setGravity(1);
    this.a.setTextAppearance(paramContext, efj.yu);
    this.b = new ImageView(paramContext);
    this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.i = ((lwj)mbb.a(paramContext, lwj.class));
    Resources localResources = paramContext.getResources();
    setBackgroundResource(da.aY);
    if (e == 0)
    {
      e = (int)localResources.getDimension(efj.mq);
      f = (int)localResources.getDimension(efj.mo);
      g = (int)localResources.getDimension(efj.ml);
    }
  }
  
  public final void a()
  {
    removeAllViews();
    this.a.setText(null);
    this.b.setImageDrawable(null);
    if (this.c != null) {
      for (int j = 0; j < 3; j++) {
        this.c[j].a();
      }
    }
    this.d = 0;
  }
  
  public final void a(gnb paramgnb, Drawable paramDrawable)
  {
    a();
    if (paramDrawable == null)
    {
      int j = paramgnb.b.length;
      if (j > 0)
      {
        this.d = Math.min(j, 3);
        if (this.d == 1) {}
        int m;
        for (int k = 2;; k = 0)
        {
          AvatarView[] arrayOfAvatarView = this.c;
          m = 0;
          if (arrayOfAvatarView != null) {
            break;
          }
          this.c = new AvatarView[3];
          for (int n = 0;; n++)
          {
            m = 0;
            if (n >= 3) {
              break;
            }
            this.c[n] = new AvatarView(getContext());
            this.c[n].e = 1;
          }
        }
        while (m < this.d)
        {
          jjd localjjd = paramgnb.b[m];
          this.c[m].a(k);
          this.c[m].a(localjjd.a, hdo.b(localjjd.d));
          addView(this.c[m]);
          m++;
        }
      }
    }
    else
    {
      this.b.setImageDrawable(paramDrawable);
      addView(this.b);
    }
    this.a.setText(paramgnb.a(getContext()));
    addView(this.a);
  }
  
  public final void a(String paramString, Drawable paramDrawable, boolean paramBoolean)
  {
    a();
    this.h = paramBoolean;
    if (paramDrawable != null)
    {
      this.b.setImageDrawable(paramDrawable);
      addView(this.b);
    }
    this.a.setText(paramString);
    addView(this.a);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = getMeasuredWidth();
    int k = getMeasuredHeight() - 2 * e;
    int m = k - 2 * lwj.a(efj.B(getContext(), efj.yu));
    if (this.c != null)
    {
      if (this.d != 1) {
        break label230;
      }
      int i10 = (j - g) / 2;
      int i11 = e + (m - g) / 2;
      this.c[0].layout(i10, i11, i10 + g, i11 + g);
    }
    for (;;)
    {
      if (this.b.getParent() == this)
      {
        int i1 = (j - this.b.getMeasuredWidth()) / 2;
        this.b.layout(i1, e, i1 + this.b.getMeasuredWidth(), e + this.b.getMeasuredHeight());
      }
      if (this.a.getParent() == this)
      {
        int n = (j - this.a.getMeasuredWidth()) / 2;
        this.a.layout(n, m + e, n + this.a.getMeasuredWidth(), m + e + this.a.getMeasuredHeight());
      }
      return;
      label230:
      if (this.d == 2)
      {
        int i6 = efj.g(getContext());
        int i7 = (j - i6) / 2;
        int i8 = e + m / 2 - i6;
        this.c[0].layout(i7, i8, i7 + i6, i8 + i6);
        int i9 = j / 2 - i6;
        this.c[1].layout(i9, i8 + i6, i9 + i6, i8 + i6 * 2);
      }
      else if (this.d == 3)
      {
        int i2 = efj.g(getContext());
        int i3 = (j - i2) / 2;
        int i4 = e + m / 2 - i2;
        this.c[0].layout(i3, i4, i3 + i2, i4 + i2);
        int i5 = j / 2 - i2;
        this.c[1].layout(i5, i4 + i2, i5 + i2, i4 + i2 * 2);
        this.c[2].layout(i5 + i2, i4 + i2, i5 + i2 * 2, i4 + i2 * 2);
      }
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    Context localContext = getContext();
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = e;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    if (this.a.getParent() == this)
    {
      this.a.measure(paramInt1, m);
      k += 2 * lwj.a(efj.B(localContext, efj.yu)) + e;
    }
    if (this.b.getParent() == this)
    {
      if (!this.h) {
        break label184;
      }
      int i1 = View.MeasureSpec.makeMeasureSpec(f, 1073741824);
      this.b.measure(i1, i1);
    }
    for (;;)
    {
      k += this.b.getMeasuredHeight() + e;
      if (this.d > 0)
      {
        if (this.d == 1)
        {
          int n = View.MeasureSpec.makeMeasureSpec(g, 1073741824);
          this.c[0].measure(n, n);
        }
        k += g + e;
      }
      setMeasuredDimension(j, k);
      return;
      label184:
      this.b.measure(m, m);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxm
 * JD-Core Version:    0.7.0.1
 */