import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

public final class cmc
  extends mby
  implements View.OnClickListener, AdapterView.OnItemClickListener, cw<List<onj>>
{
  private git Z;
  private cmd aa;
  private ListView ab;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.ur, paramViewGroup);
    this.aa = new cmd(f());
    this.ab = ((ListView)localView.findViewById(16908298));
    this.ab.setOnItemClickListener(this);
    this.ab.setAdapter(this.aa);
    localView.findViewById(aaw.gC).setOnClickListener(this);
    localView.findViewById(aaw.aT).setVisibility(8);
    TextView localTextView = (TextView)localView.findViewById(aaw.eE);
    int i = aau.fN;
    localTextView.setText(g().getString(i));
    localTextView.setVisibility(0);
    k().a(0, null, this);
    localView.findViewById(aaw.ez).setVisibility(0);
    return localView;
  }
  
  public final fu<List<onj>> a(int paramInt, Bundle paramBundle)
  {
    if ((paramInt != 0) || (!this.Z.e())) {
      return null;
    }
    String str = this.m.getString("activity_id");
    return new cme(this.ad, this.Z.c(), str);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a(1, 0);
  }
  
  public final void a(fu<List<onj>> paramfu) {}
  
  public final void d_()
  {
    super.d_();
    if (this.ab != null) {
      this.ab.setOnItemClickListener(null);
    }
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((git)this.ae.a(git.class));
  }
  
  public final void onClick(View paramView)
  {
    a(false);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    onj localonj = (onj)this.aa.getItem(paramInt);
    if (localonj == null) {
      return;
    }
    int i = this.Z.c();
    mbf localmbf = this.ad;
    String str1 = String.valueOf(localonj.a.b);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      a(efj.b(localmbf, i, str2, null, false));
      return;
    }
  }
  
  public final void p_()
  {
    super.p_();
    WindowManager.LayoutParams localLayoutParams = this.d.getWindow().getAttributes();
    int i = (int)TypedValue.applyDimension(1, 64.0F, g().getDisplayMetrics());
    localLayoutParams.height = (f().getWindowManager().getDefaultDisplay().getHeight() - i);
    this.d.getWindow().setAttributes(localLayoutParams);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmc
 * JD-Core Version:    0.7.0.1
 */