import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class dwe
  extends dvm
  implements View.OnClickListener
{
  private static boolean c;
  private static int d;
  private static int e;
  private static int f;
  private static int g;
  private static int h;
  private static int i;
  private static float j;
  private AvatarView a;
  private dvk b;
  private dwb k;
  private dwx l;
  
  public dwe(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    super.D_();
    this.k = null;
    this.b.a(null, null, null, false);
    this.b.d = null;
    this.a.a();
    this.a.setContentDescription(null);
  }
  
  protected final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramContext, paramAttributeSet, paramInt);
    if (!c)
    {
      Resources localResources = paramContext.getResources();
      g = localResources.getDimensionPixelSize(efj.lw);
      h = localResources.getDimensionPixelSize(efj.lx);
      i = localResources.getDimensionPixelSize(efj.lq);
      e = localResources.getDimensionPixelSize(efj.lo);
      d = localResources.getDimensionPixelSize(efj.ln);
      j = localResources.getDimension(efj.ly);
      f = localResources.getDimensionPixelSize(efj.lp);
      c = true;
    }
    a(e, d, h, i);
    this.a = new AvatarView(paramContext, paramAttributeSet, paramInt);
    this.a.e = 1;
    this.a.setOnClickListener(this);
    addView(this.a);
    this.b = new dvk(paramContext, paramAttributeSet, paramInt);
    addView(this.b);
    setOnClickListener(this);
  }
  
  public final void a(dwx paramdwx, dwb paramdwb, boolean paramBoolean)
  {
    if (paramdwx == null) {
      return;
    }
    this.l = paramdwx;
    if (!TextUtils.isEmpty(this.l.a)) {
      this.a.setContentDescription(this.l.a);
    }
    this.b.a(this.l.a, lwd.a(getContext(), this.l.d), this.l.e, paramBoolean);
    if (!TextUtils.isEmpty(this.l.b)) {
      this.a.a(this.l.b, this.l.c);
    }
    this.k = paramdwb;
    this.b.d = this.k;
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i1 = m + 0;
    int i2 = n + 0;
    this.a.measure(View.MeasureSpec.makeMeasureSpec(f, 1073741824), View.MeasureSpec.makeMeasureSpec(f, 1073741824));
    a(this.a, 0, 0);
    int i3 = 0 + Math.round(j * this.a.getMeasuredHeight());
    int i4 = 0 + this.a.getMeasuredWidth() + g;
    int i5 = i1 - i4;
    int i6 = i2 - i3;
    boolean bool2;
    int i8;
    if (View.MeasureSpec.getMode(paramInt2) == 0)
    {
      bool2 = bool1;
      dvk localdvk = this.b;
      int i7 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
      if (!bool2) {
        break label181;
      }
      i8 = 0;
      label139:
      localdvk.measure(i7, View.MeasureSpec.makeMeasureSpec(i6, i8));
      a(this.b, i4, i3);
      if (bool2) {
        break label188;
      }
    }
    for (;;)
    {
      setClickable(bool1);
      return;
      bool2 = false;
      break;
      label181:
      i8 = -2147483648;
      break label139;
      label188:
      bool1 = false;
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.k != null)
    {
      if ((paramView instanceof AvatarView)) {
        this.k.b(((AvatarView)paramView).a);
      }
    }
    else {
      return;
    }
    this.k.a(this.l);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwe
 * JD-Core Version:    0.7.0.1
 */