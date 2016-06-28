import android.os.CountDownTimer;
import android.widget.ListView;

public final class lcg
{
  ListView a;
  long b;
  int c;
  CountDownTimer d;
  int e = 1;
  
  public lcg(ListView paramListView, long paramLong, int paramInt)
  {
    this.a = paramListView;
    this.b = 50L;
    this.c = 5;
    this.d = new lch(this, 9223372036854775807L, this.b);
    this.d.cancel();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcg
 * JD-Core Version:    0.7.0.1
 */