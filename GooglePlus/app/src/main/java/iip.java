import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

public final class iip
  implements AdapterView.OnItemClickListener
{
  public iip(LicenseMenuActivity paramLicenseMenuActivity) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    iim localiim = (iim)paramAdapterView.getItemAtPosition(paramInt);
    Intent localIntent = new Intent(this.a, LicenseActivity.class);
    localIntent.putExtra("license", localiim);
    this.a.startActivity(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iip
 * JD-Core Version:    0.7.0.1
 */