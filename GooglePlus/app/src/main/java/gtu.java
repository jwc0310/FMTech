import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class gtu
  implements lxj
{
  final int a;
  final int b;
  final lve c;
  final gtt d;
  final TextView e;
  final TextView f;
  final TextView g;
  final TextView h;
  final MediaView i;
  
  gtu(gtt paramgtt)
  {
    Context localContext = paramgtt.getContext();
    CardView.a.a(paramgtt, 0.0F);
    CardView.a.a(paramgtt, -1);
    TypedArray localTypedArray = localContext.obtainStyledAttributes(new int[] { 16843534 });
    paramgtt.setForeground(localTypedArray.getDrawable(0));
    localTypedArray.recycle();
    paramgtt.setId(efj.EU);
    this.d = paramgtt;
    this.c = new lve(paramgtt);
    Resources localResources = paramgtt.getResources();
    this.a = localResources.getDimensionPixelSize(efj.EP);
    this.b = localResources.getDimensionPixelSize(efj.EQ);
    this.e = new TextView(localContext);
    this.e.setTextAppearance(localContext, efj.Fc);
    this.e.setVisibility(8);
    this.e.setMaxLines(2);
    this.e.setEllipsize(TextUtils.TruncateAt.END);
    this.e.setId(efj.EY);
    paramgtt.addView(this.e);
    this.f = new TextView(localContext);
    this.f.setTextAppearance(localContext, efj.Fa);
    this.f.setVisibility(8);
    this.f.setMaxLines(1);
    this.f.setEllipsize(TextUtils.TruncateAt.END);
    this.f.setId(efj.EV);
    paramgtt.addView(this.f);
    this.g = new TextView(localContext);
    this.g.setTextAppearance(localContext, efj.Fb);
    this.g.setVisibility(8);
    this.g.setMaxLines(1);
    this.g.setEllipsize(TextUtils.TruncateAt.END);
    this.g.setId(efj.EX);
    paramgtt.addView(this.g);
    this.h = new TextView(localContext);
    this.h.setTextAppearance(localContext, efj.Fd);
    this.h.setVisibility(8);
    this.h.setMaxLines(1);
    this.h.setEllipsize(TextUtils.TruncateAt.END);
    this.h.setId(efj.EZ);
    paramgtt.addView(this.h);
    this.i = new MediaView(localContext);
    this.i.s = 0;
    this.i.b(1);
    this.i.N = 0.5F;
    this.i.p = null;
    this.i.b(false);
    this.i.b(this.a, this.a);
    this.i.setId(efj.EW);
    paramgtt.addView(this.i);
  }
  
  public final void D_()
  {
    this.i.D_();
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.e.setText(paramCharSequence);
    TextView localTextView = this.e;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int j = 8;; j = 0)
    {
      localTextView.setVisibility(j);
      return;
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      ipf localipf = ipf.a(this.d.getContext(), paramString, ipm.a);
      this.i.a(localipf);
      return;
    }
    this.i.a(null);
    MediaView localMediaView = this.i;
    Bitmap localBitmap = BitmapFactory.decodeResource(localMediaView.getContext().getResources(), paramInt);
    if (localBitmap == null) {
      localBitmap = (Bitmap)MediaView.j.b();
    }
    localMediaView.C = localBitmap;
    if (paramInt != 0)
    {
      this.i.b(true);
      return;
    }
    this.i.b(false);
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    this.f.setText(paramCharSequence);
    TextView localTextView = this.f;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int j = 8;; j = 0)
    {
      localTextView.setVisibility(j);
      return;
    }
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    this.g.setText(paramCharSequence);
    TextView localTextView = this.g;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int j = 8;; j = 0)
    {
      localTextView.setVisibility(j);
      return;
    }
  }
  
  public final void d(CharSequence paramCharSequence)
  {
    this.h.setText(paramCharSequence);
    TextView localTextView = this.h;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int j = 8;; j = 0)
    {
      localTextView.setVisibility(j);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gtu
 * JD-Core Version:    0.7.0.1
 */