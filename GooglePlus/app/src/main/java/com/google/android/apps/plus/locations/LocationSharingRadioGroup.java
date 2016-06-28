package com.google.android.apps.plus.locations;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class LocationSharingRadioGroup
  extends RadioGroup
  implements View.OnClickListener
{
  public int a = -1;
  private RadioGroup.OnCheckedChangeListener b;
  private LocationSharingRadioButton c;
  private LocationSharingRadioButton d;
  
  public LocationSharingRadioGroup(Context paramContext)
  {
    super(paramContext);
  }
  
  public LocationSharingRadioGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void a(String paramString)
  {
    Resources localResources = getResources();
    LocationSharingRadioButton localLocationSharingRadioButton1 = this.c;
    String str1 = localResources.getString(aau.iz, new Object[] { paramString });
    localLocationSharingRadioButton1.b.setText(str1);
    LocationSharingRadioButton localLocationSharingRadioButton2 = this.d;
    String str2 = localResources.getString(aau.iw, new Object[] { paramString });
    localLocationSharingRadioButton2.b.setText(str2);
  }
  
  public void check(int paramInt)
  {
    int i = this.a;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if ((this.b != null) && (i != this.a)) {
        this.b.onCheckedChanged(this, this.a);
      }
      return;
      this.a = paramInt;
      this.d.setChecked(false);
      this.c.setChecked(true);
      continue;
      this.a = paramInt;
      this.c.setChecked(false);
      this.d.setChecked(true);
      continue;
      clearCheck();
    }
  }
  
  public void clearCheck()
  {
    this.a = -1;
    this.c.setChecked(false);
    this.d.setChecked(false);
  }
  
  public int getCheckedRadioButtonId()
  {
    switch (this.a)
    {
    default: 
      return -1;
    case 1: 
      return this.c.getId();
    }
    return this.d.getId();
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == this.c.getId()) {
      check(1);
    }
    while (i != this.d.getId()) {
      return;
    }
    check(2);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.c == null)
    {
      this.c = ((LocationSharingRadioButton)getChildAt(0));
      this.d = ((LocationSharingRadioButton)getChildAt(1));
      this.c.setOnClickListener(this);
      this.d.setOnClickListener(this);
      clearCheck();
      Resources localResources = getResources();
      LocationSharingRadioButton localLocationSharingRadioButton1 = this.c;
      String str1 = localResources.getString(aau.iy);
      localLocationSharingRadioButton1.a.setText(str1);
      LocationSharingRadioButton localLocationSharingRadioButton2 = this.d;
      String str2 = localResources.getString(aau.iv);
      localLocationSharingRadioButton2.a.setText(str2);
      a(localResources.getString(aau.ia));
    }
  }
  
  public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    this.b = paramOnCheckedChangeListener;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.locations.LocationSharingRadioGroup
 * JD-Core Version:    0.7.0.1
 */