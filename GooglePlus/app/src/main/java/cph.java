import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public final class cph
  extends mby
  implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener
{
  git Z;
  ContextThemeWrapper aa;
  private ArrayList<cpj> ab = new ArrayList();
  
  public static cph a(int paramInt)
  {
    cph localcph = new cph();
    Bundle localBundle = new Bundle();
    localBundle.putInt("title_res_id", paramInt);
    localBundle.putBoolean("has_public_circle", true);
    localcph.f(localBundle);
    return localcph;
  }
  
  public static cph a(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    cph localcph = new cph();
    Bundle localBundle = new Bundle();
    localBundle.putString("domain_name", paramString1);
    localBundle.putString("domain_id", paramString2);
    localBundle.putBoolean("has_public_circle", paramBoolean);
    localBundle.putInt("title_res_id", paramInt);
    localcph.f(localBundle);
    return localcph;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.aa = new ContextThemeWrapper(paramActivity, efj.yV);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    String str1 = localBundle.getString("domain_name");
    String str2 = localBundle.getString("domain_id");
    boolean bool = localBundle.getBoolean("has_public_circle");
    int i = localBundle.getInt("title_res_id");
    View localView = LayoutInflater.from(this.aa).inflate(efj.wr, null);
    ArrayList localArrayList1 = this.ab;
    int j = aau.br;
    localArrayList1.add(new cpj("1f", 7, g().getString(j)));
    if (str1 != null) {
      this.ab.add(new cpj(str2, 8, str1));
    }
    if (bool)
    {
      ArrayList localArrayList5 = this.ab;
      int i1 = aau.bu;
      localArrayList5.add(new cpj("0", 9, g().getString(i1)));
    }
    ArrayList localArrayList2 = this.ab;
    int k = aau.bz;
    localArrayList2.add(new cpj("1c", 5, g().getString(k)));
    ArrayList localArrayList3 = this.ab;
    int m = aau.bs;
    localArrayList3.add(new cpj("v.private", 101, g().getString(m)));
    ArrayList localArrayList4 = this.ab;
    int n = aau.pj;
    localArrayList4.add(new cpj("v.custom", -1, g().getString(n)));
    ListView localListView = (ListView)localView.findViewById(aaw.ew);
    localListView.setDivider(null);
    localListView.setOnItemClickListener(this);
    localListView.setAdapter(new cpi(this, this.aa, 0, this.ab));
    ((TextView)localView.findViewById(aaw.lL)).setText(i);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.aa);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(true);
    localBuilder.setView(localView);
    return localBuilder.create();
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((git)this.ae.a(git.class));
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    paramDialogInterface.dismiss();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    paramDialogInterface.dismiss();
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    bk localbk = this.n;
    cpj localcpj;
    cpk localcpk;
    int i;
    if ((localbk instanceof cpk))
    {
      localcpj = (cpj)paramView.getTag();
      if (localcpj != null)
      {
        localcpk = (cpk)localbk;
        i = localcpj.b;
        if (i != -1) {
          break label63;
        }
        localcpk.I();
      }
    }
    for (;;)
    {
      this.d.dismiss();
      return;
      label63:
      localcpk.b(localcpj.a, i, localcpj.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cph
 * JD-Core Version:    0.7.0.1
 */