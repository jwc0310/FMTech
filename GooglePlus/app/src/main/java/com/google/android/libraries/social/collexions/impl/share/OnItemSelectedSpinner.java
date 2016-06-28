package com.google.android.libraries.social.collexions.impl.share;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import efj;
import ehr;
import hpd;

public final class OnItemSelectedSpinner
  extends Spinner
{
  public AdapterView.OnItemSelectedListener a;
  
  public OnItemSelectedSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(null);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    Object localObject = getSelectedItem();
    if ((localObject != null) && ((localObject instanceof hpd)))
    {
      hpd localhpd = (hpd)localObject;
      StringBuilder localStringBuilder = new StringBuilder();
      Resources localResources = getContext().getResources();
      if (TextUtils.isEmpty(paramCharSequence))
      {
        int i = ehr.bD;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localhpd.a;
        paramCharSequence = localResources.getString(i, arrayOfObject);
      }
      CharSequence[] arrayOfCharSequence = new CharSequence[2];
      arrayOfCharSequence[0] = paramCharSequence;
      arrayOfCharSequence[1] = localResources.getString(ehr.by);
      efj.a(localStringBuilder, arrayOfCharSequence);
      setContentDescription(localStringBuilder.toString());
    }
  }
  
  public final void setSelection(int paramInt)
  {
    super.setSelection(paramInt);
    if (this.a != null)
    {
      this.a.onItemSelected(this, getSelectedView(), paramInt, getSelectedItemId());
      a(null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.share.OnItemSelectedSpinner
 * JD-Core Version:    0.7.0.1
 */