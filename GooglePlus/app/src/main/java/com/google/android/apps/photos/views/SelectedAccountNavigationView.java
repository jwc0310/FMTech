package com.google.android.apps.photos.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import bfz;
import bpw;
import com.google.android.apps.plus.views.CoverPhotoImageView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;
import git;
import gjb;
import lym;
import nxh;

public class SelectedAccountNavigationView
  extends FrameLayout
  implements View.OnClickListener
{
  private static nxh e;
  bfz a;
  public byte[] b;
  public boolean c;
  public int d = 0;
  private CoverPhotoImageView f;
  private AvatarView g;
  private TextView h;
  private TextView i;
  private View j;
  private View k;
  
  public SelectedAccountNavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (e == null)
    {
      nxh localnxh = new nxh();
      e = localnxh;
      localnxh.b = Float.valueOf(0.0F);
      e.a = Float.valueOf(0.0F);
      e.d = Float.valueOf(1.0F);
      e.c = Float.valueOf(1.0F);
    }
  }
  
  public final void a()
  {
    switch (this.d)
    {
    default: 
      return;
    case 0: 
      if (this.c)
      {
        this.j.setVisibility(0);
        this.j.setOnClickListener(this);
      }
      for (;;)
      {
        this.k.setVisibility(8);
        return;
        this.j.setVisibility(8);
      }
    }
    this.j.setVisibility(8);
    this.k.setVisibility(0);
    this.k.setOnClickListener(this);
  }
  
  public final void a(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      a();
    }
  }
  
  public final void a(git paramgit)
  {
    if (!paramgit.e()) {
      return;
    }
    gjb localgjb = paramgit.f();
    this.g.a(localgjb.b("gaia_id"), localgjb.b("profile_photo_url"));
    this.g.setOnClickListener(this);
    this.h.setText(localgjb.b("display_name"));
    this.i.setText(localgjb.b("account_name"));
    if (this.b != null)
    {
      bpw localbpw = bpw.b(this.b);
      nxh localnxh = new nxh();
      localnxh.a = Float.valueOf(localbpw.b);
      localnxh.d = Float.valueOf(localbpw.c);
      localnxh.c = Float.valueOf(localbpw.d);
      localnxh.b = Float.valueOf(localbpw.e);
      this.f.a(localbpw.a, localnxh, localbpw.f, false);
      return;
    }
    this.f.a("https://lh6.googleusercontent.com/-5vG8ole8nAI/UYFKqb0Y7YI/AAAAAAAABiA/YQzKopOzN1g/w0-h0/default_cover_1_c07bbaef481e775be41b71cecbb5cd60.jpg", e, 0, false);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.j)
    {
      a(1);
      this.a.a();
    }
    do
    {
      return;
      if (paramView == this.k)
      {
        a(0);
        this.a.a();
        return;
      }
    } while (paramView != this.g);
    performClick();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.g = ((AvatarView)findViewById(aaw.as));
    this.h = ((TextView)findViewById(aaw.cC));
    this.i = ((TextView)findViewById(aaw.s));
    this.f = ((CoverPhotoImageView)findViewById(aaw.cd));
    this.f.b(getContext().getResources().getDrawable(efj.qW));
    this.f.b = lym.a;
    this.f.a = false;
    this.j = findViewById(aaw.jU);
    this.k = findViewById(aaw.ef);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.views.SelectedAccountNavigationView
 * JD-Core Version:    0.7.0.1
 */