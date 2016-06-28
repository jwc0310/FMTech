import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class int
  extends mby
  implements AdapterView.OnItemClickListener
{
  LayoutInflater Z;
  private List<inu> aa = new ArrayList();
  private ikz ab;
  
  public int()
  {
    a(0, aaw.oR);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = this.Z.inflate(efj.OM, paramViewGroup, false);
    ListView localListView = (ListView)localView.findViewById(16908298);
    localListView.setAdapter(new inv(this, this.aa));
    localListView.setOnItemClickListener(this);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    String str = this.m.getString("account_name");
    giz localgiz = (giz)mbb.a(f(), giz.class);
    gjb localgjb1 = localgiz.a(localgiz.a(str));
    for (int i = 0; i < localgjb1.a("page_count", 0); i++)
    {
      gjb localgjb2 = localgjb1.d("page").d(Integer.toString(i));
      inu localinu = new inu(this);
      localinu.a = localgjb2.b("gaia_id");
      localinu.b = localgjb2.b("display_name");
      localinu.c = localgjb2.b("avatar_url");
      this.aa.add(localinu);
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Dialog localDialog = super.c(paramBundle);
    localDialog.setTitle(do.e);
    return localDialog;
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = LayoutInflater.from(new ContextThemeWrapper(f(), this.a));
    this.ab = ((ikz)this.ae.a(ikz.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    super.onCancel(paramDialogInterface);
    this.ab.e();
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    inu localinu = (inu)this.aa.get(paramInt);
    String str1 = this.m.getString("account_name");
    String str2 = localinu.a;
    this.ab.a(str1, str2);
    a(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     int
 * JD-Core Version:    0.7.0.1
 */