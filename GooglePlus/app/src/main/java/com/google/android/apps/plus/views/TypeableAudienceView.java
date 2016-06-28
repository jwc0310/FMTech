package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ScrollView;
import bgl;
import com.google.android.libraries.social.ui.views.multilinelayout.MultiLineLayout;
import dzs;
import dzt;
import dzv;
import efj;
import gnf;
import gxw;
import gxx;
import gxz;
import java.util.ArrayList;
import mbb;

public class TypeableAudienceView
  extends gnf
  implements TextWatcher, View.OnClickListener
{
  public TypeableAudienceView.AudienceTextView a;
  public int b;
  private int i = -1;
  private ScrollView j;
  
  public TypeableAudienceView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TypeableAudienceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TypeableAudienceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, true);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, bgl.a, paramInt, 0);
    this.i = localTypedArray.getInteger(bgl.b, -1);
    localTypedArray.recycle();
  }
  
  protected final void a()
  {
    int k = efj.wC;
    addView(LayoutInflater.from(getContext()).inflate(k, this, false));
    this.j = ((ScrollView)findViewById(aaw.ah));
    this.d = ((MultiLineLayout)findViewById(aaw.gV));
    this.d.setOnClickListener(this);
    this.a = ((TypeableAudienceView.AudienceTextView)this.d.getChildAt(0));
    this.a.setThreshold(2);
    this.a.setDropDownWidth(getResources().getDimensionPixelSize(efj.kO));
    this.a.setOnItemClickListener(new dzs(this));
    this.a.setOnKeyListener(new dzt(this));
    this.a.a = new dzv(this);
    this.a.addTextChangedListener(this);
    this.a.setImeOptions(1);
    this.b = 0;
    c();
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  protected final void b()
  {
    super.b();
    c();
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void c()
  {
    int k;
    TypeableAudienceView.AudienceTextView localAudienceTextView;
    if (this.a != null)
    {
      if ((!this.c.isEmpty()) || (this.b == 0)) {
        break label53;
      }
      k = 1;
      localAudienceTextView = this.a;
      if (k == 0) {
        break label58;
      }
    }
    label53:
    label58:
    for (String str = getResources().getString(this.b);; str = "")
    {
      localAudienceTextView.setHint(str);
      return;
      k = 0;
      break;
    }
  }
  
  protected final int d()
  {
    return -1 + this.d.getChildCount();
  }
  
  public void onClick(View paramView)
  {
    gxx localgxx = (gxx)mbb.a(getContext(), gxx.class);
    gxw localgxw = new gxw(getContext(), this.e);
    localgxw.c = gxz.cW;
    localgxx.a(localgxw);
    if (this.d.indexOfChild(paramView) < 0)
    {
      this.a.requestFocus();
      efj.j(this.a);
      return;
    }
    super.onClick(paramView);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null) {
      this.a.setAdapter(null);
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.d instanceof MultiLineLayout))
    {
      MultiLineLayout localMultiLineLayout = (MultiLineLayout)this.d;
      if ((this.i == -1) || (localMultiLineLayout.a < this.i)) {
        break label83;
      }
      this.j.getLayoutParams().height = localMultiLineLayout.a(this.i);
      this.j.scrollTo(0, localMultiLineLayout.getMeasuredHeight());
    }
    label83:
    while (this.j.getLayoutParams().height == -2) {
      return;
    }
    this.j.getLayoutParams().height = -2;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      Bundle localBundle = (Bundle)paramParcelable;
      super.onRestoreInstanceState(localBundle.getParcelable("parent_state"));
      this.a.setText(localBundle.getString("text"));
      this.a.setSelection(localBundle.getInt("selection_start"), localBundle.getInt("selection_end"));
      return;
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("parent_state", super.onSaveInstanceState());
    localBundle.putString("text", this.a.getText().toString());
    localBundle.putInt("selection_start", this.a.getSelectionStart());
    localBundle.putInt("selection_end", this.a.getSelectionEnd());
    return localBundle;
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.g = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.TypeableAudienceView
 * JD-Core Version:    0.7.0.1
 */