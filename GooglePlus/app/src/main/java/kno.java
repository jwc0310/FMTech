import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

public final class kno
  extends gzf
{
  private final knn a;
  private Bitmap b;
  
  public kno(knn paramknn)
  {
    super("SetScaledImageTask");
    this.a = paramknn;
  }
  
  protected final hae a(Context paramContext)
  {
    knn localknn = this.a;
    this.b = localknn.a(localknn.a);
    return new hae(true);
  }
  
  protected final void a_(hae paramhae)
  {
    if (this.b == null) {}
    ImageView localImageView;
    String str;
    do
    {
      do
      {
        return;
        localImageView = this.a.b;
      } while (localImageView == null);
      str = (String)localImageView.getTag();
    } while ((str == null) || (!this.a.a.equals(str)));
    localImageView.setVisibility(0);
    localImageView.setImageBitmap(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kno
 * JD-Core Version:    0.7.0.1
 */