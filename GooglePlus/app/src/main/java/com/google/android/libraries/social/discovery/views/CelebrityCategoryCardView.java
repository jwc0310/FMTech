package com.google.android.libraries.social.discovery.views;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import efj;
import ehr;
import git;
import hul;
import mbb;
import orn;
import ors;
import osm;
import oso;

public final class CelebrityCategoryCardView
  extends FrameLayout
{
  public View a;
  public boolean b;
  private Drawable c;
  private View d;
  private TextView e;
  private TextView f;
  private LinearLayout g;
  private CirclesButton h;
  private boolean i;
  
  public CelebrityCategoryCardView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    git localgit = (git)mbb.a(localContext, git.class);
    this.i = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
  }
  
  public CelebrityCategoryCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    git localgit = (git)mbb.a(localContext, git.class);
    this.i = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
  }
  
  public CelebrityCategoryCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    git localgit = (git)mbb.a(localContext, git.class);
    this.i = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
  }
  
  public final void a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence[] arrayOfCharSequence = new CharSequence[2];
    arrayOfCharSequence[0] = this.e.getText();
    arrayOfCharSequence[1] = this.f.getText();
    efj.a(localStringBuilder, arrayOfCharSequence);
    String str = localStringBuilder.toString();
    if (this.b)
    {
      setContentDescription(getContext().getString(efj.Lh, new Object[] { str }));
      return;
    }
    setContentDescription(str);
  }
  
  public final void a(osm paramosm)
  {
    int j = this.g.getChildCount();
    int k = Math.min(paramosm.c.length, j);
    this.e.setText(paramosm.b);
    StringBuilder localStringBuilder = new StringBuilder();
    int m = 0;
    if (m < j)
    {
      if (m < k)
      {
        oso localoso = paramosm.c[m];
        String str1 = efj.b(localoso.a.a);
        String str2 = localoso.a.b.c;
        AvatarView localAvatarView = (AvatarView)this.g.getChildAt(m);
        localAvatarView.setVisibility(0);
        localAvatarView.a(str1, efj.E(str2));
        localAvatarView.b = localoso.c;
        localStringBuilder.append(localoso.a.b.a);
        if (m != k - 1) {
          localStringBuilder.append(", ");
        }
      }
      for (;;)
      {
        m++;
        break;
        ((AvatarView)this.g.getChildAt(m)).setVisibility(8);
      }
    }
    this.f.setText(localStringBuilder.toString());
    a();
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = findViewById(ehr.cJ);
    this.a = findViewById(ehr.cv);
    this.e = ((TextView)findViewById(ehr.co));
    this.f = ((TextView)findViewById(ehr.cp));
    this.g = ((LinearLayout)findViewById(ehr.cl));
    this.h = ((CirclesButton)findViewById(ehr.cu));
    this.h.b(this.i);
    this.c = getContext().getResources().getDrawable(aau.zQ);
    this.d.setBackgroundDrawable(this.c);
    this.h.a(13);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.discovery.views.CelebrityCategoryCardView
 * JD-Core Version:    0.7.0.1
 */