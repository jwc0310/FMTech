import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;

public abstract class ezm
  extends Binder
  implements ezl
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.feedback.internal.IFeedbackService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
      int k = paramParcel1.readInt();
      ErrorReport localErrorReport2 = null;
      if (k != 0) {
        localErrorReport2 = (ErrorReport)ErrorReport.CREATOR.createFromParcel(paramParcel1);
      }
      boolean bool2 = a(localErrorReport2);
      paramParcel2.writeNoException();
      if (bool2) {}
      for (int m = 1;; m = 0)
      {
        paramParcel2.writeInt(m);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
      a(paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
    int i = paramParcel1.readInt();
    ErrorReport localErrorReport1 = null;
    if (i != 0) {
      localErrorReport1 = (ErrorReport)ErrorReport.CREATOR.createFromParcel(paramParcel1);
    }
    boolean bool1 = b(localErrorReport1);
    paramParcel2.writeNoException();
    int j = 0;
    if (bool1) {
      j = 1;
    }
    paramParcel2.writeInt(j);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezm
 * JD-Core Version:    0.7.0.1
 */