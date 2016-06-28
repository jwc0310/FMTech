package com.google.android.apps.plus.locations;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;

public class LocationSharingRadioButton
  extends FrameLayout
  implements Checkable
{
  CheckedTextView a;
  TextView b;
  private boolean c;
  private CheckedTextView d;
  
  public LocationSharingRadioButton(Context paramContext)
  {
    super(paramContext);
  }
  
  public LocationSharingRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public LocationSharingRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean isChecked()
  {
    return this.c;
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.d == null)
    {
      this.d = ((CheckedTextView)findViewById(aaw.aP));
      this.a = ((CheckedTextView)findViewById(aaw.aS));
      this.b = ((TextView)findViewById(aaw.aN));
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.c = paramBoolean;
    this.d.setChecked(this.c);
    this.a.setChecked(this.c);
  }
  
  public void toggle()
  {
    if (!this.c) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.locations.LocationSharingRadioButton
 * JD-Core Version:    0.7.0.1
 */