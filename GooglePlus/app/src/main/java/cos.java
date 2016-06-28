import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;

public abstract class cos
  implements View.OnClickListener, Animation.AnimationListener, cop, mew, mfd
{
  private cow a;
  private boolean b;
  private View c;
  private boolean d = false;
  public int f;
  public Context g;
  
  public cos(Context paramContext, int paramInt, cow paramcow)
  {
    this.b = true;
    this.g = paramContext;
    this.f = paramInt;
    this.a = paramcow;
    if (paramcow.i_() == null) {
      throw new IllegalStateException("Promo host must provide a non-null lifecycle.");
    }
    this.a.i_().a(this);
  }
  
  public cos(Context paramContext, int paramInt, cow paramcow, boolean paramBoolean)
  {
    this.b = false;
    this.g = paramContext;
    this.f = paramInt;
    this.a = paramcow;
  }
  
  protected static void a(Context paramContext, int paramInt1, coq paramcoq, int paramInt2, String paramString)
  {
    switch (cov.a[(paramInt2 - 1)])
    {
    default: 
      return;
    case 1: 
      String str = bgp.a(paramContext, paramInt1, paramcoq).a().toString();
      ((giz)mbb.a(paramContext, giz.class)).b(paramInt1).f("promo_stats").b(Integer.toString(paramcoq.h), str).d();
      return;
    }
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    bux localbux = new bux(localSharedPreferences.getString(paramString, ""));
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localbux.a();
    localEditor.putString(paramString, localbux.toString());
    localEditor.commit();
  }
  
  protected static void a(View paramView, String paramString)
  {
    if (paramString != null)
    {
      View localView = paramView.findViewById(aaw.id);
      if ((localView instanceof TextView)) {
        ((TextView)localView).setText(paramString);
      }
    }
  }
  
  protected static void b(View paramView, String paramString)
  {
    if (paramString != null)
    {
      View localView = paramView.findViewById(aaw.ic);
      if ((localView instanceof TextView)) {
        ((TextView)localView).setText(paramString);
      }
    }
  }
  
  private void k()
  {
    if (!this.d) {
      return;
    }
    this.d = false;
    this.c.setVisibility(8);
    this.c = null;
    this.a.C();
    this.g.getContentResolver().notifyChange(cop.e, null);
  }
  
  protected abstract void a(View paramView);
  
  protected final void a(View paramView, int paramInt, Object... paramVarArgs)
  {
    TextView localTextView = (TextView)paramView.findViewById(aaw.fn);
    String str = this.g.getString(paramInt, paramVarArgs);
    if (efj.aaz == null) {
      efj.aaz = new lwi();
    }
    Spannable localSpannable = (Spannable)Html.fromHtml(str, null, efj.aaz);
    for (URLSpan localURLSpan : (URLSpan[])((URLSpan[])localSpannable.getSpans(0, localSpannable.length(), URLSpan.class)).clone())
    {
      int k = localSpannable.getSpanStart(localURLSpan);
      int m = localSpannable.getSpanEnd(localURLSpan);
      localSpannable.removeSpan(localURLSpan);
      localSpannable.setSpan(new cot(this, localURLSpan.getURL()), k, m, 0);
    }
    localTextView.setText(localSpannable);
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
  }
  
  public boolean a(ojj paramojj)
  {
    int i = i();
    if (((i == cor.a) && (this.f == -1)) || ((i == cor.b) && (this.f != -1))) {
      return false;
    }
    bux localbux;
    switch (cov.a[(i - 1)])
    {
    default: 
      localbux = null;
    }
    while ((localbux != null) && (localbux.a == 0L))
    {
      return true;
      localbux = bgp.a(this.g, this.f, e());
      continue;
      localbux = new bux(PreferenceManager.getDefaultSharedPreferences(this.g).getString(j(), ""));
    }
  }
  
  public final void c()
  {
    if (this.d) {
      k();
    }
  }
  
  public void f()
  {
    a(this.g, this.f, e(), i(), j());
    if ((this.c == null) || (this.d)) {
      return;
    }
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(250L);
    localAlphaAnimation.setInterpolator(new AccelerateInterpolator(1.0F));
    localAlphaAnimation.setAnimationListener(this);
    this.c.startAnimation(localAlphaAnimation);
    this.d = true;
  }
  
  public final void g()
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(300L);
    localAlphaAnimation.setInterpolator(new DecelerateInterpolator(1.0F));
    this.c.startAnimation(localAlphaAnimation);
  }
  
  public final View h()
  {
    LayoutInflater localLayoutInflater;
    if (this.c == null)
    {
      localLayoutInflater = LayoutInflater.from(this.g);
      if (!this.b) {
        break label115;
      }
      this.c = localLayoutInflater.inflate(efj.wx, null, false);
      FrameLayout localFrameLayout = (FrameLayout)this.c.findViewById(aaw.ib);
      localLayoutInflater.inflate(d(), localFrameLayout, true);
    }
    for (;;)
    {
      a(this.c);
      View localView1 = this.c.findViewById(aaw.ic);
      if (localView1 != null) {
        localView1.setOnClickListener(this);
      }
      View localView2 = this.c.findViewById(aaw.id);
      if (localView2 != null) {
        localView2.setOnClickListener(this);
      }
      return this.c;
      label115:
      this.c = localLayoutInflater.inflate(d(), null, false);
    }
  }
  
  public int i()
  {
    return cor.a;
  }
  
  public String j()
  {
    if (i() == cor.b) {
      throw new IllegalStateException("SignedOut Promos must define a shared pref keys");
    }
    return null;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    k();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == aaw.ic) {
      a();
    }
    while (paramView.getId() != aaw.id) {
      return;
    }
    b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cos
 * JD-Core Version:    0.7.0.1
 */