package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import ihx;

public final class IngestGridView
  extends GridView
{
  public ihx a = null;
  
  public IngestGridView(Context paramContext)
  {
    super(paramContext);
  }
  
  public IngestGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public IngestGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void clearChoices()
  {
    super.clearChoices();
    if (this.a != null) {
      this.a.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.ui.IngestGridView
 * JD-Core Version:    0.7.0.1
 */