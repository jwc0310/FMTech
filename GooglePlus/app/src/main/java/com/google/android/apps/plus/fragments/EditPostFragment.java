package com.google.android.apps.plus.fragments;

import aau;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bp;
import bzl;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import dmm;
import kia;

public class EditPostFragment
  extends bzl
{
  private boolean Z;
  private boolean aa;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    this.d.setHint(aau.tm);
    return localView;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    Intent localIntent = paramActivity.getIntent();
    if ((localIntent.getBooleanExtra("reshare", false)) || (!localIntent.getBooleanExtra("is_only_text", false))) {}
    for (boolean bool = true;; bool = false)
    {
      this.Z = bool;
      this.aa = localIntent.getBooleanExtra("reshare", false);
      return;
    }
  }
  
  public final boolean v()
  {
    return (z()) && ((this.Z) || (this.d.c()));
  }
  
  public final void w()
  {
    super.w();
    bp localbp = f();
    if ((!i()) || (localbp.isFinishing())) {
      return;
    }
    String str1 = kia.a(this.d.getText());
    int i = this.a;
    String str2 = this.b;
    boolean bool = this.aa;
    Intent localIntent = EsService.e.a(localbp, EsService.class);
    localIntent.putExtra("op", 14);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("aid", str2);
    localIntent.putExtra("content", str1);
    localIntent.putExtra("reshare", bool);
    this.c = Integer.valueOf(EsService.a(localbp, localIntent));
  }
  
  protected final int x()
  {
    return aau.fB;
  }
  
  protected final String y()
  {
    return "content";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.EditPostFragment
 * JD-Core Version:    0.7.0.1
 */