package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import az;
import com.google.android.apps.common.proguard.UsedByReflection;
import da;
import ket;
import kfu;

@UsedByReflection
public class LabelPreference
  extends ket
{
  private CharSequence a;
  private int b;
  private int c = -1;
  
  public LabelPreference(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  @UsedByReflection
  public LabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    b(az.z);
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.a);
      this.c = localTypedArray.getDimensionPixelSize(kfu.c, -1);
      this.b = localTypedArray.getInt(kfu.b, 1);
      localTypedArray.recycle();
    }
  }
  
  protected final View a(ViewGroup paramViewGroup)
  {
    View localView = super.a(paramViewGroup);
    ((TextView)localView.findViewById(da.X)).setAutoLinkMask(this.b);
    return localView;
  }
  
  protected final void a(View paramView)
  {
    super.a(paramView);
    if (this.c >= 0) {
      paramView.setMinimumHeight(this.c);
    }
    TextView localTextView = (TextView)paramView.findViewById(da.S);
    View localView = paramView.findViewById(da.W);
    if (localTextView != null)
    {
      if (!TextUtils.isEmpty(this.a)) {
        break label78;
      }
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      paramView.findViewById(da.X);
      if (localView != null) {
        localView.setVisibility(8);
      }
      return;
      label78:
      localTextView.setVisibility(0);
      localTextView.setText(this.a);
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (!paramCharSequence.equals(this.a))
    {
      this.a = paramCharSequence;
      g();
    }
  }
  
  public final boolean c()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.settings.LabelPreference
 * JD-Core Version:    0.7.0.1
 */