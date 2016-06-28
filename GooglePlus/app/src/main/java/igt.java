import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.ui.IngestGridView;

public final class igt
  implements AdapterView.OnItemClickListener
{
  public igt(IngestActivity paramIngestActivity) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.j = paramInt;
    IngestGridView localIngestGridView = this.a.f;
    if (!this.a.f.getCheckedItemPositions().get(paramInt)) {}
    for (boolean bool = true;; bool = false)
    {
      localIngestGridView.setItemChecked(paramInt, bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igt
 * JD-Core Version:    0.7.0.1
 */