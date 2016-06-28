import android.content.res.Resources;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.ui.IngestGridView;

public final class igu
  implements AbsListView.MultiChoiceModeListener
{
  private boolean a = false;
  
  public igu(IngestActivity paramIngestActivity) {}
  
  private final void a(ActionMode paramActionMode)
  {
    int i = this.b.f.getCheckedItemCount();
    Resources localResources = this.b.getResources();
    int j = efj.Nz;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    paramActionMode.setTitle(localResources.getQuantityString(j, i, arrayOfObject));
  }
  
  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.b.onOptionsItemSelected(paramMenuItem);
  }
  
  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    paramActionMode.getMenuInflater().inflate(efj.Nx, paramMenu);
    a(paramActionMode);
    this.b.i = paramActionMode;
    this.b.m = paramMenu.findItem(efj.Np);
    this.b.a(this.b.m, this.b.l);
    return true;
  }
  
  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.b.i = null;
    this.b.m = null;
    this.b.h.sendEmptyMessage(3);
  }
  
  public final void onItemCheckedStateChanged(ActionMode paramActionMode, int paramInt, long paramLong, boolean paramBoolean)
  {
    int i = 1;
    if (this.a) {
      return;
    }
    SparseBooleanArray localSparseBooleanArray;
    int n;
    int i1;
    if (this.b.g.getItemViewType(paramInt) == i)
    {
      int k = i;
      if (k == 0) {
        break label216;
      }
      localSparseBooleanArray = this.b.f.getCheckedItemPositions();
      this.a = i;
      this.b.f.setItemChecked(paramInt, false);
      n = this.b.g.getPositionForSection(1 + this.b.g.getSectionForPosition(paramInt));
      if (n == paramInt) {
        n = this.b.g.getCount();
      }
      i1 = paramInt + 1;
      label114:
      if (i1 >= n) {
        break label232;
      }
      if (localSparseBooleanArray.get(i1)) {
        break label181;
      }
    }
    for (;;)
    {
      int i2 = paramInt + 1;
      for (;;)
      {
        if (i2 < n)
        {
          if (localSparseBooleanArray.get(i2) != i) {
            this.b.f.setItemChecked(i2, i);
          }
          i2++;
          continue;
          int m = 0;
          break;
          label181:
          i1++;
          break label114;
        }
      }
      this.b.n.b();
      this.a = false;
      for (;;)
      {
        this.b.j = paramInt;
        a(paramActionMode);
        return;
        label216:
        this.b.n.b(paramInt, paramBoolean);
      }
      label232:
      int j = 0;
    }
  }
  
  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    a(paramActionMode);
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igu
 * JD-Core Version:    0.7.0.1
 */