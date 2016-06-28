import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public final class cjt
  extends mby
  implements View.OnClickListener
{
  private git Z;
  private cju aa;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.ur, paramViewGroup);
    Bundle localBundle = this.m;
    ListView localListView = (ListView)localView.findViewById(16908298);
    gnb localgnb = (gnb)localBundle.getParcelable("audience");
    this.aa = new cju(f(), localgnb, this.Z);
    localListView.setAdapter(this.aa);
    localView.findViewById(aaw.gC).setOnClickListener(this);
    localView.findViewById(aaw.aT).setVisibility(8);
    String str = localBundle.getString("people_list_title");
    if (!TextUtils.isEmpty(str))
    {
      TextView localTextView = (TextView)localView.findViewById(aaw.eE);
      localTextView.setText(str);
      localTextView.setVisibility(0);
    }
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a(1, 0);
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((git)this.ae.a(git.class));
  }
  
  public final void m()
  {
    super.m();
    if (this.m.getBoolean("restrict_to_domain", false))
    {
      TextView localTextView = (TextView)this.N.findViewById(aaw.cI);
      Resources localResources = g();
      int i = aau.uz;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.Z.f().b("domain_name");
      localTextView.setText(localResources.getString(i, arrayOfObject));
      localTextView.setVisibility(0);
    }
  }
  
  public final void onClick(View paramView)
  {
    a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjt
 * JD-Core Version:    0.7.0.1
 */