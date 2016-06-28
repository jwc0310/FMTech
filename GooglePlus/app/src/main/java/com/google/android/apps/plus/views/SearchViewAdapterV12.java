package com.google.android.apps.plus.views;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.SearchView;
import com.google.android.apps.common.proguard.UsedByReflection;
import dzg;

@UsedByReflection
public class SearchViewAdapterV12
  extends SearchViewAdapterV11
  implements View.OnAttachStateChangeListener
{
  @UsedByReflection
  public SearchViewAdapterV12(View paramView)
  {
    super(paramView);
    this.d.addOnAttachStateChangeListener(this);
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    if ((this.d.hasFocus()) && (this.b)) {
      this.d.postDelayed(new dzg(this), 100L);
    }
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.SearchViewAdapterV12
 * JD-Core Version:    0.7.0.1
 */