import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

final class crg
  implements Runnable
{
  crg(crf paramcrf) {}
  
  public final void run()
  {
    ListView localListView = (ListView)this.a.c;
    int i = localListView.getCount();
    for (int j = 0;; j++)
    {
      View localView1;
      Cursor localCursor;
      int m;
      if (j < i)
      {
        localView1 = this.a.c.getChildAt(j);
        if (localView1 == null) {
          continue;
        }
        int k = localListView.getPositionForView(localView1);
        cqm localcqm = this.a.a;
        localCursor = (Cursor)localcqm.getItem(k);
        if (cqm.b(localCursor)) {}
        switch (localcqm.e(k))
        {
        default: 
          m = 0;
        }
      }
      while (m != 0)
      {
        View localView2 = localView1.findViewById(aaw.gt);
        if (localView2 == null) {
          break;
        }
        crf localcrf = this.a;
        if (localView2 != null)
        {
          localcrf.a(localView2, false);
          localcrf.a(localView2, -localView2.getWidth(), 200L, true);
        }
        return;
        if (localCursor.getInt(24) > 0) {
          m = 1;
        } else {
          m = 0;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crg
 * JD-Core Version:    0.7.0.1
 */