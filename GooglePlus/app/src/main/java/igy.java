import android.util.SparseBooleanArray;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.ui.IngestGridView;

public final class igy
  extends ihc
  implements ihx
{
  private int b = -1;
  private int c = -1;
  
  public igy(IngestActivity paramIngestActivity) {}
  
  private final int b(int paramInt)
  {
    if (paramInt != this.b)
    {
      this.b = paramInt;
      this.c = this.d.g.a(paramInt);
    }
    return this.c;
  }
  
  public final void a()
  {
    b();
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.d.f.setItemChecked(b(paramInt), paramBoolean);
  }
  
  public final boolean a(int paramInt)
  {
    return this.d.f.getCheckedItemPositions().get(b(paramInt));
  }
  
  public final void b(int paramInt, boolean paramBoolean)
  {
    if (this.d.k != null)
    {
      if (paramInt != this.c)
      {
        this.c = paramInt;
        this.b = this.d.k.a(paramInt);
      }
      super.b(this.b, paramBoolean);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igy
 * JD-Core Version:    0.7.0.1
 */