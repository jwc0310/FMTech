import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public abstract interface fml
  extends IInterface
{
  public abstract Bundle a(Uri paramUri);
  
  public abstract Bundle a(fmi paramfmi, boolean paramBoolean, String paramString1, String paramString2, int paramInt);
  
  public abstract Bundle a(String paramString1, String paramString2);
  
  public abstract Bundle a(String paramString1, String paramString2, long paramLong);
  
  public abstract Bundle a(String paramString1, String paramString2, long paramLong, boolean paramBoolean);
  
  public abstract Bundle a(String paramString1, String paramString2, long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract eit a(fmi paramfmi, DataHolder paramDataHolder, int paramInt1, int paramInt2, long paramLong);
  
  public abstract eit a(fmi paramfmi, AccountToken paramAccountToken, ParcelableListOptions paramParcelableListOptions);
  
  public abstract eit a(fmi paramfmi, AvatarReference paramAvatarReference, ParcelableLoadImageOptions paramParcelableLoadImageOptions);
  
  public abstract eit a(fmi paramfmi, String paramString, int paramInt);
  
  public abstract eit a(fmi paramfmi, String paramString1, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean2);
  
  public abstract void a(fmi paramfmi, long paramLong, boolean paramBoolean);
  
  public abstract void a(fmi paramfmi, Bundle paramBundle);
  
  public abstract void a(fmi paramfmi, AccountToken paramAccountToken, List<String> paramList, ParcelableGetOptions paramParcelableGetOptions);
  
  public abstract void a(fmi paramfmi, String paramString);
  
  public abstract void a(fmi paramfmi, String paramString, int paramInt1, int paramInt2);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, int paramInt);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, int paramInt1, int paramInt2);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, Uri paramUri);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, Uri paramUri, boolean paramBoolean);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, boolean paramBoolean);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, String paramString4);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, String paramString4, boolean paramBoolean2);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, String paramString4, boolean paramBoolean2, int paramInt4, int paramInt5);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList, int paramInt, boolean paramBoolean, long paramLong);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList, int paramInt1, boolean paramBoolean, long paramLong, String paramString4, int paramInt2);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList, int paramInt1, boolean paramBoolean, long paramLong, String paramString4, int paramInt2, int paramInt3);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList, int paramInt1, boolean paramBoolean, long paramLong, String paramString4, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList1, List<String> paramList2);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, List<String> paramList1, List<String> paramList2, FavaDiagnosticsEntity paramFavaDiagnosticsEntity);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, boolean paramBoolean);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt);
  
  public abstract void a(fmi paramfmi, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract void a(fmi paramfmi, String paramString, boolean paramBoolean, String[] paramArrayOfString);
  
  public abstract void a(fmi paramfmi, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2);
  
  public abstract void a(fmi paramfmi, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, int paramInt);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract boolean a();
  
  public abstract Bundle b(String paramString1, String paramString2);
  
  public abstract eit b(fmi paramfmi, long paramLong, boolean paramBoolean);
  
  public abstract eit b(fmi paramfmi, String paramString);
  
  public abstract eit b(fmi paramfmi, String paramString, int paramInt1, int paramInt2);
  
  public abstract eit b(fmi paramfmi, String paramString1, String paramString2, int paramInt1, int paramInt2);
  
  public abstract void b(fmi paramfmi, Bundle paramBundle);
  
  public abstract void b(fmi paramfmi, String paramString1, String paramString2);
  
  public abstract void b(fmi paramfmi, String paramString1, String paramString2, int paramInt);
  
  public abstract void b(fmi paramfmi, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4);
  
  public abstract void b(fmi paramfmi, String paramString1, String paramString2, String paramString3, boolean paramBoolean);
  
  public abstract eit c(fmi paramfmi, String paramString1, String paramString2, int paramInt);
  
  public abstract void c(fmi paramfmi, String paramString1, String paramString2);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fml
 * JD-Core Version:    0.7.0.1
 */