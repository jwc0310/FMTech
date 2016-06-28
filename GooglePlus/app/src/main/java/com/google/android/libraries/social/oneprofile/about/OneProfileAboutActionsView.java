package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import aw;
import efj;
import jfc;
import jgd;
import nwj;
import nwt;
import nxl;
import qgi;
import qjn;

public final class OneProfileAboutActionsView
  extends jgd
  implements View.OnClickListener
{
  public jfc a;
  
  public OneProfileAboutActionsView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutActionsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutActionsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(nxl paramnxl)
  {
    String str1 = paramnxl.g;
    String str2 = efj.d(paramnxl);
    if (str2 != null)
    {
      StringBuilder localStringBuilder2 = new StringBuilder("http://maps.google.com/maps?cid=").append(Uri.encode(str2));
      if (str1 != null) {
        localStringBuilder2.append("&q=").append(Uri.encode(str1));
      }
      String str8 = localStringBuilder2.toString();
      View localView5 = findViewById(aw.ct);
      localView5.setTag(str8);
      localView5.setOnClickListener(this);
    }
    String str3 = efj.b(paramnxl);
    Boolean localBoolean;
    boolean bool1;
    String str4;
    View localView1;
    View localView2;
    label223:
    Object localObject;
    String str6;
    if (paramnxl.f.b.d.a != null)
    {
      localBoolean = paramnxl.f.b.d.a.k;
      if (localBoolean == null)
      {
        bool1 = false;
        if (str3 != null)
        {
          StringBuilder localStringBuilder1 = new StringBuilder("http://maps.google.com/maps?daddr=");
          if (str1 != null) {
            localStringBuilder1.append(Uri.encode(str1)).append(", ");
          }
          localStringBuilder1.append(Uri.encode(str3));
          str4 = localStringBuilder1.toString();
          localView1 = findViewById(aw.by);
          localView2 = findViewById(aw.df);
          if ((!bool1) && (str3 != null)) {
            break label379;
          }
          localView2.setVisibility(8);
          localView1.setVisibility(8);
        }
        String str5 = efj.c(paramnxl);
        boolean bool2 = TextUtils.isEmpty(str5);
        localObject = null;
        if (!bool2)
        {
          str6 = String.valueOf(Uri.encode(str5));
          if (str6.length() == 0) {
            break label407;
          }
        }
      }
    }
    View localView3;
    View localView4;
    label407:
    for (String str7 = "tel:".concat(str6);; str7 = new String("tel:"))
    {
      Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse(str7));
      localIntent.addFlags(524288);
      localObject = localIntent;
      localView3 = findViewById(aw.de);
      localView4 = findViewById(aw.bq);
      if ((localObject == null) || (localObject.resolveActivity(getContext().getPackageManager()) == null)) {
        break label421;
      }
      localView3.setVisibility(0);
      localView4.setVisibility(0);
      localView4.setTag(localObject);
      localView4.setOnClickListener(this);
      return;
      bool1 = localBoolean.booleanValue();
      break;
      bool1 = false;
      break;
      label379:
      localView2.setVisibility(0);
      localView1.setVisibility(0);
      localView1.setTag(str4);
      localView1.setOnClickListener(this);
      break label223;
    }
    label421:
    localView3.setVisibility(8);
    localView4.setVisibility(8);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aw.ct) {
      this.a.h((String)paramView.getTag());
    }
    do
    {
      return;
      if (i == aw.by)
      {
        this.a.g((String)paramView.getTag());
        return;
      }
    } while (i != aw.bq);
    this.a.c((Intent)paramView.getTag());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutActionsView
 * JD-Core Version:    0.7.0.1
 */