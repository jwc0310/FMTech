import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public final class dwj
  extends dwp
  implements View.OnClickListener
{
  private static Drawable m;
  private static Drawable n;
  private static Drawable o;
  private static Drawable p;
  private static Drawable q;
  private ImageView h;
  private ImageView i;
  private boolean j;
  private dwb k;
  private boolean l;
  
  public dwj(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void a(int paramInt)
  {
    if (this.j)
    {
      if (paramInt == 0) {
        this.k.y();
      }
      while (paramInt != 1) {
        return;
      }
      this.k.z();
      return;
    }
    this.k.A();
  }
  
  public final void a(int paramInt, qdq paramqdq, qdc paramqdc, dwb paramdwb)
  {
    if (paramqdq != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.j = bool;
      this.k = paramdwb;
      switch (paramInt)
      {
      default: 
        return;
      }
    }
    this.h.setImageDrawable(m);
    this.i.setImageDrawable(n);
    String str4;
    if (paramqdq.d != null) {
      str4 = paramqdq.c;
    }
    for (String str5 = ((qea)paramqdq.d.b(qea.a)).c;; str5 = null)
    {
      super.a(str4, str5, this.h, this.i);
      return;
      str4 = paramqdq.b;
    }
    Resources localResources = getContext().getResources();
    String str1;
    String str2;
    ImageView localImageView;
    String str3;
    if (paramInt == 2)
    {
      this.h.setImageDrawable(o);
      str1 = localResources.getString(aau.gc);
      str2 = localResources.getString(aau.fZ);
      if (System.currentTimeMillis() <= paramqdc.b.longValue()) {
        break label257;
      }
      this.i.setImageDrawable(q);
      localImageView = this.i;
      str3 = localResources.getString(aau.ga);
    }
    for (;;)
    {
      super.a(str1, str3, this.h, localImageView);
      return;
      this.h.setImageDrawable(p);
      str1 = localResources.getString(aau.gb);
      break;
      label257:
      str3 = str2;
      localImageView = null;
    }
  }
  
  protected final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramContext, paramAttributeSet, paramInt);
    if (!this.l)
    {
      Resources localResources = paramContext.getResources();
      m = localResources.getDrawable(efj.qo);
      n = localResources.getDrawable(efj.qq);
      o = localResources.getDrawable(efj.qr);
      p = localResources.getDrawable(efj.pu);
      q = localResources.getDrawable(efj.ql);
      this.l = true;
    }
    this.h = new ImageView(paramContext, paramAttributeSet, paramInt);
    this.i = new ImageView(paramContext, paramAttributeSet, paramInt);
    this.a.setVisibility(0);
    this.b.setVisibility(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwj
 * JD-Core Version:    0.7.0.1
 */