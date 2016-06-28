import android.database.DataSetObserver;
import com.google.android.libraries.social.ingest.IngestActivity;

public final class igv
  extends DataSetObserver
{
  public igv(IngestActivity paramIngestActivity) {}
  
  public final void onChanged()
  {
    if (this.a.k != null) {
      this.a.k.d();
    }
  }
  
  public final void onInvalidated()
  {
    if (this.a.k != null) {
      this.a.k.d();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igv
 * JD-Core Version:    0.7.0.1
 */