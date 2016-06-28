import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class dzn
  extends ViewGroup
  implements View.OnClickListener, lxj
{
  public final loj a;
  llv b;
  boolean c;
  long d;
  int e;
  String f;
  dzo g;
  final ArrayList<AvatarView> h;
  Button i;
  ImageView j;
  ipf k;
  MediaView l;
  int m;
  int n;
  TextView o;
  gik p;
  
  public dzn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = loj.a(paramContext);
    this.g = new dzo(paramContext);
    if (!this.c) {}
    for (int i1 = 19;; i1 = 10)
    {
      Button localButton = lur.a(paramContext, paramAttributeSet, paramInt, i1, this.a.aQ, 0);
      localButton.setSingleLine(true);
      localButton.setEllipsize(TextUtils.TruncateAt.END);
      localButton.setCompoundDrawablePadding(this.a.n);
      localButton.setOnClickListener(this);
      this.i = localButton;
      this.i.setText(getContext().getString(aau.iJ));
      this.l = new MediaView(paramContext, paramAttributeSet, paramInt);
      this.l.setOnClickListener(this);
      this.l.setContentDescription(getResources().getString(aau.dg));
      this.h = new ArrayList();
      this.j = new ImageView(paramContext, paramAttributeSet, paramInt);
      this.j.setImageBitmap(this.a.f);
      this.j.setScaleType(ImageView.ScaleType.CENTER);
      this.o = new TextView(paramContext, paramAttributeSet, paramInt);
      return;
    }
  }
  
  private final int c()
  {
    if (this.e > 0) {
      return efj.r(getContext(), 2) + this.a.m;
    }
    return 0;
  }
  
  private final int d()
  {
    return ((git)mbb.a(getContext(), git.class)).c();
  }
  
  private void e()
  {
    for (int i1 = 0; i1 < this.h.size(); i1++) {
      ((AvatarView)this.h.get(i1)).ap_();
    }
    if (this.k != null) {
      this.l.ap_();
    }
  }
  
  public final void D_()
  {
    e();
    this.e = 0;
    this.g.D_();
    this.h.clear();
    this.m = 0;
    this.n = 0;
    this.k = null;
    this.d = 0L;
    removeAllViews();
    this.f = null;
    this.p = null;
  }
  
  final boolean b()
  {
    hyi localhyi = (hyi)mbb.a(getContext(), hyi.class);
    return (this.b.i) && (localhyi.b(bwb.d, d()));
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (lwo.a(this))
    {
      for (int i1 = 0; i1 < this.h.size(); i1++) {
        ((AvatarView)this.h.get(i1)).b();
      }
      if (this.k != null) {
        this.l.a(this.k);
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    Context localContext = getContext();
    int i1 = d();
    if ((efj.B(localContext)) && (this.p != null) && (this.p.f())) {
      this.p.E_();
    }
    label163:
    do
    {
      return;
      if ((paramView instanceof AvatarView))
      {
        localContext.startActivity(efj.a(localContext, i1, ((AvatarView)paramView).a, null, false));
        return;
      }
      if (paramView == this.i)
      {
        String str1 = this.b.a;
        Intent localIntent2 = efj.a(localContext, "vnd.google.android.hangouts/vnd.google.android.hangout_privileged", i1, true);
        String str2;
        if (localIntent2 != null)
        {
          str2 = String.valueOf(str1);
          if (str2.length() == 0) {
            break label163;
          }
        }
        for (String str3 = "https://plus.google.com/hangouts/_/".concat(str2);; str3 = new String("https://plus.google.com/hangouts/_/"))
        {
          localIntent2.putExtra("hangout_uri", Uri.parse(str3));
          localIntent2.putExtra("hangout_start_source", 29);
          efj.b(localContext, localIntent2);
          return;
        }
      }
    } while (paramView != this.l);
    Uri localUri = Uri.parse(this.f);
    Intent localIntent1 = new Intent("android.intent.action.VIEW", localUri);
    if (b())
    {
      localContext.startActivity(localIntent1);
      return;
    }
    localIntent1.addFlags(524288);
    if (dtz.a(localContext, "com.google.android.youtube"))
    {
      localIntent1.setPackage("com.google.android.youtube");
      if (getContext().getPackageManager().resolveActivity(localIntent1, 0) == null) {
        localIntent1.setPackage(null);
      }
    }
    try
    {
      localContext.startActivity(localIntent1);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      localContext.startActivity(new Intent("android.intent.action.VIEW", localUri));
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    e();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i12;
    if (this.b != null)
    {
      if (this.e <= 0) {
        break label438;
      }
      i12 = ((AvatarView)this.h.get(0)).c;
      int i13 = paramInt1 + this.a.z;
      int i14 = this.a.m;
      int i15 = 0;
      int i16 = i13;
      while (i15 < this.e)
      {
        AvatarView localAvatarView = (AvatarView)this.h.get(i15);
        localAvatarView.layout(i16, i14, i16 + localAvatarView.getMeasuredWidth(), i14 + i12);
        i16 += localAvatarView.getWidth() + this.a.G;
        i15++;
      }
    }
    label438:
    for (int i1 = i12 + this.a.m;; i1 = 0)
    {
      if (this.c) {
        i1 = this.l.getMeasuredHeight() + this.a.m;
      }
      this.g.layout(paramInt1, i1, paramInt3, paramInt4);
      if (this.c)
      {
        int i3 = this.l.getMeasuredWidth();
        int i4 = this.l.getMeasuredHeight();
        int i5 = this.j.getMeasuredWidth();
        int i6 = i3 / 2 - i5 / 2;
        int i7 = i4 / 2 - i5 / 2;
        this.j.layout(paramInt1 + i6, i7, i6 + i5, i7 + this.j.getMeasuredHeight());
        this.l.layout(paramInt1, 0, paramInt1 + this.l.getMeasuredWidth(), this.l.getMeasuredHeight());
        int i8 = this.b.g;
        int i9 = 0;
        if (i8 == 0) {
          i9 = 1;
        }
        if ((i9 != 0) || (b()))
        {
          int i10 = paramInt3 - this.o.getMeasuredWidth() - this.a.z;
          int i11 = this.a.z;
          this.o.layout(i10, i11, i10 + this.o.getMeasuredWidth(), i11 + this.o.getMeasuredHeight());
        }
        return;
      }
      int i2 = c() + this.g.getMeasuredHeight();
      this.i.layout(paramInt1 + this.a.z, i2, paramInt1 + this.a.z + this.i.getMeasuredWidth(), i2 + this.i.getMeasuredHeight());
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    if (this.b != null)
    {
      int i4;
      if (this.c)
      {
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.l.measure(View.MeasureSpec.makeMeasureSpec(this.n, 1073741824), View.MeasureSpec.makeMeasureSpec(this.m, 1073741824));
        if (this.b.g == 0)
        {
          i4 = 1;
          if ((i4 != 0) || (b())) {
            this.o.measure(View.MeasureSpec.makeMeasureSpec(this.n, -2147483648), View.MeasureSpec.makeMeasureSpec(this.n, -2147483648));
          }
        }
      }
      for (;;)
      {
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(0, -2147483648));
        for (int i3 = 0; i3 < this.e; i3++) {
          ((AvatarView)this.h.get(i3)).measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(efj.i(getContext()), -2147483648));
        }
        i4 = 0;
        break;
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
      }
    }
    int i2 = this.a.m + c() + this.g.getMeasuredHeight();
    if ((this.c) && (this.l.getParent() == this)) {
      i2 += this.l.getMeasuredHeight();
    }
    if ((TextUtils.isEmpty(this.b.e)) && (this.i.getParent() == this)) {
      i2 += this.i.getMeasuredHeight();
    }
    setMeasuredDimension(i1, i2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzn
 * JD-Core Version:    0.7.0.1
 */