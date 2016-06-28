import android.database.DataSetObserver;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.Scroller;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;

public final class lpy
  extends DataSetObserver
{
  public lpy(StreamGridView paramStreamGridView) {}
  
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("StreamGridView", 4)) {
      new StringBuilder(99).append("SGDSO.onChanged destroyLayoutRecords=").append(paramBoolean).append(", invalidateFrom=").append(paramInt1).append(", restorePosition=").append(paramInt2);
    }
    this.a.i = this.a.b.getCount();
    if (this.a.i > 0) {
      this.a.i += this.a.a.a;
    }
    StreamGridView localStreamGridView = this.a;
    localStreamGridView.i = (1 + localStreamGridView.i);
    if ((paramInt2 != -1) && (!paramBoolean) && (paramInt2 < this.a.i))
    {
      StreamGridView.a(this.a);
      this.a.f = true;
      this.a.a(paramInt2, 0);
      this.a.d.a.abortAnimation();
      this.a.requestLayout();
      return;
    }
    this.a.f = (paramBoolean | this.a.f);
    if (paramBoolean) {
      if (paramInt1 <= 0)
      {
        StreamGridView.a(this.a);
        this.a.g = 0;
        this.a.b();
        StreamGridView.b(this.a);
        this.a.t.c();
        this.a.a(this.a.n, this.a.o);
      }
    }
    for (;;)
    {
      if (this.a.f) {
        this.a.d.a.abortAnimation();
      }
      this.a.requestLayout();
      return;
      this.a.e = true;
      int i = this.a.a.a;
      for (int j = 0; j < i; j++) {
        this.a.k[j] = this.a.j[j];
      }
      StreamGridView.c(this.a);
      this.a.e = false;
      continue;
      StreamGridView.a(this.a);
    }
  }
  
  public final void onChanged() {}
  
  public final void onInvalidated() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpy
 * JD-Core Version:    0.7.0.1
 */