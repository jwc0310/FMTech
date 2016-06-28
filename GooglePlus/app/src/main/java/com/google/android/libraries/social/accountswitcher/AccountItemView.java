package com.google.android.libraries.social.accountswitcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;

public final class AccountItemView
  extends LinearLayout
{
  public AvatarView a;
  public TextView b;
  public TextView c;
  public ImageView d;
  public boolean e;
  
  public AccountItemView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public AccountItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AccountItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((AvatarView)findViewById(efj.CN));
    this.a.g = false;
    this.b = ((TextView)findViewById(efj.CS));
    this.c = ((TextView)findViewById(efj.CL));
    this.d = ((ImageView)findViewById(efj.CU));
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
    if (this.e)
    {
      Context localContext2 = getContext();
      int j = efj.CZ;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.c.getText();
      setContentDescription(localContext2.getString(j, arrayOfObject2));
      return;
    }
    Context localContext1 = getContext();
    int i = efj.Dc;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.b.getText();
    arrayOfObject1[1] = this.c.getText();
    setContentDescription(localContext1.getString(i, arrayOfObject1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.accountswitcher.AccountItemView
 * JD-Core Version:    0.7.0.1
 */