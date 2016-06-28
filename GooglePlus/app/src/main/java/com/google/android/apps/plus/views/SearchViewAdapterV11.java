package com.google.android.apps.plus.views;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;
import android.widget.SearchView.OnCloseListener;
import android.widget.SearchView.OnQueryTextListener;
import com.google.android.apps.common.proguard.UsedByReflection;
import dzd;
import dzf;
import efj;
import java.util.HashSet;
import java.util.Iterator;

@UsedByReflection
public class SearchViewAdapterV11
  extends dzd
  implements SearchView.OnCloseListener, SearchView.OnQueryTextListener
{
  public final SearchView d;
  
  @UsedByReflection
  public SearchViewAdapterV11(View paramView)
  {
    super(null);
    this.d = ((SearchView)paramView);
    this.d.setSubmitButtonEnabled(false);
    this.d.setOnQueryTextListener(this);
    this.d.setOnCloseListener(this);
  }
  
  public final void a(int paramInt)
  {
    this.d.setQueryHint(this.d.getContext().getString(paramInt));
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.d.setQuery(paramCharSequence, false);
    if (this.b) {
      this.d.requestFocus();
    }
  }
  
  public boolean onClose()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((dzf)localIterator.next()).D();
    }
    return true;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    super.onQueryTextSubmit(paramString);
    efj.k(this.d);
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.SearchViewAdapterV11
 * JD-Core Version:    0.7.0.1
 */