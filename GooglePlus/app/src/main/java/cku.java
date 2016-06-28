import android.database.Cursor;
import android.os.Handler;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.concurrent.CountDownLatch;

final class cku
  extends Filter
{
  cku(ckm paramckm) {}
  
  public final CharSequence convertResultToString(Object paramObject)
  {
    Cursor localCursor = (Cursor)paramObject;
    if ((localCursor == null) || (localCursor.isClosed())) {
      return "";
    }
    int i = localCursor.getColumnIndex("circle_name");
    if (i != -1) {
      return localCursor.getString(i);
    }
    int j = localCursor.getColumnIndex("name");
    if (j != -1) {
      return localCursor.getString(j);
    }
    int k = localCursor.getColumnIndex("address");
    if (k != -1) {
      return localCursor.getString(k);
    }
    return "";
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    CountDownLatch localCountDownLatch1 = this.a.y;
    if (localCountDownLatch1 != null) {
      localCountDownLatch1.countDown();
    }
    CountDownLatch localCountDownLatch2 = new CountDownLatch(1);
    this.a.y = localCountDownLatch2;
    this.a.x.post(new ckv(this, paramCharSequence));
    try
    {
      localCountDownLatch2.await();
      label57:
      this.a.y = null;
      return new Filter.FilterResults();
    }
    catch (InterruptedException localInterruptedException)
    {
      break label57;
    }
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramFilterResults.count = this.a.getCount();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cku
 * JD-Core Version:    0.7.0.1
 */