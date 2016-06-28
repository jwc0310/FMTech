import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public final class jvj
  extends mca
{
  private jvk a;
  private jvl b;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Tq, paramViewGroup, false);
    ListView localListView = (ListView)localView.findViewById(ehr.dR);
    localListView.setChoiceMode(1);
    localListView.setAdapter(this.a);
    localListView.setOnItemClickListener(this.b);
    localListView.setEmptyView(localView.findViewById(ehr.dr));
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    if (localBundle == null) {
      return;
    }
    ArrayList localArrayList = localBundle.getParcelableArrayList("poll_option_voters");
    if (localArrayList == null) {
      localArrayList = new ArrayList();
    }
    this.a = new jvk(f(), localArrayList);
    this.b = new jvl(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvj
 * JD-Core Version:    0.7.0.1
 */