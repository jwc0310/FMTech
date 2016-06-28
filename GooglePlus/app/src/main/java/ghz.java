import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.view.animation.LinearInterpolator;
import java.util.List;

public final class ghz
{
  private static final TimeInterpolator c = new LinearInterpolator();
  public float a;
  public TimeInterpolator b = c;
  private final ghx d;
  private final Path e;
  private final float f;
  private long g;
  
  ghz(ghx paramghx, Path paramPath, long paramLong, float paramFloat)
  {
    this.d = paramghx;
    this.e = paramPath;
    this.g = paramLong;
    this.f = paramFloat;
    this.a = paramFloat;
  }
  
  public final ghx a()
  {
    ghx localghx = this.d;
    Path localPath = this.e;
    long l = this.g;
    TimeInterpolator localTimeInterpolator = this.b;
    float f1 = this.f;
    float f2 = this.a;
    ghy localghy = new ghy(localTimeInterpolator, localPath, localghx.c, l, f1, f2, localghx.a);
    localghx.b.add(localghy);
    localghx.c = (l + localghx.c);
    localghx.d = f2;
    localghx.e = localghy.a(localghy.c);
    return localghx;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghz
 * JD-Core Version:    0.7.0.1
 */