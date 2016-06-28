import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.GoogleHelp;

public abstract class ewg
  extends Binder
  implements ewf
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
      if (paramParcel1.readInt() != 0) {}
      for (GoogleHelp localGoogleHelp2 = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(paramParcel1);; localGoogleHelp2 = null)
      {
        a(localGoogleHelp2, ewd.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
      GoogleHelp localGoogleHelp1;
      if (paramParcel1.readInt() != 0)
      {
        localGoogleHelp1 = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label213;
        }
      }
      for (Bitmap localBitmap2 = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; localBitmap2 = null)
      {
        a(localGoogleHelp1, localBitmap2, ewd.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localGoogleHelp1 = null;
        break;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
      if (paramParcel1.readInt() != 0) {}
      for (Bitmap localBitmap1 = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; localBitmap1 = null)
      {
        a(localBitmap1, ewd.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
      a(ewd.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      label213:
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
      b(ewd.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    c(ewd.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ewg
 * JD-Core Version:    0.7.0.1
 */