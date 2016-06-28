import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dwd
  extends dvm
  implements View.OnClickListener
{
  private static boolean i;
  private static int j;
  private static int k;
  private static int l;
  private static int m;
  private static int n;
  private static int o;
  public okn a;
  public AvatarView b;
  public MediaView c;
  public dvk d;
  public ipf e;
  public TextView f;
  public boolean g = false;
  public dwb h;
  
  public dwd(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    super.D_();
    this.c.D_();
    this.h = null;
    dvk localdvk = this.d;
    localdvk.b.setText(null);
    localdvk.a.setText(null);
    localdvk.c.setText(null);
  }
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramContext, paramAttributeSet, paramInt);
    if (!i)
    {
      Resources localResources2 = paramContext.getResources();
      n = localResources2.getDimensionPixelSize(efj.lw);
      o = localResources2.getDimensionPixelSize(efj.lx);
      m = localResources2.getDimensionPixelSize(efj.lv);
      l = localResources2.getDimensionPixelSize(efj.lp);
      j = localResources2.getDimensionPixelSize(efj.lo);
      k = localResources2.getDimensionPixelSize(efj.lu);
      i = true;
    }
    this.c = new MediaView(paramContext, paramAttributeSet, paramInt);
    this.c.b(1);
    this.c.s = 3;
    this.c.setOnClickListener(this);
    addView(this.c);
    this.d = new dvk(paramContext, paramAttributeSet, paramInt);
    addView(this.d);
    Resources localResources1 = paramContext.getResources();
    this.f = new TextView(paramContext, paramAttributeSet, paramInt);
    this.f.setBackgroundColor(localResources1.getColor(efj.jA));
    this.f.setTextColor(localResources1.getColor(efj.kq));
    this.f.setGravity(17);
    this.f.setText(localResources1.getString(aau.cZ));
    addView(this.f);
    this.b = new AvatarView(paramContext, paramAttributeSet, paramInt);
    this.b.setOnClickListener(this);
    this.b.e = 1;
    this.b.a(2);
    addView(this.b);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, byte[] paramArrayOfByte, dwb paramdwb)
  {
    for (;;)
    {
      try
      {
        this.a = ((okn)qat.b(new okn(), paramArrayOfByte, 0, paramArrayOfByte.length));
        ojf localojf = ((okm)this.a.b(okm.a)).b;
        ipm localipm = jqx.b(localojf);
        if ((localojf.l != null) && (localojf.l.b == 0))
        {
          bool1 = true;
          this.g = bool1;
          if (!this.g)
          {
            this.e = ipf.a(getContext(), paramString4, localipm);
            this.c.a(this.e, null, true);
          }
          MediaView localMediaView = this.c;
          if (!this.g) {
            break label276;
          }
          i1 = 8;
          localMediaView.setVisibility(i1);
          TextView localTextView = this.f;
          boolean bool2 = this.g;
          i2 = 0;
          if (!bool2) {
            break label282;
          }
          localTextView.setVisibility(i2);
          this.d.a(paramString1, lwd.a(getContext(), paramLong), null, true);
          if (!TextUtils.isEmpty(paramString2)) {
            this.b.a(paramString2, paramString3);
          }
          if (!TextUtils.isEmpty(paramString1)) {
            this.b.setContentDescription(paramString1);
          }
          this.h = paramdwb;
          if ((this.g) && (this.h != null)) {
            this.h.a(localojf.g.b, localojf.d);
          }
          return;
        }
      }
      catch (qas localqas)
      {
        Log.e("EventPhotoCardLayout", "Unable to parse Tile from byte array.", localqas);
        return;
      }
      boolean bool1 = false;
      continue;
      label276:
      int i1 = 0;
      continue;
      label282:
      int i2 = 8;
    }
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = i2 - m;
    int i4 = i3 + 0;
    if (this.g)
    {
      a(this.f, 0, 0);
      this.f.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
    for (;;)
    {
      int i5 = 0 + j;
      int i6 = i5 + l;
      int i7 = i2 + 0 - k - l;
      a(this.b, i5, i7);
      this.b.measure(View.MeasureSpec.makeMeasureSpec(l, 1073741824), View.MeasureSpec.makeMeasureSpec(l, 1073741824));
      int i8 = i6 + n;
      int i9 = i1 - i8 - o;
      int i10 = i2 - i3;
      this.d.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, -2147483648));
      int i11 = i4 + Math.max(0, (i10 - this.d.getMeasuredHeight()) / 2);
      a(this.d, i8, i11);
      return;
      a(this.c, 0, 0);
      this.c.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView == this.b) && (this.h != null)) {
      this.h.b(((AvatarView)paramView).a);
    }
    while ((paramView != this.c) || (this.h == null) || (this.a == null)) {
      return;
    }
    this.h.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwd
 * JD-Core Version:    0.7.0.1
 */