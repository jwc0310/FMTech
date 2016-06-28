import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.util.ArrayList;

public final class dct
  extends bj
  implements AdapterView.OnItemClickListener
{
  public static dct a(ArrayList<btc> paramArrayList)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelableArrayList("manual_awesome_types", paramArrayList);
    dct localdct = new dct();
    localdct.f(localBundle);
    return localdct;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    ArrayList localArrayList = this.m.getParcelableArrayList("manual_awesome_types");
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    localBuilder.setTitle(aau.fd);
    ListView localListView = (ListView)f().getLayoutInflater().inflate(efj.uD, null);
    localListView.setAdapter(new dcv(f(), localArrayList));
    localListView.setOnItemClickListener(this);
    localBuilder.setView(localListView);
    return localBuilder.create();
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if ((f() instanceof dcu)) {
      ((dcu)f()).d();
    }
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((f() instanceof dcu)) {
      ((dcu)f()).a(paramView.getId());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dct
 * JD-Core Version:    0.7.0.1
 */