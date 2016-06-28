import android.accounts.Account;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

public abstract class ezt
  extends Binder
  implements ezs
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.reporting.internal.IReportingService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
      Account localAccount3;
      if (paramParcel1.readInt() != 0)
      {
        localAccount3 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
        ReportingState localReportingState = a(localAccount3);
        paramParcel2.writeNoException();
        if (localReportingState == null) {
          break label142;
        }
        paramParcel2.writeInt(1);
        localReportingState.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localAccount3 = null;
        break;
        paramParcel2.writeInt(0);
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
      if (paramParcel1.readInt() != 0) {}
      for (Account localAccount2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localAccount2 = null)
      {
        int m = b(localAccount2);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(m);
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
      int k = paramParcel1.readInt();
      UploadRequest localUploadRequest = null;
      if (k != 0) {
        localUploadRequest = fdw.a(paramParcel1);
      }
      UploadRequestResult localUploadRequestResult = a(localUploadRequest);
      paramParcel2.writeNoException();
      if (localUploadRequestResult != null)
      {
        paramParcel2.writeInt(1);
        localUploadRequestResult.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 4: 
      label142:
      paramParcel1.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
      int j = a(paramParcel1.readLong());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
    Account localAccount1;
    if (paramParcel1.readInt() != 0)
    {
      localAccount1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label376;
      }
    }
    label376:
    for (PlaceReport localPlaceReport = (PlaceReport)PlaceReport.CREATOR.createFromParcel(paramParcel1);; localPlaceReport = null)
    {
      int i = a(localAccount1, localPlaceReport);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
      localAccount1 = null;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezt
 * JD-Core Version:    0.7.0.1
 */