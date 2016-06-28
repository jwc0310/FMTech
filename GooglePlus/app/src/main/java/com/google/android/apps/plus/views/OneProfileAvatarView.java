package com.google.android.apps.plus.views;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import aq;
import at;
import dxo;
import dxp;
import efj;
import ick;
import icl;
import icm;
import ifb;
import ifj;
import ipb;
import ipf;
import ipm;
import kaz;
import kbb;
import lwe;
import lwo;
import lxj;
import mbb;

public class OneProfileAvatarView
  extends ImageView
  implements at, kbb, lxj
{
  public dxp a;
  public String b;
  private final ipb c = (ipb)mbb.a(getContext(), ipb.class);
  private kaz d;
  private kaz e;
  private Drawable f;
  private boolean g;
  
  public OneProfileAvatarView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    if ((this.a != null) && (paramBoolean))
    {
      this.a = new dxo(this, this.a);
      invalidate();
      requestLayout();
    }
    setImageDrawable(paramDrawable);
  }
  
  public final void D_()
  {
    ap_();
    this.b = null;
  }
  
  public final Bitmap a(int paramInt1, int paramInt2)
  {
    return this.c.a.b(paramInt1, paramInt2);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.c.a.a(paramBitmap);
  }
  
  public final void a(kaz paramkaz)
  {
    switch (paramkaz.q)
    {
    default: 
      return;
    case 1: 
      Object localObject1 = paramkaz.p;
      Object localObject2;
      if (paramkaz == this.d)
      {
        this.g = true;
        if (!(localObject1 instanceof Bitmap)) {
          break label106;
        }
        Bitmap localBitmap = lwe.a((Bitmap)localObject1);
        localObject2 = new BitmapDrawable(getResources(), localBitmap);
      }
      for (;;)
      {
        a((Drawable)localObject2, true);
        return;
        if ((paramkaz != this.e) || (!this.g)) {
          break;
        }
        return;
        label106:
        if ((localObject1 instanceof icm))
        {
          ick localick = new ick((icm)localObject1, this.c.a.j());
          localick.a = new icl(this);
          localObject2 = localick;
        }
        else if ((localObject1 instanceof ifb))
        {
          FrameSequence localFrameSequence = ((ifb)localObject1).a;
          if (localFrameSequence == null) {
            break label223;
          }
          localObject2 = new aq(localFrameSequence, this);
          ((aq)localObject2).b = true;
          ((aq)localObject2).a.setAntiAlias(true);
          ((aq)localObject2).i = 2;
          ((aq)localObject2).start();
        }
        else
        {
          localObject2 = null;
        }
      }
    }
    label223:
    a(true);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.b = null;
    if (this.f == null) {
      this.f = new BitmapDrawable(getResources(), efj.u(getContext(), 1));
    }
    a(this.f, paramBoolean);
    setClickable(false);
    setContentDescription(getResources().getString(aau.rh));
  }
  
  public final void ap_()
  {
    setImageDrawable(null);
    if (this.e != null)
    {
      this.e.b(this);
      this.e = null;
    }
    if (this.d != null)
    {
      this.d.b(this);
      this.d = null;
    }
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (this.b != null))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      this.e = this.c.a(ipf.a(getContext(), this.b, ipm.a), 0, localLayoutParams.width, localLayoutParams.width, 2, null, null, 262144, this);
      this.d = this.c.a(ipf.a(getContext(), this.b, ipm.a), 0, localLayoutParams.width, localLayoutParams.height, null, 4, this);
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null) {
      this.a.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.OneProfileAvatarView
 * JD-Core Version:    0.7.0.1
 */