import android.app.Dialog;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public final class cly
  extends mby
  implements View.OnClickListener, AdapterView.OnItemClickListener, cw<Cursor>
{
  private git Z;
  private dex aa;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.ur, paramViewGroup);
    this.aa = new dex(f(), null);
    ListView localListView = (ListView)localView.findViewById(16908298);
    localListView.setOnItemClickListener(this);
    localListView.setAdapter(this.aa);
    localView.findViewById(aaw.gC).setOnClickListener(this);
    localView.findViewById(aaw.aT).setVisibility(8);
    Dialog localDialog = this.d;
    int i = aau.oY;
    localDialog.setTitle(g().getString(i));
    k().a(0, null, this);
    localView.findViewById(aaw.ez).setVisibility(0);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    }
    do
    {
      return null;
    } while (!this.Z.e());
    String str = this.m.getString("plus_one_id");
    return new dez(this.ad, this.Z.c(), str);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
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
      String str = this.Z.f().b("domain_name");
      TextView localTextView = (TextView)this.N.findViewById(aaw.cI);
      localTextView.setText(g().getString(aau.uz, new Object[] { str }));
      localTextView.setVisibility(0);
    }
  }
  
  public final void onClick(View paramView)
  {
    a(false);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.aa.a(paramInt)) {}
    Cursor localCursor;
    do
    {
      return;
      localCursor = (Cursor)this.aa.getItem(paramInt);
    } while (localCursor == null);
    String str = localCursor.getString(1);
    int i = this.Z.c();
    a(efj.b(f(), i, str, null, false));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cly
 * JD-Core Version:    0.7.0.1
 */