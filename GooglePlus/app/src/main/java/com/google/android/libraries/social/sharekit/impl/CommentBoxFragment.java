package com.google.android.libraries.social.sharekit.impl;

import aau;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import bk;
import com.google.android.libraries.social.sharekit.comments.CommentBox;
import efj;
import java.util.ArrayList;
import java.util.Iterator;

public final class CommentBoxFragment
  extends bk
  implements View.OnClickListener
{
  final ArrayList<View.OnClickListener> a = new ArrayList();
  public CommentBox b;
  CharSequence c;
  boolean d = true;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.c = paramBundle.getCharSequence("GENERATED_TEXT");
      this.d = paramBundle.getBoolean("URL_CHECKING_ENABLED");
    }
    View localView = paramLayoutInflater.inflate(efj.UN, paramViewGroup, false);
    this.b = ((CommentBox)localView.findViewById(aau.Bk));
    this.b.setOnClickListener(this);
    this.b.c = true;
    return localView;
  }
  
  public final void d_()
  {
    this.b = null;
    super.d_();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putCharSequence("GENERATED_TEXT", this.c);
    paramBundle.putBoolean("URL_CHECKING_ENABLED", this.d);
  }
  
  public final void onClick(View paramView)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((View.OnClickListener)localIterator.next()).onClick(paramView);
    }
  }
  
  public final void v()
  {
    this.d = false;
    this.b.a = null;
  }
  
  public final void w()
  {
    this.b.requestFocus();
    this.b.setCursorVisible(true);
    efj.j(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.CommentBoxFragment
 * JD-Core Version:    0.7.0.1
 */