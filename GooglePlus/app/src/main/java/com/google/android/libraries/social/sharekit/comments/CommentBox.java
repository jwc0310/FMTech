package com.google.android.libraries.social.sharekit.comments;

import android.content.Context;
import android.util.AttributeSet;
import efj;
import java.util.Timer;
import kin;
import kio;
import kiv;

public final class CommentBox
  extends MentionMultiAutoCompleteTextView
{
  public kiv a;
  private Timer d;
  
  public CommentBox(Context paramContext)
  {
    super(paramContext);
  }
  
  public CommentBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CommentBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    String str = efj.a(getText());
    if (str != null) {
      post(new kio(this, str));
    }
  }
  
  protected final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (this.d != null)
    {
      this.d.cancel();
      this.d = null;
    }
    if (this.a == null) {
      return;
    }
    if ((paramInt3 > paramInt2) && (paramInt3 - paramInt2 > 10))
    {
      a();
      return;
    }
    this.d = new Timer();
    this.d.schedule(new kin(this), 2000L);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.comments.CommentBox
 * JD-Core Version:    0.7.0.1
 */