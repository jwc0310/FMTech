import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class cud
  implements mbo, mfd
{
  final Context a;
  Intent b;
  Activity c;
  private git d;
  private ctu e;
  private iwu f;
  private iwj g;
  private iwv h;
  private final ArrayList<cua> i;
  private giz j;
  
  cud(Context paramContext, mek parammek, ArrayList<cua> paramArrayList)
  {
    this.i = paramArrayList;
    this.a = paramContext;
    parammek.a(this);
  }
  
  public final void a(int paramInt, View paramView, boolean paramBoolean)
  {
    TextView localTextView = (TextView)paramView;
    cua localcua = (cua)this.i.get(paramInt);
    localTextView.setText(localTextView.getContext().getString(localcua.c));
    int k;
    if (localcua.b != 0)
    {
      k = localcua.b;
      if (Build.VERSION.SDK_INT < 17) {
        break label105;
      }
      localTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(k, 0, 0, 0);
    }
    for (;;)
    {
      efj.a(localTextView, new gxq(localcua.d));
      this.h.a(paramView, paramBoolean);
      return;
      label105:
      localTextView.setCompoundDrawablesWithIntrinsicBounds(k, 0, 0, 0);
    }
  }
  
  public final void a(Activity paramActivity, Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof cua))
    {
      this.g.e();
      this.c = paramActivity;
      this.b = null;
    }
    switch (((cua)paramParcelable).a)
    {
    default: 
      Log.e("NavItemProvMixin", "Null Click Intent ");
      return;
    case 5: 
      this.b = this.f.a(this.a, this.d.c());
      return;
    case 9: 
      this.b = this.f.a(this.a, this.d.c(), this.d.f().b("gaia_id"));
      return;
    case 6: 
      this.b = this.f.d(this.a, this.d.c());
      return;
    case 7: 
      this.b = this.f.e(this.a, this.d.c());
      return;
    }
    this.b = this.f.f(this.a, this.d.c());
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((git)parammbb.a(git.class));
    this.e = ((ctu)parammbb.a(ctu.class));
    this.f = ((iwu)parammbb.a(iwu.class));
    this.h = ((iwv)parammbb.a(iwv.class));
    this.j = ((giz)parammbb.a(giz.class));
    this.g = ((iwj)parammbb.a(iwj.class));
    iwj localiwj = this.g;
    cue localcue = new cue(this);
    iwi localiwi = localiwj.p;
    if (!localiwi.a.contains(localcue)) {
      localiwi.a.add(localcue);
    }
  }
  
  public final boolean a()
  {
    return (this.j.c(this.d.c())) && (this.d.f().c("is_google_plus"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cud
 * JD-Core Version:    0.7.0.1
 */