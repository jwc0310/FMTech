package com.google.android.apps.plus.profile.impl;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.ui.views.autoresizetextview.AutoResizeTextView;
import com.google.android.libraries.social.ui.views.coverphotoimageview.CoverPhotoImageView;
import com.google.android.libraries.social.ui.views.linearavatarpileview.LinearAvatarPileView;
import div;
import diw;
import efj;
import ehr;
import gxn;
import gxq;
import mbb;
import pka;

public final class ProfileEditorHeaderView
  extends LinearLayout
  implements TextWatcher, View.OnClickListener
{
  public View a;
  public CoverPhotoImageView b;
  public LinearAvatarPileView c;
  public AutoResizeTextView d;
  public EditText e;
  public Button f;
  private TextView g;
  private TextView h;
  private diw i;
  
  public ProfileEditorHeaderView(Context paramContext)
  {
    super(paramContext);
  }
  
  public ProfileEditorHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ProfileEditorHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    TextView localTextView = this.g;
    if (!TextUtils.isEmpty(this.e.getText())) {}
    for (int j = 0;; j = 8)
    {
      localTextView.setVisibility(j);
      return;
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onClick(View paramView)
  {
    int j = paramView.getId();
    if (j == ehr.K) {
      this.i.v();
    }
    do
    {
      return;
      if (j == ehr.Z)
      {
        this.i.w();
        return;
      }
      if (j == ehr.J)
      {
        this.i.x();
        return;
      }
    } while (j != ehr.W);
    this.i.y();
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(ehr.I);
    this.b = ((CoverPhotoImageView)findViewById(ehr.H));
    this.b.n = true;
    this.b.a = false;
    View localView1 = findViewById(ehr.K);
    this.c = ((LinearAvatarPileView)findViewById(ehr.Z));
    this.d = ((AutoResizeTextView)findViewById(ehr.X));
    this.e = ((EditText)findViewById(ehr.ab));
    this.g = ((TextView)findViewById(ehr.ad));
    this.h = ((TextView)findViewById(ehr.ac));
    View localView2 = findViewById(ehr.J);
    this.f = ((Button)findViewById(ehr.W));
    this.e.addTextChangedListener(this);
    this.e.setOnFocusChangeListener(new div());
    efj.a(this.e, new gxq(pka.G));
    efj.a(localView1, new gxq(pka.h));
    efj.a(this.c, new gxq(pka.v));
    efj.a(localView2, new gxq(pka.s));
    efj.a(this.f, new gxq(pka.m));
    localView1.setOnClickListener(new gxn(this));
    this.c.setOnClickListener(new gxn(this));
    localView2.setOnClickListener(new gxn(this));
    this.f.setOnClickListener(new gxn(this));
    this.i = ((diw)mbb.a(getContext(), diw.class));
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getSize(paramInt1);
    this.a.getLayoutParams().height = ((int)(0.5625D * j));
    super.onMeasure(paramInt1, paramInt2);
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824)
    {
      int k = View.MeasureSpec.getSize(paramInt2);
      if (getMeasuredHeight() > k)
      {
        this.a.getLayoutParams().height = (this.a.getMeasuredHeight() - (getMeasuredHeight() - k));
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    TextView localTextView = this.h;
    Context localContext = getContext();
    int j = aw.L;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramCharSequence.length());
    arrayOfObject[1] = Integer.valueOf(140);
    localTextView.setText(localContext.getString(j, arrayOfObject));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.profile.impl.ProfileEditorHeaderView
 * JD-Core Version:    0.7.0.1
 */