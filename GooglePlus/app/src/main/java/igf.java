import android.graphics.Bitmap;
import java.util.List;

final class igf
{
  public igf a = this;
  public igf b = this;
  final ify c;
  List<Bitmap> d;
  
  public igf(ify paramify)
  {
    this.c = paramify;
  }
  
  public final int a()
  {
    if (this.d != null) {
      return this.d.size();
    }
    return 0;
  }
  
  public final Bitmap b()
  {
    int i = a();
    if (i != 0) {
      return (Bitmap)this.d.remove(i - 1);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igf
 * JD-Core Version:    0.7.0.1
 */