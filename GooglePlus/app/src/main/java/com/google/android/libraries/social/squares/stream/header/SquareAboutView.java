package com.google.android.libraries.social.squares.stream.header;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import az;
import com.google.android.libraries.social.squares.stream.relatedlinksview.RelatedLinksView;
import efj;
import java.util.List;
import kwz;
import kxa;
import kxb;
import mbb;

public final class SquareAboutView
  extends LinearLayout
  implements kxa
{
  public TextView a;
  public RelatedLinksView b;
  public TextView c;
  public TextView d;
  private View e;
  private final kwz f = (kwz)mbb.b(getContext(), kwz.class);
  
  public SquareAboutView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareAboutView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SquareAboutView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(kxb paramkxb)
  {
    setBackgroundColor(paramkxb.a);
    this.a.setTextColor(paramkxb.e);
    this.a.setLinkTextColor(paramkxb.d);
    RelatedLinksView localRelatedLinksView = this.b;
    int i = paramkxb.e;
    int j = paramkxb.d;
    localRelatedLinksView.c = i;
    localRelatedLinksView.d = j;
    for (int k = 0; k < localRelatedLinksView.getChildCount(); k++)
    {
      View localView = localRelatedLinksView.getChildAt(k).findViewById(efj.YD);
      if ((localView instanceof TextView))
      {
        if (localRelatedLinksView.c != 0) {
          ((TextView)localView).setTextColor(localRelatedLinksView.c);
        }
        if (localRelatedLinksView.d != 0) {
          ((TextView)localView).setLinkTextColor(localRelatedLinksView.d);
        }
      }
    }
    this.c.setTextColor(paramkxb.e);
    this.c.setLinkTextColor(paramkxb.d);
    TextView localTextView = this.c;
    int m;
    if (Build.VERSION.SDK_INT >= 17)
    {
      m = 1;
      if (m == 0) {
        break label207;
      }
    }
    label207:
    for (Drawable[] arrayOfDrawable = localTextView.getCompoundDrawablesRelative();; arrayOfDrawable = localTextView.getCompoundDrawables())
    {
      arrayOfDrawable[0].setColorFilter(paramkxb.d, PorterDuff.Mode.MULTIPLY);
      return;
      m = 0;
      break;
    }
  }
  
  public final boolean a()
  {
    if (TextUtils.isEmpty(this.a.getText())) {
      if (this.b.getChildCount() <= 0) {
        break label57;
      }
    }
    label57:
    for (int i = 1;; i = 0)
    {
      boolean bool;
      if ((i == 0) && (this.c.getVisibility() != 0))
      {
        int j = this.d.getVisibility();
        bool = false;
        if (j != 0) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
  }
  
  public final void b()
  {
    View localView = this.e;
    if (a()) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.f != null) {
      this.f.a(this);
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.f != null) {
      this.f.c.remove(this);
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = findViewById(az.T);
    this.a = ((TextView)this.e.findViewById(az.S));
    this.b = ((RelatedLinksView)this.e.findViewById(az.W));
    this.c = ((TextView)this.e.findViewById(az.V));
    this.d = ((TextView)this.e.findViewById(az.R));
    this.b.b = true;
    this.e.findViewById(az.U).setVisibility(8);
    efj.a(this.c, efj.Ys, 0, 0, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.stream.header.SquareAboutView
 * JD-Core Version:    0.7.0.1
 */