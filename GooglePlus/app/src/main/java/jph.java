import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class jph
  implements mes, mey, mfa, mfd
{
  final Set<jpk> a = new HashSet();
  gux<jpb> b;
  private final Activity c;
  private SparseArray<jot> d;
  
  jph(Activity paramActivity, mek parammek)
  {
    this.c = paramActivity;
    parammek.a(this);
  }
  
  public final void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    new StringBuilder(39).append("onRequestPermissionsResult: ").append(paramInt);
    jot localjot = (jot)this.d.get(paramInt);
    if (localjot == null)
    {
      String str = String.valueOf(this.d.toString());
      throw new IllegalStateException(37 + String.valueOf(str).length() + "No permission request " + paramInt + " in " + str);
    }
    List localList = localjot.a;
    this.d.remove(paramInt);
    int[] arrayOfInt = new int[localList.size()];
    int j = 0;
    int k;
    if (j < localList.size())
    {
      k = 0;
      label144:
      if (k >= paramArrayOfString.length) {
        break label320;
      }
      if (!((String)localList.get(j)).equals(paramArrayOfString[k])) {}
    }
    label320:
    for (int m = paramArrayOfInt[k];; m = 0)
    {
      arrayOfInt[j] = m;
      j++;
      break;
      k++;
      break label144;
      jpb localjpb = new jpb(paramInt, (String[])localList.toArray(new String[localList.size()]), arrayOfInt);
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        if (((jpk)localIterator.next()).a(localjpb)) {
          i = 1;
        }
      }
      if (i == 0)
      {
        new StringBuilder(55).append("onRequestPermissionsResult: ").append(paramInt).append(" not handled yet");
        this.b.a(Integer.valueOf(paramInt), localjpb);
      }
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    String str1;
    if (paramBundle != null)
    {
      this.d = paramBundle.getSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests");
      if (this.d != null) {
        break label95;
      }
      str1 = "";
      String str2 = String.valueOf(str1);
      if (str2.length() == 0) {
        break label106;
      }
      "onCreate restored requests: ".concat(str2);
    }
    for (;;)
    {
      this.b = ((gux)paramBundle.getParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results"));
      if (this.d == null) {
        this.d = new SparseArray();
      }
      if (this.b == null) {
        this.b = new gux(jpb.class);
      }
      return;
      label95:
      str1 = this.d.toString();
      break;
      label106:
      new String("onCreate restored requests: ");
    }
  }
  
  final void a(jpd paramjpd, int paramInt, List<String> paramList)
  {
    String str1 = String.valueOf(paramList.toString());
    new StringBuilder(32 + String.valueOf(str1).length()).append("requestPermissions: ").append(paramInt).append(" ").append(str1);
    if (this.d.size() > 0)
    {
      String str3 = String.valueOf(this.d.toString());
      throw new IllegalStateException(62 + String.valueOf(str3).length() + "Cannot request permissions " + paramInt + " when already requested " + str3);
    }
    this.d.put(paramInt, new jot(paramList));
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      if (paramjpd.a(this.c, str2) == -1) {
        localArrayList.add(str2);
      }
    }
    if (localArrayList.isEmpty())
    {
      new StringBuilder(44).append("requestPermissions: ").append(paramInt).append(", all granted");
      jpi localjpi = new jpi(this, paramInt);
      efj.m().post(localjpi);
      return;
    }
    int i = localArrayList.size();
    new StringBuilder(51).append("requestPermissions: ").append(paramInt).append(", ").append(i).append(" needed");
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    paramjpd.a(this.c, arrayOfString, paramInt);
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests", this.d);
    paramBundle.putParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results", this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jph
 * JD-Core Version:    0.7.0.1
 */