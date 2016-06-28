import android.text.Layout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.LicenseActivity;

public final class iio
  implements Runnable
{
  public iio(LicenseActivity paramLicenseActivity, int paramInt, ScrollView paramScrollView) {}
  
  public final void run()
  {
    TextView localTextView = (TextView)this.c.findViewById(efj.NP);
    int i = localTextView.getLayout().getLineForOffset(this.a);
    int j = localTextView.getLayout().getLineTop(i);
    this.b.scrollTo(0, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iio
 * JD-Core Version:    0.7.0.1
 */