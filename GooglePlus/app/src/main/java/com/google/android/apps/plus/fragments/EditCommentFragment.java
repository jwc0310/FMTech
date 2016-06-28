package com.google.android.apps.plus.fragments;

import aau;
import android.app.Activity;
import android.content.Intent;
import bp;
import bzl;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import dmm;
import kia;

public class EditCommentFragment
  extends bzl
{
  public final boolean v()
  {
    return this.d.c();
  }
  
  public final void w()
  {
    super.w();
    bp localbp = f();
    if ((!i()) || (localbp.isFinishing())) {
      return;
    }
    String str1 = kia.a(this.d.getText());
    Intent localIntent1 = localbp.getIntent();
    String str2 = localIntent1.getStringExtra("tile_id");
    String str3 = localIntent1.getStringExtra("comment_id");
    if (localIntent1.hasExtra("photo_id"))
    {
      int j = this.a;
      String str5 = this.b;
      Intent localIntent3 = EsService.e.a(localbp, EsService.class);
      localIntent3.putExtra("op", 64);
      localIntent3.putExtra("account_id", j);
      localIntent3.putExtra("aid", str5);
      localIntent3.putExtra("comment_id", str3);
      localIntent3.putExtra("content", str1);
      localIntent3.putExtra("tile_id", str2);
      this.c = Integer.valueOf(EsService.a(localbp, localIntent3));
      return;
    }
    int i = this.a;
    String str4 = this.b;
    Intent localIntent2 = EsService.e.a(localbp, EsService.class);
    localIntent2.putExtra("op", 32);
    localIntent2.putExtra("account_id", i);
    localIntent2.putExtra("aid", str4);
    localIntent2.putExtra("comment_id", str3);
    localIntent2.putExtra("content", str1);
    this.c = Integer.valueOf(EsService.a(localbp, localIntent2));
  }
  
  protected final int x()
  {
    return aau.eb;
  }
  
  protected final String y()
  {
    return "comment";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.EditCommentFragment
 * JD-Core Version:    0.7.0.1
 */