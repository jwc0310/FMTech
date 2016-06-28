import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public class fmf
  extends fmj
{
  public void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2) {}
  
  public final void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    throw new RuntimeException("Shouldn't be called");
  }
  
  public final void a(int paramInt, Bundle paramBundle1, ParcelFileDescriptor paramParcelFileDescriptor, Bundle paramBundle2) {}
  
  public void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder) {}
  
  public final void a(int paramInt, Bundle paramBundle, DataHolder[] paramArrayOfDataHolder) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmf
 * JD-Core Version:    0.7.0.1
 */