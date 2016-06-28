package android.support.v7.widget;

import aau;
import ack;
import aeu;
import agz;
import aha;
import ahb;
import ahc;
import ahd;
import ahe;
import ahf;
import ahg;
import ahh;
import ahi;
import ahj;
import ahk;
import ahl;
import ahm;
import ahn;
import aia;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import efj;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import wb;
import zw;

public class SearchView
  extends aeu
  implements ack
{
  public static final ahl l;
  private static final boolean m;
  private CharSequence A;
  private CharSequence B;
  private boolean C;
  private int D;
  private Runnable E = new agz(this);
  private final Runnable F = new ahd(this);
  private Runnable G = new ahe(this);
  private final View.OnClickListener H;
  private View.OnKeyListener I;
  private final TextView.OnEditorActionListener J;
  private final AdapterView.OnItemClickListener K;
  private final AdapterView.OnItemSelectedListener L;
  private TextWatcher M;
  public final SearchView.SearchAutoComplete a;
  public final ImageView b;
  public final ImageView c;
  public final ImageView d;
  public final ImageView e;
  public ahn f;
  public ahm j;
  public CharSequence k;
  private final View n;
  private final View o;
  private final View p;
  private final View q;
  private final ImageView r;
  private final Drawable s;
  private final Intent t;
  private final Intent u;
  private final CharSequence v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 8) {}
    for (boolean bool = true;; bool = false)
    {
      m = bool;
      l = new ahl();
      return;
    }
  }
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, aau.aa);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    new WeakHashMap();
    this.H = new ahi(this);
    this.I = new ahj(this);
    this.J = new ahk(this);
    this.K = new aha(this);
    this.L = new ahb(this);
    this.M = new ahc(this);
    zw localzw = zw.a(paramContext, paramAttributeSet, wb.aW, paramInt, 0);
    localzw.a();
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    int i = wb.bg;
    int i1 = efj.bf;
    localLayoutInflater.inflate(localzw.a.getResourceId(i, i1), this, true);
    this.a = ((SearchView.SearchAutoComplete)findViewById(efj.aE));
    this.a.a = this;
    this.n = findViewById(efj.aA);
    this.o = findViewById(efj.aD);
    this.p = findViewById(efj.aI);
    this.b = ((ImageView)findViewById(efj.ay));
    this.c = ((ImageView)findViewById(efj.aB));
    this.d = ((ImageView)findViewById(efj.az));
    this.e = ((ImageView)findViewById(efj.aF));
    this.r = ((ImageView)findViewById(efj.aC));
    this.o.setBackgroundDrawable(localzw.a(wb.bh));
    this.p.setBackgroundDrawable(localzw.a(wb.bl));
    this.b.setImageDrawable(localzw.a(wb.bk));
    this.c.setImageDrawable(localzw.a(wb.be));
    this.d.setImageDrawable(localzw.a(wb.bb));
    this.e.setImageDrawable(localzw.a(wb.bn));
    this.r.setImageDrawable(localzw.a(wb.bk));
    this.s = localzw.a(wb.bj);
    int i2 = wb.bm;
    int i3 = efj.be;
    localzw.a.getResourceId(i2, i3);
    int i4 = wb.bc;
    localzw.a.getResourceId(i4, 0);
    this.b.setOnClickListener(this.H);
    this.d.setOnClickListener(this.H);
    this.c.setOnClickListener(this.H);
    this.e.setOnClickListener(this.H);
    this.a.setOnClickListener(this.H);
    this.a.addTextChangedListener(this.M);
    this.a.setOnEditorActionListener(this.J);
    this.a.setOnItemClickListener(this.K);
    this.a.setOnItemSelectedListener(this.L);
    this.a.setOnKeyListener(this.I);
    this.a.setOnFocusChangeListener(new ahf(this));
    int i5 = wb.bf;
    a(localzw.a.getBoolean(i5, true));
    int i6 = wb.ba;
    int i7 = localzw.a.getDimensionPixelSize(i6, -1);
    if (i7 != -1)
    {
      this.z = i7;
      requestLayout();
    }
    int i8 = wb.bd;
    this.v = localzw.a.getText(i8);
    int i9 = wb.bi;
    this.k = localzw.a.getText(i9);
    int i10 = wb.aY;
    int i11 = localzw.a.getInt(i10, -1);
    if (i11 != -1) {
      this.a.setImeOptions(i11);
    }
    int i12 = wb.aZ;
    int i13 = localzw.a.getInt(i12, -1);
    if (i13 != -1) {
      this.a.setInputType(i13);
    }
    int i14 = wb.aX;
    setFocusable(localzw.a.getBoolean(i14, true));
    localzw.a.recycle();
    this.t = new Intent("android.speech.action.WEB_SEARCH");
    this.t.addFlags(268435456);
    this.t.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.u = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.u.addFlags(268435456);
    this.q = findViewById(this.a.getDropDownAnchor());
    if (this.q != null)
    {
      if (Build.VERSION.SDK_INT < 11) {
        break label892;
      }
      this.q.addOnLayoutChangeListener(new ahg(this));
    }
    for (;;)
    {
      c(this.w);
      d();
      return;
      label892:
      this.q.getViewTreeObserver().addOnGlobalLayoutListener(new ahh(this));
    }
  }
  
  static boolean a(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }
  
  private final void c(boolean paramBoolean)
  {
    this.x = paramBoolean;
    int i;
    int i1;
    label26:
    View localView;
    if (paramBoolean)
    {
      i = 0;
      if (TextUtils.isEmpty(this.a.getText())) {
        break label123;
      }
      i1 = 1;
      this.b.setVisibility(i);
      this.c.setVisibility(8);
      localView = this.n;
      if (!paramBoolean) {
        break label128;
      }
    }
    label128:
    for (int i2 = 8;; i2 = 0)
    {
      localView.setVisibility(i2);
      ImageView localImageView = this.r;
      boolean bool = this.w;
      int i3 = 0;
      if (bool) {
        i3 = 8;
      }
      localImageView.setVisibility(i3);
      i();
      if (i1 == 0) {}
      this.e.setVisibility(8);
      h();
      return;
      i = 8;
      break;
      label123:
      i1 = 0;
      break label26;
    }
  }
  
  private final void h()
  {
    this.p.setVisibility(8);
  }
  
  private final void i()
  {
    int i = 1;
    int i1;
    label35:
    int i2;
    label47:
    Drawable localDrawable;
    if (!TextUtils.isEmpty(this.a.getText()))
    {
      i1 = i;
      if ((i1 == 0) && ((!this.w) || (this.C))) {
        break label90;
      }
      ImageView localImageView = this.d;
      i2 = 0;
      if (i == 0) {
        break label95;
      }
      localImageView.setVisibility(i2);
      localDrawable = this.d.getDrawable();
      if (localDrawable != null) {
        if (i1 == 0) {
          break label102;
        }
      }
    }
    label90:
    label95:
    label102:
    for (int[] arrayOfInt = ENABLED_STATE_SET;; arrayOfInt = EMPTY_STATE_SET)
    {
      localDrawable.setState(arrayOfInt);
      return;
      i1 = 0;
      break;
      i = 0;
      break label35;
      i2 = 8;
      break label47;
    }
  }
  
  private final void j()
  {
    c(false);
    this.a.requestFocus();
    b(true);
  }
  
  public final Intent a(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      str1 = aia.a(paramCursor, paramCursor.getColumnIndex("suggest_intent_action"));
      if ((str1 != null) || (Build.VERSION.SDK_INT < 8)) {
        break label229;
      }
      str1 = null.getSuggestIntentAction();
    }
    catch (RuntimeException localRuntimeException1)
    {
      for (;;)
      {
        String str1;
        String str2;
        Object localObject;
        try
        {
          String str3;
          int i1 = paramCursor.getPosition();
          i = i1;
        }
        catch (RuntimeException localRuntimeException2)
        {
          int i = -1;
          continue;
        }
        new StringBuilder("Search suggestions cursor at row ").append(i).append(" returned exception.");
        return null;
        label229:
        if (str1 == null)
        {
          str1 = "android.intent.action.SEARCH";
          continue;
          label242:
          if (str2 == null) {
            localObject = null;
          }
        }
      }
    }
    str2 = aia.a(paramCursor, paramCursor.getColumnIndex("suggest_intent_data"));
    if ((m) && (str2 == null)) {
      str2 = null.getSuggestIntentData();
    }
    if (str2 != null)
    {
      str3 = aia.a(paramCursor, paramCursor.getColumnIndex("suggest_intent_data_id"));
      if (str3 != null)
      {
        str2 = str2 + "/" + Uri.encode(str3);
        break label242;
        for (;;)
        {
          String str4 = aia.a(paramCursor, paramCursor.getColumnIndex("suggest_intent_query"));
          return a(str1, (Uri)localObject, aia.a(paramCursor, paramCursor.getColumnIndex("suggest_intent_extra_data")), str4, paramInt, paramString);
          Uri localUri = Uri.parse(str2);
          localObject = localUri;
        }
      }
    }
  }
  
  final Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    Intent localIntent = new Intent(paramString1);
    localIntent.addFlags(268435456);
    if (paramUri != null) {
      localIntent.setData(paramUri);
    }
    localIntent.putExtra("user_query", this.B);
    if (paramString3 != null) {
      localIntent.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      localIntent.putExtra("intent_extra_data_key", paramString2);
    }
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      localIntent.putExtra("action_msg", paramString4);
    }
    if (m) {
      localIntent.setComponent(null.getSearchActivity());
    }
    return localIntent;
  }
  
  public final void a()
  {
    if (this.C) {
      return;
    }
    this.C = true;
    this.D = this.a.getImeOptions();
    this.a.setImeOptions(0x2000000 | this.D);
    this.a.setText("");
    j();
  }
  
  public final void a(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      getContext().startActivity(paramIntent);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("SearchView", "Failed launch activity: " + paramIntent, localRuntimeException);
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.a.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.a;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i = 0;; i = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i);
      return;
    }
  }
  
  public final void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.a.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      this.a.setSelection(this.a.length());
      this.B = paramCharSequence;
    }
    if ((paramBoolean) && (!TextUtils.isEmpty(paramCharSequence))) {
      e();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.w == paramBoolean) {
      return;
    }
    this.w = paramBoolean;
    c(paramBoolean);
    d();
  }
  
  public final void b()
  {
    a("", false);
    clearFocus();
    c(true);
    this.a.setImeOptions(this.D);
    this.C = false;
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      post(this.E);
    }
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.E);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }
  
  public void clearFocus()
  {
    this.y = true;
    b(false);
    super.clearFocus();
    this.a.clearFocus();
    this.y = false;
  }
  
  public final void d()
  {
    Object localObject;
    SearchView.SearchAutoComplete localSearchAutoComplete;
    if (this.k != null)
    {
      localObject = this.k;
      localSearchAutoComplete = this.a;
      if (localObject == null) {
        localObject = "";
      }
      if ((this.w) && (this.s != null)) {
        break label53;
      }
    }
    for (;;)
    {
      localSearchAutoComplete.setHint((CharSequence)localObject);
      return;
      localObject = this.v;
      break;
      label53:
      int i = (int)(1.25D * this.a.getTextSize());
      this.s.setBounds(0, 0, i, i);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
      localSpannableStringBuilder.setSpan(new ImageSpan(this.s), 1, 2, 33);
      localSpannableStringBuilder.append((CharSequence)localObject);
      localObject = localSpannableStringBuilder;
    }
  }
  
  public final void e()
  {
    Editable localEditable = this.a.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0))
    {
      if (this.f != null) {
        this.f.a(localEditable.toString());
      }
    }
    else {
      return;
    }
    b(false);
    this.a.dismissDropDown();
  }
  
  final void f()
  {
    c(this.x);
    post(this.F);
    if (this.a.hasFocus()) {
      g();
    }
  }
  
  public final void g()
  {
    ahl localahl1 = l;
    SearchView.SearchAutoComplete localSearchAutoComplete1 = this.a;
    if (localahl1.a != null) {}
    try
    {
      localahl1.a.invoke(localSearchAutoComplete1, new Object[0]);
      label29:
      ahl localahl2 = l;
      SearchView.SearchAutoComplete localSearchAutoComplete2 = this.a;
      if (localahl2.b != null) {}
      try
      {
        localahl2.b.invoke(localSearchAutoComplete2, new Object[0]);
        return;
      }
      catch (Exception localException1) {}
    }
    catch (Exception localException2)
    {
      break label29;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.F);
    post(this.G);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.x)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    switch (i)
    {
    }
    for (;;)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), paramInt2);
      return;
      if (this.z > 0)
      {
        i1 = Math.min(this.z, i1);
      }
      else
      {
        i1 = Math.min(getContext().getResources().getDimensionPixelSize(efj.p), i1);
        continue;
        if (this.z > 0)
        {
          i1 = Math.min(this.z, i1);
          continue;
          if (this.z > 0) {
            i1 = this.z;
          } else {
            i1 = getContext().getResources().getDimensionPixelSize(efj.p);
          }
        }
      }
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    post(this.F);
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.y) {}
    while (!isFocusable()) {
      return false;
    }
    if (!this.x)
    {
      boolean bool = this.a.requestFocus(paramInt, paramRect);
      if (bool) {
        c(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.7.0.1
 */