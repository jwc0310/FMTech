package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import dzu;
import dzv;

public class TypeableAudienceView$AudienceTextView
  extends AutoCompleteTextView
{
  public dzv a;
  
  public TypeableAudienceView$AudienceTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public TypeableAudienceView$AudienceTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TypeableAudienceView$AudienceTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onCheckIsTextEditor()
  {
    return true;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    dzu localdzu = new dzu(this, super.onCreateInputConnection(paramEditorInfo), true);
    localdzu.a = this;
    return localdzu;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.TypeableAudienceView.AudienceTextView
 * JD-Core Version:    0.7.0.1
 */