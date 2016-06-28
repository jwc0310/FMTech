package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import dva;
import giz;
import ipf;
import lyg;
import mbb;

public class AutoBackupBarView
  extends FrameLayout
  implements View.OnClickListener, lyg
{
  public View a;
  public ImageView b;
  public View c;
  public MediaView d;
  public MediaView e;
  public TextView f;
  public TextView g;
  public TextView h;
  public View i;
  public Button j;
  public ProgressBar k;
  public ipf l;
  public int m = -1;
  public int n;
  public boolean o;
  public String p;
  public dva q;
  public giz r;
  
  public AutoBackupBarView(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public AutoBackupBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public AutoBackupBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private final void c()
  {
    this.r = ((giz)mbb.a(getContext(), giz.class));
  }
  
  public final void a()
  {
    this.c.setVisibility(8);
    this.d.setVisibility(8);
    this.k.setVisibility(8);
    this.b.setVisibility(0);
    this.i.setVisibility(8);
    this.j.setVisibility(8);
    this.f.setVisibility(0);
    this.g.setVisibility(0);
  }
  
  public final void a(int paramInt)
  {
    this.j.setText(paramInt);
    this.j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
  }
  
  public final void b()
  {
    this.c.setVisibility(8);
    this.d.setVisibility(8);
    this.k.setVisibility(8);
    this.b.setVisibility(0);
    this.i.setVisibility(0);
    this.j.setVisibility(0);
    this.f.setVisibility(0);
    this.g.setVisibility(0);
  }
  
  public final boolean d()
  {
    return false;
  }
  
  public void onClick(View paramView)
  {
    if (this.q != null) {
      this.q.a(this.n);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.a == null)
    {
      this.a = findViewById(aaw.aj);
      this.b = ((ImageView)findViewById(aaw.ek));
      this.c = findViewById(aaw.lF);
      this.d = ((MediaView)findViewById(aaw.gE));
      this.e = ((MediaView)findViewById(aaw.lE));
      this.f = ((TextView)findViewById(aaw.lK));
      this.g = ((TextView)findViewById(aaw.fh));
      this.h = ((TextView)findViewById(aaw.fi));
      this.i = findViewById(aaw.cD);
      this.j = ((Button)findViewById(aaw.aL));
      this.k = ((ProgressBar)findViewById(aaw.hU));
      this.j.setOnClickListener(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.AutoBackupBarView
 * JD-Core Version:    0.7.0.1
 */