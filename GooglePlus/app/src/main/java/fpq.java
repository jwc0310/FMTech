import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.accounts.api.AccountData;

class fpq
  implements fpo
{
  public fpp a(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = exq.a(paramContext, paramIntent);
    fpp localfpp = null;
    AccountData localAccountData;
    if (bool1)
    {
      efj.b(paramContext, "Context must not be null.");
      efj.b(paramIntent, "Intent must not be null.");
      boolean bool2 = exs.a(paramContext, paramIntent);
      localAccountData = null;
      if (bool2) {
        break label68;
      }
    }
    for (;;)
    {
      localfpp = new fpp(localAccountData.b, localAccountData.c);
      return localfpp;
      label68:
      localAccountData = (AccountData)efj.a(paramIntent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
    }
  }
  
  public void a(Context paramContext, Intent paramIntent, fpp paramfpp)
  {
    AccountData localAccountData;
    exs localexs;
    ComponentName localComponentName;
    if (paramfpp.b != null)
    {
      localAccountData = AccountData.a(paramfpp.a, paramfpp.b);
      localexs = exq.a;
      efj.b(paramContext, "Context must not be null.");
      efj.b(paramIntent, "Intent must not be null.");
      efj.b(localAccountData, "Account data must not be null.");
      localComponentName = paramIntent.getComponent();
      if (localComponentName == null) {
        break label136;
      }
    }
    label136:
    for (String str = localComponentName.getPackageName();; str = paramIntent.getPackage())
    {
      if ((str != null) && (localexs.a.a(paramContext.getPackageManager(), str)))
      {
        Parcel localParcel = Parcel.obtain();
        localAccountData.writeToParcel(localParcel, 0);
        byte[] arrayOfByte = localParcel.marshall();
        localParcel.recycle();
        paramIntent.putExtra("com.google.android.gms.accounts.ACCOUNT_DATA", arrayOfByte);
      }
      return;
      localAccountData = AccountData.a(paramfpp.a);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpq
 * JD-Core Version:    0.7.0.1
 */