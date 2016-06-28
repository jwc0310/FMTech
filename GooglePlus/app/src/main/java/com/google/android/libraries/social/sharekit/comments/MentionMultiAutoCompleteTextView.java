package com.google.android.libraries.social.sharekit.comments;

import aau;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import bk;
import efj;
import fpi;
import java.util.ArrayList;
import java.util.List;
import jio;
import jip;
import kim;
import kip;
import kir;
import kis;
import kiu;
import lxf;
import mbb;

public class MentionMultiAutoCompleteTextView
  extends MultiAutoCompleteTextView
{
  private kim a;
  public jio b;
  public boolean c;
  private boolean d;
  private boolean e;
  
  public MentionMultiAutoCompleteTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MentionMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MentionMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a(Object[] paramArrayOfObject, SpannableStringBuilder paramSpannableStringBuilder)
  {
    int i = -1 + paramArrayOfObject.length;
    if (i >= 0)
    {
      Object localObject = paramArrayOfObject[i];
      int j = paramSpannableStringBuilder.getSpanStart(localObject);
      int k = paramSpannableStringBuilder.getSpanEnd(localObject);
      int m;
      if ((localObject instanceof StyleSpan))
      {
        m = ((StyleSpan)localObject).getStyle();
        if (m == 1)
        {
          paramSpannableStringBuilder.insert(k, "*");
          paramSpannableStringBuilder.insert(j, "*");
        }
      }
      for (;;)
      {
        label72:
        paramSpannableStringBuilder.removeSpan(localObject);
        String str1;
        do
        {
          do
          {
            i--;
            break;
            if (m == 2)
            {
              paramSpannableStringBuilder.insert(k, "_");
              paramSpannableStringBuilder.insert(j, "_");
              break label72;
            }
            if (m != 3) {
              break label72;
            }
            paramSpannableStringBuilder.insert(k, "*_");
            paramSpannableStringBuilder.insert(j, "_*");
            break label72;
            if ((localObject instanceof StrikethroughSpan))
            {
              paramSpannableStringBuilder.insert(k, "-");
              paramSpannableStringBuilder.insert(j, "-");
              break label72;
            }
          } while ((localObject instanceof lxf));
          if (!(localObject instanceof URLSpan)) {
            break label72;
          }
          str1 = ((URLSpan)localObject).getURL();
          if ((str1 == null) || (!aau.a(str1))) {
            break label268;
          }
        } while ((j == 0) || (paramSpannableStringBuilder.charAt(j - 1) != '+'));
        String str2 = aau.b(str1);
        if (str2 != null)
        {
          paramSpannableStringBuilder.setSpan(new lxf(str2), j - 1, k, 0);
          paramSpannableStringBuilder.insert(k, "​");
          continue;
          label268:
          if ((str1 == null) || (!str1.startsWith("https://plus.google.com/s/%23"))) {
            paramSpannableStringBuilder.replace(j, k, str1);
          }
        }
      }
    }
    setText(paramSpannableStringBuilder);
  }
  
  public final void a(SpannableStringBuilder paramSpannableStringBuilder)
  {
    a(paramSpannableStringBuilder.getSpans(0, paramSpannableStringBuilder.length(), Object.class), paramSpannableStringBuilder);
  }
  
  public final void a(bk parambk, int paramInt, String paramString, kim paramkim)
  {
    jio localjio = ((jip)mbb.a(getContext(), jip.class)).a(getContext(), parambk.x, parambk.k(), paramInt, 1);
    localjio.a(true);
    localjio.b(true);
    localjio.a(paramString);
    a(paramkim, localjio);
    this.e = true;
  }
  
  public final void a(String paramString)
  {
    Spanned localSpanned = efj.y(paramString);
    Object[] arrayOfObject = localSpanned.getSpans(0, localSpanned.length(), Object.class);
    if (arrayOfObject == null)
    {
      setText(localSpanned.toString());
      return;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append(localSpanned);
    a(arrayOfObject, localSpannableStringBuilder);
  }
  
  public final void a(List<kip> paramList)
  {
    if (this.a == null) {
      return;
    }
    List localList = b();
    this.a.a(paramList, localList);
  }
  
  public final void a(kim paramkim, jio paramjio)
  {
    this.b = paramjio;
    this.a = paramkim;
    boolean bool;
    if ((getResources().getConfiguration().orientation == 2) && (!efj.b(efj.K(getContext()))))
    {
      bool = true;
      this.d = bool;
      if (!this.d) {
        break label110;
      }
    }
    label110:
    for (String str = " ";; str = "​")
    {
      kiu localkiu = new kiu(str);
      setAdapter(this.b);
      setTokenizer(localkiu);
      setThreshold(3);
      addTextChangedListener(new kir(this, localkiu));
      a(false);
      return;
      bool = false;
      break;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    int i = getInputType();
    if ((this.d) && (paramBoolean)) {}
    for (int j = 0x10000 | i;; j = 0xFFFEFFFF & i)
    {
      if (i != j)
      {
        setRawInputType(j);
        efj.l(this);
      }
      return;
    }
  }
  
  public final List<kip> b()
  {
    if (this.a == null) {
      return null;
    }
    Editable localEditable = getText();
    int i = localEditable.length();
    lxf[] arrayOflxf = (lxf[])localEditable.getSpans(0, localEditable.length(), lxf.class);
    ArrayList localArrayList = new ArrayList();
    fpi localfpi = new fpi();
    int j = arrayOflxf.length;
    for (int k = 0; k < j; k++)
    {
      String str1 = arrayOflxf[k].getURL().substring(lxf.a.length());
      if (!localfpi.contains(str1))
      {
        localfpi.add(str1);
        String str2 = localEditable.subSequence(localEditable.getSpanStart(arrayOflxf[k]), Math.min(i, 1 + localEditable.getSpanEnd(arrayOflxf[k]))).toString();
        if (str2.startsWith(lxf.a)) {
          str2 = str2.substring(1);
        }
        localArrayList.add(new kip(str1, str2));
      }
    }
    return localArrayList;
  }
  
  public final boolean c()
  {
    return !TextUtils.isEmpty(getText().toString().trim());
  }
  
  protected CharSequence convertSelectionToString(Object paramObject)
  {
    Cursor localCursor = (Cursor)paramObject;
    String str1 = String.valueOf(lxf.a);
    String str2 = String.valueOf(super.convertSelectionToString(paramObject));
    SpannableString localSpannableString = new SpannableString(0 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + str2);
    int i = localCursor.getColumnIndex("person_id");
    if (i != -1) {
      localSpannableString.setSpan(new lxf(localCursor.getString(i)), 0, localSpannableString.length(), 33);
    }
    return localSpannableString;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.e) && (this.b != null)) {
      this.b.f();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.e) && (this.b != null)) {
      this.b.g();
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    int i = 0;
    kis localkis = (kis)paramParcelable;
    super.onRestoreInstanceState(localkis.getSuperState());
    if (this.b != null) {
      this.b.a(localkis.a);
    }
    Editable localEditable = getEditableText();
    URLSpan[] arrayOfURLSpan = (URLSpan[])localEditable.getSpans(0, localEditable.length(), URLSpan.class);
    int j = arrayOfURLSpan.length;
    while (i < j)
    {
      URLSpan localURLSpan = arrayOfURLSpan[i];
      if (lxf.a(localURLSpan))
      {
        lxf locallxf = new lxf(localURLSpan);
        int k = localEditable.getSpanStart(localURLSpan);
        int m = localEditable.getSpanEnd(localURLSpan);
        int n = localEditable.getSpanFlags(localURLSpan);
        localEditable.removeSpan(localURLSpan);
        localEditable.setSpan(locallxf, k, m, n);
      }
      i++;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    jio localjio = this.b;
    Bundle localBundle = null;
    if (localjio != null)
    {
      localBundle = new Bundle();
      this.b.b(localBundle);
    }
    return new kis(localParcelable, localBundle);
  }
  
  protected void replaceText(CharSequence paramCharSequence)
  {
    List localList = b();
    super.replaceText(paramCharSequence);
    a(localList);
    a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView
 * JD-Core Version:    0.7.0.1
 */