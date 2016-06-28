package com.google.android.libraries.social.acl2;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.widget.SearchView;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.RelativeLayout;
import efj;
import gob;
import goc;
import god;
import goe;
import gof;
import gog;
import goh;
import mbb;

public final class AclPickerActionBarView
  extends RelativeLayout
{
  private static float c;
  public SearchView a;
  public boolean b;
  private View d;
  private View e;
  private View f;
  private View g;
  private boolean h;
  
  public AclPickerActionBarView(Context paramContext)
  {
    super(paramContext);
    if (c == 0.0F) {
      c = getContext().getResources().getDimension(efj.Ee);
    }
  }
  
  public AclPickerActionBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (c == 0.0F) {
      c = getContext().getResources().getDimension(efj.Ee);
    }
  }
  
  public AclPickerActionBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (c == 0.0F) {
      c = getContext().getResources().getDimension(efj.Ee);
    }
  }
  
  public AclPickerActionBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    if (c == 0.0F) {
      c = getContext().getResources().getDimension(efj.Ee);
    }
  }
  
  public final void a()
  {
    this.d.setVisibility(0);
    this.e.setVisibility(0);
    this.f.setVisibility(0);
    this.g.setVisibility(8);
    this.a.setVisibility(8);
    efj.k(this.a);
    this.b = false;
    goh localgoh = (goh)mbb.b(getContext()).b(goh.class);
    if (localgoh != null) {
      localgoh.d();
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.d.setVisibility(8);
    this.e.setVisibility(8);
    this.f.setVisibility(8);
    this.g.setVisibility(0);
    this.a.setVisibility(0);
    this.a.a(paramCharSequence, false);
    this.a.requestFocus();
    this.a.postDelayed(new gog(this), 50L);
    this.b = true;
    goh localgoh = (goh)mbb.b(getContext()).b(goh.class);
    if (localgoh != null) {
      localgoh.c();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e.setClickable(paramBoolean);
    this.e.setEnabled(paramBoolean);
    ViewPropertyAnimator localViewPropertyAnimator = this.e.animate();
    if (paramBoolean) {}
    for (float f1 = 1.0F;; f1 = 0.35F)
    {
      localViewPropertyAnimator.alpha(f1);
      return;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    if (this.h == paramBoolean1) {
      return;
    }
    this.h = paramBoolean1;
    float f1;
    int j;
    if (paramBoolean1)
    {
      f1 = 0.0F;
      if (Build.VERSION.SDK_INT < 17) {
        break label99;
      }
      j = i;
      label34:
      if ((j == 0) || (getLayoutDirection() != i)) {
        break label105;
      }
    }
    for (;;)
    {
      if (i != 0) {
        f1 = -f1;
      }
      if (!paramBoolean2) {
        break label110;
      }
      this.f.animate().translationX(f1).start();
      this.e.animate().translationX(f1).start();
      return;
      f1 = c;
      break;
      label99:
      j = 0;
      break label34;
      label105:
      i = 0;
    }
    label110:
    this.f.setTranslationX(f1);
    this.e.setTranslationX(f1);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = findViewById(aau.xL);
    this.d.setOnClickListener(new gob(this));
    this.e = findViewById(aau.xR);
    a(false);
    this.e.setOnClickListener(new goc(this));
    this.h = true;
    this.f = findViewById(aau.xS);
    this.f.setOnClickListener(new god(this));
    this.g = findViewById(aau.xQ);
    this.g.setOnClickListener(new goe(this));
    this.a = ((SearchView)findViewById(aau.xT));
    this.a.a(false);
    EditText localEditText = (EditText)this.a.findViewById(aau.xW);
    localEditText.setTextAppearance(getContext(), aau.xY);
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(200);
    localEditText.setFilters(arrayOfInputFilter);
    localEditText.addTextChangedListener(new gof(this, localEditText));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.acl2.AclPickerActionBarView
 * JD-Core Version:    0.7.0.1
 */